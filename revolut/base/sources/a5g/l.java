package a5g;

import a7b.q;
import a83.z0;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.TravelFlightsFareSelectionScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreenContract$InputData;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1391a;

    public /* synthetic */ l(int i) {
        this.f1391a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f1391a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                Intrinsics.checkNotNullParameter("BOOKING_DETAILS_ERROR_STATE", "listId");
                return q4g.b.a(4, "BOOKING_DETAILS_ERROR_STATE", true);
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 2:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 3:
                Throwable error = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (model == null) {
                    return error;
                }
                return null;
            case 4:
                Throwable error2 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model2 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (model2 == null) {
                    return error2;
                }
                return null;
            case 5:
                Throwable error3 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (map == null) {
                    return error3;
                }
                return null;
            case 6:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelFlightsFareSelectionScreenContract$ModalStep step = (TravelFlightsFareSelectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TravelFlightsFareSelectionScreenContract$ModalStep.PriceBreakdown) {
                    return new TravelFlightsPriceBreakdownScreen(new TravelFlightsPriceBreakdownScreenContract$InputData(((TravelFlightsFareSelectionScreenContract$ModalStep.PriceBreakdown) step).f93341a));
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((MultibancoWithdrawalCode) obj3, "<unused var>");
                return Unit.f186387a;
            case 8:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new q(null, (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), null);
            case 9:
                Throwable error4 = (Throwable) obj2;
                h6e.d dVar = (h6e.d) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (dVar == null) {
                    return error4;
                }
                return null;
            case 10:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return tj0.a.a((Throwable) obj2) ? (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null)) : q4g.b.a(6, null, true);
            case 11:
                Throwable error5 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list == null) {
                    return error5;
                }
                return null;
            case 12:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, "ERROR_ITEM_ID", 4, true);
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                RowDelegate.Model modelA = z0.a();
                yp0.b.l(modelA, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
                return u.c(modelA);
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 18:
                Throwable error6 = (Throwable) obj2;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (tradingLegalEntityInformation == null) {
                    return error6;
                }
                return null;
            case 19:
                Throwable error7 = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (juniorBankingProfile == null) {
                    return error7;
                }
                return null;
            case 20:
                Throwable error8 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list2 == null) {
                    return error8;
                }
                return null;
            case 21:
                Throwable error9 = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile2 = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (juniorBankingProfile2 == null) {
                    return error9;
                }
                return null;
            case 22:
                Throwable error10 = (Throwable) obj2;
                psg.a aVar = (psg.a) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (aVar == null) {
                    return error10;
                }
                return null;
            case 23:
                Throwable error11 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (list3 == null) {
                    return error11;
                }
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 26:
                Throwable th10 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th10;
                }
                return null;
            case 27:
                Throwable error12 = (Throwable) obj2;
                y49.f fVar = (y49.f) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (fVar == null) {
                    return error12;
                }
                return null;
            case 28:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new a92.b((List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null)));
            default:
                Throwable error13 = (Throwable) obj2;
                LoanDetails loanDetails = (LoanDetails) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (loanDetails == null) {
                    return error13;
                }
                return null;
        }
    }
}
