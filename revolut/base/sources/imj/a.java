package imj;

import kotlin.text.CharsKt;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static boolean a(String str) {
        String string = str != null ? d0.F0(str).toString() : null;
        if (string != null && string.length() != 0) {
            for (int i = 0; i < string.length(); i++) {
                char cCharAt = string.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || CharsKt.e(cCharAt)) {
                }
            }
            return true;
        }
        return false;
    }
}
