package cul;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvestOrderEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(InvestOrderEditScreen investOrderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.v = investOrderEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f51781a;
        int iHashCode = str.hashCode();
        Continuation continuation = null;
        InvestOrderEditScreen investOrderEditScreen = this.v;
        if (iHashCode != -2003201372) {
            if (iHashCode != -1085518302) {
                if (iHashCode == 604087901 && str.equals("SET_LIMITS_ITEM")) {
                    com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) investOrderEditScreen.d();
                    eVar.h3(((v) ((vkm.j2) eVar.m0.f22677a).getValue()).f109176b, true);
                }
            } else if (str.equals("SET_EXPIRY_ITEM")) {
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar2 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) investOrderEditScreen.d();
                eVar2.getClass();
                eVar2.n2(new j1(eVar2, continuation, 13), new whi.b(6));
            }
        } else if (str.equals("SET_SCHEDULE_SETTINGS_ITEM")) {
            com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar3 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) investOrderEditScreen.d();
            eVar3.getClass();
            eVar3.n2(new j1(eVar3, continuation, 14), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
