package k8g;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f182144a;

    public l(boolean z) {
        this.f182144a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f182144a == ((l) obj2).f182144a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f182144a);
    }
}
