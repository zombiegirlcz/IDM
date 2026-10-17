package androidx.glance.session;

import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import skm.e0;
import skm.k0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.glance.session.TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1", f = "TimerScope.kt", l = {ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<TimerScope, Continuation<? super T>, Object> $block;
    final /* synthetic */ TimeSource $timeSource;
    final /* synthetic */ CoroutineScope $timerScope;
    int label;
    final /* synthetic */ TimerScopeKt$withTimer$2$1$blockScope$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1, TimeSource timeSource, CoroutineScope coroutineScope, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = timerScopeKt$withTimer$2$1$blockScope$1;
        this.$timeSource = timeSource;
        this.$timerScope = coroutineScope;
        this.$block = function2;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(this.this$0, this.$timeSource, this.$timerScope, this.$block, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        long jMo3581getTimeLeftUwyO8pc;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        do {
            Object obj3 = this.this$0.deadline.get();
            Intrinsics.h(obj3);
            if (((Number) obj3).longValue() <= this.$timeSource.markNow()) {
                e0.k(this.$timerScope, new TimeoutCancellationException("Timed out of executing block.", this.$block.hashCode()));
                return Unit.f186387a;
            }
            jMo3581getTimeLeftUwyO8pc = this.this$0.mo3581getTimeLeftUwyO8pc();
            this.label = 1;
        } while (k0.c(jMo3581getTimeLeftUwyO8pc, this) != aVar);
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
