package anc;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6754a;

    public p(boolean z) {
        this.f6754a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f6754a == ((p) obj2).f6754a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6754a);
    }
}
