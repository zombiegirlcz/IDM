package ho3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f154221b;

    public b(String id10, d status) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f154220a = id10;
        this.f154221b = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f154220a, bVar.f154220a) && this.f154221b == bVar.f154221b;
    }

    public final int hashCode() {
        return this.f154221b.hashCode() + (this.f154220a.hashCode() * 31);
    }
}
