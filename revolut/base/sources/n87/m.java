package n87;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f213258a;

    public m(boolean z) {
        this.f213258a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f213258a == ((m) obj2).f213258a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213258a);
    }
}
