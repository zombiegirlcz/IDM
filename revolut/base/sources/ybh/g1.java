package ybh;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.WealthAddMoneyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class g1 extends gim.i implements Function2 {
    public final /* synthetic */ WealthAddMoneyScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(WealthAddMoneyScreen wealthAddMoneyScreen, Continuation continuation) {
        super(2, continuation);
        this.u = wealthAddMoneyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g1(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g1) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) this.u.R2()).accept(b.f312292a);
        return Unit.f186387a;
    }
}
