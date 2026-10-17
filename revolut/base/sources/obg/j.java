package obg;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f223944a;

    public j(boolean z) {
        this.f223944a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f223944a == ((j) obj2).f223944a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223944a);
    }
}
