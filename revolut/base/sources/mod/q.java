package mod;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f207632b;

    public q(int i) {
        this.f207632b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f207632b == ((q) obj2).f207632b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f207632b);
    }
}
