package ns0;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q {
    private q() {
    }

    public static void a(Canvas canvas, CharSequence charSequence, ImageSpan imageSpan, float f, float f4, TextPaint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(charSequence, "char");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (imageSpan == null) {
            canvas.drawText(charSequence, 0, charSequence.length(), f, f4, paint);
            return;
        }
        Drawable drawable = imageSpan.getDrawable();
        int alpha = drawable.getAlpha();
        drawable.setAlpha(kotlin.ranges.f.g((int) ((paint.getAlpha() / 255.0f) * alpha), 0, 255));
        try {
            imageSpan.draw(canvas, charSequence, 0, charSequence.length(), f, (int) (paint.ascent() + f4), (int) f4, (int) (paint.descent() + f4), paint);
        } finally {
            drawable.setAlpha(alpha);
        }
    }
}
