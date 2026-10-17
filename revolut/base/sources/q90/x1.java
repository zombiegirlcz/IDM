package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006$"}, d2 = {"Lq90/x1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "g", "title", "Lq90/t1;", "c", "Lq90/t1;", "()Lq90/t1;", "description", "Lq90/o;", "Lq90/o;", "()Lq90/o;", "icon", "Lq90/y1;", "e", "Lq90/y1;", "f", "()Lq90/y1;", "link", "", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "visible", "i", "isCopiable", "copyValue", "imageBannerAssetUrl", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("descriptionHtml")
    private final t1 description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("icon")
    private final o icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("link")
    private final y1 link;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("visible")
    private final Boolean visible;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("isCopiable")
    private final Boolean isCopiable;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("copyValue")
    private final String copyValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("imageBannerAssetUrl")
    private final String imageBannerAssetUrl;

    public x1(String id10, String title, t1 t1Var, o oVar, y1 y1Var, Boolean bool, Boolean bool2, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id10;
        this.title = title;
        this.description = t1Var;
        this.icon = oVar;
        this.link = y1Var;
        this.visible = bool;
        this.isCopiable = bool2;
        this.copyValue = str;
        this.imageBannerAssetUrl = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCopyValue() {
        return this.copyValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final t1 getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getImageBannerAssetUrl() {
        return this.imageBannerAssetUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return Intrinsics.f(this.id, x1Var.id) && Intrinsics.f(this.title, x1Var.title) && Intrinsics.f(this.description, x1Var.description) && Intrinsics.f(this.icon, x1Var.icon) && Intrinsics.f(this.link, x1Var.link) && Intrinsics.f(this.visible, x1Var.visible) && Intrinsics.f(this.isCopiable, x1Var.isCopiable) && Intrinsics.f(this.copyValue, x1Var.copyValue) && Intrinsics.f(this.imageBannerAssetUrl, x1Var.imageBannerAssetUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final y1 getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
        t1 t1Var = this.description;
        int iHashCode = (iC + (t1Var == null ? 0 : t1Var.hashCode())) * 31;
        o oVar = this.icon;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        y1 y1Var = this.link;
        int iHashCode3 = (iHashCode2 + (y1Var == null ? 0 : y1Var.hashCode())) * 31;
        Boolean bool = this.visible;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isCopiable;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.copyValue;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageBannerAssetUrl;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getIsCopiable() {
        return this.isCopiable;
    }
}
