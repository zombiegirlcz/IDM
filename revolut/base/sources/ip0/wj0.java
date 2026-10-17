package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class wj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167039c;
    public final boolean d;

    public wj0(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f167037a = z;
        this.f167038b = z3;
        this.f167039c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wj0)) {
            return false;
        }
        wj0 wj0Var = (wj0) obj2;
        return this.f167037a == wj0Var.f167037a && this.f167038b == wj0Var.f167038b && this.f167039c == wj0Var.f167039c && this.d == wj0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f167037a) * 31, 31, this.f167038b), 31, this.f167039c);
    }
}
