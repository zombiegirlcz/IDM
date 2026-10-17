package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\t\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006 "}, d2 = {"Lnx4/b;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "j", "title", "c", "h", "subtitle", "d", "i", "subtitleStyle", "e", "icon", "Lnx4/k0;", "Lnx4/k0;", "g", "()Lnx4/k0;", "image", "Lnx4/n;", "Lnx4/n;", "()Lnx4/n;", "action", "actionButtonTitle", "badge", "accessoryIcon", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("subtitleStyle")
    private final String subtitleStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("icon")
    private final String icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("image")
    private final k0 image;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("action")
    private final n action;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("actionButtonTitle")
    private final String actionButtonTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("badge")
    private final String badge;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("accessoryIcon")
    private final String accessoryIcon;

    public b(String id10, String title, String str, String str2, k0 k0Var, n nVar, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id10;
        this.title = title;
        this.subtitle = str;
        this.subtitleStyle = str2;
        this.icon = null;
        this.image = k0Var;
        this.action = nVar;
        this.actionButtonTitle = str3;
        this.badge = str4;
        this.accessoryIcon = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessoryIcon() {
        return this.accessoryIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final n getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActionButtonTitle() {
        return this.actionButtonTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.subtitle, bVar.subtitle) && Intrinsics.f(this.subtitleStyle, bVar.subtitleStyle) && Intrinsics.f(this.icon, bVar.icon) && Intrinsics.f(this.image, bVar.image) && Intrinsics.f(this.action, bVar.action) && Intrinsics.f(this.actionButtonTitle, bVar.actionButtonTitle) && Intrinsics.f(this.badge, bVar.badge) && Intrinsics.f(this.accessoryIcon, bVar.accessoryIcon);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final k0 getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitleStyle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        k0 k0Var = this.image;
        int iHashCode4 = (iHashCode3 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        n nVar = this.action;
        int iHashCode5 = (iHashCode4 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str4 = this.actionButtonTitle;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.badge;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.accessoryIcon;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSubtitleStyle() {
        return this.subtitleStyle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
