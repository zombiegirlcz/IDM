package ji1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mi1.a f174323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.address.common.impl.flow.screen.find.a f174324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f174325c;

    public e(mi1.a permissionRequestStatus, com.revolut.feature.address.common.impl.flow.screen.find.a searchState, String latestSearchQuery) {
        Intrinsics.checkNotNullParameter(permissionRequestStatus, "permissionRequestStatus");
        Intrinsics.checkNotNullParameter(searchState, "searchState");
        Intrinsics.checkNotNullParameter(latestSearchQuery, "latestSearchQuery");
        this.f174323a = permissionRequestStatus;
        this.f174324b = searchState;
        this.f174325c = latestSearchQuery;
    }

    public static e a(e eVar, mi1.a permissionRequestStatus, com.revolut.feature.address.common.impl.flow.screen.find.a searchState, String latestSearchQuery, int i) {
        if ((i & 1) != 0) {
            permissionRequestStatus = eVar.f174323a;
        }
        if ((i & 2) != 0) {
            searchState = eVar.f174324b;
        }
        if ((i & 4) != 0) {
            latestSearchQuery = eVar.f174325c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(permissionRequestStatus, "permissionRequestStatus");
        Intrinsics.checkNotNullParameter(searchState, "searchState");
        Intrinsics.checkNotNullParameter(latestSearchQuery, "latestSearchQuery");
        return new e(permissionRequestStatus, searchState, latestSearchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f174323a == eVar.f174323a && Intrinsics.f(this.f174324b, eVar.f174324b) && Intrinsics.f(this.f174325c, eVar.f174325c);
    }

    public final int hashCode() {
        return this.f174325c.hashCode() + ((this.f174324b.hashCode() + (this.f174323a.hashCode() * 31)) * 31);
    }
}
