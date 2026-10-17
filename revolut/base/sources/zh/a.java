package zh;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f322195g = new a(4201, 4096, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f322196h = new a(1033, 1024, 1);
    public static final a i = new a(67, 64, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f322197j = new a(19, 16, 1);
    public static final a k = new a(285, 256, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f322198l = new a(301, 256, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f322199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f322200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f322201c;
    public final int d;
    public final int e;
    public final int f;

    public a(int i2, int i3, int i5) {
        this.e = i2;
        this.d = i3;
        this.f = i5;
        this.f322199a = new int[i3];
        this.f322200b = new int[i3];
        int i6 = 1;
        for (int i21 = 0; i21 < i3; i21++) {
            this.f322199a[i21] = i6;
            i6 <<= 1;
            if (i6 >= i3) {
                i6 = (i6 ^ i2) & (i3 - 1);
            }
        }
        for (int i22 = 0; i22 < i3 - 1; i22++) {
            this.f322200b[this.f322199a[i22]] = i22;
        }
        this.f322201c = new b(this, new int[]{0});
    }

    public final int a(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.f322200b;
        return this.f322199a[(iArr[i2] + iArr[i3]) % (this.d - 1)];
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("GF(0x");
        sb6.append(Integer.toHexString(this.e));
        sb6.append(CoreConstants.COMMA_CHAR);
        return j6.a.t(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
