package x2i;

import com.google.android.gms.wallet.WalletConstants;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import com.revolut.feature_market_data_api.navigation.HistoricFeeBreakdownFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.youTransactor.uCube.rpc.Constants;
import ip0.z;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u2i.y;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f302579b;

    public /* synthetic */ e(r rVar, int i) {
        this.f302578a = i;
        this.f302579b = rVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ExchangeOrderInfo f72134a;
        switch (this.f302578a) {
            case 0:
                u2i.q qVar = this.f302579b.f302593m;
                Object obj3 = ((CellDetailsActionDelegate.Model) obj2).f51787l;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature_exchange.api.dialogs.CryptoOrderPriceDialogFactory.CryptoPriceDialogData");
                n0i.a cryptoPriceDialogData = (n0i.a) obj3;
                y yVar = (y) qVar;
                yVar.getClass();
                Intrinsics.checkNotNullParameter(cryptoPriceDialogData, "cryptoPriceDialogData");
                pfm.n nVar = new pfm.n(new to7.f(yVar, cryptoPriceDialogData, 5), 1);
                Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                return nVar;
            case 1:
                return ((opi.b) ((y) this.f302579b.f302593m).f).O();
            case 2:
                ty0.a clickData = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                return Intrinsics.f(clickData.f275445a, "CRYPTO_PRICE_EXPLANATION_TEXT_ID") ? ((y) this.f302579b.f302593m).c(u2i.m.CRYPTO) : pfm.m.f235744a;
            case 3:
                List mainItems = (List) obj2;
                Intrinsics.checkNotNullParameter(mainItems, "mainItems");
                return d0.E0(mainItems, u.c(new z("ACTIONS_ID", u.c((ActionsView.Item) this.f302579b.f302595p.getValue()), false, 0, 0, Constants.TAG_F4)));
            case 4:
                ip0.y clickData2 = (ip0.y) obj2;
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                if (Intrinsics.f(clickData2.f167226b.f58316a, "CANCEL_ACTION")) {
                    pfm.h hVar = new pfm.h(new ty7.b(this.f302579b, 22), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    return hVar;
                }
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 5:
                return this.f302579b.f302592l.N(k1i.g.FUTURE);
            case 6:
                CellDetailsChevronDelegate.Model it8 = (CellDetailsChevronDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                s2i.j jVar = (s2i.j) this.f302579b.f302591j;
                BridgeDestination bridgeDestinationC = jVar.f259365c.c();
                return jVar.f259364b.a(bridgeDestinationC instanceof KompotDestination ? new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) bridgeDestinationC, false, (Integer) null, 0, 61)) : bridgeDestinationC.f98270a);
            case 7:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                r rVar = this.f302579b;
                ExchangeOrder exchangeOrderA = ((s2i.h) rVar.i).a();
                if (exchangeOrderA == null || (f72134a = exchangeOrderA.getF72134a()) == null) {
                    pfm.m mVar2 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                    return mVar2;
                }
                s2i.b bVar = rVar.f302591j;
                xi0.b currency = f72134a.e;
                s2i.j jVar2 = (s2i.j) bVar;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(currency, "currency");
                pfm.a aVar = new pfm.a(new ufm.c(new s2i.i(currency, 0), 2), new s08.g(25, new ryd.i(jVar2, 16)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 8:
                CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) obj2;
                ExchangeOrder exchangeOrderA2 = ((s2i.h) this.f302579b.i).a();
                if (exchangeOrderA2 != null) {
                    boolean z = hx7.q.L(exchangeOrderA2.getF72134a()) && hx7.q.O(exchangeOrderA2.getF72134a());
                    String str = exchangeOrderA2.getF72134a().f72138b;
                    if (str != null) {
                        return new yhm.r(str, model, Boolean.valueOf(z));
                    }
                }
                return null;
            case 9:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                String breakdownId = (String) rVar2.f314201a;
                CellDetailsActionDelegate.Model model2 = (CellDetailsActionDelegate.Model) rVar2.f314202b;
                boolean zBooleanValue = ((Boolean) rVar2.f314203c).booleanValue();
                s2i.b bVar2 = this.f302579b.f302591j;
                Object obj4 = model2.f51787l;
                ChargeBreakdown chargeBreakdown = obj4 instanceof ChargeBreakdown ? (ChargeBreakdown) obj4 : null;
                s2i.j jVar3 = (s2i.j) bVar2;
                jVar3.getClass();
                Intrinsics.checkNotNullParameter(breakdownId, "breakdownId");
                return jVar3.f259364b.a(new FeatureCommand(new HistoricFeeBreakdownFeatureConfig(chargeBreakdown, breakdownId, (z3i.b) null, (xi0.b) null, false, zBooleanValue, c4i.a.EXCHANGE, (AnalyticsProduct.Retail) null, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION)));
            case 10:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                r rVar3 = this.f302579b;
                return zBooleanValue2 ? ((opi.b) rVar3.f302594n).O() : ((s2i.h) rVar3.i).f259360j.a(null);
            default:
                Data result = (Data) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return zi0.c.E(result) ? ((s2i.j) this.f302579b.f302591j).finish() : pfm.m.f235744a;
        }
    }
}
