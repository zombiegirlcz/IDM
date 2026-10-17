package k4l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f180986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f180987b;

    public j(dj0.d total, h hVar) {
        Intrinsics.checkNotNullParameter(total, "total");
        this.f180986a = total;
        this.f180987b = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f180986a, jVar.f180986a) && Intrinsics.f(this.f180987b, jVar.f180987b);
    }

    public final int hashCode() {
        int iHashCode = this.f180986a.hashCode() * 31;
        h hVar = this.f180987b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
