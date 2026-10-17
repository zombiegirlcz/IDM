package androidx.compose.animation.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001am\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0010\u001aI\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014\u001ak\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0017\u001a5\u0010\u0018\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/AnimationState;", "value", "velocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "copy", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)Landroidx/compose/animation/core/AnimationState;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "velocity", "(Landroidx/compose/animation/core/AnimationState;FFJJZ)Landroidx/compose/animation/core/AnimationState;", "initialValue", "initialVelocity", "AnimationState", "(FFJJZ)Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;JJZ)Landroidx/compose/animation/core/AnimationState;", "createZeroVectorFrom", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "animation-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AnimationStateKt {
    @NotNull
    public static final AnimationState<Float, AnimationVector1D> AnimationState(float f, float f4, long j2, long j3, boolean z) {
        return new AnimationState<>(VectorConvertersKt.getVectorConverter(m.f186426a), Float.valueOf(f), AnimationVectorsKt.AnimationVector(f4), j2, j3, z);
    }

    public static /* synthetic */ AnimationState AnimationState$default(float f, float f4, long j2, long j3, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            f4 = BitmapDescriptorFactory.HUE_RED;
        }
        if ((i & 4) != 0) {
            j2 = Long.MIN_VALUE;
        }
        if ((i & 8) != 0) {
            j3 = Long.MIN_VALUE;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return AnimationState(f, f4, j2, j3, z);
    }

    @NotNull
    public static final <T, V extends AnimationVector> AnimationState<T, V> copy(@NotNull AnimationState<T, V> animationState, T t2, V v, long j2, long j3, boolean z) {
        return new AnimationState<>(animationState.getTypeConverter(), t2, v, j2, j3, z);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, Object obj2, AnimationVector animationVector, long j2, long j3, boolean z, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj2 = animationState.getValue();
        }
        if ((i & 2) != 0) {
            animationVector = AnimationVectorsKt.copy(animationState.getVelocityVector());
        }
        if ((i & 4) != 0) {
            j2 = animationState.getLastFrameTimeNanos();
        }
        if ((i & 8) != 0) {
            j3 = animationState.getFinishedTimeNanos();
        }
        if ((i & 16) != 0) {
            z = animationState.getIsRunning();
        }
        boolean z3 = z;
        long j5 = j3;
        return copy((AnimationState<Object, AnimationVector>) animationState, obj2, animationVector, j2, j5, z3);
    }

    @NotNull
    public static final <T, V extends AnimationVector> V createZeroVectorFrom(@NotNull TwoWayConverter<T, V> twoWayConverter, T t2) {
        V v = (V) twoWayConverter.getConvertToVector().invoke(t2);
        v.reset$animation_core();
        return v;
    }

    public static /* synthetic */ AnimationState AnimationState$default(TwoWayConverter twoWayConverter, Object obj2, Object obj3, long j2, long j3, boolean z, int i, Object obj4) {
        if ((i & 8) != 0) {
            j2 = Long.MIN_VALUE;
        }
        if ((i & 16) != 0) {
            j3 = Long.MIN_VALUE;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        return AnimationState(twoWayConverter, obj2, obj3, j2, j3, z);
    }

    @NotNull
    public static final AnimationState<Float, AnimationVector1D> copy(@NotNull AnimationState<Float, AnimationVector1D> animationState, float f, float f4, long j2, long j3, boolean z) {
        return new AnimationState<>(animationState.getTypeConverter(), Float.valueOf(f), AnimationVectorsKt.AnimationVector(f4), j2, j3, z);
    }

    @NotNull
    public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(@NotNull TwoWayConverter<T, V> twoWayConverter, T t2, T t3, long j2, long j3, boolean z) {
        return new AnimationState<>(twoWayConverter, t2, (AnimationVector) twoWayConverter.getConvertToVector().invoke(t3), j2, j3, z);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, float f, float f4, long j2, long j3, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = ((Number) animationState.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f4 = ((AnimationVector1D) animationState.getVelocityVector()).getValue();
        }
        if ((i & 4) != 0) {
            j2 = animationState.getLastFrameTimeNanos();
        }
        if ((i & 8) != 0) {
            j3 = animationState.getFinishedTimeNanos();
        }
        if ((i & 16) != 0) {
            z = animationState.getIsRunning();
        }
        boolean z3 = z;
        long j5 = j3;
        return copy((AnimationState<Float, AnimationVector1D>) animationState, f, f4, j2, j5, z3);
    }
}
