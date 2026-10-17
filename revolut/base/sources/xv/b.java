package xv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw.o f309122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f309123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f309124c;
    public final long d;
    public final vw.m e;

    public b(vw.o payload, int i, int i2, long j2, vw.m mVar) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f309122a = payload;
        this.f309123b = i;
        this.f309124c = i2;
        this.d = j2;
        this.e = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f309122a, bVar.f309122a) && this.f309123b == bVar.f309123b && this.f309124c == bVar.f309124c && this.d == bVar.d && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iC = a0.d.c(j6.a.b(this.f309124c, j6.a.b(this.f309123b, this.f309122a.hashCode() * 31, 31), 31), 31, this.d);
        vw.m mVar = this.e;
        return iC + (mVar == null ? 0 : mVar.hashCode());
    }
}
