package i2l;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.details.TransferAccountDetailsScreen;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.details.TransferAccountDetailsScreenContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewContract$ModalStep;
import com.revolut.feature.store.impl.ui.brand_filters.StoreBrandsFiltersScreen;
import com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$ModalStep;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature_market_data_impl.data.model.OrderQuoteLimitsParams;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.commodity.asset_details.impl.R$string;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.holdings_average_price.CommodityHoldingsAvgPriceController;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.CommodityPositionDetailsControllerContract$ModalStep;
import grl.k9;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class n0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158034a;

    public /* synthetic */ n0(int i) {
        this.f158034a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f158034a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new z((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)), r.f158041a, null);
            case 1:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return yp0.b.g((List) getDefaultErrorItems2.invoke(new iii.d(10, null, true, false, "travel_status_partner_transactions_error")), t0.a(), null, 0, 0, 126);
            case 2:
                Throwable th10 = (Throwable) obj2;
                Function1 defaultProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultProvider, "defaultProvider");
                if (th10 != null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                }
                return i35.h.a((List) defaultProvider.invoke(new iii.d(14, null, false, false, null)));
            case 3:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                StoreHomeFlowContract$ModalStep step = (StoreHomeFlowContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof StoreHomeFlowContract$ModalStep.BrandFilters) {
                    return new StoreBrandsFiltersScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 5:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 6:
                Function1 defaultError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultError, "defaultError");
                return (List) defaultError.invoke(new iii.d(12, null, false, true, null));
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((OrderQuoteLimitsParams) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((k59.c) obj3, "<unused var>");
                return Unit.f186387a;
            case 9:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TransferReviewContract$ModalStep step2 = (TransferReviewContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof TransferReviewContract$ModalStep.AccountDetails) {
                    return new TransferAccountDetailsScreen(new TransferAccountDetailsScreenContract$InputData(((TransferReviewContract$ModalStep.AccountDetails) step2).f62470a));
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                Throwable th11 = (Throwable) obj2;
                if (((WealthAccount.Margin) obj3) != null) {
                    return th11;
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 12:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null));
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 14:
                Throwable th12 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                throw new IllegalStateException("Wallet profile is null for post activation provider", th12);
            case 15:
                Throwable error = (Throwable) obj2;
                psg.a aVar = (psg.a) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar == null) {
                    return error;
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new g6a.l(e6a.b.a((Throwable) obj2), null, null, null, false, false, 14);
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return e6a.b.a((Throwable) obj2);
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 19:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return tj0.a.a((Throwable) obj2) ? (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null)) : q4g.b.a(6, null, true);
            case 20:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CommodityPositionDetailsControllerContract$ModalStep step3 = (CommodityPositionDetailsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof CommodityPositionDetailsControllerContract$ModalStep.UnrealisedReturnStep)) {
                    if (step3 instanceof CommodityPositionDetailsControllerContract$ModalStep.HoldingsAveragePrice) {
                        return new CommodityHoldingsAvgPriceController();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.asset_details_investment_unrealised_return_dialog_title, null, null, 14), new TextLocalisedClause(R$string.asset_details_investment_unrealised_return_dialog_description, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.asset_details_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Commodities;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return i6j.j.f159026a;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 28:
                Throwable error2 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool == null) {
                    return error2;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                Intrinsics.checkNotNullParameter("TICKET_RULES_ERROR_STATE", "listId");
                return q4g.b.a(4, "TICKET_RULES_ERROR_STATE", true);
        }
    }

    public /* synthetic */ n0(Object obj2, int i) {
        this.f158034a = i;
    }
}
