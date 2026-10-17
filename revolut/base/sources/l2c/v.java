package l2c;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.ViaVerdeHomeContract$Action;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlowContract$PagerItem;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin.TravelFlightsCheckInScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin_details.TravelFlightsCheckInDetailsScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin_details.TravelFlightsCheckInDetailsScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.self_transfer.TravelFlightsSelfTransferScreen;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import o97.a0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191763a;

    public /* synthetic */ v(int i) {
        this.f191763a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        switch (this.f191763a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 1:
                Throwable error = (Throwable) obj2;
                UUID uuid = (UUID) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (uuid == null) {
                    return error;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 3:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(10, null, true, false, "STORE_ORDERS_ERROR_ID"));
            case 4:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(10, null, true, false, "STORE_ORDERS_GIFT_CARDS_ERROR_ID"));
            case 5:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 7:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new l42.d((List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null)), null);
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 9:
                Throwable th10 = (Throwable) obj2;
                if (((od0.i) obj3) == null) {
                    return th10;
                }
                return null;
            case 10:
                Throwable th11 = (Throwable) obj2;
                if (((od0.i) obj3) == null) {
                    return th11;
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 13:
                Throwable th12 = (Throwable) obj2;
                if (((NavBarWithContainerBackground) obj3) == null) {
                    return th12;
                }
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 15:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelFlightsCheckInScreenContract$ModalStep step = (TravelFlightsCheckInScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TravelFlightsCheckInScreenContract$ModalStep.CheckInDetails) {
                    TravelFlightsCheckInScreenContract$ModalStep.CheckInDetails checkInDetails = (TravelFlightsCheckInScreenContract$ModalStep.CheckInDetails) step;
                    return new TravelFlightsCheckInDetailsScreen(new TravelFlightsCheckInDetailsScreenContract$InputData(checkInDetails.f93287a, checkInDetails.f93288b));
                }
                if (Intrinsics.f(step, TravelFlightsCheckInScreenContract$ModalStep.SelfTransfer.f93289a)) {
                    return new TravelFlightsSelfTransferScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                Intrinsics.checkNotNullParameter("CHECK_IN_ERROR_STATE", "listId");
                return q4g.b.a(4, "CHECK_IN_ERROR_STATE", true);
            case 17:
                Throwable error2 = (Throwable) obj2;
                Subaccount subaccount = (Subaccount) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (subaccount == null) {
                    return error2;
                }
                return null;
            case 18:
                Throwable error3 = (Throwable) obj2;
                Subaccount subaccount2 = (Subaccount) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (subaccount2 == null) {
                    return error3;
                }
                return null;
            case 19:
                Throwable th13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.u.c(new InvestorUpdateHistoryFlowContract$PagerItem.Error(th13 != null ? th13.getMessage() : null));
            case 20:
                Throwable error4 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (bool == null) {
                    return error4;
                }
                return null;
            case 21:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                int i = R$string.loan_management_repayment_v2_review_payment_v2_title;
                m70.a.c(t0.f186434a);
                return new l85.i(null, new TextLocalisedClause(i, zhm.u.c(""), null, 12), (List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)));
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 23:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new l8k.f((List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null)), false);
            case 24:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(6, ViaVerdeHomeContract$Action.Retry.f62655a, true, false, null));
            case 25:
                Throwable error5 = (Throwable) obj2;
                a0 a0Var = (a0) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (a0Var == null) {
                    return error5;
                }
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new Data(f0.f322471a, null, false, 2, null);
            case 27:
                Throwable th14 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                if (th14 != null) {
                    throw th14;
                }
                throw new NoSuchElementException("Cannot find wallet profile by user id");
            case 28:
                Throwable error6 = (Throwable) obj2;
                psg.a aVar = (psg.a) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (aVar == null) {
                    return error6;
                }
                return null;
            default:
                Throwable error7 = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (juniorBankingProfile == null) {
                    return error7;
                }
                return null;
        }
    }

    public /* synthetic */ v(kxk.o oVar) {
        this.f191763a = 21;
    }
}
