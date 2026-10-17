package ep0;

import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class m extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f128042a;

    public final int a(int i, int i2, int i3, int i5) {
        return (int) (v0.a.a(i5, 1, i2, i) * Math.max(1.0f, this.f128042a / i3));
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint tp2) {
        Intrinsics.checkNotNullParameter(tp2, "tp");
        this.f128042a = tp2.getTextSize();
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint tp2) {
        Intrinsics.checkNotNullParameter(tp2, "tp");
        this.f128042a = tp2.getTextSize();
    }
}
