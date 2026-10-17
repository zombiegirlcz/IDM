package d4i;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f111328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f111329c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f111330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f111331h;
    public final boolean i;

    public e() {
        this(false, false, 511);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f111327a == eVar.f111327a && this.f111328b == eVar.f111328b && this.f111329c == eVar.f111329c && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && this.f111330g == eVar.f111330g && this.f111331h == eVar.f111331h && this.i == eVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f111327a) * 31, 31, this.f111328b), 31, this.f111329c), 31, this.d), 31, this.e), 31, this.f), 31, this.f111330g), 31, this.f111331h);
    }

    public e(boolean z, boolean z3, int i) {
        boolean z4 = (i & 1) != 0;
        boolean z6 = (i & 4) != 0;
        boolean z11 = (i & 8) != 0;
        boolean z12 = (i & 16) != 0;
        boolean z29 = (i & 32) != 0;
        z = (i & 64) != 0 ? false : z;
        z3 = (i & 128) != 0 ? false : z3;
        boolean z31 = (i & 256) == 0;
        this.f111327a = z4;
        this.f111328b = true;
        this.f111329c = z6;
        this.d = z11;
        this.e = z12;
        this.f = z29;
        this.f111330g = z;
        this.f111331h = z3;
        this.i = z31;
    }
}
