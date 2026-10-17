package sn8;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lsn8/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "c", "()Z", "visibleInContacts", "b", "discoverableByUsername", "profileReveal", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("visibleInContacts")
    private final boolean visibleInContacts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("discoverableByUsername")
    private final boolean discoverableByUsername;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("profileReveal")
    private final boolean profileReveal;

    public a(boolean z, boolean z3, boolean z4) {
        this.visibleInContacts = z;
        this.discoverableByUsername = z3;
        this.profileReveal = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDiscoverableByUsername() {
        return this.discoverableByUsername;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getProfileReveal() {
        return this.profileReveal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getVisibleInContacts() {
        return this.visibleInContacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.visibleInContacts == aVar.visibleInContacts && this.discoverableByUsername == aVar.discoverableByUsername && this.profileReveal == aVar.profileReveal;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.profileReveal) + j6.a.c(Boolean.hashCode(this.visibleInContacts) * 31, 31, this.discoverableByUsername);
    }
}
