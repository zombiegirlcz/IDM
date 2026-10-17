package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class qk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166010c;
    public final boolean d;
    public final boolean e;

    public qk(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f166008a = z;
        this.f166009b = z3;
        this.f166010c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qk)) {
            return false;
        }
        qk qkVar = (qk) obj2;
        return this.f166008a == qkVar.f166008a && this.f166009b == qkVar.f166009b && this.f166010c == qkVar.f166010c && this.d == qkVar.d && this.e == qkVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166008a) * 31, 31, this.f166009b), 31, this.f166010c), 31, this.d);
    }
}
