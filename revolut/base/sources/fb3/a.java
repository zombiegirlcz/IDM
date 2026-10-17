package fb3;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f133432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f133433b;

    public a(double d, double d5) {
        this.f133432a = d;
        this.f133433b = d5;
    }

    @Override // fb3.c
    public final double a() {
        return this.f133432a;
    }

    @Override // fb3.c
    public final double b() {
        return this.f133433b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.f133432a, aVar.f133432a) == 0 && Double.compare(this.f133433b, aVar.f133433b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f133433b) + (Double.hashCode(this.f133432a) * 31);
    }
}
