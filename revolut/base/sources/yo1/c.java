package yo1;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b\f\u0010'R\u001c\u0010,\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b\u000f\u0010+R\"\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b\t\u0010'R\u001c\u00102\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\b-\u00101R\u001c\u00106\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b\u0005\u00105¨\u00067"}, d2 = {"Lyo1/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "name", "b", "h", "label", "c", "o", "type", "d", "g", "inputMask", "", "e", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "optional", "f", "l", "regex", "k", "placeholder", "defaultValue", "editable", "Lyo1/f;", "Lyo1/f;", "n", "()Lyo1/f;", "tooltip", "", "Lyo1/d;", "Ljava/util/List;", "()Ljava/util/List;", "choices", "Lyo1/a;", "Lyo1/a;", "()Lyo1/a;", "condition", "m", "childInputs", "Lyo1/e;", "Lyo1/e;", "()Lyo1/e;", "subForm", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("inputMask")
    private final String inputMask;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("optional")
    private final Boolean optional;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("regex")
    private final String regex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("placeholder")
    private final String placeholder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultValue")
    private final String defaultValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("editable")
    private final Boolean editable;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("tooltip")
    private final f tooltip;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("choices")
    private final List<d> choices;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("condition")
    private final a condition;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("childInputs")
    private final List<c> childInputs;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("subForm")
    private final e subForm;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("attributes")
    private final b attributes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getChildInputs() {
        return this.childInputs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getChoices() {
        return this.choices;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getCondition() {
        return this.condition;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.name, cVar.name) && Intrinsics.f(this.label, cVar.label) && Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.inputMask, cVar.inputMask) && Intrinsics.f(this.optional, cVar.optional) && Intrinsics.f(this.regex, cVar.regex) && Intrinsics.f(this.placeholder, cVar.placeholder) && Intrinsics.f(this.defaultValue, cVar.defaultValue) && Intrinsics.f(this.editable, cVar.editable) && Intrinsics.f(this.tooltip, cVar.tooltip) && Intrinsics.f(this.choices, cVar.choices) && Intrinsics.f(this.condition, cVar.condition) && Intrinsics.f(this.childInputs, cVar.childInputs) && Intrinsics.f(this.subForm, cVar.subForm) && Intrinsics.f(this.attributes, cVar.attributes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getEditable() {
        return this.editable;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getInputMask() {
        return this.inputMask;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inputMask;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.optional;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.regex;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.placeholder;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.defaultValue;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.editable;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        f fVar = this.tooltip;
        int iHashCode10 = (iHashCode9 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        List<d> list = this.choices;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        a aVar = this.condition;
        int iHashCode12 = (iHashCode11 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<c> list2 = this.childInputs;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        e eVar = this.subForm;
        int iHashCode14 = (iHashCode13 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        b bVar = this.attributes;
        return iHashCode14 + (bVar != null ? bVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getOptional() {
        return this.optional;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getRegex() {
        return this.regex;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final e getSubForm() {
        return this.subForm;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final f getTooltip() {
        return this.tooltip;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
