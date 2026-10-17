package cul;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvestOrderEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InvestOrderEditScreen investOrderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.v = investOrderEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (model.i == jvl.b.DISMISS_DIALOG) {
            j60.a.v(((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.v.d()).f106932w, false, null, 3);
        }
        return Unit.f186387a;
    }
}
