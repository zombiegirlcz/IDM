package olj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static String a(String maskedInput) {
        Intrinsics.checkNotNullParameter(maskedInput, "maskedInput");
        StringBuilder sb6 = new StringBuilder();
        int length = maskedInput.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = maskedInput.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                sb6.append(cCharAt);
            }
        }
        return sb6.toString();
    }
}
