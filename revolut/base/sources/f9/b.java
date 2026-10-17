package f9;

import ch.qos.logback.core.CoreConstants;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Arrays;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes16.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f132789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f132790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f132791c;
    public static final int[] d;
    public static final int[] e;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f132789a = charArray;
        int length = charArray.length;
        f132790b = new byte[length];
        for (int i = 0; i < length; i++) {
            f132790b[i] = (byte) f132789a[i];
        }
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 32; i2++) {
            iArr[i2] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        int[] iArr2 = new int[256];
        System.arraycopy(iArr, 0, iArr2, 0, 256);
        for (int i3 = 128; i3 < 256; i3++) {
            iArr2[i3] = (i3 & BERTags.FLAGS) == 192 ? 2 : (i3 & 240) == 224 ? 3 : (i3 & Constants.TAG_FULL_SVPP_IDENTIFICATION) == 240 ? 4 : -1;
        }
        f132791c = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        int[] iArr5 = new int[256];
        int[] iArr6 = f132791c;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        d = iArr8;
        int[] iArr9 = new int[256];
        e = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i21 = 0; i21 < 10; i21++) {
            e[i21 + 48] = i21;
        }
        for (int i22 = 0; i22 < 6; i22++) {
            int[] iArr10 = e;
            int i32 = i22 + 10;
            iArr10[i22 + 97] = i32;
            iArr10[i22 + 65] = i32;
        }
    }

    public static void a(String str, StringBuilder sb6) {
        int[] iArr = d;
        int length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb6.append(cCharAt);
            } else {
                sb6.append(CoreConstants.ESCAPE_CHAR);
                int i2 = iArr[cCharAt];
                if (i2 < 0) {
                    sb6.append('u');
                    sb6.append('0');
                    sb6.append('0');
                    char[] cArr = f132789a;
                    sb6.append(cArr[cCharAt >> 4]);
                    sb6.append(cArr[cCharAt & 15]);
                } else {
                    sb6.append((char) i2);
                }
            }
        }
    }
}
