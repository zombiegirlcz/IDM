package dnm;

import java.io.Serializable;
import org.apache.commons.validator.routines.checkdigit.CheckDigitException;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Serializable {
    public static int a(String str) throws CheckDigitException {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str.substring(4));
        sb6.append(str.substring(0, 4));
        String string = sb6.toString();
        long j2 = 0;
        for (int i = 0; i < string.length(); i++) {
            int numericValue = Character.getNumericValue(string.charAt(i));
            if (numericValue < 0 || numericValue > 35) {
                throw new CheckDigitException(com.google.android.gms.internal.mlkit_vision_face.a.m("Invalid Character[", i, numericValue, "] = '", "'"));
            }
            j2 = (j2 * (numericValue > 9 ? 100L : 10L)) + ((long) numericValue);
            if (j2 > 999999999) {
                j2 %= 97;
            }
        }
        return (int) (j2 % 97);
    }

    public final boolean b(String str) {
        if (str != null && str.length() >= 5) {
            String strSubstring = str.substring(2, 4);
            if (!"00".equals(strSubstring) && !"01".equals(strSubstring) && !"99".equals(strSubstring)) {
                try {
                    if (a(str) == 1) {
                        return true;
                    }
                } catch (CheckDigitException unused) {
                }
            }
        }
        return false;
    }
}
