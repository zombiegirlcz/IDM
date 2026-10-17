package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.LanguageFeatureSpan;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes15.dex */
abstract class SubtitleViewUtils {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$removeAllEmbeddedStyling$0(Object obj2) {
        return !(obj2 instanceof LanguageFeatureSpan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$removeEmbeddedFontSizes$1(Object obj2) {
        return (obj2 instanceof AbsoluteSizeSpan) || (obj2 instanceof RelativeSizeSpan);
    }

    public static void removeAllEmbeddedStyling(Cue.Builder builder) {
        builder.clearWindowColor();
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((Spannable) Preconditions.checkNotNull(builder.getText()), new j(0));
        }
        removeEmbeddedFontSizes(builder);
    }

    public static void removeEmbeddedFontSizes(Cue.Builder builder) {
        builder.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((Spannable) Preconditions.checkNotNull(builder.getText()), new j(1));
        }
    }

    private static void removeSpansIf(Spannable spannable, Predicate<Object> predicate) {
        for (Object obj2 : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj2)) {
                spannable.removeSpan(obj2);
            }
        }
    }

    public static float resolveTextSize(int i, float f, int i2, int i3) {
        float f4;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f4 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f4 = i2;
        }
        return f * f4;
    }
}
