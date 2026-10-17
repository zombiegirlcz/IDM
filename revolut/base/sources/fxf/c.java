package fxf;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f138815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f138816b;

    public c(double d, double d5) {
        this.f138815a = d;
        this.f138816b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Double.compare(this.f138815a, cVar.f138815a) == 0 && Double.compare(this.f138816b, cVar.f138816b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f138816b) + (Double.hashCode(this.f138815a) * 31);
    }
}
