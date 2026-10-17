package ci;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a extends knm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f24325a = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f24326b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    public static boolean T(char[] cArr, char c2) {
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }
}
