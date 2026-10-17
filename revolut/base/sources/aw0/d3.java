package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class d3 extends h3 {
    public final int d;
    public final int e;
    public final int f;

    public d3(int i, int i2, int i3) {
        super(i, i2, i3);
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    @Override // aw0.h3
    public final int a() {
        return this.f;
    }

    @Override // aw0.h3
    public final int b() {
        return this.e;
    }

    @Override // aw0.h3
    public final int c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return this.d == d3Var.d && this.e == d3Var.e && this.f == d3Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, Integer.hashCode(this.d) * 31, 31);
    }
}
