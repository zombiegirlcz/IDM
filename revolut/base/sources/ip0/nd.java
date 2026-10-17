package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class nd implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165494c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public nd(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f165492a = z;
        this.f165493b = z3;
        this.f165494c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nd)) {
            return false;
        }
        nd ndVar = (nd) obj2;
        return this.f165492a == ndVar.f165492a && this.f165493b == ndVar.f165493b && this.f165494c == ndVar.f165494c && this.d == ndVar.d && this.e == ndVar.e && this.f == ndVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165492a) * 31, 31, this.f165493b), 31, this.f165494c), 31, this.d), 31, this.e);
    }
}
