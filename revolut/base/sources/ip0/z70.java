package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class z70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167414c;
    public final boolean d;
    public final boolean e;

    public z70(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f167412a = z;
        this.f167413b = z3;
        this.f167414c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z70)) {
            return false;
        }
        z70 z70Var = (z70) obj2;
        return this.f167412a == z70Var.f167412a && this.f167413b == z70Var.f167413b && this.f167414c == z70Var.f167414c && this.d == z70Var.d && this.e == z70Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167412a) * 31, 31, this.f167413b), 31, this.f167414c), 31, this.d);
    }
}
