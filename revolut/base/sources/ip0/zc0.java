package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class zc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167446c;
    public final boolean d;

    public zc0(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f167444a = z;
        this.f167445b = z3;
        this.f167446c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zc0)) {
            return false;
        }
        zc0 zc0Var = (zc0) obj2;
        return this.f167444a == zc0Var.f167444a && this.f167445b == zc0Var.f167445b && this.f167446c == zc0Var.f167446c && this.d == zc0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f167444a) * 31, 31, this.f167445b), 31, this.f167446c);
    }
}
