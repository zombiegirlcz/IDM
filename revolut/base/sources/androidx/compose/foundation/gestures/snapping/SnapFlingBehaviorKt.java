package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gim.c;
import gim.d;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a^\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0019\u0010\u001a\u001af\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!\"\u001a\u0010#\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "snapFlingBehavior", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialTargetOffset", "initialVelocity", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "Landroidx/compose/animation/core/AnimationVector1D;", "animation", "Lkotlin/Function1;", "", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "approach", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/foundation/gestures/snapping/ApproachAnimation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetOffset", "Landroidx/compose/animation/core/AnimationState;", "animationState", "animateDecay", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelOffset", "animationSpec", "animateWithTarget", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "target", "coerceToTarget", "(FF)F", "Landroidx/compose/ui/unit/Dp;", "MinFlingVelocityDp", "F", "getMinFlingVelocityDp", "()F", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class SnapFlingBehaviorKt {
    private static final float MinFlingVelocityDp = Dp.m3297constructorimpl(400);

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1, reason: invalid class name */
    @d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {308}, m = "animateDecay", v = 1)
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        float F$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.animateDecay(null, BitmapDescriptorFactory.HUE_RED, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {349}, m = "animateWithTarget", v = 1)
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C18841 extends c {
        float F$0;
        float F$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18841(Continuation<? super C18841> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.animateWithTarget(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateDecay(androidx.compose.foundation.gestures.ScrollScope r10, float r11, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r12, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r13, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r14, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            float r11 = r0.F$0
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.internal.m0 r10 = (kotlin.jvm.internal.m0) r10
            java.lang.Object r12 = r0.L$0
            androidx.compose.animation.core.AnimationState r12 = (androidx.compose.animation.core.AnimationState) r12
            yhm.o.b(r15)
            goto L6e
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            yhm.o.b(r15)
            kotlin.jvm.internal.m0 r6 = new kotlin.jvm.internal.m0
            r6.<init>()
            java.lang.Object r15 = r12.getVelocity()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r2 = 0
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L52
            r15 = r3
            goto L53
        L52:
            r15 = 0
        L53:
            r15 = r15 ^ r3
            h1.a r4 = new h1.a
            r9 = 0
            r7 = r10
            r5 = r11
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r12
            r0.L$1 = r6
            r0.F$0 = r5
            r0.label = r3
            java.lang.Object r10 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay(r12, r13, r15, r4, r0)
            if (r10 != r1) goto L6c
            return r1
        L6c:
            r11 = r5
            r10 = r6
        L6e:
            androidx.compose.foundation.gestures.snapping.AnimationResult r13 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r10 = r10.f186427a
            float r11 = r11 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r11)
            r13.<init>(r10, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, Function1<? super Float, Unit> function1, float f) {
        float fScrollBy;
        try {
            fScrollBy = scrollScope.scrollBy(f);
        } catch (CancellationException unused) {
            animationScope.cancelAnimation();
            fScrollBy = BitmapDescriptorFactory.HUE_RED;
        }
        function1.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f - fScrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit animateDecay$lambda$0(float f, m0 m0Var, ScrollScope scrollScope, Function1 function1, AnimationScope animationScope) {
        if (Math.abs(((Number) animationScope.getValue()).floatValue()) >= Math.abs(f)) {
            float fCoerceToTarget = coerceToTarget(((Number) animationScope.getValue()).floatValue(), f);
            animateDecay$consumeDelta(animationScope, scrollScope, function1, fCoerceToTarget - m0Var.f186427a);
            animationScope.cancelAnimation();
            m0Var.f186427a = fCoerceToTarget;
        } else {
            animateDecay$consumeDelta(animationScope, scrollScope, function1, ((Number) animationScope.getValue()).floatValue() - m0Var.f186427a);
            m0Var.f186427a = ((Number) animationScope.getValue()).floatValue();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateWithTarget(androidx.compose.foundation.gestures.ScrollScope r15, float r16, float r17, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r18, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r19, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r20, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r21) {
        /*
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C18841
            if (r2 == 0) goto L18
            r2 = r1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r2 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C18841) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.label = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r2 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.result
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L42
            if (r3 != r4) goto L3a
            float r15 = r8.F$1
            float r0 = r8.F$0
            java.lang.Object r2 = r8.L$1
            kotlin.jvm.internal.m0 r2 = (kotlin.jvm.internal.m0) r2
            java.lang.Object r3 = r8.L$0
            androidx.compose.animation.core.AnimationState r3 = (androidx.compose.animation.core.AnimationState) r3
            yhm.o.b(r1)
            r1 = r3
            goto L94
        L3a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L42:
            yhm.o.b(r1)
            kotlin.jvm.internal.m0 r11 = new kotlin.jvm.internal.m0
            r11.<init>()
            java.lang.Object r1 = r18.getVelocity()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            java.lang.Object r5 = r18.getVelocity()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L6a
            r5 = r4
            goto L6b
        L6a:
            r5 = 0
        L6b:
            r6 = r5 ^ 1
            h1.a r9 = new h1.a
            r14 = 1
            r12 = r15
            r10 = r17
            r13 = r20
            r9.<init>(r10, r11, r12, r13, r14)
            r15 = r3
            r3 = r18
            r8.L$0 = r3
            r8.L$1 = r11
            r8.F$0 = r0
            r8.F$1 = r1
            r8.label = r4
            r4 = r15
            r5 = r19
            r7 = r9
            java.lang.Object r15 = androidx.compose.animation.core.SuspendAnimationKt.animateTo(r3, r4, r5, r6, r7, r8)
            if (r15 != r2) goto L90
            return r2
        L90:
            r15 = r1
            r2 = r11
            r1 = r18
        L94:
            java.lang.Object r3 = r1.getVelocity()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = coerceToTarget(r3, r15)
            androidx.compose.foundation.gestures.snapping.AnimationResult r15 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r2 = r2.f186427a
            float r0 = r0 - r2
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r0)
            r9 = 29
            r10 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            androidx.compose.animation.core.AnimationState r0 = androidx.compose.animation.core.AnimationStateKt.copy$default(r1, r2, r3, r4, r6, r8, r9, r10)
            r15.<init>(r11, r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateWithTarget(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit animateWithTarget$lambda$0(float f, m0 m0Var, ScrollScope scrollScope, Function1 function1, AnimationScope animationScope) {
        float fScrollBy;
        float fCoerceToTarget = coerceToTarget(((Number) animationScope.getValue()).floatValue(), f);
        float f4 = fCoerceToTarget - m0Var.f186427a;
        try {
            fScrollBy = scrollScope.scrollBy(f4);
        } catch (CancellationException unused) {
            animationScope.cancelAnimation();
            fScrollBy = BitmapDescriptorFactory.HUE_RED;
        }
        function1.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f4 - fScrollBy) > 0.5f || fCoerceToTarget != ((Number) animationScope.getValue()).floatValue()) {
            animationScope.cancelAnimation();
        }
        m0Var.f186427a += fScrollBy;
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object approach(ScrollScope scrollScope, float f, float f4, ApproachAnimation<Float, AnimationVector1D> approachAnimation, Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        return approachAnimation.approachAnimation(scrollScope, new Float(f), new Float(f4), function1, continuation);
    }

    private static final float coerceToTarget(float f, float f4) {
        return f4 == BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : (f4 <= BitmapDescriptorFactory.HUE_RED ? f >= f4 : f <= f4) ? f : f4;
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    @NotNull
    public static final TargetedFlingBehavior snapFlingBehavior(@NotNull SnapLayoutInfoProvider snapLayoutInfoProvider, @NotNull DecayAnimationSpec<Float> decayAnimationSpec, @NotNull AnimationSpec<Float> animationSpec) {
        return new SnapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpec, animationSpec);
    }
}
