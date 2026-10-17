package j2f;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f170852a;

    public j(boolean z) {
        this.f170852a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f170852a == ((j) obj2).f170852a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f170852a);
    }
}
