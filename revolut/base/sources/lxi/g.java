package lxi;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.FreelancerMerchantTermsScreenContract$ModalStep;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import grl.k9;
import ip0.zj;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m1c.g1;
import m2f.r;
import m3g.c0;
import x2h.b;
import zhm.f0;
import zhm.u;
import zhm.v;
import zw7.d0;
import zw7.s0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200586a;

    public /* synthetic */ g(int i) {
        this.f200586a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f200586a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                List listK = v.k(new ImageClause(R$drawable.uikit_icn_24_retry, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14));
                m70.a.t(t0.f186434a);
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_ERROR_ITEM", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_common_state_error_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, null, null, false, 0, 0, 31680);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return u.c(model);
            case 2:
                return Boolean.valueOf(((Boolean) obj2).booleanValue() && !((Boolean) obj3).booleanValue());
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new ly5.g(iii.c.b(null, null, 6, true));
            case 5:
                Throwable error = (Throwable) obj2;
                d0 d0Var = (d0) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (d0Var == null) {
                    return error;
                }
                return null;
            case 6:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 7:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FreelancerMerchantTermsScreenContract$ModalStep step = (FreelancerMerchantTermsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, FreelancerMerchantTermsScreenContract$ModalStep.SettlementTimeInfo.f74049a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_terms_sections_settlement_time_sheet_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_terms_sections_settlement_time_sheet_subtitle, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Freelancer;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 8:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new m07.h((List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null)));
            case 9:
                Throwable error2 = (Throwable) obj2;
                s0 s0Var = (s0) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (s0Var == null) {
                    return error2;
                }
                return null;
            case 10:
                Throwable error3 = (Throwable) obj2;
                TradingAccount tradingAccount = (TradingAccount) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (tradingAccount == null) {
                    return error3;
                }
                return null;
            case 11:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, false, null));
            case 12:
                m1i.g inputSide = (m1i.g) obj2;
                ExchangeOrderDraft orderDraft = (ExchangeOrderDraft) obj3;
                Intrinsics.checkNotNullParameter(inputSide, "inputSide");
                Intrinsics.checkNotNullParameter(orderDraft, "orderDraft");
                return new Pair(inputSide, orderDraft);
            case 13:
                Throwable error4 = (Throwable) obj2;
                ec5.c cVar = (ec5.c) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (cVar == null) {
                    return error4;
                }
                return null;
            case 14:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new m22.b((List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null)));
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 16:
                Throwable error5 = (Throwable) obj2;
                g1 g1Var = (g1) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (g1Var == null) {
                    return error5;
                }
                return null;
            case 17:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new r((List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null)), null, new m2f.k(new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.trade_rev_points_transfer_action_button_title, null, null, 14), false, false));
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 21:
                Throwable error6 = (Throwable) obj2;
                psg.a aVar2 = (psg.a) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (aVar2 == null) {
                    return error6;
                }
                return null;
            case 22:
                Throwable error7 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (bool == null) {
                    return error7;
                }
                return null;
            case 23:
                Throwable error8 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list == null) {
                    return error8;
                }
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(c0.b());
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return b.C1676b.f302573a;
            case 28:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(14, null, true, false, null));
            default:
                return Boolean.valueOf(Intrinsics.f(((o30.c) obj2).f221672a, ((o30.c) obj3).f221672a));
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f200586a = i;
    }
}
