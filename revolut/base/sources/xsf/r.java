package xsf;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f308479a;

    public r() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f308479a == ((r) obj2).f308479a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f308479a);
    }

    public r(boolean z) {
        this.f308479a = z;
    }
}
