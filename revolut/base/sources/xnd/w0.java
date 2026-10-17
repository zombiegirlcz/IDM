package xnd;

/* JADX INFO: loaded from: classes7.dex */
public final class w0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f307465a;

    public w0(int i) {
        this.f307465a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w0) && this.f307465a == ((w0) obj2).f307465a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f307465a);
    }
}
