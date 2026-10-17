package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b\t\u0010&R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b)\u0010\u0004R\"\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\r\u0010\u0017R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004¨\u0006."}, d2 = {"Lq90/l3;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "k", "style", "", "c", "Z", "h", "()Z", "required", "", "Lq90/h3;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "options", "i", "searchHint", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "randomOptionsOrder", "Lq90/m3;", "Lq90/m3;", "l", "()Lq90/m3;", "value", "Lq90/f3;", "Lq90/f3;", "()Lq90/f3;", "customOption", "assetStyle", "j", "separationStyle", "Lq90/g3;", "groups", "hint", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l3 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("style")
    @NotNull
    private final String style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("options")
    @NotNull
    private final List<h3> options;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("searchHint")
    private final String searchHint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("randomOptionsOrder")
    private final Boolean randomOptionsOrder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final m3 value;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("customOption")
    private final f3 customOption;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("assetStyle")
    private final String assetStyle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("optionsSeparationStyle")
    private final String separationStyle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("groups")
    private final List<g3> groups;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("hint")
    private final String hint;

    public l3(String id10, String style, boolean z, ArrayList options, String str, Boolean bool, m3 m3Var, f3 f3Var, String str2, String str3, ArrayList arrayList, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(options, "options");
        this.id = id10;
        this.style = style;
        this.required = z;
        this.options = options;
        this.searchHint = str;
        this.randomOptionsOrder = bool;
        this.value = m3Var;
        this.customOption = f3Var;
        this.assetStyle = str2;
        this.separationStyle = str3;
        this.groups = arrayList;
        this.hint = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAssetStyle() {
        return this.assetStyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f3 getCustomOption() {
        return this.customOption;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getGroups() {
        return this.groups;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj2;
        return Intrinsics.f(this.id, l3Var.id) && Intrinsics.f(this.style, l3Var.style) && this.required == l3Var.required && Intrinsics.f(this.options, l3Var.options) && Intrinsics.f(this.searchHint, l3Var.searchHint) && Intrinsics.f(this.randomOptionsOrder, l3Var.randomOptionsOrder) && Intrinsics.f(this.value, l3Var.value) && Intrinsics.f(this.customOption, l3Var.customOption) && Intrinsics.f(this.assetStyle, l3Var.assetStyle) && Intrinsics.f(this.separationStyle, l3Var.separationStyle) && Intrinsics.f(this.groups, l3Var.groups) && Intrinsics.f(this.hint, l3Var.hint);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getOptions() {
        return this.options;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getRandomOptionsOrder() {
        return this.randomOptionsOrder;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(p.a.c(this.id.hashCode() * 31, 31, this.style), 31, this.required), 31, this.options);
        String str = this.searchHint;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.randomOptionsOrder;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        m3 m3Var = this.value;
        int iHashCode3 = (iHashCode2 + (m3Var == null ? 0 : m3Var.hashCode())) * 31;
        f3 f3Var = this.customOption;
        int iHashCode4 = (iHashCode3 + (f3Var == null ? 0 : f3Var.hashCode())) * 31;
        String str2 = this.assetStyle;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.separationStyle;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<g3> list = this.groups;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.hint;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSearchHint() {
        return this.searchHint;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSeparationStyle() {
        return this.separationStyle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final m3 getValue() {
        return this.value;
    }
}
