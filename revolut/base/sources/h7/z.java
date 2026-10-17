package h7;

/* JADX INFO: loaded from: classes23.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149831a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof z) {
            return this.f149831a == ((z) obj2).f149831a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f149831a);
    }

    public final String toString() {
        return "RawRes(resId=" + this.f149831a + ")";
    }
}
