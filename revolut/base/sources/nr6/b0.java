package nr6;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f218554a;

    public b0() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && this.f218554a == ((b0) obj2).f218554a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f218554a);
    }

    public b0(boolean z) {
        this.f218554a = z;
    }
}
