package anm;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7835b;

    @Override // anm.b
    public final int a(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        int i2;
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        int i3;
        int i5;
        switch (this.f7835b) {
            case 0:
                int length = (charSequence.length() - i) - 1;
                StringBuilder sb6 = new StringBuilder();
                if (charSequence.charAt(i) != '\\' || length <= 0 || (cCharAt = charSequence.charAt((i2 = i + 1))) < '0' || cCharAt > '7') {
                    return 0;
                }
                int i6 = i + 2;
                int i21 = i + 3;
                sb6.append(charSequence.charAt(i2));
                if (length > 1 && (cCharAt2 = charSequence.charAt(i6)) >= '0' && cCharAt2 <= '7') {
                    sb6.append(charSequence.charAt(i6));
                    if (length > 2 && (cCharAt3 = charSequence.charAt(i2)) >= '0' && cCharAt3 <= '3' && (cCharAt4 = charSequence.charAt(i21)) >= '0' && cCharAt4 <= '7') {
                        sb6.append(charSequence.charAt(i21));
                    }
                }
                stringWriter.write(Integer.parseInt(sb6.toString(), 8));
                return sb6.length() + 1;
            default:
                if (charSequence.charAt(i) != '\\' || (i3 = i + 1) >= charSequence.length() || charSequence.charAt(i3) != 'u') {
                    return 0;
                }
                int i22 = 2;
                while (true) {
                    i5 = i + i22;
                    if (i5 < charSequence.length() && charSequence.charAt(i5) == 'u') {
                        i22++;
                    }
                }
                if (i5 < charSequence.length() && charSequence.charAt(i5) == '+') {
                    i22++;
                }
                int i32 = i + i22;
                int i33 = i32 + 4;
                if (i33 > charSequence.length()) {
                    throw new IllegalArgumentException("Less than 4 hex digits in unicode value: '" + ((Object) charSequence.subSequence(i, charSequence.length())) + "' due to end of CharSequence");
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(i32, i33);
                try {
                    stringWriter.write((char) Integer.parseInt(charSequenceSubSequence.toString(), 16));
                    return i22 + 4;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Unable to parse unicode value: " + ((Object) charSequenceSubSequence), e);
                }
        }
    }
}
