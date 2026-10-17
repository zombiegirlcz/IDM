package bg5;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.crypto.config.api.models.CryptoPersonalExchangeFeesResources;
import com.revolut.feature.crypto.exchange.fees.impl.ui.details.CryptoExchangeFeesDetailsController;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoExchangeFeesDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CryptoExchangeFeesDetailsController cryptoExchangeFeesDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoExchangeFeesDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pd5.d dVar;
        CryptoPersonalExchangeFeesResources cryptoPersonalExchangeFeesResources;
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.L.getValue();
        Intrinsics.h(model);
        h hVar = (h) cVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51822a, "MIN_FEES_APPLY_LOWER_VALUE_TRADES_LIST_ID") && (dVar = ((d) ((j2) hVar.f15136s.f22677a).getValue()).e) != null && (cryptoPersonalExchangeFeesResources = dVar.k) != null) {
            hVar.C1(u0.c(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(cryptoPersonalExchangeFeesResources.f70779a, 14), (SharedFaqDestination.PassthroughData) null, false, 14), false, (Integer) null, 0, 61)));
        }
        return Unit.f186387a;
    }
}
