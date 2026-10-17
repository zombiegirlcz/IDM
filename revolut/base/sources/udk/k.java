package udk;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f279260a;

    public k(boolean z) {
        this.f279260a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f279260a == ((k) obj2).f279260a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f279260a);
    }
}
