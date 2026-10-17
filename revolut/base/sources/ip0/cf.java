package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163729c;
    public final boolean d;
    public final boolean e;

    public cf(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f163727a = z;
        this.f163728b = z3;
        this.f163729c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj2;
        return this.f163727a == cfVar.f163727a && this.f163728b == cfVar.f163728b && this.f163729c == cfVar.f163729c && this.d == cfVar.d && this.e == cfVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163727a) * 31, 31, this.f163728b), 31, this.f163729c), 31, this.d);
    }
}
