package androidx.view.compose;

import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.activity.compose.ComposePredictiveBackHandler$currentOnBack$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposePredictiveBackHandler$currentOnBack$1 extends i implements Function2<Flow, Continuation<? super Unit>, Object> {
    int label;

    public ComposePredictiveBackHandler$currentOnBack$1(Continuation<? super ComposePredictiveBackHandler$currentOnBack$1> continuation) {
        super(2, continuation);
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new ComposePredictiveBackHandler$currentOnBack$1(continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Flow flow, Continuation<? super Unit> continuation) {
        return ((ComposePredictiveBackHandler$currentOnBack$1) create(flow, continuation)).invokeSuspend(Unit.f186387a);
    }
}
