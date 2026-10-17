package androidx.camera.camera2.adapter;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.ExposureState;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#¨\u0006$"}, d2 = {"Landroidx/camera/camera2/adapter/EvCompValue;", "Landroidx/camera/core/ExposureState;", "", "supported", "", "index", "Landroid/util/Range;", "range", "Landroid/util/Rational;", "step", "<init>", "(ZILandroid/util/Range;Landroid/util/Rational;)V", "getExposureCompensationIndex", "()I", "getExposureCompensationRange", "()Landroid/util/Range;", "isExposureCompensationSupported", "()Z", "newIndex", "updateIndex$camera_camera2", "(I)Landroidx/camera/camera2/adapter/EvCompValue;", "updateIndex", "copy", "(ZILandroid/util/Range;Landroid/util/Rational;)Landroidx/camera/camera2/adapter/EvCompValue;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "I", "Landroid/util/Range;", "Landroid/util/Rational;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EvCompValue implements ExposureState {
    private final int index;

    @NotNull
    private final Range<Integer> range;

    @NotNull
    private final Rational step;
    private final boolean supported;

    public EvCompValue(boolean z, int i, @NotNull Range<Integer> range, @NotNull Rational step) {
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(step, "step");
        this.supported = z;
        this.index = i;
        this.range = range;
        this.step = step;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvCompValue copy$default(EvCompValue evCompValue, boolean z, int i, Range range, Rational rational, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            z = evCompValue.supported;
        }
        if ((i2 & 2) != 0) {
            i = evCompValue.index;
        }
        if ((i2 & 4) != 0) {
            range = evCompValue.range;
        }
        if ((i2 & 8) != 0) {
            rational = evCompValue.step;
        }
        return evCompValue.copy(z, i, range, rational);
    }

    @NotNull
    public final EvCompValue copy(boolean supported, int index, @NotNull Range<Integer> range, @NotNull Rational step) {
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(step, "step");
        return new EvCompValue(supported, index, range, step);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvCompValue)) {
            return false;
        }
        EvCompValue evCompValue = (EvCompValue) other;
        return this.supported == evCompValue.supported && this.index == evCompValue.index && Intrinsics.f(this.range, evCompValue.range) && Intrinsics.f(this.step, evCompValue.step);
    }

    @Override // androidx.camera.core.ExposureState
    /* JADX INFO: renamed from: getExposureCompensationIndex, reason: from getter */
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.camera.core.ExposureState
    @NotNull
    public Range<Integer> getExposureCompensationRange() {
        return this.range;
    }

    public int hashCode() {
        return this.step.hashCode() + ((this.range.hashCode() + a.b(this.index, Boolean.hashCode(this.supported) * 31, 31)) * 31);
    }

    @Override // androidx.camera.core.ExposureState
    /* JADX INFO: renamed from: isExposureCompensationSupported, reason: from getter */
    public boolean getSupported() {
        return this.supported;
    }

    @NotNull
    public String toString() {
        return "EvCompValue(supported=" + this.supported + ", index=" + this.index + ", range=" + this.range + ", step=" + this.step + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @NotNull
    public final EvCompValue updateIndex$camera_camera2(int newIndex) {
        return copy$default(this, false, newIndex, null, null, 13, null);
    }
}
