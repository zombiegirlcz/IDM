package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227491a;

    public y4(boolean z) {
        this.f227491a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y4) && this.f227491a == ((y4) obj2).f227491a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227491a);
    }
}
