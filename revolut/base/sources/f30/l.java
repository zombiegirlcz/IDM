package f30;

import java.text.BreakIterator;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import zsc.p;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f131877a = new Regex("\\p{InCombiningDiacriticalMarks}");

    private l() {
    }

    public static ArrayList a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String strR = "";
        if (input.length() != 0) {
            String strNormalize = Normalizer.normalize(input, Normalizer.Form.NFKD);
            Intrinsics.checkNotNullExpressionValue(strNormalize, "normalize(...)");
            String strReplace = f131877a.replace(strNormalize, "");
            StringBuilder sb6 = new StringBuilder(strReplace.length());
            int length = strReplace.length();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                char cCharAt = strReplace.charAt(i);
                if (CharsKt.e(cCharAt)) {
                    z = sb6.length() > 0;
                } else {
                    if (z) {
                        sb6.append(p.SPACE_CHAR);
                    }
                    sb6.append(cCharAt);
                }
            }
            String string = sb6.toString();
            Locale locale = Locale.ROOT;
            strR = p.a.r(locale, "ROOT", string, locale, "toLowerCase(...)");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(strR);
        ArrayList arrayList = new ArrayList();
        int iFirst = wordInstance.first();
        int next = wordInstance.next();
        while (true) {
            int i2 = next;
            int i3 = iFirst;
            iFirst = i2;
            if (iFirst == -1) {
                return arrayList;
            }
            String strSubstring = strR.substring(i3, iFirst);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            int i5 = 0;
            while (true) {
                if (i5 >= strSubstring.length()) {
                    break;
                }
                if (Character.isLetterOrDigit(strSubstring.charAt(i5))) {
                    arrayList.add(strSubstring);
                    break;
                }
                i5++;
            }
            next = wordInstance.next();
        }
    }
}
