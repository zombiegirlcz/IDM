package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class r8 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166144c;
    public final boolean d;

    public r8(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f166142a = z;
        this.f166143b = z3;
        this.f166144c = z4;
        this.d = z6;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj2;
        return this.f166142a == r8Var.f166142a && this.f166143b == r8Var.f166143b && this.f166144c == r8Var.f166144c && this.d == r8Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f166142a) * 31, 31, this.f166143b), 31, this.f166144c);
    }
}
