package tk6;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f271895a;

    public g() {
        this(true);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f271895a == ((g) obj2).f271895a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271895a);
    }

    public g(boolean z) {
        this.f271895a = z;
    }
}
