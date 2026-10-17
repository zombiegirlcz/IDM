package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class z1 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167381b;

    public z1(boolean z, boolean z3) {
        this.f167380a = z;
        this.f167381b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f167381b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return this.f167380a == z1Var.f167380a && this.f167381b == z1Var.f167381b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167381b) + (Boolean.hashCode(this.f167380a) * 31);
    }
}
