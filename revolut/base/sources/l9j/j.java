package l9j;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.visible_prequalification.VisiblePrequalificationFlowContract$Step;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.zj;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import lbc.o;
import lbc.u;
import ldk.x;
import ms0.h4;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193263a;

    public /* synthetic */ j(int i) {
        this.f193263a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f193263a) {
            case 0:
                Throwable error = (Throwable) obj2;
                StakingPocket stakingPocket = (StakingPocket) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (stakingPocket == null) {
                    return error;
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 2:
                Throwable error2 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (iVar == null) {
                    return error2;
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 6:
                Throwable error3 = (Throwable) obj2;
                f5j.a aVar = (f5j.a) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (aVar == null) {
                    return error3;
                }
                return null;
            case 7:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ORDER_DETAILS_ERROR_ID", new TextLocalisedClause(R$string.revolut_pay_order_details_error_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_order_details_error_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.revolut_pay_order_details_error_retry, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1856);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new u(o.f193643a, zhm.u.c(model));
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new lw0.h(lw0.i.AVATAR);
            case 10:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
                m70.a.c(t0.f186434a);
                return new ld4.m(ky4.a.a(com.revolut.feature.credit.core.R$string.credit_application_loan_selection_title, ""), list);
            case 11:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("ERROR_ITEM_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1860);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(model2);
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ldj.i.b();
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new x(ldk.h.f194167a, null, iii.c.b(null, null, 6, true));
            case 16:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null));
            case 17:
                Throwable th10 = (Throwable) obj2;
                if (((TradingAccount.TaxAdvantage) obj3) == null) {
                    return th10;
                }
                return null;
            case 18:
                Throwable error4 = (Throwable) obj2;
                lha.g gVar = (lha.g) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (gVar == null) {
                    return error4;
                }
                return null;
            case 19:
                Throwable error5 = (Throwable) obj2;
                nha.c cVar = (nha.c) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (cVar == null) {
                    return error5;
                }
                return null;
            case 20:
                Throwable error6 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (pricingPlanSubscription == null) {
                    return error6;
                }
                return null;
            case 21:
                Throwable error7 = (Throwable) obj2;
                hha.d dVar = (hha.d) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (dVar == null) {
                    return error7;
                }
                return null;
            case 22:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null));
            case 23:
                Throwable error8 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bool == null) {
                    return error8;
                }
                return null;
            case 24:
                Throwable error9 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (bool2 == null) {
                    return error9;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 26:
                yki.l FlowCoordinator = (yki.l) obj2;
                VisiblePrequalificationFlowContract$Step step = (VisiblePrequalificationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, VisiblePrequalificationFlowContract$Step.Loading.f68512a)) {
                    return com.revolut.feature.credit.application.plugins.impl.ui.loading.a.b();
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, true);
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
        }
    }

    public /* synthetic */ j(Object obj2, int i) {
        this.f193263a = i;
    }
}
