package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1202}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class Transition$animateTo$1$1$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    float F$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Transition<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(Transition<S> transition, Continuation<? super Transition$animateTo$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = transition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Transition transition, float f, long j2) {
        if (!transition.isSeeking()) {
            transition.onFrame$animation_core(j2, f);
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.this$0, continuation);
        transition$animateTo$1$1$1.L$0 = obj2;
        return transition$animateTo$1$1$1;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        final float durationScale;
        CoroutineScope coroutineScope;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            durationScale = SuspendAnimationKt.getDurationScale(coroutineScope2.getF74819h());
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            durationScale = this.F$0;
            coroutineScope = (CoroutineScope) this.L$0;
            o.b(obj2);
        }
        while (e0.y(coroutineScope)) {
            final Transition<S> transition = this.this$0;
            Function1 function1 = new Function1() { // from class: androidx.compose.animation.core.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return Transition$animateTo$1$1$1.invokeSuspend$lambda$0(transition, durationScale, ((Long) obj3).longValue());
                }
            };
            this.L$0 = coroutineScope;
            this.F$0 = durationScale;
            this.label = 1;
            if (MonotonicFrameClockKt.withFrameNanos(function1, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Transition$animateTo$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
