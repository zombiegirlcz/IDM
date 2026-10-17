package bp0;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {
    public static CharSequence a(CharSequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        if (!d0.W(sequence)) {
            char cCharAt = sequence.charAt(0);
            if (!Character.isUpperCase(cCharAt)) {
                SpannableStringBuilder spannableStringBuilder = sequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) sequence : new SpannableStringBuilder(sequence);
                String strValueOf = String.valueOf(cCharAt);
                Intrinsics.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                spannableStringBuilder.replace(0, 1, (CharSequence) upperCase);
                return spannableStringBuilder;
            }
        }
        return sequence;
    }
}
