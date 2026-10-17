package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\t\u0010 R\u001a\u0010%\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b\f\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010*\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b\u001e\u0010)¨\u0006+"}, d2 = {"Lkfj/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "d", "icon", "c", "e", "iconUrl", "i", "severity", "k", "title", "Lkfj/e0;", "Lkfj/e0;", "j", "()Lkfj/e0;", "subtitle", "Lkfj/t;", "g", "Lkfj/t;", "()Lkfj/t;", "action", "Lkfj/s;", "h", "Lkfj/s;", "()Lkfj/s;", "data", "", "Z", "()Z", "dismissible", "ownerUsername", "", "J", "()J", "priority", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("icon")
    private final String icon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("iconUrl")
    private final String iconUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("severity")
    @NotNull
    private final String severity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final e0 subtitle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("action")
    private final t action;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("data")
    private final s data;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("dismissible")
    private final boolean dismissible;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("ownerUsername")
    private final String ownerUsername;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("priority")
    private final long priority;

    public u(String id10, String str, String str2, String severity, String title, e0 subtitle, t tVar, s sVar, boolean z, String str3, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.id = id10;
        this.icon = str;
        this.iconUrl = str2;
        this.severity = severity;
        this.title = title;
        this.subtitle = subtitle;
        this.action = tVar;
        this.data = sVar;
        this.dismissible = z;
        this.ownerUsername = str3;
        this.priority = j2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final t getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDismissible() {
        return this.dismissible;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.id, uVar.id) && Intrinsics.f(this.icon, uVar.icon) && Intrinsics.f(this.iconUrl, uVar.iconUrl) && Intrinsics.f(this.severity, uVar.severity) && Intrinsics.f(this.title, uVar.title) && Intrinsics.f(this.subtitle, uVar.subtitle) && Intrinsics.f(this.action, uVar.action) && Intrinsics.f(this.data, uVar.data) && this.dismissible == uVar.dismissible && Intrinsics.f(this.ownerUsername, uVar.ownerUsername) && this.priority == uVar.priority;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getOwnerUsername() {
        return this.ownerUsername;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getPriority() {
        return this.priority;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        int iHashCode3 = (this.subtitle.hashCode() + p.a.c(p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.severity), 31, this.title)) * 31;
        t tVar = this.action;
        int iHashCode4 = (iHashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        s sVar = this.data;
        int iC = j6.a.c((iHashCode4 + (sVar == null ? 0 : sVar.hashCode())) * 31, 31, this.dismissible);
        String str3 = this.ownerUsername;
        return Long.hashCode(this.priority) + ((iC + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSeverity() {
        return this.severity;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final e0 getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
