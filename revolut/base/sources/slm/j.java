package slm;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Ascii;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f264267a = new char[LDSFile.EF_DG2_TAG];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f264268b = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a(CoreConstants.DOUBLE_QUOTE_CHAR, 34);
        a(CoreConstants.ESCAPE_CHAR, 92);
        byte[] bArr = f264268b;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = Ascii.DEL;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    public static void a(char c2, int i) {
        if (c2 != 'u') {
            f264267a[c2] = (char) i;
        }
    }
}
