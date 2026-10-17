package ci;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f24327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f24328b = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f24329c = {'/', CoreConstants.COLON_CHAR, '+', CoreConstants.DOT};
    public static final char d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f24327a = cArr;
        d = cArr[0];
    }

    @Override // kotlin.jvm.internal.s
    public final boolean[] d(String str) {
        int i;
        int length = str.length();
        char c2 = d;
        if (length < 2) {
            str = c2 + str + c2;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f24327a;
            boolean zT = a.T(cArr, upperCase);
            boolean zT2 = a.T(cArr, upperCase2);
            char[] cArr2 = f24328b;
            boolean zT3 = a.T(cArr2, upperCase);
            boolean zT4 = a.T(cArr2, upperCase2);
            if (zT) {
                if (!zT2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zT3) {
                if (zT2 || zT4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                str = c2 + str + c2;
            } else if (!zT4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!a.T(f24329c, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + CoreConstants.SINGLE_QUOTE_CHAR);
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i2];
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i6));
            if (i6 == 0 || i6 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i21 = 0;
            while (true) {
                char[] cArr3 = a.f24325a;
                if (i21 >= cArr3.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i21]) {
                    i = a.f24326b[i21];
                    break;
                }
                i21++;
            }
            int i22 = 0;
            int i32 = 0;
            boolean z = true;
            while (i22 < 7) {
                zArr[i5] = z;
                i5++;
                if (((i >> (6 - i22)) & 1) == 0 || i32 == 1) {
                    z = !z;
                    i22++;
                    i32 = 0;
                } else {
                    i32++;
                }
            }
            if (i6 < str.length() - 1) {
                zArr[i5] = false;
                i5++;
            }
        }
        return zArr;
    }
}
