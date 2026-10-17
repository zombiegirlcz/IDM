package ch.qos.logback.core.pattern.parser;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SimpleKeywordNode extends FormattingNode {
    List<String> optionList;

    public SimpleKeywordNode(int i, Object obj2) {
        super(i, obj2);
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj2) {
        if (!super.equals(obj2) || !(obj2 instanceof SimpleKeywordNode)) {
            return false;
        }
        List<String> list = this.optionList;
        List<String> list2 = ((SimpleKeywordNode) obj2).optionList;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public List<String> getOptions() {
        return this.optionList;
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        return super.hashCode();
    }

    public void setOptions(List<String> list) {
        this.optionList = list;
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public String toString() {
        StringBuilder sb6;
        Object obj2;
        StringBuilder sb9 = new StringBuilder();
        if (this.optionList == null) {
            sb6 = new StringBuilder("KeyWord(");
            sb6.append(this.value);
            sb6.append(",");
            obj2 = this.formatInfo;
        } else {
            sb6 = new StringBuilder("KeyWord(");
            sb6.append(this.value);
            sb6.append(", ");
            sb6.append(this.formatInfo);
            sb6.append(",");
            obj2 = this.optionList;
        }
        sb6.append(obj2);
        sb6.append(")");
        sb9.append(sb6.toString());
        sb9.append(printNext());
        return sb9.toString();
    }

    public SimpleKeywordNode(Object obj2) {
        super(1, obj2);
    }
}
