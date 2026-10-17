package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class wf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167005c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f167006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f167007h;

    public wf0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f167003a = z;
        this.f167004b = z3;
        this.f167005c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f167006g = z29;
        this.f167007h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wf0)) {
            return false;
        }
        wf0 wf0Var = (wf0) obj2;
        return this.f167003a == wf0Var.f167003a && this.f167004b == wf0Var.f167004b && this.f167005c == wf0Var.f167005c && this.d == wf0Var.d && this.e == wf0Var.e && this.f == wf0Var.f && this.f167006g == wf0Var.f167006g && this.f167007h == wf0Var.f167007h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167007h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167003a) * 31, 31, this.f167004b), 31, this.f167005c), 31, this.d), 31, this.e), 31, this.f), 31, this.f167006g);
    }
}
