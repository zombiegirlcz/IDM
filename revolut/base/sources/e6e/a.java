package e6e;

import aw0.s0;
import cci.i;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.b;
import com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager.JuniorAllowancePagerScreen;
import com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager.JuniorAllowancePagerScreenContract$Input;
import com.revolut.feature.junior_allowance.impl.ui.screen.list.JuniorAllowancesListScreenContract$ModalStep;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.partner_taxes_disclaimer.TravelHotelsPartnerTaxesDisclaimerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.partner_taxes_disclaimer.TravelHotelsPartnerTaxesDisclaimerScreenContract$InputData;
import e85.l;
import e85.r;
import e8e.q;
import e94.o;
import ead.h;
import f19.g;
import iii.d;
import ip0.zj;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122994a;

    public /* synthetic */ a(int i) {
        this.f122994a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f122994a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new d(14, null, true, false, null));
            case 2:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new l((List) getDefaultErrorItems2.invoke(new d(14, null, true, false, null)), r.a(null, false));
            case 3:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                return Optional.empty();
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return e8d.a.a(new s0(new TextLocalisedClause(R$string.help_center_section_need_more_help_action_chat, null, null, 14), (ResourceImage) null, 14));
            case 6:
                Function1 function1 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(function1, "default");
                return new q(null, (List) function1.invoke(new d(14, null, false, false, null)));
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new o(u.c(new FullScreenStateDelegate.Model("LIST_ID_ERROR_ITEM", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_debts_hub_error_title, null, null, 14), null, new ComplexImage.Regular(b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_debts_hub_error_action_title, null, null, 14), null, h4.ACCENT), null, false, null, null, null, 2020)));
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 9:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new d(4, new h(t9d.d.Pdf), true, true, null));
            case 10:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new d(4, new h(t9d.d.Email), true, true, null));
            case 11:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new d(4, new h(t9d.d.Payment), true, true, null));
            case 12:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new d(12, null, true, true, null));
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 14:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return (List) getDefaultErrorItems7.invoke(new d(14, null, true, false, null));
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ebf.r.a(null);
            case 17:
                Function1 getDefaultErrorItems8 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return (List) getDefaultErrorItems8.invoke(new d(14, null, true, false, null));
            case 18:
                Function1 getDefaultErrorItems9 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems9, "getDefaultErrorItems");
                return (List) getDefaultErrorItems9.invoke(new d(14, null, true, false, null));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_BLOCK_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), new ComplexImage.Regular(b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31680);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return u.c(model);
            case 21:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                JuniorAllowancesListScreenContract$ModalStep step = (JuniorAllowancesListScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof JuniorAllowancesListScreenContract$ModalStep.AllowancePager)) {
                    throw new NoWhenBranchMatchedException();
                }
                JuniorAllowancesListScreenContract$ModalStep.AllowancePager allowancePager = (JuniorAllowancesListScreenContract$ModalStep.AllowancePager) step;
                return new JuniorAllowancePagerScreen(new JuniorAllowancePagerScreenContract$Input(allowancePager.f76843a, allowancePager.f76844b, allowancePager.f76845c));
            case 22:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new d(14, null, true, false, null));
            case 23:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((i) obj3, "<unused var>");
                return Unit.f186387a;
            case 24:
                Throwable error = (Throwable) obj2;
                wc6.d dVar = (wc6.d) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (dVar == null) {
                    return error;
                }
                return null;
            case 25:
                Throwable error2 = (Throwable) obj2;
                g gVar = (g) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (gVar == null) {
                    return error2;
                }
                return null;
            case 26:
                Throwable error3 = (Throwable) obj2;
                hha.d dVar2 = (hha.d) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (dVar2 == null) {
                    return error3;
                }
                return null;
            case 27:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsPriceBreakdownScreenContract$ModalStep step2 = (TravelHotelsPriceBreakdownScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof TravelHotelsPriceBreakdownScreenContract$ModalStep.PartnerTaxesDisclaimer) {
                    return new TravelHotelsPartnerTaxesDisclaimerScreen(new TravelHotelsPartnerTaxesDisclaimerScreenContract$InputData(((TravelHotelsPriceBreakdownScreenContract$ModalStep.PartnerTaxesDisclaimer) step2).f93971a));
                }
                throw new NoWhenBranchMatchedException();
            case 28:
                Throwable error4 = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (juniorBankingProfile == null) {
                    return error4;
                }
                return null;
            default:
                Throwable error5 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bool == null) {
                    return error5;
                }
                return null;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f122994a = i;
    }
}
