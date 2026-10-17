package q9c;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f243872a;

    public n(boolean z) {
        this.f243872a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f243872a == ((n) obj2).f243872a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f243872a);
    }
}
