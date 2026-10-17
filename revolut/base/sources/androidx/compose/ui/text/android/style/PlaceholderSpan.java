package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.J;\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJY\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R$\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8\u0006@BX\u0086.¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010'\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010!R$\u0010)\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010!R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan;", "Landroid/text/style/ReplacementSpan;", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", "x", "top", "y", "bottom", "", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "width", "F", "widthUnit", "I", "height", "heightUnit", "widthAsSpInPx", "heightAsSpInPx", "verticalAlign", "getVerticalAlign", "()I", "value", "fontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "getFontMetrics", "()Landroid/graphics/Paint$FontMetricsInt;", "widthPx", "getWidthPx", "heightPx", "getHeightPx", "", "isLaidOut", "Z", "Companion", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlaceholderSpan extends ReplacementSpan {
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private final float heightAsSpInPx;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final int verticalAlign;
    private final float width;
    private final float widthAsSpInPx;
    private int widthPx;
    private final int widthUnit;
    public static final int $stable = 8;

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, CharSequence text, int start, int end2, float x3, int top, int y2, int bottom, @NotNull Paint paint) {
    }

    @NotNull
    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.r("fontMetrics");
        throw null;
    }

    public final int getHeightPx() {
        if (!this.isLaidOut) {
            InlineClassHelperKt.throwIllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.heightPx;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, CharSequence text, int start, int end2, Paint.FontMetricsInt fm3) {
        float f;
        float f4;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (!(getFontMetrics().descent > getFontMetrics().ascent)) {
            InlineClassHelperKt.throwIllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        int i = this.widthUnit;
        if (i == 0) {
            f = this.widthAsSpInPx;
        } else {
            if (i != 1) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f = this.width * textSize;
        }
        this.widthPx = PlaceholderSpan_androidKt.ceilToInt(f);
        int i2 = this.heightUnit;
        if (i2 == 0) {
            f4 = this.heightAsSpInPx;
        } else {
            if (i2 != 1) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f4 = this.height * textSize;
        }
        this.heightPx = PlaceholderSpan_androidKt.ceilToInt(f4);
        if (fm3 != null) {
            fm3.ascent = getFontMetrics().ascent;
            fm3.descent = getFontMetrics().descent;
            fm3.leading = getFontMetrics().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fm3.ascent > (-getHeightPx())) {
                        fm3.ascent = -getHeightPx();
                    }
                    break;
                case 1:
                case 4:
                    if (getHeightPx() + fm3.ascent > fm3.descent) {
                        fm3.descent = getHeightPx() + fm3.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fm3.ascent > fm3.descent - getHeightPx()) {
                        fm3.ascent = fm3.descent - getHeightPx();
                    }
                    break;
                case 3:
                case 6:
                    if (fm3.descent - fm3.ascent < getHeightPx()) {
                        int heightPx = fm3.ascent - ((getHeightPx() - (fm3.descent - fm3.ascent)) / 2);
                        fm3.ascent = heightPx;
                        fm3.descent = getHeightPx() + heightPx;
                    }
                    break;
                default:
                    InlineClassHelperKt.throwIllegalArgumentException("Unknown verticalAlign.");
                    break;
            }
            fm3.top = Math.min(getFontMetrics().top, fm3.ascent);
            fm3.bottom = Math.max(getFontMetrics().bottom, fm3.descent);
        }
        return getWidthPx();
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int getWidthPx() {
        if (!this.isLaidOut) {
            InlineClassHelperKt.throwIllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.widthPx;
    }
}
