package eh1;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f125697a;

    public n(boolean z) {
        this.f125697a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f125697a == ((n) obj2).f125697a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125697a);
    }
}
