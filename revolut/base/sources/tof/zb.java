package tof;

/* JADX INFO: loaded from: classes8.dex */
public final class zb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f273208a;

    public zb(y2 y2Var) {
        this.f273208a = y2Var;
    }

    public final y2 a() {
        return this.f273208a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof zb) && this.f273208a == ((zb) obj2).f273208a;
    }

    public final int hashCode() {
        y2 y2Var = this.f273208a;
        if (y2Var == null) {
            return 0;
        }
        return y2Var.hashCode();
    }
}
