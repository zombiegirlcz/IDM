package t9f;

import cli.y;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.BuyInPriceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import t9f.k;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BuyInPriceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(BuyInPriceScreen buyInPriceScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = buyInPriceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BuyInPriceScreen buyInPriceScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) buyInPriceScreen.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) buyInPriceScreen.e3()).C2(k.a.f269022a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) buyInPriceScreen.e3();
                y yVar = oVar.f269031r;
                if (((i) ((j2) yVar.f22677a).getValue()).f269019b) {
                    oVar.C2(new j(((i) ((j2) yVar.f22677a).getValue()).f269018a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
