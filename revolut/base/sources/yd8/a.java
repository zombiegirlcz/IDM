package yd8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.flow.PaymentOptionsFlowContract$Step;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.options.PaymentOptionsController;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.options.PaymentOptionsControllerContract$InputData;
import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsPurchase;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlow;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$InputData;
import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreenContract$ModalStep;
import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreen;
import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreenContract$InputData;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import yh4.o;
import yhm.r;
import yic.s;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312641a;

    public /* synthetic */ a(int i) {
        this.f312641a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f312641a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bool == null) {
                    return error;
                }
                return null;
            case 1:
                return Boolean.valueOf(((Boolean) obj2).booleanValue() && ((Boolean) obj3).booleanValue());
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 5:
                Throwable error2 = (Throwable) obj2;
                of8.b bVar = (of8.b) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bVar == null) {
                    return error2;
                }
                return null;
            case 6:
                Throwable th10 = (Throwable) obj2;
                if (((eda.b) obj3) == null) {
                    return th10;
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new cii.b(null, f0.f322471a, yeg.h.a());
            case 9:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, false, null));
            case 10:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
                m70.a.c(t0.f186434a);
                return new o(list, new TextLocalisedClause(R$string.credit_application_sepa_direct_debit_set_up_title, u.c(""), null, 12), null, null, null);
            case 11:
                Throwable error3 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (map == null) {
                    return error3;
                }
                return null;
            case 12:
                Throwable th11 = (Throwable) obj2;
                if (((Function0) obj3) == null) {
                    return th11;
                }
                return null;
            case 13:
                Throwable error4 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (iVar == null) {
                    return error4;
                }
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new s(yic.g.f314285a, iii.c.b(null, null, 6, true));
            case 15:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ShopsCarouselDetailsScreenContract$ModalStep step = (ShopsCarouselDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof ShopsCarouselDetailsScreenContract$ModalStep.PurchaseItemDialog) {
                    ShopsPurchase shopsPurchase = ((ShopsCarouselDetailsScreenContract$ModalStep.PurchaseItemDialog) step).f87151a;
                    return new ShopsItemsDetailsScreen(new ShopsItemsDetailsScreenContract$InputData(shopsPurchase.f87067c, shopsPurchase.d, shopsPurchase.e, shopsPurchase.f87068g, shopsPurchase.k, shopsPurchase.i, shopsPurchase.f87069h));
                }
                if (!(step instanceof ShopsCarouselDetailsScreenContract$ModalStep.BidAuction)) {
                    throw new NoWhenBranchMatchedException();
                }
                ShopsAuction.Offer offer = ((ShopsCarouselDetailsScreenContract$ModalStep.BidAuction) step).f87150a;
                return new ShopsBidFlow(new ShopsBidFlowContract$InputData(offer.f87015a, offer.d));
            case 16:
                Function1 defaultErrorState = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorState, "defaultErrorState");
                return (List) defaultErrorState.invoke(new iii.d(8, null, true, true, "SHOPS_CARROUSEL_DETAILS_LIST_ID_STATE_ERROR"));
            case 17:
                Function1 defaultItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItemsProvider, "defaultItemsProvider");
                return (List) defaultItemsProvider.invoke(new iii.d(14, null, false, false, null));
            case 18:
                yki.l FlowCoordinator = (yki.l) obj2;
                PaymentOptionsFlowContract$Step step2 = (PaymentOptionsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof PaymentOptionsFlowContract$Step.PaymentOptions) {
                    return new PaymentOptionsController(new PaymentOptionsControllerContract$InputData(((PaymentOptionsFlowContract$Step.PaymentOptions) step2).f78885a));
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 21:
                Throwable error5 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list2 == null) {
                    return error5;
                }
                return null;
            case 22:
                Throwable error6 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list3 == null) {
                    return error6;
                }
                return null;
            case 23:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                yjh.d dVar = new yjh.d(null, null, null);
                if (zBooleanValue) {
                    return null;
                }
                return dVar;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                Throwable error7 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list4 == null) {
                    return error7;
                }
                return null;
            case 26:
                Throwable error8 = (Throwable) obj2;
                r rVar = (r) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (rVar == null) {
                    return error8;
                }
                return null;
            case 27:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            default:
                Throwable error9 = (Throwable) obj2;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (tradingLegalEntityInformation == null) {
                    return error9;
                }
                return null;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f312641a = i;
    }
}
