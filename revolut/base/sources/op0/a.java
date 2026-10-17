package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227154c;
    public final boolean d;
    public final boolean e;

    public a(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f227152a = z;
        this.f227153b = z3;
        this.f227154c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f227152a == aVar.f227152a && this.f227153b == aVar.f227153b && this.f227154c == aVar.f227154c && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227152a) * 31, 31, this.f227153b), 31, this.f227154c), 31, this.d);
    }
}
