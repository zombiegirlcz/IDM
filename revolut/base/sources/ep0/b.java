package ep0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineBackgroundSpan;
import android.text.style.ReplacementSpan;
import androidx.collection.MutableLongFloatMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b implements LineBackgroundSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Spanned f128014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f128015b = -1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableLongFloatMap f128016c;
    public Spanned d;
    public final MutableLongFloatMap e;

    public b() {
        int i = 0;
        int i2 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f128016c = new MutableLongFloatMap(i, i2, defaultConstructorMarker);
        this.e = new MutableLongFloatMap(i, i2, defaultConstructorMarker);
    }

    public final float a(Spanned spanned, Paint paint, int i, int i2) {
        float fMeasureText;
        int i3 = i;
        Spanned spanned2 = this.f128014a;
        MutableLongFloatMap mutableLongFloatMap = this.f128016c;
        if (spanned2 != spanned || this.f128015b != paint.getTextSize()) {
            this.f128014a = spanned;
            this.f128015b = paint.getTextSize();
            mutableLongFloatMap.clear();
        }
        long j2 = ((long) i2) | (((long) i3) << 32);
        int iFindKeyIndex = mutableLongFloatMap.findKeyIndex(j2);
        if (iFindKeyIndex >= 0) {
            return mutableLongFloatMap.values[iFindKeyIndex];
        }
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(i3, i2, ReplacementSpan.class);
        Intrinsics.h(replacementSpanArr);
        if (replacementSpanArr.length == 0) {
            fMeasureText = paint.measureText(spanned, i3, i2);
        } else {
            if (replacementSpanArr.length > 1) {
                zhm.p.B(new a9j.f(spanned, 28), replacementSpanArr);
            }
            float fMeasureText2 = BitmapDescriptorFactory.HUE_RED;
            for (ReplacementSpan replacementSpan : replacementSpanArr) {
                if (i3 >= i2) {
                    break;
                }
                float f = fMeasureText2;
                int spanStart = spanned.getSpanStart(replacementSpan);
                int spanEnd = spanned.getSpanEnd(replacementSpan);
                if (spanEnd <= i3 || spanEnd <= spanStart || spanStart >= i2) {
                    fMeasureText2 = f;
                } else {
                    fMeasureText2 = (spanStart > i3 ? paint.measureText(spanned, i3, spanStart) + f : f) + replacementSpan.getSize(paint, spanned, spanStart, spanEnd, null);
                    i3 = spanEnd;
                }
            }
            float f4 = fMeasureText2;
            fMeasureText = i3 < i2 ? paint.measureText(spanned, i3, i2) + f4 : f4;
        }
        mutableLongFloatMap.put(j2, fMeasureText);
        return fMeasureText;
    }

    public final int b(Spanned spanned, int i, int i2) {
        float f;
        Intrinsics.checkNotNullParameter(spanned, "spanned");
        Spanned spanned2 = this.d;
        MutableLongFloatMap mutableLongFloatMap = this.e;
        if (spanned2 != spanned) {
            this.d = spanned;
            mutableLongFloatMap.clear();
        }
        long j2 = (((long) i) << 32) | ((long) i2);
        int iFindKeyIndex = mutableLongFloatMap.findKeyIndex(j2);
        if (iFindKeyIndex < 0) {
            LeadingMarginSpan[] leadingMarginSpanArr = (LeadingMarginSpan[]) spanned.getSpans(i, spanned.nextSpanTransition(i, i2, LeadingMarginSpan.class), LeadingMarginSpan.class);
            Intrinsics.h(leadingMarginSpanArr);
            int i3 = 0;
            if (leadingMarginSpanArr.length != 0) {
                boolean z = true;
                if (i != 0 && spanned.charAt(i - 1) != '\n') {
                    z = false;
                }
                int length = leadingMarginSpanArr.length;
                int leadingMargin = 0;
                while (i3 < length) {
                    leadingMargin += leadingMarginSpanArr[i3].getLeadingMargin(z);
                    i3++;
                }
                i3 = leadingMargin;
            }
            f = i3;
            mutableLongFloatMap.put(j2, f);
        } else {
            f = mutableLongFloatMap.values[iFindKeyIndex];
        }
        return (int) f;
    }

    public abstract void c(Canvas canvas, Paint paint, int i, int i2, int i3, int i5, Spanned spanned, int i6, int i21, int i22, int i32, float f, float f4);

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i5, int i6, CharSequence text, int i21, int i22, int i32) {
        int iMax;
        int iMin;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        int spanEnd = spanned.getSpanEnd(this);
        if (spanStart == -1 || spanEnd == -1 || spanStart >= i22 || spanEnd <= i21 || (iMax = Math.max(spanStart, i21)) >= (iMin = Math.min(spanEnd, i22))) {
            return;
        }
        c(canvas, paint, i, i3, i5, i6, spanned, i21, i22, iMax, iMin, a(spanned, paint, i21, iMax), a(spanned, paint, iMax, iMin));
    }
}
