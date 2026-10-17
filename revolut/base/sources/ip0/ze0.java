package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ze0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167455c;
    public final boolean d;

    public ze0(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f167453a = z;
        this.f167454b = z3;
        this.f167455c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ze0)) {
            return false;
        }
        ze0 ze0Var = (ze0) obj2;
        return this.f167453a == ze0Var.f167453a && this.f167454b == ze0Var.f167454b && this.f167455c == ze0Var.f167455c && this.d == ze0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f167453a) * 31, 31, this.f167454b), 31, this.f167455c);
    }
}
