package pig;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f236491a;

    public n(boolean z) {
        this.f236491a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f236491a == ((n) obj2).f236491a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f236491a);
    }
}
