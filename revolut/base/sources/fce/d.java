package fce;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SubscriptionDetailsDialogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SubscriptionDetailsDialogController subscriptionDetailsDialogController, Continuation continuation) {
        super(2, continuation);
        this.v = subscriptionDetailsDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f;
        fva.e frequency = obj3 instanceof fva.e ? (fva.e) obj3 : null;
        if (frequency != null) {
            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.b bVar = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.b) this.v.R2();
            bVar.getClass();
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            cli.y yVar = bVar.o;
            y yVar2 = (y) ((j2) yVar.f22677a).getValue();
            if (yVar2 instanceof t) {
                bVar.H2(yVar, new f0d.l((t) yVar2, frequency, 21));
            }
        }
        return Unit.f186387a;
    }
}
