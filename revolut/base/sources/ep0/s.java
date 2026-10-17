package ep0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements LineHeightSpan.WithDensity {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f128051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f128052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f128053c;

    public s(int i) {
        this.f128051a = i;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i5, Paint.FontMetricsInt fontMetricsInt) {
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i5, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        if (fontMetricsInt == null || textPaint == null) {
            return;
        }
        int i6 = this.f128051a;
        if (i == i6) {
            this.f128052b = fontMetricsInt.ascent;
            this.f128053c = fontMetricsInt.descent;
        }
        int iA = n.a(textPaint.getFontFeatureSettings(), "spcl");
        if (i != i6 || iA == 0) {
            fontMetricsInt.ascent = this.f128052b;
        } else {
            fontMetricsInt.ascent -= ((this.f128053c - this.f128052b) * iA) / 100;
        }
    }
}
