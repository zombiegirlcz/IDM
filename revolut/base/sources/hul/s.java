package hul;

import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.feature.wealth.private_equity.common.order_info_dialog_builder.FundOrderInfoBottomSheetControllerProvider$Companion$InvestOrderReviewScreenIlliquidityWarningLearnMorePayload;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import com.revolut.trading.orders.ui.invest.placement.models.ProcessedInputAmount;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.review.o f155762b;

    public /* synthetic */ s(com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar, int i) {
        this.f155761a = i;
        this.f155762b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f155761a) {
            case 0:
                SourcePocketWrapper sourcePocketWrapper = (SourcePocketWrapper) obj2;
                Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar = this.f155762b;
                return nim.a.v(oVar.f106990w.b3(), new v(oVar, sourcePocketWrapper, 0));
            case 1:
                dii.g it8 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                boolean z = it8 instanceof dii.c;
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar2 = this.f155762b;
                if (z) {
                    if (Intrinsics.f(((dii.c) it8).f115066a.d, FundOrderInfoBottomSheetControllerProvider$Companion$InvestOrderReviewScreenIlliquidityWarningLearnMorePayload.f95734a)) {
                        oki.h.v2(oVar2.f106983h0, InvestOrderReviewScreenContract$ModalStep.IlliquidityWarningLearnMore.f106951a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                } else {
                    if (!Intrinsics.f(it8, dii.e.f115068a)) {
                        return Unit.f186387a;
                    }
                    oVar2.l2(new com.revolut.trading.orders.ui.invest.placement.screens.review.a(oVar2, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 2:
                pdf.c it9 = (pdf.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar3 = this.f155762b;
                oVar3.H2(oVar3.g0, new cul.o0(it9, 1));
                return Unit.f186387a;
            case 3:
                dii.g it10 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (it10 instanceof dii.c) {
                    String str = ((dii.c) it10).f115066a.f275445a;
                    com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar4 = this.f155762b;
                    oVar4.l2(new e0(oVar4, str, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 4:
                eii.k output = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if ((output instanceof eii.e) && Intrinsics.f(((eii.e) output).f126651a.f275445a, "large-order-learn-more")) {
                    com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar5 = this.f155762b;
                    oVar5.D.getClass();
                    oVar5.C1(u0.b(gc0.c.f(new HelpCentreFeatureConfig.Topic("question.why-am-i-seeing-large-orders-warning", "trading"))));
                }
                return Unit.f186387a;
            case 5:
                Map ipoSummaries = (Map) obj2;
                Intrinsics.checkNotNullParameter(ipoSummaries, "ipoSummaries");
                return Optional.ofNullable(ipoSummaries.get(this.f155762b.i0));
            default:
                ProcessedInputAmount processedInputAmount = (ProcessedInputAmount) obj2;
                Intrinsics.checkNotNullParameter(processedInputAmount, "processedInputAmount");
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar6 = this.f155762b;
                bul.u uVar = oVar6.R;
                OrderQuoteParams orderQuoteParams = ((h) ((j2) oVar6.g0.f22677a).getValue()).f155719a.e;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
                Intrinsics.checkNotNullParameter(processedInputAmount, "processedInputAmount");
                if (processedInputAmount instanceof ProcessedInputAmount.Original) {
                    return orderQuoteParams;
                }
                if (!(processedInputAmount instanceof ProcessedInputAmount.Converted)) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimal = ((ProcessedInputAmount.Converted) processedInputAmount).f106869b.f104717a;
                xi0.b from = orderQuoteParams.f104783a;
                xi0.b to6 = orderQuoteParams.f104784b;
                f8l.e orderType = orderQuoteParams.f104785c;
                f8l.b amountIn = orderQuoteParams.e;
                f8l.b baseRateAsset = orderQuoteParams.f;
                BigDecimal bigDecimal2 = orderQuoteParams.f104786g;
                boolean z3 = orderQuoteParams.f104787h;
                String str2 = orderQuoteParams.i;
                f8l.f fVar = orderQuoteParams.f104788j;
                String str3 = orderQuoteParams.k;
                String str4 = orderQuoteParams.f104789l;
                Boolean bool = orderQuoteParams.f104790m;
                String str5 = orderQuoteParams.f104791n;
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to6, "to");
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                Intrinsics.checkNotNullParameter(amountIn, "amountIn");
                Intrinsics.checkNotNullParameter(baseRateAsset, "baseRateAsset");
                return new OrderQuoteParams(from, to6, orderType, bigDecimal, amountIn, baseRateAsset, bigDecimal2, z3, str2, fVar, str3, str4, bool, str5);
        }
    }
}
