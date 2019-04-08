package Tags;

import org.w3c.dom.Element;

public class Interlink {
    private String id;
    private LinkType linkType;
    private DatasetProp sourceDataset;
    private DatasetProp targetDataset;
    private LinkageRule linkageRule;
//    private Filter filter;

    public Interlink (Element interlink) {
        this.id = interlink.getAttribute("id");
        this.linkType = new LinkType((Element) interlink.getElementsByTagName("LinkType")
                .item(0));
        this.sourceDataset = new DatasetProp((Element) interlink.getElementsByTagName("SourceDataset")
                .item(0));
        this.targetDataset = new DatasetProp((Element) interlink.getElementsByTagName("TargetDataset")
                .item(0));
        this.linkageRule = new LinkageRule((Element) interlink.getElementsByTagName("LinkageRule")
                .item(0));

    }

    public String getLinkType () {
        return linkType.getLinkType();
    }

    public String getId () {
        return this.id;
    }

    public DatasetProp getSourceDataset () {
        return this.sourceDataset;
    }

    public DatasetProp getTargetDataset () {
        return this.targetDataset;
    }

    public LinkageRule getLinkageRule () {
        return linkageRule;
    }
}
