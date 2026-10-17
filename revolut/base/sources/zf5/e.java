package zf5;

import com.revolut.feature.crypto.config.api.models.CryptoPersonalExchangeFeesResources;
import com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesController;
import com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$ModalStep;
import com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$Parcel$LearnMore;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yui.v;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoExchangeFeesController f321864w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CryptoExchangeFeesController cryptoExchangeFeesController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f321864w = cryptoExchangeFeesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f321864w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f321864w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f321864w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CryptoPersonalExchangeFeesResources cryptoPersonalExchangeFeesResources;
        int i = this.u;
        CryptoExchangeFeesController cryptoExchangeFeesController = this.f321864w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVarE3 = cryptoExchangeFeesController.d();
                Intrinsics.h(clickData);
                com.revolut.feature.crypto.exchange.fees.impl.ui.c cVar = (com.revolut.feature.crypto.exchange.fees.impl.ui.c) fVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (clickData.d instanceof CryptoExchangeFeesControllerContract$Parcel$LearnMore) {
                    pd5.d dVar = ((g) ((j2) cVar.v.f22677a).getValue()).f321868g;
                    oki.h.v2(cVar.f70847x, new CryptoExchangeFeesControllerContract$ModalStep.LearnMoreBottomSheet((dVar == null || (cryptoPersonalExchangeFeesResources = dVar.k) == null) ? null : cryptoPersonalExchangeFeesResources.f70780b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            case 1:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVarE32 = cryptoExchangeFeesController.d();
                Intrinsics.h(clickData2);
                com.revolut.feature.crypto.exchange.fees.impl.ui.c cVar2 = (com.revolut.feature.crypto.exchange.fees.impl.ui.c) fVarE32;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) cVar2.f70845t).d(clickData2);
                if (cryptoFcaRisksDestinationD != null) {
                    cVar2.C1(u0.b(u0.f(cryptoFcaRisksDestinationD)));
                }
                break;
            default:
                String tabId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVarE33 = cryptoExchangeFeesController.d();
                Intrinsics.h(tabId);
                com.revolut.feature.crypto.exchange.fees.impl.ui.c cVar3 = (com.revolut.feature.crypto.exchange.fees.impl.ui.c) fVarE33;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                cVar3.H2(cVar3.v, new v(tabId, 12));
                break;
        }
        return Unit.f186387a;
    }
}
