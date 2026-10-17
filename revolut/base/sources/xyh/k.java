package xyh;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog.OrderTypeDialogController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderTypeDialogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(OrderTypeDialogController orderTypeDialogController, Continuation continuation) {
        super(2, continuation);
        this.v = orderTypeDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVar = (e) this.v.P.getValue();
        boolean z = !model.f51915c;
        o oVar = (o) eVar;
        oVar.H2(oVar.f309735p, new n(z, 0));
        oVar.o.f110257a.k(Boolean.valueOf(z));
        return Unit.f186387a;
    }
}
