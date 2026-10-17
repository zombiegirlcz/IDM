package zbj;

import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o0 o0Var = new o0(this.v, continuation);
        o0Var.u = obj2;
        return o0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o0) create((CircleActionButtonsBarDelegate.CircleActionButton) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CircleActionButtonsBarDelegate.CircleActionButton circleActionButton = (CircleActionButtonsBarDelegate.CircleActionButton) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar = this.v;
        cVar.H2(cVar.F, new za9.c(circleActionButton, 7));
        return Unit.f186387a;
    }
}
