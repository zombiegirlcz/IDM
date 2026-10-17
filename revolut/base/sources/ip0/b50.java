package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class b50 {
    private b50() {
    }

    public static c50 a(int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(a0.d.n("itemCount must be > 0, was ", i2).toString());
        }
        if (i < 0 || i >= i2) {
            throw new IllegalArgumentException(a0.d.g(i, i2, "index ", " out of bounds for itemCount ").toString());
        }
        return i == i2 + (-1) ? c50.LAST : i == 0 ? c50.FIRST : c50.MIDDLE;
    }
}
