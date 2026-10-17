package iim;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kim.a f161642a = new kim.a();

    public static final int a(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i5 = i2 % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = i % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                int i21 = (i5 - i6) % i3;
                if (i21 < 0) {
                    i21 += i3;
                }
                return i2 - i21;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i22 = -i3;
                int i32 = i % i22;
                if (i32 < 0) {
                    i32 += i22;
                }
                int i33 = i2 % i22;
                if (i33 < 0) {
                    i33 += i22;
                }
                int i43 = (i32 - i33) % i22;
                if (i43 < 0) {
                    i43 += i22;
                }
                return i43 + i2;
            }
        }
        return i2;
    }
}
