package in8;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f162693a;

    public g(boolean z) {
        this.f162693a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f162693a == ((g) obj2).f162693a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162693a);
    }
}
