package xob;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f307778a;

    public p(boolean z) {
        this.f307778a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f307778a == ((p) obj2).f307778a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f307778a);
    }
}
