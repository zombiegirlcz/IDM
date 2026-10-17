package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class z80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167419c;
    public final boolean d;

    public z80(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f167417a = z;
        this.f167418b = z3;
        this.f167419c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z80)) {
            return false;
        }
        z80 z80Var = (z80) obj2;
        return this.f167417a == z80Var.f167417a && this.f167418b == z80Var.f167418b && this.f167419c == z80Var.f167419c && this.d == z80Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f167417a) * 31, 31, this.f167418b), 31, this.f167419c);
    }
}
