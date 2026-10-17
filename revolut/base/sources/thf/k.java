package thf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f271376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f271377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f271378c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f271379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f271380h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f271381j;

    public /* synthetic */ k(int i, boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this(z, (i & 2) == 0, (i & 4) == 0, (i & 8) != 0 ? false : z3, (i & 16) == 0, (i & 32) != 0 ? true : z4, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? false : z11, (i & 256) == 0, (i & 512) != 0 ? null : j.f271375a);
    }

    public static k a(k kVar) {
        return new k(kVar.f271376a, true, true, kVar.d, kVar.e, kVar.f, kVar.f271379g, kVar.f271380h, kVar.i, kVar.f271381j);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f271376a == kVar.f271376a && this.f271377b == kVar.f271377b && this.f271378c == kVar.f271378c && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f && this.f271379g == kVar.f271379g && this.f271380h == kVar.f271380h && this.i == kVar.i && Intrinsics.f(this.f271381j, kVar.f271381j);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f271376a) * 31, 31, this.f271377b), 31, this.f271378c), 31, this.d), 31, this.e), 31, this.f), 31, this.f271379g), 31, this.f271380h), 31, this.i);
        j jVar = this.f271381j;
        return iC + (jVar == null ? 0 : jVar.hashCode());
    }

    public k(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, j jVar) {
        this.f271376a = z;
        this.f271377b = z3;
        this.f271378c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f271379g = z29;
        this.f271380h = z31;
        this.i = z41;
        this.f271381j = jVar;
    }
}
