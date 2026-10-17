package bk2;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f16225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f16226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16227c;
    public final sj2.c d;

    public d(double d, double d5, boolean z, sj2.c cVar) {
        this.f16225a = d;
        this.f16226b = d5;
        this.f16227c = z;
        this.d = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Double.compare(this.f16225a, dVar.f16225a) == 0 && Double.compare(this.f16226b, dVar.f16226b) == 0 && this.f16227c == dVar.f16227c && this.d == dVar.d;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.b(15, m72.b.c(Double.hashCode(this.f16225a) * 31, this.f16226b, 31), 31), 31, this.f16227c);
        sj2.c cVar = this.d;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }
}
