package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165005a;

    public kf(boolean z) {
        this.f165005a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof kf) && this.f165005a == ((kf) obj2).f165005a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165005a);
    }
}
