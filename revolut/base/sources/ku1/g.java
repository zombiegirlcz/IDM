package ku1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.blik.impl.ui.confirmation.BlikConfirmationScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ BlikConfirmationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BlikConfirmationScreen blikConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = blikConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e0 e0Var = (e0) ((n) this.u.Z.getValue());
        e0Var.getClass();
        e0Var.f2(e0Var.e1(new g1j.a(new BalanceSelector$InputData(y0.b(k1j.a.POCKETS), k1j.d.RETAIL, io3.l.CURRENT, null, null, null, null, null, null, 504), e0Var.v)), ModalDestination.Style.POPUP.f98311a, new p(e0Var, 0));
        return Unit.f186387a;
    }
}
