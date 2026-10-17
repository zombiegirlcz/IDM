package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class x9 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167113c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public x9(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f167111a = z;
        this.f167112b = z3;
        this.f167113c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj2;
        return this.f167111a == x9Var.f167111a && this.f167112b == x9Var.f167112b && this.f167113c == x9Var.f167113c && this.d == x9Var.d && this.e == x9Var.e && this.f == x9Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167111a) * 31, 31, this.f167112b), 31, this.f167113c), 31, this.d), 31, this.e);
    }
}
