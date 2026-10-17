package xo4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010#\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u0005\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b\u0016\u0010%R\u001a\u0010*\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b\f\u0010)¨\u0006+"}, d2 = {"Lxo4/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "e", "name", "c", "displayName", "i", "url", "", "Z", "j", "()Z", "isRead", "Lxo4/t;", "f", "Lxo4/t;", "h", "()Lxo4/t;", "type", "Lxo4/s;", "g", "Lxo4/s;", "()Lxo4/s;", "state", "", "J", "()J", "createdDate", "Ljava/lang/Long;", "()Ljava/lang/Long;", "signDate", "Lxo4/r;", "Lxo4/r;", "()Lxo4/r;", "fileType", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentId")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("displayName")
    @NotNull
    private final String displayName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("url")
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("isRead")
    private final boolean isRead;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final t type;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final s state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("signDate")
    private final Long signDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("fileType")
    @NotNull
    private final r fileType;

    public o(String id10, String name, String displayName, String url2, boolean z, t type, s state, long j2, Long l2, r fileType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        this.id = id10;
        this.name = name;
        this.displayName = displayName;
        this.url = url2;
        this.isRead = z;
        this.type = type;
        this.state = state;
        this.createdDate = j2;
        this.signDate = l2;
        this.fileType = fileType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r getFileType() {
        return this.fileType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.id, oVar.id) && Intrinsics.f(this.name, oVar.name) && Intrinsics.f(this.displayName, oVar.displayName) && Intrinsics.f(this.url, oVar.url) && this.isRead == oVar.isRead && this.type == oVar.type && this.state == oVar.state && this.createdDate == oVar.createdDate && Intrinsics.f(this.signDate, oVar.signDate) && this.fileType == oVar.fileType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getSignDate() {
        return this.signDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final s getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final t getType() {
        return this.type;
    }

    public final int hashCode() {
        int iC = a0.d.c((this.state.hashCode() + ((this.type.hashCode() + j6.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.displayName), 31, this.url), 31, this.isRead)) * 31)) * 31, 31, this.createdDate);
        Long l2 = this.signDate;
        return this.fileType.hashCode() + ((iC + (l2 == null ? 0 : l2.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }
}
