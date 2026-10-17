package b33;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11988a;

    public d(int i) {
        this.f11988a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f11988a == ((d) obj2).f11988a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11988a);
    }
}
