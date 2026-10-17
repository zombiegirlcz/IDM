package neg;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f214521a;

    public m(boolean z) {
        this.f214521a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f214521a == ((m) obj2).f214521a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f214521a);
    }
}
