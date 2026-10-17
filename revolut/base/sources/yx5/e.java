package yx5;

import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.CryptoDiscoverAllScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CryptoDiscoverAllScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CryptoDiscoverAllScreen cryptoDiscoverAllScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cryptoDiscoverAllScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoDiscoverAllScreen cryptoDiscoverAllScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b) cryptoDiscoverAllScreen.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b bVar = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b) cryptoDiscoverAllScreen.e3();
                bVar.H2(bVar.u, new yv8.j(15));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b bVar2 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b) cryptoDiscoverAllScreen.e3();
                bVar2.H2(bVar2.u, new yv8.j(14));
                break;
        }
        return Unit.f186387a;
    }
}
