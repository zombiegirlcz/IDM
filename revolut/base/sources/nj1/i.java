package nj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f216332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f216333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f216334c;
    public final b d;
    public final boolean e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f216335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f216336h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f216337j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f216338l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f216339m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f216340n;
    public final boolean o;

    public i() {
        this(false, null, null, null, false, null, false, false, false, false, false, false, false, false, 16383);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f216332a == iVar.f216332a && Intrinsics.f(this.f216333b, iVar.f216333b) && Intrinsics.f(this.f216334c, iVar.f216334c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && this.f216335g == iVar.f216335g && this.f216336h == iVar.f216336h && this.i == iVar.i && this.f216337j == iVar.f216337j && this.k == iVar.k && this.f216338l == iVar.f216338l && this.f216339m == iVar.f216339m && this.f216340n == iVar.f216340n;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f216332a) * 31;
        j jVar = this.f216333b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        b bVar = this.f216334c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.d;
        int iC = j6.a.c((iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31, this.e);
        b bVar3 = this.f;
        return Boolean.hashCode(this.f216340n) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((iC + (bVar3 != null ? bVar3.hashCode() : 0)) * 31, 31, this.f216335g), 31, this.f216336h), 31, this.i), 31, this.f216337j), 31, this.k), 31, this.f216338l), 31, this.f216339m);
    }

    public i(boolean z, j jVar, b bVar, b bVar2, boolean z3, b bVar3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f216332a = z;
        this.f216333b = jVar;
        this.f216334c = bVar;
        this.d = bVar2;
        this.e = z3;
        this.f = bVar3;
        this.f216335g = z4;
        this.f216336h = z6;
        this.i = z11;
        this.f216337j = z12;
        this.k = z29;
        this.f216338l = z31;
        this.f216339m = z41;
        this.f216340n = z49;
        this.o = (bVar == null || bVar.f216323a) && (bVar2 == null || bVar2.f216323a) && z3 && (bVar3 == null || bVar3.f216323a) && z4 && z6 && z11 && z12 && z29 && z31 && z41 && z49;
    }

    public /* synthetic */ i(boolean z, j jVar, b bVar, b bVar2, boolean z3, b bVar3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : jVar, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : bVar2, (i & 16) != 0 ? true : z3, (i & 32) == 0 ? bVar3 : null, (i & 64) != 0 ? true : z4, (i & 128) != 0 ? true : z6, (i & 256) != 0 ? true : z11, (i & 512) != 0 ? true : z12, (i & 1024) != 0 ? true : z29, (i & 2048) != 0 ? true : z31, (i & 4096) != 0 ? true : z41, (i & 8192) != 0 ? true : z49);
    }
}
