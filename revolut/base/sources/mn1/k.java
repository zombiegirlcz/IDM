package mn1;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f207343a;

    public k(boolean z) {
        this.f207343a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f207343a == ((k) obj2).f207343a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f207343a);
    }
}
