package gsb;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f146364a;

    public o(int i) {
        this.f146364a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f146364a == ((o) obj2).f146364a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f146364a);
    }
}
