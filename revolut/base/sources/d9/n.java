package d9;

/* JADX INFO: loaded from: classes16.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f112310c = new n(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112312b;

    public n(int i, int i2) {
        this.f112311a = i;
        this.f112312b = i2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != n.class) {
            return false;
        }
        n nVar = (n) obj2;
        return nVar.f112311a == this.f112311a && nVar.f112312b == this.f112312b;
    }

    public final int hashCode() {
        return this.f112312b + this.f112311a;
    }

    public final String toString() {
        return this == f112310c ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.f112311a), Integer.valueOf(this.f112312b));
    }
}
