package pni;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f237818a;

    public n(boolean z) {
        this.f237818a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f237818a == ((n) obj2).f237818a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237818a);
    }
}
