package androidx.compose.animation;

import a0.d;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "splinePositions", "splineTimes", "", "nbSamples", "", "computeSplineInfo", "([F[FI)V", "T", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/DecayAnimationSpec;", "splineBasedDecay", "(Landroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/DecayAnimationSpec;", "animation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class SplineBasedDecayKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i) {
        float f;
        float f4;
        float f5;
        float f6;
        float f32;
        float f35;
        float f36;
        float f37;
        float f41;
        float f42 = BitmapDescriptorFactory.HUE_RED;
        int i2 = 0;
        float f57 = 0.0f;
        while (true) {
            float f69 = 1.0f;
            if (i2 >= i) {
                fArr2[i] = 1.0f;
                fArr[i] = 1.0f;
                return;
            }
            float f75 = i2 / i;
            float f77 = 1.0f;
            while (true) {
                f = ((f77 - f42) / 2.0f) + f42;
                f4 = f69 - f;
                f5 = f * 3.0f * f4;
                f6 = f * f * f;
                float fA = d.a(f, 0.35000002f, f4 * 0.175f, f5) + f6;
                f32 = f69;
                if (Math.abs(fA - f75) < 1.0E-5d) {
                    break;
                }
                if (fA > f75) {
                    f77 = f;
                } else {
                    f42 = f;
                }
                f69 = f32;
            }
            float f81 = 0.5f;
            fArr[i2] = (((f4 * 0.5f) + f) * f5) + f6;
            float f82 = f32;
            while (true) {
                f35 = ((f82 - f57) / 2.0f) + f57;
                f36 = f32 - f35;
                f37 = f35 * 3.0f * f36;
                f41 = f35 * f35 * f35;
                float fA2 = d.a(f36, f81, f35, f37) + f41;
                float f93 = f75;
                if (Math.abs(fA2 - f75) >= 1.0E-5d) {
                    if (fA2 > f93) {
                        f82 = f35;
                    } else {
                        f57 = f35;
                    }
                    f75 = f93;
                    f81 = 0.5f;
                }
            }
            fArr2[i2] = (((f35 * 0.35000002f) + (f36 * 0.175f)) * f37) + f41;
            i2++;
        }
    }

    @NotNull
    public static final <T> DecayAnimationSpec<T> splineBasedDecay(@NotNull Density density) {
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
