package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.FormatInfo;

/* JADX INFO: loaded from: classes.dex */
public class FormattingNode extends Node {
    FormatInfo formatInfo;

    public FormattingNode(int i) {
        super(i);
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj2) {
        if (!super.equals(obj2) || !(obj2 instanceof FormattingNode)) {
            return false;
        }
        FormatInfo formatInfo = this.formatInfo;
        FormatInfo formatInfo2 = ((FormattingNode) obj2).formatInfo;
        return formatInfo != null ? formatInfo.equals(formatInfo2) : formatInfo2 == null;
    }

    public FormatInfo getFormatInfo() {
        return this.formatInfo;
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        FormatInfo formatInfo = this.formatInfo;
        return iHashCode + (formatInfo != null ? formatInfo.hashCode() : 0);
    }

    public void setFormatInfo(FormatInfo formatInfo) {
        this.formatInfo = formatInfo;
    }

    public FormattingNode(int i, Object obj2) {
        super(i, obj2);
    }
}
