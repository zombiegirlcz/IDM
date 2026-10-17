package slm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;

/* JADX INFO: loaded from: classes14.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f264265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f264266b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + b(i >> 12) + b(i >> 8) + b(i >> 4) + b(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f264265a = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = ISO7816.INS_MSE;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = ISOFileInfo.FCP_BYTE;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f264266b = bArr;
    }

    public static final void a(String value, StringBuilder sb6) {
        Intrinsics.checkNotNullParameter(sb6, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        int length = value.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = value.charAt(i2);
            String[] strArr = f264265a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb6.append((CharSequence) value, i, i2);
                sb6.append(strArr[cCharAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb6.append((CharSequence) value, i, value.length());
        } else {
            sb6.append(value);
        }
        sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
    }

    public static final char b(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }
}
