package ep0;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextPaint f128027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharacterStyle[] f128028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spanned f128029c;
    public float d = -1.0f;
    public int e = -1;
    public int f = -1;

    public final Paint a(Paint paint, CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (charSequence instanceof Spanned) {
            if (this.f128028b == null || this.f128029c != charSequence || this.d != paint.getTextSize() || i != this.e || i2 != this.f) {
                this.f128029c = (Spanned) charSequence;
                this.d = paint.getTextSize();
                this.e = i;
                this.f = i2;
                this.f128028b = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            }
            CharacterStyle[] characterStyleArr = this.f128028b;
            if (characterStyleArr != null && characterStyleArr.length != 0) {
                TextPaint textPaint = this.f128027a;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f128027a = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        return paint;
    }
}
