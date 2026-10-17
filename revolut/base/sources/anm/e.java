package anm;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7830b;

    @Override // anm.c
    public final boolean b(int i, StringWriter stringWriter) throws IOException {
        switch (this.f7830b) {
            case 0:
                if (i >= 32 && i <= 127) {
                    return false;
                }
                if (i > 65535) {
                    char[] chars = Character.toChars(i);
                    StringBuilder sb6 = new StringBuilder("\\u");
                    String hexString = Integer.toHexString(chars[0]);
                    Locale locale = Locale.ENGLISH;
                    sb6.append(hexString.toUpperCase(locale));
                    sb6.append("\\u");
                    sb6.append(Integer.toHexString(chars[1]).toUpperCase(locale));
                    stringWriter.write(sb6.toString());
                } else {
                    stringWriter.write("\\u");
                    char[] cArr = b.f7823a;
                    stringWriter.write(cArr[(i >> 12) & 15]);
                    stringWriter.write(cArr[(i >> 8) & 15]);
                    stringWriter.write(cArr[(i >> 4) & 15]);
                    stringWriter.write(cArr[i & 15]);
                }
                return true;
            default:
                return i >= 55296 && i <= 57343;
        }
    }
}
