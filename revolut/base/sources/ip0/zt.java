package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class zt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167540c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public zt(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f167538a = z;
        this.f167539b = z3;
        this.f167540c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zt)) {
            return false;
        }
        zt ztVar = (zt) obj2;
        return this.f167538a == ztVar.f167538a && this.f167539b == ztVar.f167539b && this.f167540c == ztVar.f167540c && this.d == ztVar.d && this.e == ztVar.e && this.f == ztVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167538a) * 31, 31, this.f167539b), 31, this.f167540c), 31, this.d), 31, this.e);
    }
}
