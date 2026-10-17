package g1i;

import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.feature_exchange.api.navigation.TakeProfitStopLossFeatureConfig;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f139628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExchangeOrderDraft f139629c;

    public /* synthetic */ g0(ExchangeOrderDraft exchangeOrderDraft, l0 l0Var) {
        this.f139627a = 2;
        this.f139629c = exchangeOrderDraft;
        this.f139628b = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f139627a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                v1i.a aVar = (v1i.a) pair.f186386b;
                n9l.a aVar2 = (n9l.a) zhm.d0.o0(list);
                if (aVar2 == null) {
                    return pfm.m.f235744a;
                }
                wd6.h hVar = aVar.f285318a;
                return this.f139628b.d.a(new FeatureCommand(new TakeProfitStopLossFeatureConfig.TakeProfitStopLoss(l0.f(aVar2, hVar, this.f139629c, aVar.f285319b, null), Integer.valueOf(hVar == wd6.h.LIMIT ? 327 : 326))));
            case 1:
                List midRate = (List) obj2;
                Intrinsics.checkNotNullParameter(midRate, "midRate");
                n9l.a aVar3 = (n9l.a) zhm.d0.o0(midRate);
                if (aVar3 == null) {
                    return pfm.m.f235744a;
                }
                xi0.b bVar = aVar3.f213662b;
                xi0.b bVar2 = aVar3.f213661a;
                r0i.c cVar = r0i.c.TP_SL;
                float f = (float) aVar3.f213663c;
                wd6.e eVar = wd6.e.SELL;
                ExchangeOrderDraft exchangeOrderDraft = this.f139629c;
                return this.f139628b.d.a(new FeatureCommand(new TakeProfitStopLossFeatureConfig.TakeProfitStopLoss(new TakeProfitStopLossParams(bVar, bVar2, cVar, f, eVar, yh5.b.T(exchangeOrderDraft.f96879a), yh5.b.T(exchangeOrderDraft.f96880b), exchangeOrderDraft.f, null), 325)));
            default:
                List bidRate = (List) obj2;
                Intrinsics.checkNotNullParameter(bidRate, "bidRate");
                n9l.a aVar4 = (n9l.a) zhm.d0.o0(bidRate);
                if (aVar4 == null) {
                    return pfm.m.f235744a;
                }
                ExchangeOrderDraft exchangeOrderDraft2 = this.f139629c;
                wd6.h hVar2 = exchangeOrderDraft2.e;
                wd6.e eVar2 = exchangeOrderDraft2.f96881c;
                Float fValueOf = Float.valueOf((float) exchangeOrderDraft2.f96885l);
                l0 l0Var = this.f139628b;
                l0Var.getClass();
                return l0Var.d.a(new FeatureCommand(new TakeProfitStopLossFeatureConfig.TakeProfitStopLoss(l0.f(aVar4, hVar2, exchangeOrderDraft2, eVar2, fValueOf), Integer.valueOf(hVar2 == wd6.h.LIMIT ? 327 : 326))));
        }
    }

    public /* synthetic */ g0(l0 l0Var, ExchangeOrderDraft exchangeOrderDraft, int i) {
        this.f139627a = i;
        this.f139628b = l0Var;
        this.f139629c = exchangeOrderDraft;
    }
}
