package ezk;

import aw0.n6;
import cli.y;
import com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.SelectFreeStocksScreen;
import etj.l;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SelectFreeStocksScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(SelectFreeStocksScreen selectFreeStocksScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = selectFreeStocksScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SelectFreeStocksScreen selectFreeStocksScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b bVar = (com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) selectFreeStocksScreen.R2();
                y yVar = bVar.v;
                yzg.d dVar = (yzg.d) ((a) ((j2) yVar.f22677a).getValue()).f130974a.getContent();
                Continuation continuation = null;
                dj0.d dVar2 = dVar != null ? dVar.f318107c : null;
                yzg.d dVar3 = (yzg.d) ((a) ((j2) yVar.f22677a).getValue()).f130974a.getContent();
                bVar.l2(new l(bVar, dVar2, dVar3 != null ? dVar3.f : null, continuation, 7), new yi5.b(26));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) selectFreeStocksScreen.R2()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
