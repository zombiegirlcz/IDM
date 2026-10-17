package androidx.compose.animation.core;

import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2174}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class TransitionKt$rememberTransition$1$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TransitionState<T> $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$1$1(TransitionState<T> transitionState, Continuation<? super TransitionKt$rememberTransition$1$1> continuation) {
        super(2, continuation);
        this.$transitionState = transitionState;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new TransitionKt$rememberTransition$1$1(this.$transitionState, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        hlm.a compositionContinuationMutex;
        TransitionState transitionState;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            ((SeekableTransitionState) this.$transitionState).observeTotalDuration$animation_core();
            compositionContinuationMutex = ((SeekableTransitionState) this.$transitionState).getCompositionContinuationMutex();
            TransitionState transitionState2 = this.$transitionState;
            this.L$0 = compositionContinuationMutex;
            this.L$1 = transitionState2;
            this.label = 1;
            if (compositionContinuationMutex.lock(null, this) == aVar) {
                return aVar;
            }
            transitionState = transitionState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transitionState = (TransitionState) this.L$1;
            compositionContinuationMutex = (hlm.a) this.L$0;
            o.b(obj2);
        }
        try {
            ((SeekableTransitionState) transitionState).setComposedTargetState$animation_core(((SeekableTransitionState) transitionState).getTargetState());
            CancellableContinuation compositionContinuation = ((SeekableTransitionState) transitionState).getCompositionContinuation();
            if (compositionContinuation != null) {
                m.Companion companion = m.INSTANCE;
                compositionContinuation.resumeWith(((SeekableTransitionState) transitionState).getTargetState());
            }
            ((SeekableTransitionState) transitionState).setCompositionContinuation$animation_core(null);
            Unit unit = Unit.f186387a;
            compositionContinuationMutex.unlock(null);
            return Unit.f186387a;
        } catch (Throwable th10) {
            compositionContinuationMutex.unlock(null);
            throw th10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransitionKt$rememberTransition$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
