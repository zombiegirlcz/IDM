package k01;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements Density {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Density f179915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f179916b;

    public p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f179915a = AndroidDensity_androidKt.Density(context);
        this.f179916b = new AtomicReference(new TextPaint());
    }

    public final float a(CharSequence text, float f, float f4, n01.h textStyle) {
        String str;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        int i = o.f179914a[textStyle.ordinal()];
        if (i == 1) {
            str = null;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sans-serif-medium";
        }
        if (text.length() == 0) {
            return f4;
        }
        AtomicReference atomicReference = this.f179916b;
        TextPaint textPaint = (TextPaint) atomicReference.getAndSet(null);
        if (textPaint == null) {
            textPaint = new TextPaint();
        }
        if (str != null) {
            textPaint.setTypeface(Typeface.create(str, 0));
        }
        Density density = this.f179915a;
        float fMo768toPx0680j_4 = density.mo768toPx0680j_4(f4);
        float fMo768toPx0680j_42 = density.mo768toPx0680j_4(f);
        textPaint.setTextSize(fMo768toPx0680j_4);
        float desiredWidth = Layout.getDesiredWidth(text, textPaint);
        if (desiredWidth >= fMo768toPx0680j_42) {
            float f5 = fMo768toPx0680j_4 / 2;
            textPaint.setTextSize(f5);
            f4 = density.mo765toDpu2uoSUM((int) j6.a.a(f5, fMo768toPx0680j_4, (fMo768toPx0680j_42 - desiredWidth) / (Layout.getDesiredWidth(text, textPaint) - desiredWidth), fMo768toPx0680j_4));
        }
        textPaint.reset();
        atomicReference.set(textPaint);
        return f4;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f179915a.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.f179915a.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final int mo762roundToPx0680j_4(float f) {
        return this.f179915a.mo762roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final float mo763toDpGaN1DYA(long j2) {
        return this.f179915a.mo763toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo764toDpu2uoSUM(float f) {
        return this.f179915a.mo764toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final long mo766toDpSizekrfVVM(long j2) {
        return this.f179915a.mo766toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final float mo767toPxR2X_6o(long j2) {
        return this.f179915a.mo767toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final float mo768toPx0680j_4(float f) {
        return this.f179915a.mo768toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final long mo769toSizeXkaWNTQ(long j2) {
        return this.f179915a.mo769toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final long mo770toSp0xMU5do(float f) {
        return this.f179915a.mo770toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo771toSpkPz2Gy4(float f) {
        return this.f179915a.mo771toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo765toDpu2uoSUM(int i) {
        return this.f179915a.mo765toDpu2uoSUM(i);
    }
}
