package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Lnx4/l1;", "Lnx4/r1;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "title", "b", "description", "c", "descriptionStyle", "d", "descriptionColor", "e", "f", "style", "secondDescription", "secondDescriptionStyle", "Lnx4/n;", "h", "Lnx4/n;", "()Lnx4/n;", "titleAction", "i", "titleIcon", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l1 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("descriptionStyle")
    private final String descriptionStyle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("descriptionColor")
    private final String descriptionColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("style")
    private final String style;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("secondDescription")
    private final String secondDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondDescriptionStyle")
    private final String secondDescriptionStyle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("titleAction")
    private final n titleAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("titleIcon")
    private final String titleIcon;

    public l1(String title, String description, String str, String str2, String str3, String str4, String str5, n nVar, String str6) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.title = title;
        this.description = description;
        this.descriptionStyle = str;
        this.descriptionColor = str2;
        this.style = str3;
        this.secondDescription = str4;
        this.secondDescriptionStyle = str5;
        this.titleAction = nVar;
        this.titleIcon = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescriptionColor() {
        return this.descriptionColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescriptionStyle() {
        return this.descriptionStyle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSecondDescription() {
        return this.secondDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSecondDescriptionStyle() {
        return this.secondDescriptionStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.title, l1Var.title) && Intrinsics.f(this.description, l1Var.description) && Intrinsics.f(this.descriptionStyle, l1Var.descriptionStyle) && Intrinsics.f(this.descriptionColor, l1Var.descriptionColor) && Intrinsics.f(this.style, l1Var.style) && Intrinsics.f(this.secondDescription, l1Var.secondDescription) && Intrinsics.f(this.secondDescriptionStyle, l1Var.secondDescriptionStyle) && Intrinsics.f(this.titleAction, l1Var.titleAction) && Intrinsics.f(this.titleIcon, l1Var.titleIcon);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStyle() {
        return this.style;
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
        int iC = p.a.c(this.title.hashCode() * 31, 31, this.description);
        String str = this.descriptionStyle;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.descriptionColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.style;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondDescription;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.secondDescriptionStyle;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        n nVar = this.titleAction;
        int iHashCode6 = (iHashCode5 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str6 = this.titleIcon;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }
}
