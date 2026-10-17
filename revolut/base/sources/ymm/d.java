package ymm;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends anm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f315061b = String.valueOf(CoreConstants.DOUBLE_QUOTE_CHAR);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f315062c = {CoreConstants.COMMA_CHAR, CoreConstants.DOUBLE_QUOTE_CHAR, '\r', '\n'};

    @Override // anm.b
    public final int a(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        char[] cArr;
        if (i != 0) {
            throw new IllegalStateException("CsvEscaper should never reach the [1] index");
        }
        String string = charSequence.toString();
        int i2 = g.f315066a;
        if (string == null || (cArr = f315062c) == null) {
            stringWriter.write(charSequence.toString());
        } else {
            int length = string.length();
            int i3 = length - 1;
            int length2 = cArr.length;
            int i5 = length2 - 1;
            loop0: for (int i6 = 0; i6 < length; i6++) {
                char cCharAt = string.charAt(i6);
                for (int i21 = 0; i21 < length2; i21++) {
                    if (cArr[i21] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i21 == i5 || (i6 < i3 && cArr[i21 + 1] == string.charAt(i6 + 1)))) {
                        stringWriter.write(34);
                        String string2 = charSequence.toString();
                        StringBuilder sb6 = new StringBuilder();
                        String str = f315061b;
                        sb6.append(str);
                        sb6.append(str);
                        stringWriter.write(g.g(string2, str, sb6.toString()));
                        stringWriter.write(34);
                        break loop0;
                    }
                }
            }
            stringWriter.write(charSequence.toString());
        }
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }
}
