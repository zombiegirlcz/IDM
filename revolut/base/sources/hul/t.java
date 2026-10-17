package hul;

import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.review.o f155764b;

    public /* synthetic */ t(com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar, int i) {
        this.f155763a = i;
        this.f155764b = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f155763a) {
            case 0:
                return Boolean.valueOf(((jte.d) this.f155764b.V).c(TradingOrdersApi$Toggles.TradingSourcePocketPickerCryptoDisclaimersUk.f106798c));
            case 1:
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar = this.f155764b;
                return rd0.e.b(((ael.k) oVar.f106988s).f(oVar.i0));
            case 2:
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar2 = this.f155764b;
                return ((ael.k) oVar2.f106988s).o(oVar2.i0, w4l.h.f294642c);
            case 3:
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar3 = this.f155764b;
                return nim.a.y(nim.a.v(rd0.e.b(oVar3.Z.a(oVar3.i0, false)), new hu1.h0(12)), new hu1.h0(13));
            default:
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar4 = this.f155764b;
                oVar4.D.getClass();
                oVar4.C1(u0.b(gc0.c.f(new HelpCentreFeatureConfig.Topic("topic.stocks", "trading"))));
                return Unit.f186387a;
        }
    }
}
