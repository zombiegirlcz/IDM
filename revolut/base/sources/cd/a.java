package cd;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f23127a = c(new byte[]{101, 120, ISO7816.INS_MANAGE_CHANNEL, 97, 110, ISOFileInfo.FMD_BYTE, 32, 51, ISO7816.INS_INCREASE, 45, ISOFileInfo.FCP_BYTE, 121, 116, 101, 32, 107});

    public static void a(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = iArr[i] + iArr[i2];
        iArr[i] = i6;
        int i21 = i6 ^ iArr[i5];
        int i22 = (i21 >>> (-16)) | (i21 << 16);
        iArr[i5] = i22;
        int i32 = iArr[i3] + i22;
        iArr[i3] = i32;
        int i33 = iArr[i2] ^ i32;
        int i43 = (i33 >>> (-12)) | (i33 << 12);
        iArr[i2] = i43;
        int i59 = iArr[i] + i43;
        iArr[i] = i59;
        int i66 = iArr[i5] ^ i59;
        int i74 = (i66 >>> (-8)) | (i66 << 8);
        iArr[i5] = i74;
        int i92 = iArr[i3] + i74;
        iArr[i3] = i92;
        int i96 = iArr[i2] ^ i92;
        iArr[i2] = (i96 >>> (-7)) | (i96 << 7);
    }

    public static void b(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    public static int[] c(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
