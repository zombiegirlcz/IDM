package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227352a;

    public m4(boolean z) {
        this.f227352a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m4) && this.f227352a == ((m4) obj2).f227352a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227352a);
    }
}
