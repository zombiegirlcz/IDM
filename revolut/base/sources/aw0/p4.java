package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class p4 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10465b;

    public p4() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj2;
        return Float.compare(this.f10464a, p4Var.f10464a) == 0 && this.f10465b == p4Var.f10465b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10465b) + (Float.hashCode(this.f10464a) * 31);
    }

    public p4(int i) {
        this.f10464a = 0.05f;
        this.f10465b = 5;
    }
}
