package jc6;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.RecurringDonationAmountScreen;
import com.revolut.feature_market_data_api.navigation.ExchangeBreakdownFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RecurringDonationAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(RecurringDonationAmountScreen recurringDonationAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = recurringDonationAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarH3 = this.v.T2();
        Intrinsics.h(model);
        s sVar = (s) lVarH3;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Pair pair = (Pair) t1.t(((j) sVar.t2()).f172714b, ((j) sVar.t2()).f172715c).getContent();
        if (pair != null) {
            ba6.l lVar = (ba6.l) pair.f186385a;
            xi0.b bVar = (xi0.b) pair.f186386b;
            OrderQuote orderQuote = (OrderQuote) ((j) sVar.t2()).f.getContent();
            if (orderQuote != null) {
                sVar.C1(new BridgeDestination(new FeatureCommand(new ExchangeBreakdownFeatureConfig(v13.d.m(((j) sVar.t2()).d.f218471a.f115082a, bVar, lVar.i.f115083b), orderQuote, c4i.a.DONATIONS, null, false, 2040))));
            }
        }
        return Unit.f186387a;
    }
}
