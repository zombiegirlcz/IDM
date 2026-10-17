package sy;

/* JADX INFO: loaded from: classes16.dex */
public final class l implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f266547a;

    public l(boolean z) {
        this.f266547a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f266547a == ((l) obj2).f266547a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266547a);
    }
}
