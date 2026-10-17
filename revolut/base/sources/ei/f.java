package ei;

import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes17.dex */
public abstract class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f126331c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f126329a = {ISO7816.INS_DECREASE, Constants.INQUIRY, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 38, 13, 9, ISO7816.INS_UNBLOCK_CHV, 58, 35, 45, 46, ISO7816.INS_CHANGE_CHV, 47, 43, 37, ISO7816.INS_PSO, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f126330b = {59, 60, 62, SignedBytes.MAX_POWER_OF_TWO, 91, 92, 93, 95, 96, 126, Constants.NFC_READER, 13, 9, ISO7816.INS_UNBLOCK_CHV, 58, 10, 45, 46, ISO7816.INS_CHANGE_CHV, 47, ISO7816.INS_MSE, 124, ISO7816.INS_PSO, 40, 41, 63, 123, 125, 39, 0};
    public static final byte[] d = new byte[128];
    public static final Charset e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        f126331c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f126329a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b4 = bArr2[i2];
            if (b4 > 0) {
                f126331c[b4] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(d, (byte) -1);
        while (true) {
            byte[] bArr3 = f126330b;
            if (i >= bArr3.length) {
                return;
            }
            byte b5 = bArr3[i];
            if (b5 > 0) {
                d[b5] = (byte) i;
            }
            i++;
        }
    }

    public static void a(StringBuilder sb6, byte[] bArr, int i, int i2) {
        if (i == 1 && i2 == 0) {
            sb6.append((char) 913);
        } else if (i % 6 == 0) {
            sb6.append((char) 924);
        } else {
            sb6.append((char) 901);
        }
        int i3 = 0;
        if (i >= 6) {
            char[] cArr = new char[5];
            int i5 = 0;
            while (i - i5 >= 6) {
                long j2 = 0;
                for (int i6 = 0; i6 < 6; i6++) {
                    j2 = (j2 << 8) + ((long) (bArr[i5 + i6] & UnsignedBytes.MAX_VALUE));
                }
                for (int i21 = 0; i21 < 5; i21++) {
                    cArr[i21] = (char) (j2 % 900);
                    j2 /= 900;
                }
                for (int i22 = 4; i22 >= 0; i22--) {
                    sb6.append(cArr[i22]);
                }
                i5 += 6;
            }
            i3 = i5;
        }
        while (i3 < i) {
            sb6.append((char) (bArr[i3] & UnsignedBytes.MAX_VALUE));
            i3++;
        }
    }

    public static void b(StringBuilder sb6, int i, int i2, String str) {
        StringBuilder sb9 = new StringBuilder((i2 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb9.setLength(0);
            int iMin = Math.min(44, i2 - i3);
            StringBuilder sb10 = new StringBuilder("1");
            int i5 = i + i3;
            sb10.append(str.substring(i5, i5 + iMin));
            BigInteger bigInteger = new BigInteger(sb10.toString());
            do {
                sb9.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb9.length() - 1; length >= 0; length--) {
                sb6.append(sb9.charAt(length));
            }
            i3 += iMin;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6 A[EDGE_INSN: B:76:0x00e6->B:57:0x00e6 BREAK  A[LOOP:0: B:3:0x000e->B:93:0x000e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.String r17, int r18, int r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.f.c(java.lang.String, int, int, java.lang.StringBuilder, int):int");
    }

    public static boolean d(char c2) {
        if (c2 != ' ') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    public static boolean e(char c2) {
        if (c2 != ' ') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }
}
