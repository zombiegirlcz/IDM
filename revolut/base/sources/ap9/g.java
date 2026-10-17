package ap9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8129c;
    public final boolean d;

    public g(long j2, String id10, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f8127a = id10;
        this.f8128b = j2;
        this.f8129c = z;
        this.d = z3;
    }

    public static g a(g gVar, long j2, boolean z, int i) {
        String id10 = gVar.f8127a;
        if ((i & 2) != 0) {
            j2 = gVar.f8128b;
        }
        long j3 = j2;
        boolean z3 = gVar.f8129c;
        if ((i & 8) != 0) {
            z = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        return new g(j3, id10, z3, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f8127a, gVar.f8127a) && this.f8128b == gVar.f8128b && this.f8129c == gVar.f8129c && this.d == gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(a0.d.c(this.f8127a.hashCode() * 31, 31, this.f8128b), 31, this.f8129c);
    }
}
