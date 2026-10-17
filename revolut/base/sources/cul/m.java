package cul;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvestOrderEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InvestOrderEditScreen investOrderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.v = investOrderEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52613a;
        boolean zF = Intrinsics.f(str, "LIST_ID_EXTENDED_HOURS_INFO_DIALOG_BUTTON_GOT_IT");
        int i = 3;
        int i2 = 0;
        InvestOrderEditScreen investOrderEditScreen = this.v;
        if (zF) {
            j60.a.v(((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) investOrderEditScreen.d()).f106932w, false, null, 3);
        } else {
            int i3 = 1;
            if (Intrinsics.f(str, "BUTTON_ID_FUND")) {
                a0 a0VarD = investOrderEditScreen.d();
                Object obj3 = model.i;
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) a0VarD;
                j60.a.v(eVar.f106932w, false, new cf6.a(eVar, obj3 instanceof Amount ? (Amount) obj3 : null, 27), 1);
            } else if (Intrinsics.f(str, "BUTTON_ID_SWITCH_ACCOUNT")) {
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar2 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) investOrderEditScreen.d();
                j60.a.v(eVar2.f106932w, false, new j0(eVar2, i2), 1);
            } else if (Intrinsics.f(str, "BUTTON_ID_SELL_ALL")) {
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar3 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) investOrderEditScreen.d();
                j60.a.v(eVar3.f106932w, false, new j0(eVar3, 2), 1);
            } else if (Intrinsics.f(str, "BUTTON_ID_PROCEED_WITHOUT_SELLING_ALL")) {
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar4 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) investOrderEditScreen.d();
                j60.a.v(eVar4.f106932w, false, new j0(eVar4, i3), 1);
            } else {
                rvl.c.Companion.getClass();
                if (Intrinsics.f(str, "ACTION_WAIT_ID")) {
                    com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar5 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) investOrderEditScreen.d();
                    skm.a2 a2Var = eVar5.f106929s0;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    j60.a.v(eVar5.f106932w, false, new j0(eVar5, i), 1);
                } else if (Intrinsics.f(str, "ACTION_CONTINUE_LIST_ID")) {
                    com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar6 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) investOrderEditScreen.d();
                    skm.a2 a2Var2 = eVar6.f106929s0;
                    if (a2Var2 != null) {
                        a2Var2.f(null);
                    }
                    j60.a.v(eVar6.f106932w, false, null, 3);
                    eVar6.H2(eVar6.m0, new p0(4));
                }
            }
        }
        return Unit.f186387a;
    }
}
