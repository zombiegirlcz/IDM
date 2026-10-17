package hi;

import com.google.zxing.WriterException;
import com.youTransactor.uCube.rpc.Constants;
import es0.e;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes17.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f152438a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f152439b = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f152440c = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] d = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, LDSFile.EF_DG14_TAG, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, LDSFile.EF_DG4_TAG, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, LDSFile.EF_DG12_TAG, ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, LDSFile.EF_DG4_TAG, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, Constants.EMVTag.TAG_9A_TRANSACTION_DATE}, new int[]{6, 28, 54, 80, 106, 132, ISO781611.SMT_DO_DS}, new int[]{6, 32, 58, 84, LDSFile.EF_DG14_TAG, 136, 162}, new int[]{6, 26, 54, 82, LDSFile.EF_DG14_TAG, 138, Constants.TAG_PAYMENT_APP_CLESS_VERSION}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] e = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(e eVar, boolean z) {
        int i = eVar.f128826b;
        int i2 = eVar.f128827c;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = (byte[][]) eVar.d;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            byte b4 = -1;
            int i21 = 0;
            for (int i22 = 0; i22 < i; i22++) {
                byte b5 = z ? bArr[i6][i22] : bArr[i22][i6];
                if (b5 == b4) {
                    i21++;
                } else {
                    if (i21 >= 5) {
                        i5 += i21 - 2;
                    }
                    i21 = 1;
                    b4 = b5;
                }
            }
            if (i21 >= 5) {
                i5 = (i21 - 2) + i5;
            }
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(yh.a r25, gi.a r26, gi.c r27, int r28, es0.e r29) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.c.b(yh.a, gi.a, gi.c, int, es0.e):void");
    }

    public static int c(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
        int i3 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i3) {
            iNumberOfLeadingZeros2 ^= i2 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i3);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void d(int i, int i2, e eVar) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i5 = i + i3;
            if (!g(eVar.a(i5, i2))) {
                throw new WriterException();
            }
            eVar.b(i5, i2, 0);
        }
    }

    public static void e(int i, int i2, e eVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f152439b[i3];
            for (int i5 = 0; i5 < 7; i5++) {
                eVar.b(i + i5, i2 + i3, iArr[i5]);
            }
        }
    }

    public static void f(int i, int i2, e eVar) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i5 = i2 + i3;
            if (!g(eVar.a(i, i5))) {
                throw new WriterException();
            }
            eVar.b(i, i5, 0);
        }
    }

    public static boolean g(int i) {
        return i == -1;
    }
}
