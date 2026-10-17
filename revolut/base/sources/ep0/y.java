package ep0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y extends m implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f128059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f128060c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f128061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f128062h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f128063j;
    public final String k;

    public y(int i, int i2, int i3, int i5, int i6, int i21) {
        this.f128059b = i;
        this.f128060c = i2;
        this.d = i3;
        this.e = i5;
        this.f = i6;
        this.f128061g = i21;
        this.f128062h = String.valueOf(i);
        this.i = i < 10;
        this.f128063j = ".";
        this.k = "0";
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i5, int i6, CharSequence text, int i21, int i22, boolean z, Layout layout) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if ((spanned != null ? spanned.getSpanStart(this) : -1) == i21) {
            Paint.Style style = paint.getStyle();
            Paint.Align textAlign = paint.getTextAlign();
            paint.setStyle(Paint.Style.FILL);
            String str = this.f128063j;
            float fMeasureText = paint.measureText(str);
            boolean z3 = this.i;
            String str2 = this.f128062h;
            float fMeasureText2 = z3 ? paint.measureText(this.k) : paint.measureText(str2);
            float f = fMeasureText2 + fMeasureText;
            float f4 = i;
            float leadingMargin = (getLeadingMargin(true) * i2) + f4;
            int i32 = this.f;
            if (i2 > 0) {
                float fMax = Math.max(f4 + f, leadingMargin - i32);
                Paint.Align align = Paint.Align.RIGHT;
                paint.setTextAlign(align);
                float f5 = i5;
                canvas.drawText(str, fMax, f5, paint);
                if (z3) {
                    paint.setTextAlign(Paint.Align.CENTER);
                    canvas.drawText(str2, (fMax - fMeasureText) - (fMeasureText2 / 2.0f), f5, paint);
                } else {
                    paint.setTextAlign(align);
                    canvas.drawText(str2, fMax - fMeasureText, f5, paint);
                }
            } else {
                float fMin = Math.min(f4 - f, leadingMargin + i32);
                if (z3) {
                    paint.setTextAlign(Paint.Align.CENTER);
                    canvas.drawText(str2, (fMeasureText2 / 2.0f) + fMin, i5, paint);
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    canvas.drawText(str2, fMin, i5, paint);
                }
                paint.setTextAlign(Paint.Align.LEFT);
                canvas.drawText(str, fMin + fMeasureText2, i5, paint);
            }
            paint.setStyle(style);
            paint.setTextAlign(textAlign);
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f128059b == yVar.f128059b && this.f128060c == yVar.f128060c && this.d == yVar.d && this.e == yVar.e && this.f == yVar.f && this.f128061g == yVar.f128061g;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return a(this.d, this.e, this.f128061g, this.f128060c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128061g) + j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f128060c, Integer.hashCode(this.f128059b) * 31, 31), 31), 31), 31);
    }
}
