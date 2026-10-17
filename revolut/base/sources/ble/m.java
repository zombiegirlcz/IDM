package ble;

import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabInvestController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TabInvestController tabInvestController, Continuation continuation) {
        super(2, continuation);
        this.v = tabInvestController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((com.revolut.core.ui_kit.views.navbar.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.core.ui_kit.views.navbar.c cVar = (com.revolut.core.ui_kit.views.navbar.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarR2 = this.v.R2();
        AccountSelectionNavBarContentView.b scrollingState = cVar.f59521b;
        com.revolut.feature.tab.invest.impl.ui.home.f fVar = (com.revolut.feature.tab.invest.impl.ui.home.f) qVarR2;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(scrollingState, "scrollingState");
        fVar.H2(fVar.f89873e0, new bke.c(scrollingState, 1));
        return Unit.f186387a;
    }
}
