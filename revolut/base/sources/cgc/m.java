package cgc;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23921a;

    public m(int i) {
        this.f23921a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f23921a == ((m) obj2).f23921a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23921a);
    }
}
