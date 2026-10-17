package ocb;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f224205a;

    public z(boolean z) {
        this.f224205a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && this.f224205a == ((z) obj2).f224205a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224205a);
    }
}
