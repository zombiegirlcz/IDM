package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class as implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163489c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f163491h;

    public as(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f163487a = z;
        this.f163488b = z3;
        this.f163489c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f163490g = z29;
        this.f163491h = z31;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f163491h;
    }

    public final boolean b() {
        return this.f163488b;
    }

    public final boolean c() {
        return this.f163490g;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.f163487a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof as)) {
            return false;
        }
        as asVar = (as) obj2;
        return this.f163487a == asVar.f163487a && this.f163488b == asVar.f163488b && this.f163489c == asVar.f163489c && this.d == asVar.d && this.e == asVar.e && this.f == asVar.f && this.f163490g == asVar.f163490g && this.f163491h == asVar.f163491h;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.d;
    }

    public final boolean h() {
        return this.f163489c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163491h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163487a) * 31, 31, this.f163488b), 31, this.f163489c), 31, this.d), 31, this.e), 31, this.f), 31, this.f163490g);
    }
}
