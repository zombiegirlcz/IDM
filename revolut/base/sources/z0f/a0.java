package z0f;

import androidx.compose.runtime.ComposableSingletons$CompositionKt;
import androidx.compose.runtime.Composer;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.accessibility_settings.impl.ui.flow.accessibility_settings.AccessibilitySettingsFlowContract$Step;
import com.revolut.feature.accessibility_settings.impl.ui.screen.accessibility_settings.AccessibilitySettingsController;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.TravelExperiencesPriceBreakdownScreenContract$ModalStep;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.discount.TravelExperiencesPointsDiscountInfoScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.discount.TravelExperiencesPointsDiscountInfoScreenContract$InputData;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import z55.s;
import z66.t;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318243a;

    public /* synthetic */ a0(int i) {
        this.f318243a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f318243a) {
            case 0:
                Throwable error = (Throwable) obj2;
                TopupMethod topupMethod = (TopupMethod) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (topupMethod == null) {
                    return error;
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("NEWS_ERROR_LIST_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(model);
            case 3:
                return ComposableSingletons$CompositionKt.lambda_954879418$lambda$0((Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return ComposableSingletons$CompositionKt.lambda_1918065384$lambda$0((Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 6:
                Throwable error2 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (iVar == null) {
                    return error2;
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 8:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return z27.o.f318991a;
            case 10:
                Throwable error3 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new z2a.j(iii.c.b(null, null, 6, false), null);
            case 12:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelExperiencesPriceBreakdownScreenContract$ModalStep step = (TravelExperiencesPriceBreakdownScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TravelExperiencesPriceBreakdownScreenContract$ModalStep.Discount) {
                    return new TravelExperiencesPointsDiscountInfoScreen(new TravelExperiencesPointsDiscountInfoScreenContract$InputData(((TravelExperiencesPriceBreakdownScreenContract$ModalStep.Discount) step).f93109a));
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return s.b.f319511a;
            case 15:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 16:
                Throwable error4 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model2 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (model2 == null) {
                    return error4;
                }
                return null;
            case 17:
                Throwable error5 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model3 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (model3 == null) {
                    return error5;
                }
                return null;
            case 18:
                Throwable error6 = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (nVar == null) {
                    return error6;
                }
                return null;
            case 19:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                t.a aVar = z66.t.Companion;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 20:
                Throwable error7 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error7, "error");
                return error7;
            case 21:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new z6k.h((List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null)), z6k.d.f319787a);
            case 22:
                Throwable error8 = (Throwable) obj2;
                h93.f0 f0Var = (h93.f0) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (f0Var == null) {
                    return error8;
                }
                return null;
            case 23:
                Throwable error9 = (Throwable) obj2;
                Integer num = (Integer) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (num == null) {
                    return error9;
                }
                return null;
            case 24:
                Throwable th10 = (Throwable) obj2;
                if (((dj0.d) obj3) == null) {
                    return th10;
                }
                return null;
            case 25:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new z75.u((List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)), z75.r.f319929a, false);
            case 26:
                yki.l FlowCoordinator = (yki.l) obj2;
                AccessibilitySettingsFlowContract$Step it8 = (AccessibilitySettingsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (((AccessibilitySettingsFlowContract$Step) FlowCoordinator.d()) instanceof AccessibilitySettingsFlowContract$Step.Settings) {
                    return new AccessibilitySettingsController();
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                Throwable error10 = (Throwable) obj2;
                LoanDetails loanDetails = (LoanDetails) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (loanDetails == null) {
                    return error10;
                }
                return null;
            case 28:
                Throwable error11 = (Throwable) obj2;
                LoanDetails loanDetails2 = (LoanDetails) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (loanDetails2 == null) {
                    return error11;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, true);
        }
    }

    public /* synthetic */ a0(Object obj2, int i) {
        this.f318243a = i;
    }
}
