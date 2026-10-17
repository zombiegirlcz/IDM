package f9;

import ch.qos.logback.core.CoreConstants;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes16.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f132802a = String.valueOf(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f132803b = String.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f132804c = new int[1000];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                int i5 = 0;
                while (i5 < 10) {
                    f132804c[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i5 + 48);
                    i5++;
                    i++;
                }
            }
        }
    }

    public static int a(char[] cArr, int i, int i2) {
        int i3 = f132804c[i];
        cArr[i2] = (char) (i3 >> 16);
        int i5 = i2 + 2;
        cArr[i2 + 1] = (char) ((i3 >> 8) & CertificateBody.profileType);
        int i6 = i2 + 3;
        cArr[i5] = (char) (i3 & CertificateBody.profileType);
        return i6;
    }

    public static int b(char[] cArr, int i, int i2) {
        int i3 = f132804c[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i2] = (char) (i3 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i3 >> 8) & CertificateBody.profileType);
            i2++;
        }
        int i5 = i2 + 1;
        cArr[i2] = (char) (i3 & CertificateBody.profileType);
        return i5;
    }

    public static int c(char[] cArr, int i, int i2) {
        int i3 = i / 1000;
        int i5 = i - (i3 * 1000);
        int i6 = i3 / 1000;
        int[] iArr = f132804c;
        int i21 = iArr[i6];
        cArr[i2] = (char) (i21 >> 16);
        cArr[i2 + 1] = (char) ((i21 >> 8) & CertificateBody.profileType);
        cArr[i2 + 2] = (char) (i21 & CertificateBody.profileType);
        int i22 = iArr[i3 - (i6 * 1000)];
        cArr[i2 + 3] = (char) (i22 >> 16);
        cArr[i2 + 4] = (char) ((i22 >> 8) & CertificateBody.profileType);
        cArr[i2 + 5] = (char) (i22 & CertificateBody.profileType);
        int i32 = iArr[i5];
        cArr[i2 + 6] = (char) (i32 >> 16);
        int i33 = i2 + 8;
        cArr[i2 + 7] = (char) ((i32 >> 8) & CertificateBody.profileType);
        int i43 = i2 + 9;
        cArr[i33] = (char) (i32 & CertificateBody.profileType);
        return i43;
    }

    public static int d(char[] cArr, int i, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = f132802a;
                int length = str.length();
                str.getChars(0, length, cArr, i2);
                return length + i2;
            }
            cArr[i2] = CoreConstants.DASH_CHAR;
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i >= 1000) {
                int i5 = i / 1000;
                return a(cArr, i - (i5 * 1000), b(cArr, i5, i2));
            }
            if (i >= 10) {
                return b(cArr, i, i2);
            }
            cArr[i2] = (char) (i + 48);
            return i2 + 1;
        }
        if (i < 1000000000) {
            int i6 = i / 1000;
            int i21 = i6 / 1000;
            return a(cArr, i - (i6 * 1000), a(cArr, i6 - (i21 * 1000), b(cArr, i21, i2)));
        }
        int i22 = i - 1000000000;
        if (i22 >= 1000000000) {
            i22 = i - 2000000000;
            i3 = i2 + 1;
            cArr[i2] = '2';
        } else {
            i3 = i2 + 1;
            cArr[i2] = '1';
        }
        return c(cArr, i22, i3);
    }

    public static int e(long j2, char[] cArr, int i) {
        int iC;
        if (j2 < 0) {
            if (j2 > -2147483648L) {
                return d(cArr, (int) j2, i);
            }
            if (j2 == Long.MIN_VALUE) {
                String str = f132803b;
                int length = str.length();
                str.getChars(0, length, cArr, i);
                return length + i;
            }
            cArr[i] = CoreConstants.DASH_CHAR;
            j2 = -j2;
            i++;
        } else if (j2 <= 2147483647L) {
            return d(cArr, (int) j2, i);
        }
        long j3 = j2 / 1000000000;
        long j5 = j2 - (j3 * 1000000000);
        if (j3 < 1000000000) {
            int i2 = (int) j3;
            int[] iArr = f132804c;
            if (i2 >= 1000000) {
                int i3 = i2 / 1000;
                int i5 = i2 - (i3 * 1000);
                int i6 = i3 / 1000;
                int iB = b(cArr, i6, i);
                int i21 = iArr[i3 - (i6 * 1000)];
                cArr[iB] = (char) (i21 >> 16);
                cArr[iB + 1] = (char) ((i21 >> 8) & CertificateBody.profileType);
                cArr[iB + 2] = (char) (i21 & CertificateBody.profileType);
                int i22 = iArr[i5];
                cArr[iB + 3] = (char) (i22 >> 16);
                int i32 = iB + 5;
                cArr[iB + 4] = (char) ((i22 >> 8) & CertificateBody.profileType);
                iC = iB + 6;
                cArr[i32] = (char) (i22 & CertificateBody.profileType);
            } else if (i2 < 1000) {
                iC = b(cArr, i2, i);
            } else {
                int i33 = i2 / 1000;
                int i43 = i2 - (i33 * 1000);
                int i59 = iArr[i33];
                if (i33 > 9) {
                    if (i33 > 99) {
                        cArr[i] = (char) (i59 >> 16);
                        i++;
                    }
                    cArr[i] = (char) ((i59 >> 8) & CertificateBody.profileType);
                    i++;
                }
                cArr[i] = (char) (i59 & CertificateBody.profileType);
                int i66 = iArr[i43];
                cArr[i + 1] = (char) (i66 >> 16);
                int i74 = i + 3;
                cArr[i + 2] = (char) ((i66 >> 8) & CertificateBody.profileType);
                iC = i + 4;
                cArr[i74] = (char) (i66 & CertificateBody.profileType);
            }
        } else {
            long j16 = j3 / 1000000000;
            int iB2 = b(cArr, (int) j16, i);
            iC = c(cArr, (int) (j3 - (1000000000 * j16)), iB2);
        }
        return c(cArr, (int) j5, iC);
    }
}
