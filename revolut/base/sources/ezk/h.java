package ezk;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.SelectFreeStocksScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends i implements Function2 {
    public final /* synthetic */ SelectFreeStocksScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SelectFreeStocksScreen selectFreeStocksScreen, Continuation continuation) {
        super(2, continuation);
        this.u = selectFreeStocksScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        vii.c cVar = ((com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) this.u.R2()).u;
        Unit unit = Unit.f186387a;
        cVar.b(unit);
        return unit;
    }
}
