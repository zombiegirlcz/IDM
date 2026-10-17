package w5k;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f295341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f295342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f295343c;
    public final boolean d;

    public a(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f295341a = z;
        this.f295342b = z3;
        this.f295343c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f295341a == aVar.f295341a && this.f295342b == aVar.f295342b && this.f295343c == aVar.f295343c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f295341a) * 31, 31, this.f295342b), 31, this.f295343c);
    }
}
