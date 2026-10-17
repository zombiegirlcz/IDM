package y9e;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.subscriptions.impl.edit_frequency.EditSubscriptionFrequencyController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EditSubscriptionFrequencyController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditSubscriptionFrequencyController editSubscriptionFrequencyController, Continuation continuation) {
        super(2, continuation);
        this.v = editSubscriptionFrequencyController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.S.getValue();
        Intrinsics.h(model);
        g gVar = (g) cVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.recurring_payments.models.RecurringPaymentFrequency");
        gVar.H2(gVar.f311848p, new y8a.h((fva.e) obj3, 4));
        return Unit.f186387a;
    }
}
