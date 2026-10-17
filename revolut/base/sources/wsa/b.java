package wsa;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f299682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f299683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kqa.a f299684c;

    public b(long j2, long j3, kqa.a aVar) {
        this.f299682a = j2;
        this.f299683b = j3;
        this.f299684c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f299682a == bVar.f299682a && this.f299683b == bVar.f299683b && Intrinsics.f(this.f299684c, bVar.f299684c);
    }

    public final int hashCode() {
        int iC = d.c(Long.hashCode(this.f299682a) * 31, 31, this.f299683b);
        kqa.a aVar = this.f299684c;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
