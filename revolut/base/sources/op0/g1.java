package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227265a;

    public g1(boolean z) {
        this.f227265a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g1) && this.f227265a == ((g1) obj2).f227265a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227265a);
    }
}
