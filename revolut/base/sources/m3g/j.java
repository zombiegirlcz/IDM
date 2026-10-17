package m3g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f202538b;

    public j(String attractionId, String str) {
        Intrinsics.checkNotNullParameter(attractionId, "attractionId");
        this.f202537a = attractionId;
        this.f202538b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f202537a, jVar.f202537a) && Intrinsics.f(this.f202538b, jVar.f202538b);
    }

    public final int hashCode() {
        int iHashCode = this.f202537a.hashCode() * 31;
        String str = this.f202538b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
