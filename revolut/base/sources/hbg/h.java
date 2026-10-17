package hbg;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue_management.CatalogueManagementScreen;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.all_forms.AllFormsScreen;
import com.revolut.feature.apm.bizum.impl.ui.settings.BizumSettingsScreen;
import com.revolut.feature.atm.impl.ui.redesign.error.AtmErrorController;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.details.PersonalDetailsScreen;
import com.revolut.feature.external_accounts.api.navigation.AkahuDestination;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.ClientsListScreen;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.countries.CrossBorderCountryDepartmentsScreen;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreen;
import com.revolut.feature.transport.impl.ui.hub.tickets.expired.ExpiredTicketsListScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.TravelHotelsBookingDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.partner_taxes_disclaimer.TravelHotelsPartnerTaxesDisclaimerScreen;
import com.revolut.feature.view.image.core.BaseViewImageScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install.EsimInstallBottomSheetScreen;
import gwi.n4;
import gwi.s0;
import hnj.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h((TravelHotelsBookingDetailsScreen) this.v, continuation, 0);
            case 1:
                return new h((hd2.c) this.v, continuation, 1);
            case 2:
                return new h((TravelHotelsPartnerTaxesDisclaimerScreen) this.v, continuation, 2);
            case 3:
                return new h((CatalogueManagementScreen) this.v, continuation, 3);
            case 4:
                return new h((com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a) this.v, continuation, 4);
            case 5:
                return new h((com.revolut.feature.retail.reverywhere.impl.onboarding.a) this.v, continuation, 5);
            case 6:
                return new h((PersonalDetailsScreen) this.v, continuation, 6);
            case 7:
                return new h((hh6.p) this.v, continuation, 7);
            case 8:
                return new h((EsimCountryPickerScreen) this.v, continuation, 8);
            case 9:
                return new h((com.revolut.feature.shops.impl.flow.checkout.b) this.v, continuation, 9);
            case 10:
                return new h((AtmErrorController) this.v, continuation, 10);
            case 11:
                return new h((hk9.q) this.v, continuation, 11);
            case 12:
                return new h((EsimMobilePlanInvoicesScreen) this.v, continuation, 12);
            case 13:
                return new h((ClientsListScreen) this.v, continuation, 13);
            case 14:
                return new h((hmc.c) this.v, continuation, 14);
            case 15:
                return new h((hng.b) this.v, continuation, 15);
            case 16:
                return new h((EsimInstallBottomSheetScreen) this.v, continuation, 16);
            case 17:
                return new h((CrossBorderCountryDepartmentsScreen) this.v, continuation, 17);
            case 18:
                return new h((CoparentsSettingsScreen) this.v, continuation, 18);
            case 19:
                return new h((AllFormsScreen) this.v, continuation, 19);
            case 20:
                return new h((hq3.o) this.v, continuation, 20);
            case 21:
                return new h((BaseViewImageScreen) this.v, continuation, 21);
            case 22:
                return new h((com.revolut.biometric_verification.impl.ui.step.document.flow.e) this.v, continuation, 22);
            case 23:
                return new h((BizumSettingsScreen) this.v, continuation, 23);
            case 24:
                return new h((com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b) this.v, continuation, 24);
            case 25:
                return new h((com.revolut.feature.topup_screen.impl.flow.topup_methods.d) this.v, continuation, 25);
            case 26:
                return new h((ExpiredTicketsListScreen) this.v, continuation, 26);
            case 27:
                return new h((hwi.c) this.v, continuation, 27);
            case 28:
                return new h((hwi.g) this.v, continuation, 28);
            default:
                return new h((hwi.h0) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 1:
                break;
        }
        return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ArrayList arrayList = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TravelHotelsBookingDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hd2.c cVar = (hd2.c) obj3;
                cli.y yVar = cVar.f151378q;
                if (((hd2.d) ((j2) yVar.f22677a).getValue()).f151379a - 1 != 0) {
                    cVar.H2(yVar, new h56.a(cVar, 24));
                } else {
                    cVar.I2();
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hdg.d) ((hdg.c) ((TravelHotelsPartnerTaxesDisclaimerScreen) obj3).T.getValue())).B2();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CatalogueManagementScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a) obj3).f76881t);
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.retail.reverywhere.impl.onboarding.a) obj3).f82913s);
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hg4.u) ((PersonalDetailsScreen) obj3).R2()).C2(hg4.k.f152095a);
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hh6.p) obj3).u2();
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((EsimCountryPickerScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.shops.impl.flow.checkout.b) obj3).f87092q);
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AtmErrorController) obj3).F2();
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hk9.q) obj3).J2(new hhd.n(14));
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hkj.f) ((EsimMobilePlanInvoicesScreen) obj3).R.getValue()).B2();
                return Unit.f186387a;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ClientsListScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v(((hmc.c) obj3).d.f153637n, false, null, 3);
                return Unit.f186387a;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                od0.h hVar = od0.i.Companion;
                Object objT2 = ((hng.b) obj3).f154092a.T2("SELECTED_REGISTERED_IDENTITY_ID", wim.z.d(o0.b(String.class)));
                hVar.getClass();
                return od0.h.a(objT2);
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hnj.g) ((hnj.f) ((EsimInstallBottomSheetScreen) obj3).V.getValue())).C2(e.a.f154124a);
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ho6.p) ((CrossBorderCountryDepartmentsScreen) obj3).d()).B2();
                return Unit.f186387a;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CoparentsSettingsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hq1.g) ((AllFormsScreen) obj3).P.getValue()).B2();
                return Unit.f186387a;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hq3.o) obj3).v2(hq3.a.f154589a);
                return Unit.f186387a;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((BaseViewImageScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z1 z1Var = ((com.revolut.biometric_verification.impl.ui.step.document.flow.e) obj3).C;
                Unit unit = Unit.f186387a;
                z1Var.k(unit);
                return unit;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((BizumSettingsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b bVar = (com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b) obj3;
                bVar.G2(aii.q.f5292a);
                bVar.I2();
                return Unit.f186387a;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((com.revolut.feature.topup_screen.impl.flow.topup_methods.d) obj3).C1(AkahuDestination.f72245a);
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ExpiredTicketsListScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) p.a.j(gwi.m0.class, KTypeProjection.INSTANCE, List.class, ((hwi.c) obj3).f156197b, "pass_details_list");
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(knm.b.L((gwi.m0) it8.next()));
                    }
                }
                return arrayList;
            case 28:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list3 = (List) p.a.j(s0.class, KTypeProjection.INSTANCE, List.class, ((hwi.g) obj3).f156217b, "KEY_RECENT_PASSENGERS");
                if (list3 != null) {
                    List<s0> list4 = list3;
                    arrayList = new ArrayList(zhm.w.t(list4, 10));
                    for (s0 s0Var : list4) {
                        Intrinsics.checkNotNullParameter(s0Var, "<this>");
                        arrayList.add(new svi.s(s0Var.f147510a, s0Var.f147511b, s0Var.f147512c));
                    }
                }
                return arrayList;
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list5 = (List) p.a.j(n4.class, KTypeProjection.INSTANCE, List.class, ((hwi.h0) obj3).f156223b, "KEY_PASS_ACTIVITY_FILTERS");
                if (list5 != null) {
                    return l9.l.w(list5);
                }
                return null;
        }
    }
}
