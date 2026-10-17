package v25;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_info.TravelFlightsBaggageInfoScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_info.TravelFlightsBaggageInfoScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.TravelFlightsBaggageSelectionScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreenContract$InputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.dg;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q35.r;
import v2e.w;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285651a;

    public /* synthetic */ g(int i) {
        this.f285651a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f285651a) {
            case 0:
                Throwable th10 = (Throwable) obj2;
                if (((Loan) obj3) == null) {
                    return th10;
                }
                return null;
            case 1:
                Throwable th11 = (Throwable) obj2;
                if (((Loan) obj3) == null) {
                    return th11;
                }
                return null;
            case 2:
                Throwable th12 = (Throwable) obj2;
                if (((LoanDetails) obj3) == null) {
                    return th12;
                }
                return null;
            case 3:
                Throwable th13 = (Throwable) obj2;
                if (((FeatureCommand) obj3) == null) {
                    return th13;
                }
                return null;
            case 4:
                Throwable th14 = (Throwable) obj2;
                if (((LoanKompotFeatureConfig.UpcomingInstalmentDetailsDestination) obj3) == null) {
                    return th14;
                }
                return null;
            case 5:
                Throwable th15 = (Throwable) obj2;
                if (((r) obj3) == null) {
                    return th15;
                }
                return null;
            case 6:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 9:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return new w((List) defaultErrorItemsProvider.invoke(new iii.d(8, null, true, true, "STORE_BRAND_DETAIL_REDEEM_ERROR_STATE_ID")), 2, 0);
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 11:
                Function1 defaultErrorItemsProvider2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider2, "defaultErrorItemsProvider");
                return (List) defaultErrorItemsProvider2.invoke(new iii.d(10, null, true, false, "STORE_BRAND_DETAIL_REDEEM_EXCLUSIVES_ERROR_STATE_ID"));
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return v2g.k.a();
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                List listC = u.c(new dg("ID_ERROR_ITEM", new TextLocalisedClause(R.string.error_network_connection_description, null, null, 14), new TextLocalisedClause(R.string.common_action_retry, null, null, 14)));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 14:
                Throwable th16 = (Throwable) obj2;
                if (((v38.c) obj3) == null) {
                    return th16;
                }
                return null;
            case 15:
                Throwable th17 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th17;
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new v4a.g(f0.f322471a, v4a.o.b(false));
            case 17:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
                yp0.b.k(list, 0, 0, 0, 0, 31);
                return list;
            case 18:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelFlightsBaggageSelectionScreenContract$ModalStep step = (TravelFlightsBaggageSelectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TravelFlightsBaggageSelectionScreenContract$ModalStep.BaggageInfo) {
                    return new TravelFlightsBaggageInfoScreen(new TravelFlightsBaggageInfoScreenContract$InputData(TravelFlightsBaggageInfoScreenContract$InputData.Mode.StaticInfo.f93242a));
                }
                if (step instanceof TravelFlightsBaggageSelectionScreenContract$ModalStep.PriceBreakdown) {
                    return new TravelFlightsPriceBreakdownScreen(new TravelFlightsPriceBreakdownScreenContract$InputData(((TravelFlightsBaggageSelectionScreenContract$ModalStep.PriceBreakdown) step).f93247a));
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new v4g.l(new TextLocalisedClause(R$string.travel_flights_checkout_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.travel_flights_checkout_error_generic_action_try_again, null, null, 14));
            case 20:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                return e;
            case 21:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 24:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new v6i.l(null, (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null)), false);
            case 25:
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((Exception) obj3, "<unused var>");
                return Boolean.FALSE;
            case 26:
                Throwable error = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (nVar == null) {
                    return error;
                }
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f285651a = i;
    }
}
