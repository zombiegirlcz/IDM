package com.revolut;

import android.graphics.Bitmap;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.Deflater;
import net.sf.scuba.smartcards.ISO7816;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes.dex */
public class ProtectedRevolutApplication$ProtectedRevolutApplication$q {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ED = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f50268c = 1;

    /* JADX INFO: renamed from: gq, reason: collision with root package name */
    private static final int f50269gq = 30;
    private static final int iup = 40;
    private static final int u = 3;

    /* JADX INFO: renamed from: weg, reason: collision with root package name */
    private static final int f50270weg = 10;
    private static final int zcx = 40;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f50267b = D(40);
    private static final byte[][] FwJG = {new byte[]{-1, 7, 10, 15, Ascii.DC4, Ascii.SUB, 18, Ascii.DC4, Ascii.CAN, 30, 18, Ascii.DC4, Ascii.CAN, Ascii.SUB, 30, Ascii.SYN, Ascii.CAN, 28, 30, 28, 28, 28, 28, 30, 30, Ascii.SUB, 28, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30}, new byte[]{-1, 10, 16, Ascii.SUB, 18, Ascii.CAN, 16, 18, Ascii.SYN, Ascii.SYN, Ascii.SUB, 30, Ascii.SYN, Ascii.SYN, Ascii.CAN, Ascii.CAN, 28, 28, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28}, new byte[]{-1, 13, Ascii.SYN, 18, Ascii.SUB, 18, Ascii.CAN, 18, Ascii.SYN, Ascii.DC4, Ascii.CAN, 28, Ascii.SUB, Ascii.CAN, Ascii.DC4, 30, Ascii.CAN, 28, 28, Ascii.SUB, 30, 28, 30, 30, 30, 30, 28, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30}, new byte[]{-1, 17, 28, Ascii.SYN, 16, Ascii.SYN, 28, Ascii.SUB, Ascii.SUB, Ascii.CAN, 28, Ascii.CAN, 28, Ascii.SYN, Ascii.CAN, Ascii.CAN, 30, 28, 28, Ascii.SUB, 28, 30, Ascii.CAN, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30}};
    private static final byte[][] dEhF = {new byte[]{-1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 4, 4, 4, 4, 4, 6, 6, 6, 6, 7, 8, 8, 9, 9, 10, 12, 12, 12, 13, 14, 15, 16, 17, 18, 19, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.CAN, Ascii.EM}, new byte[]{-1, 1, 1, 1, 2, 2, 4, 4, 4, 5, 5, 5, 8, 9, 9, 10, 10, 11, 13, 14, 16, 17, 17, 18, Ascii.DC4, Ascii.NAK, Ascii.ETB, Ascii.EM, Ascii.SUB, 28, 29, Ascii.US, Constants.NFC_READER, 35, 37, 38, 40, 43, 45, 47, Constants.INQUIRY}, new byte[]{-1, 1, 1, 2, 2, 4, 4, 6, 6, 8, 8, 8, 10, 12, 16, 12, 17, 16, 18, Ascii.NAK, Ascii.DC4, Ascii.ETB, Ascii.ETB, Ascii.EM, Ascii.ESC, 29, ISO7816.INS_MSE, ISO7816.INS_MSE, 35, 38, 40, 43, 45, ISO7816.INS_DECREASE, 51, 53, 56, 59, 62, 65, ISO7816.INS_REHABILITATE_CHV}, new byte[]{-1, 1, 1, 2, 4, 4, 4, 5, 6, 8, 8, 11, 11, 16, 16, 18, 16, 19, Ascii.NAK, Ascii.EM, Ascii.EM, Ascii.EM, ISO7816.INS_MSE, 30, 32, 35, 37, 40, ISO7816.INS_PSO, 45, ISO7816.INS_DECREASE, 51, 54, 57, 60, 63, CVCAFile.CAR_TAG, 70, 74, 77, 81}};
    public static int qD = 0;
    public static int kEB = 1;
    public static int gBp = 2;
    public static int qq = 3;

    private static int Cn(int i, int i2) {
        if (i2 < 0 || i2 >= 4) {
            throw new AssertionError();
        }
        return (bha(i) / 8) - (FwJG[i2][i] * dEhF[i2][i]);
    }

    public static Bitmap CtG(byte[] bArr, int i, int i2, int i3) {
        int iHw = hw(bArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[i * i2];
        float f = i / ((i3 * 2) + iHw);
        float f4 = i2 / ((i3 * 2) + iHw);
        float f5 = f * i3;
        float f6 = f4 * i3;
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < i2; i6++) {
                if (i5 < f5 || i6 < f6 || i5 > i - f5 || i6 > i2 - f6) {
                    iArr[(i6 * i) + i5] = -1;
                } else {
                    iArr[(i6 * i) + i5] = cxm(bArr, (int) ((((float) i5) - f5) / f), (int) ((((float) i6) - f6) / f4)) ? -16777216 : -1;
                }
            }
        }
        bitmapCreateBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return bitmapCreateBitmap;
    }

    private static int D(int i) {
        return (((((i * 4) + 17) * ((i * 4) + 17)) + 7) / 8) + 1;
    }

    private static void E(byte[] bArr, int i, int i2, byte[] bArr2) {
        byte b4 = dEhF[i2][i];
        byte b5 = FwJG[i2][i];
        int iBha = bha(i) / 8;
        int iCn = Cn(i, i2);
        int i3 = b4 - (iBha % b4);
        int i5 = (iBha / b4) - b5;
        byte[] bArr3 = new byte[30];
        j(b5, bArr3);
        ProtectedRevolutApplication$RevolutApplication$a protectedRevolutApplication$RevolutApplication$a = new ProtectedRevolutApplication$RevolutApplication$a(bArr);
        ProtectedRevolutApplication$RevolutApplication$a protectedRevolutApplication$RevolutApplication$a2 = new ProtectedRevolutApplication$RevolutApplication$a(bArr);
        int i6 = 0;
        while (i6 < b4) {
            int i21 = (i6 < i3 ? 0 : 1) + i5;
            ProtectedRevolutApplication$RevolutApplication$a protectedRevolutApplication$RevolutApplication$aIg = protectedRevolutApplication$RevolutApplication$a2.ig(iCn);
            bkGq(protectedRevolutApplication$RevolutApplication$a, i21, bArr3, b5, protectedRevolutApplication$RevolutApplication$aIg);
            int i22 = 0;
            int i32 = i6;
            while (i22 < i21) {
                if (i22 == i5) {
                    i32 -= i3;
                }
                bArr2[i32] = protectedRevolutApplication$RevolutApplication$a.ebCA(i22);
                i22++;
                i32 += b4;
            }
            int i33 = 0;
            int i43 = iCn + i6;
            while (i33 < b5) {
                bArr2[i43] = protectedRevolutApplication$RevolutApplication$aIg.ebCA(i33);
                i33++;
                i43 += b4;
            }
            protectedRevolutApplication$RevolutApplication$a.xzF(i21);
            i6++;
        }
    }

    public static byte[] EeJH(byte[] bArr, int i, boolean z) {
        int i2 = f50267b;
        byte[] bArr2 = new byte[i2];
        byte[] bArr3 = new byte[i2];
        int iMin = Math.min(bArr.length, s(i));
        System.arraycopy(bArr, 0, bArr3, 0, iMin);
        int i3 = iMin * 8;
        int i5 = 1;
        while (true) {
            int i6 = i;
            int iCn = Cn(i5, i6) * 8;
            int iOE = oE(iMin, i3, i5);
            if (iOE != -1 && iOE <= iCn) {
                for (int i21 = i; i21 <= qq; i21++) {
                    if (z && iOE <= Cn(i5, i21) * 8) {
                        i6 = i21;
                    }
                }
                int iMmm = mmm(iMin, nqv(i5), bArr2, mmm(4, 4, bArr2, 0));
                for (int i22 = 0; i22 < i3; i22++) {
                    iMmm = mmm((g(bArr3[i22 >>> 3]) >>> (7 - (i22 & 7))) & 1, 1, bArr2, iMmm);
                }
                if (iMmm != iOE) {
                    throw new AssertionError();
                }
                int iCn2 = Cn(i5, i6) * 8;
                if (iMmm > iCn2) {
                    throw new AssertionError();
                }
                int i32 = iCn2 - iMmm;
                if (i32 > 4) {
                    i32 = 4;
                }
                int iMmm2 = mmm(0, i32, bArr2, iMmm);
                int iMmm3 = mmm(0, (8 - (iMmm2 % 8)) % 8, bArr2, iMmm2);
                if (iMmm3 % 8 != 0) {
                    throw new AssertionError();
                }
                int i33 = Constants.TAG_OS_VERSION;
                while (iMmm3 < iCn2) {
                    iMmm3 = mmm(i33, 8, bArr2, iMmm3);
                    i33 ^= Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION;
                }
                E(bArr2, i5, i6, bArr3);
                v(i5, bArr2);
                xhgC(bArr3, bha(i5) / 8, bArr2);
                bEin(bArr2, i5);
                v(i5, bArr3);
                long j2 = Long.MAX_VALUE;
                int i43 = -1;
                for (int i59 = 0; i59 < 8; i59++) {
                    rBb(bArr3, bArr2, i59);
                    vcBh(i6, i59, bArr2);
                    long jFCc = FCc(bArr2);
                    if (jFCc < j2) {
                        i43 = i59;
                        j2 = jFCc;
                    }
                    rBb(bArr3, bArr2, i59);
                }
                rBb(bArr3, bArr2, i43);
                vcBh(i6, i43, bArr2);
                return bArr2;
            }
            if (i5 >= 40) {
                bArr2[0] = 0;
                return bArr2;
            }
            i5++;
        }
    }

    static long FCc(byte[] bArr) {
        int i;
        long j2;
        int iHw = hw(bArr);
        long jXyl = 0;
        int i2 = 0;
        while (true) {
            i = 7;
            j2 = 1;
            if (i2 >= iHw) {
                break;
            }
            boolean zOaCu = false;
            int i3 = 0;
            int[] iArr = new int[7];
            for (int i5 = 0; i5 < iHw; i5++) {
                if (oaCu(bArr, i5, i2) == zOaCu) {
                    i3++;
                    if (i3 == 5) {
                        jXyl += 3;
                    } else if (i3 > 5) {
                        jXyl++;
                    }
                } else {
                    iw(i3, iArr, iHw);
                    if (!zOaCu) {
                        jXyl += ((long) H(iArr, iHw)) * 40;
                    }
                    zOaCu = oaCu(bArr, i5, i2);
                    i3 = 1;
                }
            }
            jXyl += ((long) xyl(zOaCu, i3, iArr, iHw)) * 40;
            i2++;
        }
        int i6 = 0;
        while (i6 < iHw) {
            boolean zOaCu2 = false;
            int i21 = 0;
            int[] iArr2 = new int[i];
            int i22 = 0;
            while (i22 < iHw) {
                if (oaCu(bArr, i6, i22) == zOaCu2) {
                    i21++;
                    if (i21 == 5) {
                        jXyl += 3;
                    } else if (i21 > 5) {
                        jXyl += j2;
                    }
                } else {
                    iw(i21, iArr2, iHw);
                    if (!zOaCu2) {
                        jXyl += ((long) H(iArr2, iHw)) * 40;
                    }
                    zOaCu2 = oaCu(bArr, i6, i22);
                    i21 = 1;
                }
                i22++;
                j2 = 1;
            }
            jXyl += ((long) xyl(zOaCu2, i21, iArr2, iHw)) * 40;
            i6++;
            i = 7;
            j2 = 1;
        }
        for (int i32 = 0; i32 < iHw - 1; i32++) {
            for (int i33 = 0; i33 < iHw - 1; i33++) {
                boolean zOaCu3 = oaCu(bArr, i33, i32);
                if (zOaCu3 == oaCu(bArr, i33 + 1, i32) && zOaCu3 == oaCu(bArr, i33, i32 + 1) && zOaCu3 == oaCu(bArr, i33 + 1, i32 + 1)) {
                    jXyl += 3;
                }
            }
        }
        int i43 = 0;
        for (int i59 = 0; i59 < iHw; i59++) {
            for (int i66 = 0; i66 < iHw; i66++) {
                if (oaCu(bArr, i66, i59)) {
                    i43++;
                }
            }
        }
        int i74 = iHw * iHw;
        int iAbs = ((int) (((Math.abs((((long) i43) * 20) - (((long) i74) * 10)) + ((long) i74)) - 1) / ((long) i74))) - 1;
        if (iAbs < 0 || iAbs > 9) {
            throw new AssertionError();
        }
        long j3 = jXyl + (((long) iAbs) * 10);
        if (0 > j3 || j3 > 2568888) {
            throw new AssertionError();
        }
        return j3;
    }

    private static int FJA(int i, int[] iArr) {
        if (i == 1) {
            return 0;
        }
        int i2 = (i / 7) + 2;
        int i3 = i == 32 ? 26 : ((((i * 4) + (i2 * 2)) + 1) / ((i2 * 2) - 2)) * 2;
        int i5 = i2 - 1;
        int i6 = (i * 4) + 10;
        while (i5 >= 1) {
            iArr[i5] = i6;
            i5--;
            i6 -= i3;
        }
        iArr[0] = 6;
        return i2;
    }

    private static void G(int i, int i2, int i3, int i5, byte[] bArr) {
        for (int i6 = 0; i6 < i5; i6++) {
            for (int i21 = 0; i21 < i3; i21++) {
                x(bArr, i + i21, i2 + i6, true);
            }
        }
    }

    static int H(int[] iArr, int i) {
        int i2 = iArr[1];
        if (i2 > i * 3) {
            throw new AssertionError();
        }
        boolean z = i2 > 0 && iArr[2] == i2 && iArr[3] == i2 * 3 && iArr[4] == i2 && iArr[5] == i2;
        return ((!z || iArr[0] < i2 * 4 || iArr[6] < i2) ? 0 : 1) + ((!z || iArr[6] < i2 * 4 || iArr[0] < i2) ? 0 : 1);
    }

    static void Hzk(ProtectedRevolutApplication$RevolutApplication$a protectedRevolutApplication$RevolutApplication$a, int i, ProtectedRevolutApplication$RevolutApplication$a protectedRevolutApplication$RevolutApplication$a2, int i2, int i3) {
        protectedRevolutApplication$RevolutApplication$a.yy(protectedRevolutApplication$RevolutApplication$a2.ime(i2, i3), i);
    }

    static void Hzk(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        System.arraycopy(Arrays.copyOfRange(iArr2, i2, i2 + i3), 0, iArr, i, i3);
    }

    private static void bEin(byte[] bArr, int i) {
        int i2;
        int iHw = hw(bArr);
        int i3 = 7;
        while (true) {
            if (i3 >= iHw - 7) {
                break;
            }
            x(bArr, 6, i3, false);
            x(bArr, i3, 6, false);
            i3 += 2;
        }
        for (int i5 = -4; i5 <= 4; i5++) {
            for (int i6 = -4; i6 <= 4; i6++) {
                int iAbs = Math.abs(i6);
                if (Math.abs(i5) > iAbs) {
                    iAbs = Math.abs(i5);
                }
                if (iAbs == 2 || iAbs == 4) {
                    zIcc(bArr, i6 + 3, i5 + 3, false);
                    zIcc(bArr, (iHw - 4) + i6, i5 + 3, false);
                    zIcc(bArr, i6 + 3, (iHw - 4) + i5, false);
                }
            }
        }
        int[] iArr = new int[7];
        int iFJA = FJA(i, iArr);
        for (int i21 = 0; i21 < iFJA; i21++) {
            for (int i22 = 0; i22 < iFJA; i22++) {
                if ((i21 != 0 || i22 != 0) && ((i21 != 0 || i22 != iFJA - 1) && (i21 != iFJA - 1 || i22 != 0))) {
                    int i32 = -1;
                    while (i32 <= 1) {
                        int i33 = -1;
                        while (i33 <= 1) {
                            x(bArr, iArr[i21] + i33, iArr[i22] + i32, i33 == 0 && i32 == 0);
                            i33++;
                        }
                        i32++;
                    }
                }
            }
        }
        if (i >= 7) {
            int i43 = i;
            for (int i59 = 0; i59 < 12; i59++) {
                i43 = (i43 << 1) ^ ((i43 >>> 11) * 7973);
            }
            long j2 = (((long) i) << 12) | ((long) i43);
            if ((j2 >>> 18) != 0) {
                throw new AssertionError();
            }
            int i66 = 0;
            for (i2 = 6; i66 < i2; i2 = 6) {
                for (int i74 = 0; i74 < 3; i74++) {
                    int i92 = (iHw - 11) + i74;
                    x(bArr, i92, i66, (j2 & 1) != 0);
                    x(bArr, i66, i92, (j2 & 1) != 0);
                    j2 >>>= 1;
                }
                i66++;
            }
        }
    }

    private static int bha(int i) {
        if (1 > i || i > 40) {
            throw new AssertionError();
        }
        int i2 = (((i * 16) + 128) * i) + 64;
        if (i >= 2) {
            int i3 = (i / 7) + 2;
            i2 -= (((i3 * 25) - 10) * i3) - 55;
            if (i >= 7) {
                i2 -= 36;
            }
        }
        if (208 > i2 || i2 > 29648) {
            throw new AssertionError();
        }
        return i2;
    }

    private static void bkGq(ProtectedRevolutApplication$RevolutApplication$a protectedRevolutApplication$RevolutApplication$a, int i, byte[] bArr, int i2, ProtectedRevolutApplication$RevolutApplication$a protectedRevolutApplication$RevolutApplication$a2) {
        if (1 > i2 || i2 > 30) {
            throw new AssertionError();
        }
        protectedRevolutApplication$RevolutApplication$a2.aDG(0, i2);
        for (int i3 = 0; i3 < i; i3++) {
            byte bEy = (byte) ((protectedRevolutApplication$RevolutApplication$a.ey(i3) ^ protectedRevolutApplication$RevolutApplication$a2.ey(0)) & 255);
            Hzk(protectedRevolutApplication$RevolutApplication$a2, 0, protectedRevolutApplication$RevolutApplication$a2, 1, i2 - 1);
            protectedRevolutApplication$RevolutApplication$a2.li(i2 - 1, (byte) 0);
            for (int i5 = 0; i5 < i2; i5++) {
                protectedRevolutApplication$RevolutApplication$a2.li(i5, (byte) ((protectedRevolutApplication$RevolutApplication$a2.ey(i5) ^ g(lwu(bArr[i5], bEy))) & 255));
            }
        }
    }

    public static boolean cxm(byte[] bArr, int i, int i2) {
        int iG = g(bArr[0]);
        return i >= 0 && i < iG && i2 >= 0 && i2 < iG && oaCu(bArr, i, i2);
    }

    static byte[] eFe(byte[] bArr) {
        int length = bArr.length;
        int iS = s(qD);
        while (true) {
            byte[] bArrOvC = ovC(bArr, length);
            if (bArrOvC.length <= iS) {
                return bArrOvC;
            }
            length = ((int) ((iS / bArrOvC.length) * length)) - 32;
        }
    }

    public static Bitmap f(byte[] bArr, int i, boolean z, int i2, int i3) {
        return CtG(EeJH(bArr, i, z), i2, i3, 6);
    }

    public static int g(byte b4) {
        return b4 & UnsignedBytes.MAX_VALUE;
    }

    public static int hw(byte[] bArr) {
        if (bArr == null) {
            throw new AssertionError();
        }
        int iG = g(bArr[0]);
        if (21 > iG || iG > 177) {
            throw new AssertionError();
        }
        return iG;
    }

    static void iw(int i, int[] iArr, int i2) {
        if (iArr[0] == 0) {
            i += i2;
        }
        Hzk(iArr, 1, iArr, 0, 6);
        iArr[0] = i;
    }

    private static void j(int i, byte[] bArr) {
        if (1 > i || i > 30) {
            throw new AssertionError();
        }
        Arrays.fill(bArr, (byte) 0);
        bArr[i - 1] = 1;
        byte bLwu = 1;
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = lwu(bArr[i3], bLwu);
                if (i3 + 1 < i) {
                    bArr[i3] = (byte) (bArr[i3] ^ bArr[i3 + 1]);
                }
            }
            bLwu = lwu(bLwu, (byte) 2);
        }
    }

    private static byte lwu(byte b4, byte b5) {
        int iG = g(b4);
        int iG2 = g(b5);
        int i = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            i = ((i << 1) ^ ((i >>> 7) * 285)) ^ (((iG2 >>> i2) & 1) * iG);
        }
        return (byte) (i & 255);
    }

    private static int mmm(int i, int i2, byte[] bArr, int i3) {
        int i5 = i2 - 1;
        while (i5 >= 0) {
            int i6 = i3 >>> 3;
            bArr[i6] = (byte) ((g(bArr[i6]) | (((i >>> i5) & 1) << (7 - (i3 & 7)))) & 255);
            i5--;
            i3++;
        }
        return i3;
    }

    private static int nqv(int i) {
        if (1 > i || i > 40) {
            throw new AssertionError();
        }
        return (i + 7) / 17 == 0 ? 8 : 16;
    }

    private static int oE(int i, int i2, int i3) {
        if (i < 0 || i > 32767) {
            throw new AssertionError();
        }
        if (i2 < 0 || i2 > 32767) {
            throw new AssertionError();
        }
        int iNqv = nqv(i3);
        if (iNqv < 0 || iNqv > 16) {
            throw new AssertionError();
        }
        if (i >= (1 << iNqv)) {
            return -1;
        }
        long j2 = 0 + ((long) iNqv) + 4 + ((long) i2);
        if (j2 > 32767) {
            return -1;
        }
        return (int) j2;
    }

    private static boolean oaCu(byte[] bArr, int i, int i2) {
        int iG = g(bArr[0]);
        if (21 > iG || iG > 177 || i < 0 || i >= iG || i2 < 0 || i2 >= iG) {
            throw new AssertionError();
        }
        int i3 = (i2 * iG) + i;
        return uk(g(bArr[(i3 >>> 3) + 1]), i3 & 7);
    }

    private static byte[] ovC(byte[] bArr, int i) {
        Deflater deflater = new Deflater();
        deflater.setLevel(9);
        deflater.setInput(bArr, 0, i);
        deflater.finish();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.min(bArr.length, i));
            try {
                byte[] bArr2 = new byte[1024];
                while (!deflater.finished()) {
                    byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void rBb(byte[] bArr, byte[] bArr2, int i) {
        if (i < 0 || i > 7) {
            throw new AssertionError();
        }
        int iHw = hw(bArr2);
        for (int i2 = 0; i2 < iHw; i2++) {
            for (int i3 = 0; i3 < iHw; i3++) {
                if (!oaCu(bArr, i3, i2)) {
                    boolean z = false;
                    switch (i) {
                        case 0:
                            if ((i3 + i2) % 2 == 0) {
                                z = true;
                            }
                            break;
                        case 1:
                            if (i2 % 2 == 0) {
                                z = true;
                            }
                            break;
                        case 2:
                            if (i3 % 3 == 0) {
                                z = true;
                            }
                            break;
                        case 3:
                            if ((i3 + i2) % 3 == 0) {
                                z = true;
                            }
                            break;
                        case 4:
                            if (((i3 / 3) + (i2 / 2)) % 2 == 0) {
                                z = true;
                            }
                            break;
                        case 5:
                            if (((i3 * i2) % 2) + ((i3 * i2) % 3) == 0) {
                                z = true;
                            }
                            break;
                        case 6:
                            if ((((i3 * i2) % 2) + ((i3 * i2) % 3)) % 2 == 0) {
                                z = true;
                            }
                            break;
                        case 7:
                            if ((((i3 + i2) % 2) + ((i3 * i2) % 3)) % 2 == 0) {
                                z = true;
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                    x(bArr2, i3, i2, oaCu(bArr2, i3, i2) ^ z);
                }
            }
        }
    }

    public static int s(int i) {
        return (Cn(26, i) - nqv(26)) - 14;
    }

    static boolean uk(int i, int i2) {
        return ((i >>> i2) & 1) != 0;
    }

    private static void v(int i, byte[] bArr) {
        int i2 = (i * 4) + 17;
        Arrays.fill(bArr, 0, (((i2 * i2) + 7) / 8) + 1, (byte) 0);
        bArr[0] = (byte) i2;
        G(6, 0, 1, i2, bArr);
        G(0, 6, i2, 1, bArr);
        G(0, 0, 9, 9, bArr);
        G(i2 - 8, 0, 8, 9, bArr);
        G(0, i2 - 8, 9, 8, bArr);
        int iFJA = FJA(i, new int[7]);
        for (int i3 = 0; i3 < iFJA; i3++) {
            for (int i5 = 0; i5 < iFJA; i5++) {
                if ((i3 != 0 || i5 != 0) && ((i3 != 0 || i5 != iFJA - 1) && (i3 != iFJA - 1 || i5 != 0))) {
                    G(r3[i3] - 2, r3[i5] - 2, 5, 5, bArr);
                }
            }
        }
        if (i >= 7) {
            G(i2 - 11, 0, 3, 6, bArr);
            G(0, i2 - 11, 6, 3, bArr);
        }
    }

    static void vcBh(int i, int i2, byte[] bArr) {
        if (i2 < 0 || i2 > 7) {
            throw new AssertionError();
        }
        int i3 = (new int[]{1, 0, 3, 2}[i] << 3) | i2;
        int i5 = i3;
        for (int i6 = 0; i6 < 10; i6++) {
            i5 = (i5 << 1) ^ ((i5 >>> 9) * 1335);
        }
        int i21 = ((i3 << 10) | i5) ^ 21522;
        if ((i21 >> 15) != 0) {
            throw new AssertionError();
        }
        for (int i22 = 0; i22 <= 5; i22++) {
            x(bArr, 8, i22, uk(i21, i22));
        }
        x(bArr, 8, 7, uk(i21, 6));
        x(bArr, 8, 8, uk(i21, 7));
        x(bArr, 7, 8, uk(i21, 8));
        for (int i32 = 9; i32 < 15; i32++) {
            x(bArr, 14 - i32, 8, uk(i21, i32));
        }
        int iHw = hw(bArr);
        for (int i33 = 0; i33 < 8; i33++) {
            x(bArr, (iHw - 1) - i33, 8, uk(i21, i33));
        }
        for (int i43 = 8; i43 < 15; i43++) {
            x(bArr, 8, (iHw - 15) + i43, uk(i21, i43));
        }
        x(bArr, 8, iHw - 8, true);
    }

    private static void x(byte[] bArr, int i, int i2, boolean z) {
        int iHw = hw(bArr);
        if (21 > iHw || iHw > 177 || i < 0 || i >= iHw || i2 < 0 || i2 >= iHw) {
            System.out.printf("qrsize: %d, x: %d, y: %d\n", Integer.valueOf(iHw), Integer.valueOf(i), Integer.valueOf(i2));
        }
        if (21 > iHw || iHw > 177 || i < 0 || i >= iHw || i2 < 0 || i2 >= iHw) {
            throw new AssertionError();
        }
        int i3 = (i2 * iHw) + i;
        int i5 = i3 & 7;
        int i6 = (i3 >>> 3) + 1;
        if (z) {
            bArr[i6] = (byte) (((1 << i5) | g(bArr[i6])) & 255);
        } else {
            bArr[i6] = (byte) (((1 << i5) ^ 255) & g(bArr[i6]) & 255);
        }
    }

    private static void xhgC(byte[] bArr, int i, byte[] bArr2) {
        int iHw = hw(bArr2);
        int i2 = 0;
        int i3 = iHw - 1;
        while (i3 >= 1) {
            if (i3 == 6) {
                i3 = 5;
            }
            for (int i5 = 0; i5 < iHw; i5++) {
                for (int i6 = 0; i6 < 2; i6++) {
                    int i21 = i3 - i6;
                    int i22 = (2 & (i3 + 1)) == 0 ? (iHw - 1) - i5 : i5;
                    if (!oaCu(bArr2, i21, i22) && i2 < i * 8) {
                        x(bArr2, i21, i22, uk(bArr[i2 >>> 3], 7 - (i2 & 7)));
                        i2++;
                    }
                }
            }
            i3 -= 2;
        }
        if (i2 != i * 8) {
            throw new AssertionError();
        }
    }

    static int xyl(boolean z, int i, int[] iArr, int i2) {
        if (z) {
            iw(i, iArr, i2);
            i = 0;
        }
        iw(i + i2, iArr, i2);
        return H(iArr, i2);
    }

    private static void zIcc(byte[] bArr, int i, int i2, boolean z) {
        int iHw = hw(bArr);
        if (i < 0 || i >= iHw || i2 < 0 || i2 >= iHw) {
            return;
        }
        x(bArr, i, i2, z);
    }
}
