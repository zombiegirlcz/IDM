package h7a;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149864a;

    public a(int i) {
        this.f149864a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f149864a == ((a) obj2).f149864a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f149864a);
    }
}
