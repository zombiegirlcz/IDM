package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.cbeff.ISO781611;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, 150}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class SnapFlingBehavior$fling$result$1 extends i implements Function2<CoroutineScope, Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ Function1<Float, Unit> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapFlingBehavior$fling$result$1(SnapFlingBehavior snapFlingBehavior, float f, Function1<? super Float, Unit> function1, ScrollScope scrollScope, Continuation<? super SnapFlingBehavior$fling$result$1> continuation) {
        super(2, continuation);
        this.this$0 = snapFlingBehavior;
        this.$initialVelocity = f;
        this.$onRemainingScrollOffsetUpdate = function1;
        this.$this_fling = scrollScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(m0 m0Var, Function1 function1, float f) {
        float f4 = m0Var.f186427a - f;
        m0Var.f186427a = f4;
        function1.invoke(Float.valueOf(f4));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(m0 m0Var, Function1 function1, float f) {
        float f4 = m0Var.f186427a - f;
        m0Var.f186427a = f4;
        function1.invoke(Float.valueOf(f4));
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        final m0 m0Var;
        Object objTryApproach;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            float fCalculateApproachOffset = this.this$0.snapLayoutInfoProvider.calculateApproachOffset(this.$initialVelocity, DecayAnimationSpecKt.calculateTargetValue(this.this$0.decayAnimationSpec, BitmapDescriptorFactory.HUE_RED, this.$initialVelocity));
            if (Float.isNaN(fCalculateApproachOffset)) {
                InlineClassHelperKt.throwIllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            m0Var = new m0();
            float fSignum = Math.signum(this.$initialVelocity) * Math.abs(fCalculateApproachOffset);
            m0Var.f186427a = fSignum;
            this.$onRemainingScrollOffsetUpdate.invoke(new Float(fSignum));
            SnapFlingBehavior snapFlingBehavior = this.this$0;
            ScrollScope scrollScope = this.$this_fling;
            float f = m0Var.f186427a;
            float f4 = this.$initialVelocity;
            final Function1<Float, Unit> function1 = this.$onRemainingScrollOffsetUpdate;
            final int i2 = 0;
            Function1 function12 = new Function1() { // from class: androidx.compose.foundation.gestures.snapping.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    int i3 = i2;
                    float fFloatValue = ((Float) obj3).floatValue();
                    switch (i3) {
                        case 0:
                            return SnapFlingBehavior$fling$result$1.invokeSuspend$lambda$1(m0Var, function1, fFloatValue);
                        default:
                            return SnapFlingBehavior$fling$result$1.invokeSuspend$lambda$4(m0Var, function1, fFloatValue);
                    }
                }
            };
            this.L$0 = m0Var;
            this.label = 1;
            objTryApproach = snapFlingBehavior.tryApproach(scrollScope, f, f4, function12, this);
            if (objTryApproach != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        m0 m0Var2 = (m0) this.L$0;
        o.b(obj2);
        m0Var = m0Var2;
        objTryApproach = obj2;
        AnimationState animationState = (AnimationState) objTryApproach;
        float fCalculateSnapOffset = this.this$0.snapLayoutInfoProvider.calculateSnapOffset(((Number) animationState.getVelocity()).floatValue());
        if (Float.isNaN(fCalculateSnapOffset)) {
            InlineClassHelperKt.throwIllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        m0Var.f186427a = fCalculateSnapOffset;
        ScrollScope scrollScope2 = this.$this_fling;
        AnimationState animationStateCopy$default = AnimationStateKt.copy$default(animationState, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, 30, (Object) null);
        AnimationSpec animationSpec = this.this$0.snapAnimationSpec;
        final Function1<Float, Unit> function13 = this.$onRemainingScrollOffsetUpdate;
        final int i3 = 1;
        Function1 function14 = new Function1() { // from class: androidx.compose.foundation.gestures.snapping.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                int i32 = i3;
                float fFloatValue = ((Float) obj3).floatValue();
                switch (i32) {
                    case 0:
                        return SnapFlingBehavior$fling$result$1.invokeSuspend$lambda$1(m0Var, function13, fFloatValue);
                    default:
                        return SnapFlingBehavior$fling$result$1.invokeSuspend$lambda$4(m0Var, function13, fFloatValue);
                }
            }
        };
        this.L$0 = null;
        this.label = 2;
        Object objAnimateWithTarget = SnapFlingBehaviorKt.animateWithTarget(scrollScope2, fCalculateSnapOffset, fCalculateSnapOffset, animationStateCopy$default, animationSpec, function14, this);
        return objAnimateWithTarget == aVar ? aVar : objAnimateWithTarget;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        return ((SnapFlingBehavior$fling$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
