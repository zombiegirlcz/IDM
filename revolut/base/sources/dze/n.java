package dze;

import aw0.n6;
import cli.y;
import com.revolut.chat.ui.inbox.InboxScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.LoanPaymentSettingsHubController;
import com.revolut.feature.freelancer.impl.ui.profile.details.FreelancerProfileScreen;
import com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlow;
import com.revolut.feature.joint.impl.ui.limits.JointLimitsScreen;
import com.revolut.feature.licenses.impl.ui.licenses.offline.OfflineLicenseController;
import com.revolut.feature.retail.cfd.impl.screens.overnight_fee.CfdOvernightFeeBreakdownController;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.CobrandedCardsTypeSelectionScreen;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeController;
import com.revolut.feature.semi_independent_onboarding.impl.ui.details.SemiIndependentOnboardingDetailsScreen;
import com.revolut.feature.statements.impl.ui.documents_hub.period.bottom_sheet.StatementPeriodSelectorBottomSheet;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_issuer.AboutIssuerScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.broker_selection.BrokerSelectionScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreen;
import com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet.EmailVerificationOtpBottomSheet;
import com.revolut.retail.feature.balance.picker.impl.new_picker.currency.CurrencyChooserScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.enrollment.TravelStatusEnrollmentScreen;
import dx4.x;
import e69.u;
import e6d.r;
import e8h.p0;
import eaf.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import l1j.a;
import le.u1;
import nii.n1;
import vkm.j2;
import wim.z;
import yhm.m;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n((com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c) this.v, continuation, 0);
            case 1:
                return new n((FreelancerProfileScreen) this.v, continuation, 1);
            case 2:
                return new n((StatementPeriodSelectorBottomSheet) this.v, continuation, 2);
            case 3:
                return new n((OfflineLicenseController) this.v, continuation, 3);
            case 4:
                return new n((e1a.f) this.v, continuation, 4);
            case 5:
                return new n((SemiIndependentOnboardingDetailsScreen) this.v, continuation, 5);
            case 6:
                return new n((CurrencyChooserScreen) this.v, continuation, 6);
            case 7:
                return new n((TravelStatusEnrollmentScreen) this.v, continuation, 7);
            case 8:
                return new n((CfdOvernightFeeBreakdownController) this.v, continuation, 8);
            case 9:
                return new n((InboxScreen) this.v, continuation, 9);
            case 10:
                return new n((CreditAmountInputScreen) this.v, continuation, 10);
            case 11:
                return new n((JointLimitsScreen) this.v, continuation, 11);
            case 12:
                return new n((AboutIssuerScreen) this.v, continuation, 12);
            case 13:
                return new n((com.revolut.feature.apm.iris.impl.ui.a) this.v, continuation, 13);
            case 14:
                return new n((u) this.v, continuation, 14);
            case 15:
                return new n((r) this.v, continuation, 15);
            case 16:
                return new n((LoanPaymentSettingsHubController) this.v, continuation, 16);
            case 17:
                return new n((com.revolut.feature.giro.impl.ui.review.a) this.v, continuation, 17);
            case 18:
                return new n((CobrandedCardsTypeSelectionScreen) this.v, continuation, 18);
            case 19:
                return new n((IndexDetailsFlow) this.v, continuation, 19);
            case 20:
                return new n((e8h.e) this.v, continuation, 20);
            case 21:
                return new n((e8h.j) this.v, continuation, 21);
            case 22:
                return new n((p0) this.v, continuation, 22);
            case 23:
                return new n((e98.f) this.v, continuation, 23);
            case 24:
                return new n((RevolutPayManagementHomeController) this.v, continuation, 24);
            case 25:
                return new n((BrokerSelectionScreen) this.v, continuation, 25);
            case 26:
                return new n((q) this.v, continuation, 26);
            case 27:
                return new n((TravelHotelsHomeBookingsScreen) this.v, continuation, 27);
            case 28:
                return new n((EmailVerificationOtpBottomSheet) this.v, continuation, 28);
            default:
                return new n((ebi.j) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((n) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((n) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((n) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((n) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((n) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((n) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v65, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c) obj3).d0(false, false);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((e07.j) ((FreelancerProfileScreen) obj3).T2()).u2();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0e.h hVarM3 = ((StatementPeriodSelectorBottomSheet) obj3).R2();
                hVarM3.C2(new xxd.a(hVarM3.f121573p.e()));
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((OfflineLicenseController) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((e1a.f) obj3).c();
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.semi_independent_onboarding.impl.ui.details.b) ((SemiIndependentOnboardingDetailsScreen) obj3).d()).B2();
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((e2j.o) ((CurrencyChooserScreen) obj3).R2()).C2(a.C1086a.f191546a);
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((e2l.g) ((e2l.e) ((TravelStatusEnrollmentScreen) obj3).P.getValue())).B2();
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((e4b.q) ((e4b.d) ((CfdOvernightFeeBreakdownController) obj3).Q.getValue())).B2();
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((InboxScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b) ((CreditAmountInputScreen) obj3).R2();
                x xVar = bVar.f67048s.f;
                if (xVar != null) {
                    bVar.C2(new e54.n(xVar.f120823b, null));
                } else {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        throw new IllegalStateException("menu item is mandatory for onMenuItemClicked");
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        Throwable thA = yhm.m.a(yhm.o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                    }
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((JointLimitsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((e5e.f) ((AboutIssuerScreen) obj3).S.getValue()).B2();
                return Unit.f186387a;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.apm.iris.impl.ui.a) obj3).u);
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e69.o oVar = u.Companion;
                ((u) obj3).C2(aii.q.f5292a);
                return Unit.f186387a;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d6d.f fVar = (d6d.f) j6.a.k(d6d.f.class, ((r) obj3).d, "CALCULATION_STRATEGY_KEY");
                if (fVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                d6d.j spareChange = fVar.getSpareChange();
                return new yvh.i(spareChange != null ? new yvh.j(spareChange.getRoundUps()) : null);
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((e75.o) ((LoanPaymentSettingsHubController) obj3).S.getValue()).B2();
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.giro.impl.ui.review.a) obj3).C2(e77.g.f123095a);
                return Unit.f186387a;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((e7b.h) ((e7b.e) ((CobrandedCardsTypeSelectionScreen) obj3).Q.getValue())).B2();
                return Unit.f186387a;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.global_markets.impl.ui.flow.index_details.b) ((e87.c) ((IndexDetailsFlow) obj3).P.getValue())).B2();
                return Unit.f186387a;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((e8h.e) obj3).f123680a, "TOOLTIP_SWITCH_CURRENCY_DISMISSED_KEY", Boolean.TRUE);
                return Unit.f186387a;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s7h.l lVar = (s7h.l) j6.a.k(s7h.l.class, ((e8h.j) obj3).f123698b, "STORAGE_FREE_STOCKS_CAMPAIGN_KEY");
                if (lVar != null) {
                    return vc.o.B(lVar);
                }
                return null;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar = ((p0) obj3).f123724c;
                KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
                KType kTypeB = o0.b(q7h.c.class);
                companion3.getClass();
                List list = (List) eVar.T2("WEALTH_DISCLAIMERS_DATA_KEY", z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                if (list != null) {
                    return cj9.c.V(list);
                }
                return null;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((e98.f) obj3).f123932c;
                e98.f.Companion.getClass();
                Map map = (Map) cVar.T2("CARD_REQUESTS_KEY", e98.f.i);
                if (map == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(map, "<this>");
                Set<Map.Entry> setEntrySet = map.entrySet();
                int iB = q0.b(w.t(setEntrySet, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Map.Entry entry : setEntrySet) {
                    String str = (String) entry.getKey();
                    List<c98.b> list2 = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    for (c98.b bVar2 : list2) {
                        String strE = bVar2.getId();
                        e93.b bVar3 = (e93.b) u1.u(bVar2.getBrand(), hx7.l.j());
                        b93.b bVar4 = new b93.b(bVar2.getDesignCode());
                        c98.a aVarC = bVar2.getCustomisation();
                        arrayList.add(new jc8.a(strE, bVar3, bVar4, aVarC != null ? new jc8.b(aVarC.getBase64Image(), aVarC.getImageUrl()) : null, bVar2.getVirtual(), bVar2.getCardProfileId()));
                    }
                    linkedHashMap.put(str, arrayList);
                }
                return linkedHashMap;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((RevolutPayManagementHomeController) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((BrokerSelectionScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vii.c cVar2 = ((q) obj3).f124244q;
                Unit unit = Unit.f186387a;
                cVar2.b(unit);
                return unit;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ebg.p) ((TravelHotelsHomeBookingsScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ebi.j) ((EmailVerificationOtpBottomSheet) obj3).m3()).I2("INBOX_LIST_ID");
                return Unit.f186387a;
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ebi.j jVar = (ebi.j) obj3;
                y yVar = jVar.f124376t;
                if (!((ebi.d) ((j2) yVar.f22677a).getValue()).f124367b) {
                    jVar.H2(yVar, new ebi.i(1));
                }
                return Unit.f186387a;
        }
    }
}
