package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.ObjectsCompat;

/* JADX INFO: loaded from: classes15.dex */
public abstract class PrecomputedTextCompat implements Spannable {

    public static final class Params {
        private final int mBreakStrategy;
        private final int mHyphenationFrequency;
        private final TextPaint mPaint;
        private final TextDirectionHeuristic mTextDir;
        final PrecomputedText.Params mWrapped;

        public Params(PrecomputedText.Params params) {
            this.mPaint = params.getTextPaint();
            this.mTextDir = params.getTextDirection();
            this.mBreakStrategy = params.getBreakStrategy();
            this.mHyphenationFrequency = params.getHyphenationFrequency();
            this.mWrapped = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public boolean equals(Object obj2) {
            if (obj2 == this) {
                return true;
            }
            if (!(obj2 instanceof Params)) {
                return false;
            }
            Params params = (Params) obj2;
            return equalsWithoutTextDirection(params) && this.mTextDir == params.getTextDirection();
        }

        public boolean equalsWithoutTextDirection(Params params) {
            if (this.mBreakStrategy == params.getBreakStrategy() && this.mHyphenationFrequency == params.getHyphenationFrequency() && this.mPaint.getTextSize() == params.getTextPaint().getTextSize() && this.mPaint.getTextScaleX() == params.getTextPaint().getTextScaleX() && this.mPaint.getTextSkewX() == params.getTextPaint().getTextSkewX() && this.mPaint.getLetterSpacing() == params.getTextPaint().getLetterSpacing() && TextUtils.equals(this.mPaint.getFontFeatureSettings(), params.getTextPaint().getFontFeatureSettings()) && this.mPaint.getFlags() == params.getTextPaint().getFlags() && this.mPaint.getTextLocales().equals(params.getTextPaint().getTextLocales())) {
                return this.mPaint.getTypeface() == null ? params.getTextPaint().getTypeface() == null : this.mPaint.getTypeface().equals(params.getTextPaint().getTypeface());
            }
            return false;
        }

        public int getBreakStrategy() {
            return this.mBreakStrategy;
        }

        public int getHyphenationFrequency() {
            return this.mHyphenationFrequency;
        }

        public TextDirectionHeuristic getTextDirection() {
            return this.mTextDir;
        }

        public TextPaint getTextPaint() {
            return this.mPaint;
        }

        public int hashCode() {
            return ObjectsCompat.hash(Float.valueOf(this.mPaint.getTextSize()), Float.valueOf(this.mPaint.getTextScaleX()), Float.valueOf(this.mPaint.getTextSkewX()), Float.valueOf(this.mPaint.getLetterSpacing()), Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocales(), this.mPaint.getTypeface(), Boolean.valueOf(this.mPaint.isElegantTextHeight()), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency));
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder("{");
            sb6.append("textSize=" + this.mPaint.getTextSize());
            sb6.append(", textScaleX=" + this.mPaint.getTextScaleX());
            sb6.append(", textSkewX=" + this.mPaint.getTextSkewX());
            sb6.append(", letterSpacing=" + this.mPaint.getLetterSpacing());
            sb6.append(", elegantTextHeight=" + this.mPaint.isElegantTextHeight());
            sb6.append(", textLocale=" + this.mPaint.getTextLocales());
            sb6.append(", typeface=" + this.mPaint.getTypeface());
            sb6.append(", variationSettings=" + this.mPaint.getFontVariationSettings());
            sb6.append(", textDir=" + this.mTextDir);
            sb6.append(", breakStrategy=" + this.mBreakStrategy);
            sb6.append(", hyphenationFrequency=" + this.mHyphenationFrequency);
            sb6.append("}");
            return sb6.toString();
        }
    }
}
