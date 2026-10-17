package k0h;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f180045a;

    public b(boolean z) {
        this.f180045a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f180045a == ((b) obj2).f180045a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f180045a);
    }
}
