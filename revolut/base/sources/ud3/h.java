package ud3;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.feature.cashback.impl.ui.yourcashback.home.YourCashbackHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ YourCashbackHomeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(YourCashbackHomeScreen yourCashbackHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = yourCashbackHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CounterTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e0 e0Var = (e0) this.u.T2();
        j60.a aVar2 = e0Var.z;
        e0Var.A.getClass();
        aVar2.x(new rp0.y(zhm.f0.f322471a, new rp0.t(new TextLocalisedClause(R$string.cashback_product_plan_total_cashback_disclaimer_title, null, null, 14), new TextLocalisedClause(R$string.cashback_product_plan_total_cashback_disclaimer_description, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016));
        return Unit.f186387a;
    }
}
