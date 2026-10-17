package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ph0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165826a;

    public ph0(boolean z) {
        this.f165826a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ph0) && this.f165826a == ((ph0) obj2).f165826a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165826a);
    }
}
