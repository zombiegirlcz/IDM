package b9;

/* JADX INFO: loaded from: classes16.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13487b;

    public v(long j2, int i) {
        this.f13487b = j2;
        this.f13486a = i;
    }

    public static v a(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j2 = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            if (j2 > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new v(j2, i3);
    }
}
