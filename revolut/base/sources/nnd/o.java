package nnd;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217574a;

    public o(int i) {
        this.f217574a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f217574a == ((o) obj2).f217574a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f217574a);
    }
}
