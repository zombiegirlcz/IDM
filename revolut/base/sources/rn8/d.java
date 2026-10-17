package rn8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lrn8/d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "visibleInContacts", "b", "discoverableByUsername", "profileReveal", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("visibleInContacts")
    private final Boolean visibleInContacts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("discoverableByUsername")
    private final Boolean discoverableByUsername;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("profileReveal")
    private final Boolean profileReveal;

    public d(Boolean bool, Boolean bool2, Boolean bool3) {
        this.visibleInContacts = bool;
        this.discoverableByUsername = bool2;
        this.profileReveal = bool3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getDiscoverableByUsername() {
        return this.discoverableByUsername;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getProfileReveal() {
        return this.profileReveal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getVisibleInContacts() {
        return this.visibleInContacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.visibleInContacts, dVar.visibleInContacts) && Intrinsics.f(this.discoverableByUsername, dVar.discoverableByUsername) && Intrinsics.f(this.profileReveal, dVar.profileReveal);
    }

    public final int hashCode() {
        Boolean bool = this.visibleInContacts;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.discoverableByUsername;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.profileReveal;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }
}
