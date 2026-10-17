package d4e;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111278a;

    public a(int i) {
        this.f111278a = i;
    }

    public final int a() {
        return this.f111278a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f111278a == ((a) obj2).f111278a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f111278a);
    }
}
