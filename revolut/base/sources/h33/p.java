package h33;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f149034a;

    public p(boolean z) {
        this.f149034a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f149034a == ((p) obj2).f149034a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149034a);
    }
}
