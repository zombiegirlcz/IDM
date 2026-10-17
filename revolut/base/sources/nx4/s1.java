package nx4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R$\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\t\u0010\u0004R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0005\u0010!¨\u0006#"}, d2 = {"Lnx4/s1;", "Lnx4/u1;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "title", "b", "d", "description", "c", "f", "icon", "", "Lnx4/o1;", "Ljava/util/List;", "h", "()Ljava/util/List;", "notes", "Lnx4/r1;", "e", "g", "items", "cdnAssetId", "getButtonTitle$annotations", "()V", "buttonTitle", "getFooter$annotations", "footer", "Lnx4/u0;", "Lnx4/u0;", "()Lnx4/u0;", "actionFooter", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s1 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("icon")
    private final String icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("notes")
    private final List<o1> notes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("items")
    private final List<r1> items;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cdnAssetId")
    private final String cdnAssetId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("buttonTitle")
    private final String buttonTitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("footer")
    private final String footer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("actionFooter")
    private final u0 actionFooter;

    public s1(String title, String str, String str2, zhm.f0 f0Var, List list, String str3, String str4, String str5, u0 u0Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.description = str;
        this.icon = str2;
        this.notes = f0Var;
        this.items = list;
        this.cdnAssetId = str3;
        this.buttonTitle = str4;
        this.footer = str5;
        this.actionFooter = u0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final u0 getActionFooter() {
        return this.actionFooter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCdnAssetId() {
        return this.cdnAssetId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return Intrinsics.f(this.title, s1Var.title) && Intrinsics.f(this.description, s1Var.description) && Intrinsics.f(this.icon, s1Var.icon) && Intrinsics.f(this.notes, s1Var.notes) && Intrinsics.f(this.items, s1Var.items) && Intrinsics.f(this.cdnAssetId, s1Var.cdnAssetId) && Intrinsics.f(this.buttonTitle, s1Var.buttonTitle) && Intrinsics.f(this.footer, s1Var.footer) && Intrinsics.f(this.actionFooter, s1Var.actionFooter);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getNotes() {
        return this.notes;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<o1> list = this.notes;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<r1> list2 = this.items;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.cdnAssetId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonTitle;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.footer;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        u0 u0Var = this.actionFooter;
        return iHashCode8 + (u0Var != null ? u0Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
