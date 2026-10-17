package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u0012\u001a\u00020\u0003*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010\"\u001a\u00020\u0010*\u00020\u00142\u0006\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010#\"(\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)*\f\b\u0002\u0010,\"\u00020\u00142\u00020\u0014*\u0018\b\u0002\u0010-\"\b\u0012\u0004\u0012\u00020\u00140\n2\b\u0012\u0004\u0012\u00020\u00140\n¨\u0006."}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "event", "", "addPointerInputChange", "(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "addPointerInputChange-0AR0LA0", "(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "index", "", "time", "", "dataPoint", "set", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "", "x", "y", "sampleCount", "degree", "coefficients", "polyFitLeastSquares", "([F[FII[F)[F", "dataPoints", "", "isDataDifferential", "calculateImpulseVelocity", "([F[FIZ)F", "a", "dot", "([F[F)F", "VelocityTrackerAddPointsFix", "Z", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "getVelocityTrackerAddPointsFix$annotations", "()V", "Vector", "Matrix", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class VelocityTrackerKt {
    private static boolean VelocityTrackerAddPointsFix = true;

    public static final void addPointerInputChange(@NotNull VelocityTracker velocityTracker, @NotNull PointerInputChange pointerInputChange) {
        m2515addPointerInputChange0AR0LA0(velocityTracker, pointerInputChange, Offset.INSTANCE.m1845getZeroF1C5BW0());
    }

    /* JADX INFO: renamed from: addPointerInputChange-0AR0LA0, reason: not valid java name */
    public static final void m2515addPointerInputChange0AR0LA0(@NotNull VelocityTracker velocityTracker, @NotNull PointerInputChange pointerInputChange, long j2) {
        velocityTracker.getPlatformVelocityTracker().mo2509addPointerInputChangeUv8p0NA(pointerInputChange, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i, boolean z) {
        int i2 = i - 1;
        float f = fArr2[i2];
        float f4 = BitmapDescriptorFactory.HUE_RED;
        int i3 = i2;
        while (i3 > 0) {
            int i5 = i3 - 1;
            float f5 = fArr2[i5];
            if (f != f5) {
                float f6 = (z ? -fArr[i5] : fArr[i3] - fArr[i5]) / (f - f5);
                float fAbs = (Math.abs(f6) * (f6 - (Math.signum(f4) * ((float) Math.sqrt(Math.abs(f4) * 2))))) + f4;
                if (i3 == i2) {
                    fAbs *= 0.5f;
                }
                f4 = fAbs;
            }
            i3--;
            f = f5;
        }
        return Math.signum(f4) * ((float) Math.sqrt(Math.abs(f4) * 2));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final boolean getVelocityTrackerAddPointsFix() {
        return VelocityTrackerAddPointsFix;
    }

    @NotNull
    public static final float[] polyFitLeastSquares(@NotNull float[] fArr, @NotNull float[] fArr2, int i, int i2, @NotNull float[] fArr3) {
        int i3 = i2;
        if (i3 < 1) {
            InlineClassHelperKt.throwIllegalArgumentException("The degree must be at positive integer");
        }
        if (i == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
        }
        if (i3 >= i) {
            i3 = i - 1;
        }
        int i5 = i3 + 1;
        float[][] fArr4 = new float[i5][];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr4[i6] = new float[i];
        }
        for (int i21 = 0; i21 < i; i21++) {
            fArr4[0][i21] = 1.0f;
            for (int i22 = 1; i22 < i5; i22++) {
                fArr4[i22][i21] = fArr4[i22 - 1][i21] * fArr[i21];
            }
        }
        float[][] fArr5 = new float[i5][];
        for (int i32 = 0; i32 < i5; i32++) {
            fArr5[i32] = new float[i];
        }
        float[][] fArr6 = new float[i5][];
        for (int i33 = 0; i33 < i5; i33++) {
            fArr6[i33] = new float[i5];
        }
        int i43 = 0;
        while (i43 < i5) {
            float[] destination = fArr5[i43];
            float[] fArr7 = fArr4[i43];
            Intrinsics.checkNotNullParameter(fArr7, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i);
            for (int i59 = 0; i59 < i43; i59++) {
                float[] fArr8 = fArr5[i59];
                float fDot = dot(destination, fArr8);
                for (int i66 = 0; i66 < i; i66++) {
                    destination[i66] = destination[i66] - (fArr8[i66] * fDot);
                }
            }
            float fSqrt = (float) Math.sqrt(dot(destination, destination));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i74 = 0; i74 < i; i74++) {
                destination[i74] = destination[i74] * f;
            }
            float[] fArr9 = fArr6[i43];
            int i92 = 0;
            while (i92 < i5) {
                fArr9[i92] = i92 < i43 ? BitmapDescriptorFactory.HUE_RED : dot(destination, fArr4[i92]);
                i92++;
            }
            i43++;
        }
        for (int i96 = i3; -1 < i96; i96--) {
            float fDot2 = dot(fArr5[i96], fArr2);
            float[] fArr10 = fArr6[i96];
            int i99 = i96 + 1;
            if (i99 <= i3) {
                int i100 = i3;
                while (true) {
                    fDot2 -= fArr10[i100] * fArr3[i100];
                    if (i100 != i99) {
                        i100--;
                    }
                }
            }
            fArr3[i96] = fDot2 / fArr10[i96];
        }
        return fArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i, long j2, float f) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i] = new DataPointAtTime(j2, f);
        } else {
            dataPointAtTime.setTime(j2);
            dataPointAtTime.setDataPoint(f);
        }
    }
}
