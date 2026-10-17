package ob2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.upi.impl.flow.area.flow.UpiFlowContract$Step;
import com.revolut.feature.apm.upi.impl.flow.area.screen.UpiAreaScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_subscribe.PlanSubscribeFlowContract$Step;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import i3g.k;
import ip0.zj;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import obg.m;
import oi4.j;
import tof.a3;
import whf.p;
import yki.l;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223858a;

    public /* synthetic */ a(int i) {
        this.f223858a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f223858a) {
            case 0:
                Throwable error = (Throwable) obj2;
                ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = (ApmPaymentAuthorisationSummary) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (apmPaymentAuthorisationSummary == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                ggk.d dVar = (ggk.d) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (dVar == null) {
                    return error2;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("SELECT_TRACKING_CARRIER_ERROR_ID", new TextLocalisedClause(R$string.revolut_pay_shipping_carrier_search_error_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.revolut_pay_shipping_carrier_search_error_retry, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1856);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return u.c(model);
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return m.f223948a;
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
                m70.a.c(t0.f186434a);
                return new oc4.h(k.g(""), list);
            case 5:
                Throwable error3 = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (juniorBankingProfile == null) {
                    return error3;
                }
                return null;
            case 6:
                Throwable error4 = (Throwable) obj2;
                psg.a aVar = (psg.a) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (aVar == null) {
                    return error4;
                }
                return null;
            case 7:
                Throwable error5 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list2 == null) {
                    return error5;
                }
                return null;
            case 8:
                Throwable error6 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bool == null) {
                    return error6;
                }
                return null;
            case 9:
                Throwable error7 = (Throwable) obj2;
                vd8.a aVar2 = (vd8.a) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (aVar2 == null) {
                    return error7;
                }
                return null;
            case 10:
                Throwable error8 = (Throwable) obj2;
                sf8.h hVar = (sf8.h) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (hVar == null) {
                    return error8;
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 12:
                Throwable error9 = (Throwable) obj2;
                String str = (String) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (str == null) {
                    return error9;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.merchants_block_confirm_subtitle, null, null, 14);
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.merchants_unblock_confirm_subtitle, null, null, 14);
            case 15:
                Throwable error10 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list3 == null) {
                    return error10;
                }
                return null;
            case 16:
                Throwable error11 = (Throwable) obj2;
                hdh.e eVar = (hdh.e) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (eVar == null) {
                    return error11;
                }
                return null;
            case 17:
                Throwable error12 = (Throwable) obj2;
                l93.d dVar2 = (l93.d) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (dVar2 == null) {
                    return error12;
                }
                return null;
            case 18:
                Throwable error13 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (bool2 == null) {
                    return error13;
                }
                return null;
            case 19:
                l FlowCoordinator = (l) obj2;
                UpiFlowContract$Step step = (UpiFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, UpiFlowContract$Step.Area.f62974a)) {
                    return new UpiAreaScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return new og2.i((List) defaultFactory.invoke(new iii.d(14, null, false, false, null)), false);
            case 21:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                PlanSubscribeFlowContract$Step step2 = (PlanSubscribeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                throw new IllegalStateException(("Unexpected step: " + step2).toString());
            case 22:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new j((List) defaultErrorItems.invoke(new iii.d(14, null, false, false, null)), false);
            case 23:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 24:
                Throwable th10 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th10;
                }
                return null;
            case 25:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 26:
                Throwable error14 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (list4 == null) {
                    return error14;
                }
                return null;
            case 27:
                Throwable error15 = (Throwable) obj2;
                p pVar = (p) obj3;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (pVar == null) {
                    return error15;
                }
                return null;
            case 28:
                a3 old2 = (a3) obj2;
                a3 a3Var = (a3) obj3;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(a3Var, "new");
                return Boolean.valueOf(Intrinsics.f(old2.f272624y.f273143a, a3Var.f272624y.f273143a) && Intrinsics.f(old2.f272581b, a3Var.f272581b));
            default:
                Throwable th11 = (Throwable) obj2;
                if (((UserInfoAccount) obj3) == null) {
                    return th11;
                }
                return null;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f223858a = i;
    }
}
