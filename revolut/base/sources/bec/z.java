package bec;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyContract$ModalStep;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class z extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayWithAnyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(PayWithAnyScreen payWithAnyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = payWithAnyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z zVar = new z(this.v, continuation);
        zVar.u = obj2;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.d();
        Object obj3 = model.u;
        com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar2 = (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) qVarE3;
        if (obj3 instanceof c) {
            oki.h.v2(aVar2.f84729w, new PayWithAnyContract$ModalStep.CardOptions(((c) obj3).f14765a.f84370a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
