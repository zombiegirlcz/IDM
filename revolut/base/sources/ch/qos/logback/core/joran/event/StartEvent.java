package ch.qos.logback.core.joran.event;

import ch.qos.logback.core.joran.spi.ElementPath;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;
import zsc.p;

/* JADX INFO: loaded from: classes.dex */
public class StartEvent extends SaxEvent {
    public final Attributes attributes;
    public final ElementPath elementPath;

    public StartEvent(ElementPath elementPath, String str, String str2, String str3, Attributes attributes, Locator locator) {
        super(str, str2, str3, locator);
        this.attributes = new AttributesImpl(attributes);
        this.elementPath = elementPath;
    }

    public Attributes getAttributes() {
        return this.attributes;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("StartEvent(");
        sb6.append(getQName());
        if (this.attributes != null) {
            for (int i = 0; i < this.attributes.getLength(); i++) {
                if (i > 0) {
                    sb6.append(p.SPACE_CHAR);
                }
                sb6.append(this.attributes.getLocalName(i));
                sb6.append("=\"");
                sb6.append(this.attributes.getValue(i));
                sb6.append("\"");
            }
        }
        sb6.append(")  [");
        sb6.append(this.locator.getLineNumber());
        sb6.append(",");
        sb6.append(this.locator.getColumnNumber());
        sb6.append("]");
        return sb6.toString();
    }
}
