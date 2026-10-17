package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class nq implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165561c;
    public final boolean d;

    public nq(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f165559a = z;
        this.f165560b = z3;
        this.f165561c = z4;
        this.d = z6;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nq)) {
            return false;
        }
        nq nqVar = (nq) obj2;
        return this.f165559a == nqVar.f165559a && this.f165560b == nqVar.f165560b && this.f165561c == nqVar.f165561c && this.d == nqVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f165559a) * 31, 31, this.f165560b), 31, this.f165561c);
    }
}
