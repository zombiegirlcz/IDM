package s2h;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f259348a;

    public g(boolean z) {
        this.f259348a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f259348a == ((g) obj2).f259348a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259348a);
    }
}
