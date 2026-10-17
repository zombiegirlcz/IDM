package androidx.compose.animation.core;

import androidx.compose.ui.graphics.BezierKt;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", "a", "", "b", "c", "d", "<init>", "(FFFF)V", "min", "max", "transform", "fraction", "throwNoSolution", "", "equals", "", "other", "", "hashCode", "", "toString", "", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CubicBezierEasing implements Easing {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float max;
    private final float min;

    public CubicBezierEasing(float f, float f4, float f5, float f6) {
        this.a = f;
        this.b = f4;
        this.c = f5;
        this.d = f6;
        if (!((Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) ? false : true)) {
            PreconditionsKt.throwIllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f4 + ", " + f5 + ", " + f6 + CoreConstants.DOT);
        }
        long jComputeCubicVerticalBounds = BezierKt.computeCubicVerticalBounds(BitmapDescriptorFactory.HUE_RED, f4, f6, 1.0f, new float[5], 0);
        this.min = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds >> 32));
        this.max = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds & BodyPartID.bodyIdMax));
    }

    private final void throwNoSolution(float fraction) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ") has no solution at " + fraction);
    }

    public boolean equals(Object other) {
        if (!(other instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) other;
        return this.a == cubicBezierEasing.a && this.b == cubicBezierEasing.b && this.c == cubicBezierEasing.c && this.d == cubicBezierEasing.d;
    }

    public int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.c, m72.b.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("CubicBezierEasing(a=");
        sb6.append(this.a);
        sb6.append(", b=");
        sb6.append(this.b);
        sb6.append(", c=");
        sb6.append(this.c);
        sb6.append(", d=");
        return m72.b.s(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float fraction) {
        if (fraction > BitmapDescriptorFactory.HUE_RED && fraction < 1.0f) {
            float fMax = Math.max(fraction, 1.1920929E-7f);
            float fFindFirstCubicRoot = BezierKt.findFirstCubicRoot(BitmapDescriptorFactory.HUE_RED - fMax, this.a - fMax, this.c - fMax, 1.0f - fMax);
            if (Float.isNaN(fFindFirstCubicRoot)) {
                throwNoSolution(fraction);
            }
            fraction = BezierKt.evaluateCubic(this.b, this.d, fFindFirstCubicRoot);
            float f = this.min;
            float f4 = this.max;
            if (fraction < f) {
                fraction = f;
            }
            if (fraction > f4) {
                return f4;
            }
        }
        return fraction;
    }
}
