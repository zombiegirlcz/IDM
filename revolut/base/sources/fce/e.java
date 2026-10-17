package fce;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ SubscriptionDetailsDialogController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SubscriptionDetailsDialogController subscriptionDetailsDialogController, Continuation continuation) {
        super(2, continuation);
        this.u = subscriptionDetailsDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.b bVar = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.b) this.u.R2();
        cli.y yVar = bVar.o;
        y yVar2 = (y) ((j2) yVar.f22677a).getValue();
        if (yVar2 instanceof i) {
            bVar.H2(yVar, new fca.d((i) yVar2, 1));
        } else if (yVar2 instanceof w) {
            bVar.H2(yVar, new fca.d((w) yVar2, 2));
        }
        return Unit.f186387a;
    }
}
