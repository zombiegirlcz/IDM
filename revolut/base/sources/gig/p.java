package gig;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f144202a;

    public p(boolean z) {
        this.f144202a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f144202a == ((p) obj2).f144202a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f144202a);
    }
}
