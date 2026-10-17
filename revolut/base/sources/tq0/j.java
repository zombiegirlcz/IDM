package tq0;

import aw0.o9;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.insurance_credit.impl.ui.screen.bottom_sheet.BottomSheetScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.bottom_sheet.BottomSheetScreenContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.InsuranceDetailsScreenContract$ModalStep;
import com.revolut.feature.insurance_home.impl.ui.screen.home.InsuranceHomeScreenContract$ModalStep;
import com.revolut.feature.insurance_home.impl.ui.screen.product_summary.InsuranceProductSummaryScreen;
import com.revolut.feature.insurance_home.impl.ui.screen.product_summary.InsuranceProductSummaryScreenContract$InputData;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qrb.n;
import tt4.o;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273467a;

    public /* synthetic */ j(int i) {
        this.f273467a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        Object content;
        switch (this.f273467a) {
            case 0:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof k);
            case 1:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return new tqc.d(null, iii.c.b(null, null, 6, false));
            case 2:
                Throwable error = (Throwable) obj2;
                Boolean bool = (Boolean) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bool == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                od0.i iVar = (od0.i) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (iVar == null) {
                    return error3;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((trb.b) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((n) data, "<unused var>");
                return Unit.f186387a;
            case 6:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new tre.g((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)));
            case 7:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 8:
                Throwable error4 = (Throwable) obj2;
                FreelancerAccountOnboardingState freelancerAccountOnboardingState = (FreelancerAccountOnboardingState) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (freelancerAccountOnboardingState == null) {
                    return error4;
                }
                return null;
            case 9:
                Throwable error5 = (Throwable) obj2;
                od0.i iVar2 = (od0.i) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (iVar2 == null) {
                    return error5;
                }
                return null;
            case 10:
                Throwable error6 = (Throwable) obj2;
                od0.i iVar3 = (od0.i) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if ((iVar3 != null ? (io3.d) iVar3.f224257a : null) == null) {
                    return error6;
                }
                return null;
            case 11:
                Throwable th10 = (Throwable) obj2;
                if (((List) data) == null) {
                    return th10;
                }
                return null;
            case 12:
                Data old2 = (Data) obj2;
                Data data2 = (Data) data;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(data2, "new");
                boolean z = true;
                if (!Intrinsics.f(data2, old2) && ((content = data2.getContent()) == null || !content.equals(old2.getContent()))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(10, null, true, false, "TICKETS_LIST_ERROR_ID"));
            case 14:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 15:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new o(new NavBarLargeCentred.Model(null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 991), (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null)));
            case 16:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InsuranceDetailsScreenContract$ModalStep step = (InsuranceDetailsScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof InsuranceDetailsScreenContract$ModalStep.PolicyInfo) {
                    return new BottomSheetScreen(new BottomSheetScreenContract$InputData(((InsuranceDetailsScreenContract$ModalStep.PolicyInfo) step).f75833a));
                }
                throw new NoWhenBranchMatchedException();
            case 17:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 18:
                Throwable error7 = (Throwable) obj2;
                Map map = (Map) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (map == null) {
                    return error7;
                }
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 20:
                Function1 getDefaultErrorItems5 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null));
            case 21:
                vl4.g old3 = (vl4.g) obj2;
                vl4.g gVar = (vl4.g) data;
                Intrinsics.checkNotNullParameter(old3, "old");
                Intrinsics.checkNotNullParameter(gVar, "new");
                return Boolean.valueOf(Intrinsics.f(old3.f290249b, gVar.f290249b) && Intrinsics.f(old3.f290250c, gVar.f290250c) && Intrinsics.f(old3.d, gVar.d));
            case 22:
                Function1 errorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return new tv4.m(new tv4.l(null, new TextLocalisedClause(R$string.credit_card_transactions_title, null, null, 14)), (List) errorItems.invoke(new iii.d(14, null, true, false, null)));
            case 23:
                Function1 getDefaultErrorItems6 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return new tv7.i(null, (List) getDefaultErrorItems6.invoke(new iii.d(14, null, true, false, null)), false);
            case 24:
                Function1 getDefaultErrorItems7 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return new tvc.f(new lw0.h(lw0.i.ICON), (List) getDefaultErrorItems7.invoke(new iii.d(12, null, false, true, null)), false, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            case 25:
                Function1 defaultFactory = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(14, null, false, false, null));
            case 26:
                Throwable error8 = (Throwable) obj2;
                em4.f fVar = (em4.f) data;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (fVar == null) {
                    return error8;
                }
                return null;
            case 27:
                Throwable error9 = (Throwable) obj2;
                Boolean bool2 = (Boolean) data;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (bool2 == null) {
                    return error9;
                }
                return null;
            case 28:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InsuranceHomeScreenContract$ModalStep step2 = (InsuranceHomeScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof InsuranceHomeScreenContract$ModalStep.Summary) {
                    return new InsuranceProductSummaryScreen(new InsuranceProductSummaryScreenContract$InputData(((InsuranceHomeScreenContract$ModalStep.Summary) step2).f76217a));
                }
                throw new NoWhenBranchMatchedException();
            default:
                Function1 getDefaultErrorItems8 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return new tw7.j(false, null, null, AnimatedBackgroundType.DEFAULT.f51471a, f0.f322471a, (List) getDefaultErrorItems8.invoke(new iii.d(14, null, true, false, null)));
        }
    }

    public /* synthetic */ j(cli.n nVar, int i) {
        this.f273467a = i;
    }
}
