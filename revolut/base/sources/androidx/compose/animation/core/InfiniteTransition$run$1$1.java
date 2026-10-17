package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.youTransactor.uCube.rpc.Constants;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, Constants.TAG_ATMEL_SERIAL}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class InfiniteTransition$run$1$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<State<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3, reason: invalid class name */
    @d(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function2<Float, Continuation<? super Boolean>, Object> {
        /* synthetic */ float F$0;
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.F$0 = ((Number) obj2).floatValue();
            return anonymousClass3;
        }

        public final Object invoke(float f, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass3) create(Float.valueOf(f), continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return Boolean.valueOf(this.F$0 > BitmapDescriptorFactory.HUE_RED);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            return invoke(((Number) obj2).floatValue(), (Continuation<? super Boolean>) obj3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1$1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, Continuation<? super InfiniteTransition$run$1$1> continuation) {
        super(2, continuation);
        this.$toolingOverride = mutableState;
        this.this$0 = infiniteTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableState mutableState, InfiniteTransition infiniteTransition, m0 m0Var, CoroutineScope coroutineScope, long j2) {
        State state = (State) mutableState.getValue();
        long jLongValue = state != null ? ((Number) state.getValue()).longValue() : j2;
        if (infiniteTransition.startTimeNanos == Long.MIN_VALUE || m0Var.f186427a != SuspendAnimationKt.getDurationScale(coroutineScope.getF74819h())) {
            infiniteTransition.startTimeNanos = j2;
            MutableVector mutableVector = infiniteTransition._animations;
            Object[] objArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                ((InfiniteTransition.TransitionAnimationState) objArr[i]).reset$animation_core();
            }
            m0Var.f186427a = SuspendAnimationKt.getDurationScale(coroutineScope.getF74819h());
        }
        if (m0Var.f186427a == BitmapDescriptorFactory.HUE_RED) {
            MutableVector mutableVector2 = infiniteTransition._animations;
            Object[] objArr2 = mutableVector2.content;
            int size2 = mutableVector2.getSize();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InfiniteTransition.TransitionAnimationState) objArr2[i2]).skipToEnd$animation_core();
            }
        } else {
            infiniteTransition.onFrame((long) ((jLongValue - infiniteTransition.startTimeNanos) / m0Var.f186427a));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invokeSuspend$lambda$1(CoroutineScope coroutineScope) {
        return SuspendAnimationKt.getDurationScale(coroutineScope.getF74819h());
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.$toolingOverride, this.this$0, continuation);
        infiniteTransition$run$1$1.L$0 = obj2;
        return infiniteTransition$run$1$1;
    }

    /* JADX WARN: Path cross not found for [B:11:0x0042, B:16:0x0060], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:16:0x0060, B:11:0x0042], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[PHI: r8 r9
      0x0059: PHI (r8v1 kotlin.jvm.internal.m0) = (r8v2 kotlin.jvm.internal.m0), (r8v3 kotlin.jvm.internal.m0) binds: [B:12:0x0056, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r9v1 kotlinx.coroutines.CoroutineScope) = (r9v2 kotlinx.coroutines.CoroutineScope), (r9v3 kotlinx.coroutines.CoroutineScope) binds: [B:12:0x0056, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005e -> B:11:0x0042). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:11:0x0042). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.m0 r1 = (kotlin.jvm.internal.m0) r1
            java.lang.Object r4 = r11.L$0
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            yhm.o.b(r12)
            r8 = r1
            r9 = r4
            goto L42
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.m0 r1 = (kotlin.jvm.internal.m0) r1
            java.lang.Object r4 = r11.L$0
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            yhm.o.b(r12)
            r8 = r1
            r9 = r4
            goto L59
        L30:
            yhm.o.b(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
            kotlin.jvm.internal.m0 r1 = new kotlin.jvm.internal.m0
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f186427a = r4
            r9 = r12
            r8 = r1
        L42:
            androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> r6 = r11.$toolingOverride
            androidx.compose.animation.core.InfiniteTransition r7 = r11.this$0
            androidx.compose.animation.core.a r5 = new androidx.compose.animation.core.a
            r10 = 1
            r5.<init>(r6, r7, r8, r9, r10)
            r11.L$0 = r9
            r11.L$1 = r8
            r11.label = r3
            java.lang.Object r12 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r5, r11)
            if (r12 != r0) goto L59
            goto L7b
        L59:
            float r12 = r8.f186427a
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L42
            androidx.compose.animation.core.b r12 = new androidx.compose.animation.core.b
            r12.<init>()
            kotlinx.coroutines.flow.Flow r12 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r12)
            androidx.compose.animation.core.InfiniteTransition$run$1$1$3 r1 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$3
            r4 = 0
            r1.<init>(r4)
            r11.L$0 = r9
            r11.L$1 = r8
            r11.label = r2
            java.lang.Object r12 = vkm.q.y(r12, r1, r11)
            if (r12 != r0) goto L42
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InfiniteTransition$run$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
