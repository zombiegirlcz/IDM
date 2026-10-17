package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010\u001fR\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b.\u0010/R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00104\u001a\u0004\b\u0012\u00105¨\u00067"}, d2 = {"Lnx4/i2;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "g", "title", "j", "value", "d", "e", "promoValue", "promoDirection", "f", "description", "Lnx4/s1;", "Lnx4/s1;", "()Lnx4/s1;", "info", "h", "o", "valueInfo", "i", "titleIcon", "Lnx4/n;", "Lnx4/n;", "()Lnx4/n;", "titleAction", "k", "m", "valueIcon", "Lnx4/k0;", "l", "Lnx4/k0;", "n", "()Lnx4/k0;", "valueImage", "valueAction", "valueDescription", "", "Ljava/lang/Boolean;", "q", "()Ljava/lang/Boolean;", "valueUpdated", "p", "valueStyle", "Lnx4/g2;", "Lnx4/g2;", "()Lnx4/g2;", "richValue", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i2 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final String value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("promoValue")
    private final String promoValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("promoDirection")
    private final String promoDirection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("info")
    private final s1 info;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueInfo")
    private final s1 valueInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("titleIcon")
    private final String titleIcon;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("titleAction")
    private final n titleAction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("valueIcon")
    private final String valueIcon;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueImage")
    private final k0 valueImage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueAction")
    private final n valueAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueDescription")
    private final String valueDescription;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("valueUpdated")
    private final Boolean valueUpdated;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueStyle")
    private final String valueStyle;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("richValue")
    private final g2 richValue;

    public i2(String name, String title, String str, String str2, String str3, String str4, String str5, n nVar, String str6, k0 k0Var, n nVar2, String str7, Boolean bool, String str8, g2 g2Var) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        this.name = name;
        this.title = title;
        this.value = str;
        this.promoValue = str2;
        this.promoDirection = str3;
        this.description = str4;
        this.info = null;
        this.valueInfo = null;
        this.titleIcon = str5;
        this.titleAction = nVar;
        this.valueIcon = str6;
        this.valueImage = k0Var;
        this.valueAction = nVar2;
        this.valueDescription = str7;
        this.valueUpdated = bool;
        this.valueStyle = str8;
        this.richValue = g2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s1 getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPromoDirection() {
        return this.promoDirection;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPromoValue() {
        return this.promoValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj2;
        return Intrinsics.f(this.name, i2Var.name) && Intrinsics.f(this.title, i2Var.title) && Intrinsics.f(this.value, i2Var.value) && Intrinsics.f(this.promoValue, i2Var.promoValue) && Intrinsics.f(this.promoDirection, i2Var.promoDirection) && Intrinsics.f(this.description, i2Var.description) && Intrinsics.f(this.info, i2Var.info) && Intrinsics.f(this.valueInfo, i2Var.valueInfo) && Intrinsics.f(this.titleIcon, i2Var.titleIcon) && Intrinsics.f(this.titleAction, i2Var.titleAction) && Intrinsics.f(this.valueIcon, i2Var.valueIcon) && Intrinsics.f(this.valueImage, i2Var.valueImage) && Intrinsics.f(this.valueAction, i2Var.valueAction) && Intrinsics.f(this.valueDescription, i2Var.valueDescription) && Intrinsics.f(this.valueUpdated, i2Var.valueUpdated) && Intrinsics.f(this.valueStyle, i2Var.valueStyle) && Intrinsics.f(this.richValue, i2Var.richValue);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final g2 getRichValue() {
        return this.richValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final n getTitleAction() {
        return this.titleAction;
    }

    public final int hashCode() {
        int iC = p.a.c(this.name.hashCode() * 31, 31, this.title);
        String str = this.value;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.promoValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.promoDirection;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        s1 s1Var = this.info;
        int iHashCode5 = (iHashCode4 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        s1 s1Var2 = this.valueInfo;
        int iHashCode6 = (iHashCode5 + (s1Var2 == null ? 0 : s1Var2.hashCode())) * 31;
        String str5 = this.titleIcon;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        n nVar = this.titleAction;
        int iHashCode8 = (iHashCode7 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str6 = this.valueIcon;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        k0 k0Var = this.valueImage;
        int iHashCode10 = (iHashCode9 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        n nVar2 = this.valueAction;
        int iHashCode11 = (iHashCode10 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        String str7 = this.valueDescription;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.valueUpdated;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.valueStyle;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        g2 g2Var = this.richValue;
        return iHashCode14 + (g2Var != null ? g2Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final n getValueAction() {
        return this.valueAction;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getValueDescription() {
        return this.valueDescription;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getValueIcon() {
        return this.valueIcon;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final k0 getValueImage() {
        return this.valueImage;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final s1 getValueInfo() {
        return this.valueInfo;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getValueStyle() {
        return this.valueStyle;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getValueUpdated() {
        return this.valueUpdated;
    }
}
