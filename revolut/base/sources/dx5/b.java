package dx5;

import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.confirmation.CryptoCommodityBuyCollectionConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoCommodityBuyCollectionConfirmationScreen f120870w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CryptoCommodityBuyCollectionConfirmationScreen cryptoCommodityBuyCollectionConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f120870w = cryptoCommodityBuyCollectionConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f120870w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f120870w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoCommodityBuyCollectionConfirmationScreen cryptoCommodityBuyCollectionConfirmationScreen = this.f120870w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVar = (g) cryptoCommodityBuyCollectionConfirmationScreen.Y.getValue();
                Intrinsics.h(clickData);
                n nVar = (n) gVar;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) nVar.u).d(clickData);
                if (cryptoFcaRisksDestinationD != null) {
                    nVar.C1(cryptoFcaRisksDestinationD);
                }
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVar2 = (g) cryptoCommodityBuyCollectionConfirmationScreen.Y.getValue();
                Intrinsics.h(clickData2);
                n nVar2 = (n) gVar2;
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                nVar2.n2(new dlk.k(nVar2, clickData2, null, 27), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
