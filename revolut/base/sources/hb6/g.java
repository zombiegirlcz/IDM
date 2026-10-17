package hb6;

import aw0.i;
import aw0.o9;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.DonationBreakdownContract$ModalStep;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.checkin_instructions.TravelHotelsCheckInInstructionsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.checkin_instructions.TravelHotelsCheckInInstructionsScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.TravelHotelsBookingDetailsScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.additional_information.TravelHotelsBookingAdditionalInformationScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.additional_information.TravelHotelsBookingAdditionalInformationScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import ff4.s;
import grl.k9;
import hbf.q;
import he1.k;
import he1.n;
import hee.p;
import hg4.r;
import hg9.l;
import hk9.h;
import ip0.zj;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150618a;

    public /* synthetic */ g(int i) {
        this.f150618a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f150618a) {
            case 0:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DonationBreakdownContract$ModalStep step = (DonationBreakdownContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof DonationBreakdownContract$ModalStep.CharityGets)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.donations_donation_breakdown_cells_charity_gets_title, null, null, 14), null, null, null, false, 30);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.donations_fx_rate_disclaimer_message, null, null, 14);
                AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                k9 k9Var = k9.Donations;
                companion.getClass();
                AnalyticsProduct.Companion.a(k9Var);
                return new ActionsBottomSheetController(new dii.a(aVar, (i) null, new AnalyticsProduct.Retail(k9Var), (AnalyticsContext) null, textLocalisedClause));
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return q.f150675a;
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 5:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsBookingDetailsScreenContract$ModalStep step2 = (TravelHotelsBookingDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof TravelHotelsBookingDetailsScreenContract$ModalStep.CheckInInstructions) {
                    return new TravelHotelsCheckInInstructionsScreen(new TravelHotelsCheckInInstructionsScreenContract$InputData(((TravelHotelsBookingDetailsScreenContract$ModalStep.CheckInInstructions) step2).f93844a));
                }
                if (!(step2 instanceof TravelHotelsBookingDetailsScreenContract$ModalStep.AdditionalInformation)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelHotelsBookingDetailsScreenContract$ModalStep.AdditionalInformation additionalInformation = (TravelHotelsBookingDetailsScreenContract$ModalStep.AdditionalInformation) step2;
                return new TravelHotelsBookingAdditionalInformationScreen(new TravelHotelsBookingAdditionalInformationScreenContract$InputData(additionalInformation.f93841a, additionalInformation.f93842b, additionalInformation.f93843c));
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 12:
                Throwable error = (Throwable) obj2;
                NaviCommand naviCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (naviCommand == null) {
                    return error;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_list_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_list_error_caption, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D148", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_list_error_action, null, null, 14), false, null, null, false, 0, 0, 32576);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new k(u.c(model), n.f151525b);
            case 14:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 16:
                Throwable error2 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (pair == null) {
                    return error2;
                }
                return null;
            case 17:
                Throwable error3 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (map == null) {
                    return error3;
                }
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new p(iii.c.b(null, null, 6, false), false);
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new s(u.c(new FullScreenStateDelegate.Model("ID_ERROR_ITEM", new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, false, 0, 0, 32596)), hf4.i.a(""), null, null, null, null, null, null, null, false, false, null, null, 6684);
            case 20:
                Throwable error4 = (Throwable) obj2;
                PaymentCounterpartyInfo paymentCounterpartyInfo = (PaymentCounterpartyInfo) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (paymentCounterpartyInfo == null) {
                    return error4;
                }
                return null;
            case 21:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.personal_details_title, null, null, 14);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.personal_details_subtitle, null, null, 14);
                m70.a.c(t0.f186434a);
                return new r((List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), textLocalisedClause2, textLocalisedClause3, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, true);
            case 22:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new l((List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null)), false);
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                boolean zA = tj0.a.a((Throwable) obj2);
                FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("SALARY_HUB_ERROR", new TextLocalisedClause(zA ? com.revolut.kompot.common.R$string.common_offline_state_title : com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_error_generic_title, null, null, 14), zA ? new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_description, null, null, 14) : null, new ComplexImage.Regular(new GlyphImage(zA ? R$drawable.uikit_icn_24_communication : R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), new l6(12, new TextLocalisedClause(zA ? com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_error_network_primary_cta : com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_error_generic_primary_cta, null, null, 14), null, h4.ACCENT), null, false, null, null, null, YearClass.CLASS_2016);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                return new hgb.u(null, null, u.c(model2), 7);
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                Throwable error5 = (Throwable) obj2;
                ec5.c cVar = (ec5.c) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (cVar == null) {
                    return error5;
                }
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            default:
                Function1 getErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getErrorItems, "getErrorItems");
                return new hk9.l((List) getErrorItems.invoke(new iii.d(12, null, false, true, null)), h.f152875a);
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f150618a = i;
    }
}
