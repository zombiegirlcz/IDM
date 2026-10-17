package w70;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f295454a;

    public a(int i) {
        this.f295454a = i;
    }

    public final boolean a(int i) {
        return this.f295454a >= i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f295454a == ((a) obj2).f295454a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f295454a);
    }
}
