package f3e;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f131961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f131962b;

    public c(double d, double d5) {
        this.f131961a = d;
        this.f131962b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Double.compare(this.f131961a, cVar.f131961a) == 0 && Double.compare(this.f131962b, cVar.f131962b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f131962b) + (Double.hashCode(this.f131961a) * 31);
    }
}
