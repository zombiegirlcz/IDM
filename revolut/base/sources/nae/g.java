package nae;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f213869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f213870b;

    public g(int i, int i2) {
        this.f213869a = i;
        this.f213870b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f213869a == gVar.f213869a && this.f213870b == gVar.f213870b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f213870b) + (Integer.hashCode(this.f213869a) * 31);
    }
}
