package androidx.media3.ui;

import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextDirectionHeuristics;
import androidx.media3.common.util.Log;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
abstract class BidiUtils {
    private static final Splitter LF_SPLITTER = Splitter.on("\n");
    private static final Splitter CRLF_SPLITTER = Splitter.on("\r\n");
    private static final Joiner LF_JOINER = Joiner.on("\n");

    public static boolean containsRtl(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            byte directionality = Character.getDirectionality(iCodePointAt);
            if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                return true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return false;
    }

    public static CharSequence wrapText(CharSequence charSequence) {
        Spanned spanned;
        Object[] spans;
        int[] iArr;
        int[] iArr2;
        List<String> listSplitToList;
        int i;
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        int i2 = 0;
        if (charSequence instanceof Spanned) {
            spanned = (Spanned) charSequence;
            spans = spanned.getSpans(0, charSequence.length(), Object.class);
            iArr = new int[spans.length];
            iArr2 = new int[spans.length];
            Arrays.fill(iArr, -1);
            Arrays.fill(iArr2, -1);
        } else {
            spanned = null;
            spans = null;
            iArr = null;
            iArr2 = null;
        }
        if (charSequence.toString().contains("\r\n")) {
            listSplitToList = CRLF_SPLITTER.splitToList(charSequence);
            i = 2;
        } else {
            listSplitToList = LF_SPLITTER.splitToList(charSequence);
            i = 1;
        }
        ArrayList arrayList = new ArrayList(listSplitToList.size());
        int i3 = 0;
        int length = 0;
        for (String str : listSplitToList) {
            String strUnicodeWrap = bidiFormatter.unicodeWrap(str, TextDirectionHeuristics.LTR);
            if (spans != null) {
                Preconditions.checkNotNull(spanned);
                Preconditions.checkNotNull(iArr);
                Preconditions.checkNotNull(iArr2);
                int length2 = strUnicodeWrap.length() - str.length();
                if (length2 > 0) {
                    i3++;
                }
                for (int i5 = i2; i5 < spans.length; i5++) {
                    if (iArr[i5] < 0 && spanned.getSpanStart(spans[i5]) >= length) {
                        if (spanned.getSpanStart(spans[i5]) < str.length() + length) {
                            iArr[i5] = i3;
                        }
                    }
                    if (iArr2[i5] < 0 && spanned.getSpanEnd(spans[i5]) - 1 >= length && spanned.getSpanEnd(spans[i5]) - 1 < str.length() + length) {
                        iArr2[i5] = i3;
                    }
                }
                length += str.length() + i;
                if (length2 > 0) {
                    i3++;
                }
            }
            arrayList.add(strUnicodeWrap);
            i2 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LF_JOINER.join(arrayList));
        if (spans != null) {
            Preconditions.checkNotNull(spanned);
            Preconditions.checkNotNull(iArr);
            Preconditions.checkNotNull(iArr2);
            for (int i6 = 0; i6 < spans.length; i6++) {
                int spanStart = spanned.getSpanStart(spans[i6]) + iArr[i6];
                int spanEnd = spanned.getSpanEnd(spans[i6]) + iArr2[i6];
                int spanFlags = spanned.getSpanFlags(spans[i6]);
                if (spanStart < 0 || spanStart >= spannableStringBuilder.length() || spanEnd < 0 || spanEnd > spannableStringBuilder.length()) {
                    StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("Span out of bounds: start=", spanStart, spanEnd, ",end=", ",len=");
                    sbW.append(spannableStringBuilder.length());
                    Log.w("BidiUtils", sbW.toString());
                } else {
                    spannableStringBuilder.setSpan(spans[i6], spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableStringBuilder;
    }
}
