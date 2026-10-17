package vw;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f292572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f292573b;

    public b(Double d, boolean z) {
        this.f292572a = z;
        this.f292573b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f292572a == bVar.f292572a && Intrinsics.f(this.f292573b, bVar.f292573b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f292572a) * 31;
        Double d = this.f292573b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}
