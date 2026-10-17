package mt0;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f208728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f208729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f208730c;
    public final boolean d;
    public final boolean e;

    public t(int i, boolean z, boolean z3, boolean z4, boolean z6) {
        this.f208728a = i;
        this.f208729b = z;
        this.f208730c = z3;
        this.d = z4;
        this.e = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f208728a == tVar.f208728a && this.f208729b == tVar.f208729b && this.f208730c == tVar.f208730c && this.d == tVar.d && this.e == tVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Integer.hashCode(this.f208728a) * 31, 31, this.f208729b), 31, this.f208730c), 31, this.d);
    }
}
