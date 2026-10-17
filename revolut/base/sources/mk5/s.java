package mk5;

import androidx.sqlite.SQLiteConnection;
import aw0.o9;
import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.core.ui_kit.internal.views.ProgressPagingIndicatorView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountScreen;
import com.revolut.feature.apm.bizum.impl.ui.transfer.flow.BizumTransferFlowContract$Step;
import com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewContract$InputData;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$Step;
import com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.date_picker.DatePickerContract$OutputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectContract$ModalStep;
import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import com.revolut.feature.tax_residency.impl.exemption.flows.main.TaxExemptionFlowContract$Step;
import com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.AddDeclarationFlowContract$Step;
import com.revolut.feature_autoinvest_ui_api.navigation.AutoInvestMoveControllerApi$Result;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.api.models.WebAuthnEvidence;
import com.revolut.sso.impl.domain.models.AuthResult;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State;
import h93.f0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mhd.p0;
import mlk.h0;
import ms0.g3;
import ms0.l3;
import ms0.o2;
import ms0.r2;
import no6.d;
import org.jmrtd.lds.LDSFile;
import vkm.j2;
import zhm.a1;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f206199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f206200c;

    public /* synthetic */ s(Object obj2, Object obj3, int i) {
        this.f206198a = i;
        this.f206200c = obj2;
        this.f206199b = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k2j.d dVar;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        int i = this.f206198a;
        int i2 = 8;
        final int i3 = 0;
        final int i5 = 1;
        Continuation continuation = null;
        Object obj3 = this.f206199b;
        Object obj4 = this.f206200c;
        switch (i) {
            case 0:
                CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies currencies = (CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies) obj4;
                com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar = (com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a) obj3;
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                List list = (List) hVar.f288433a;
                List list2 = (List) hVar.f288434b;
                List list3 = (List) hVar.f288435c;
                List list4 = (List) hVar.d;
                List<xi0.b> f70950a = currencies.getF70950a();
                ArrayList arrayList = new ArrayList(zhm.w.t(f70950a, 10));
                for (xi0.b bVar : f70950a) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((io3.d) next).f163147c, bVar.f306286a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    io3.d dVar2 = (io3.d) next;
                    dj0.d dVar3 = dVar2 != null ? new dj0.d(dVar2.i, bVar) : null;
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            if (Intrinsics.f(((qta.c) next2).f249046a, bVar)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    qta.c cVar = (qta.c) next2;
                    n9l.a aVarF0 = cVar != null ? ofm.q.f0(cVar) : null;
                    String strA = aVar.f70961p.a(bVar);
                    dj0.d dVarK = (dVar3 == null || dVar3.f115082a == 0 || aVarF0 == null) ? null : pyd.c.K(dVar3, aVarF0.f213663c, aVarF0.f213662b);
                    Iterator it10 = list3.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next3 = it10.next();
                            if (((pd5.g) next3).f235102a.equals(bVar)) {
                            }
                        } else {
                            next3 = null;
                        }
                    }
                    pd5.g gVar = (pd5.g) next3;
                    pd5.j jVar = gVar != null ? gVar.f235106h : null;
                    Iterator it11 = list4.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            next4 = it11.next();
                            if (Intrinsics.f(((cw5.b) next4).f109534a, bVar.f306286a)) {
                            }
                        } else {
                            next4 = null;
                        }
                        break;
                    }
                    arrayList.add(new l(strA, bVar, dVar3, dVarK, jVar, (cw5.b) next4));
                }
                if (currencies instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies.Sorted) {
                    return arrayList;
                }
                if (!(currencies instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies.DefaultSorting)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list5 = list;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it12 = list5.iterator();
                while (it12.hasNext()) {
                    arrayList2.add(((io3.d) it12.next()).f163147c);
                }
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                int i6 = 0;
                for (Object obj5 : arrayList2) {
                    int i21 = i6 + 1;
                    if (i6 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    arrayList3.add(new Pair((String) obj5, Integer.valueOf(i6)));
                    i6 = i21;
                }
                Map mapT = r0.t(arrayList3);
                qta.c cVar2 = (qta.c) d0.d0(list2);
                xi0.b bVar2 = cVar2 != null ? cVar2.f249047b : null;
                int i22 = t.f206201a[aVar.o.e.ordinal()];
                if (i22 == 1) {
                    dVar = new k2j.d(new afa.a(bVar2, 5), 17);
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = new k2j.d(new com.google.android.material.color.utilities.g(8), 18);
                }
                return d0.P0(d0.P0(arrayList, new h6l.a(cim.b.g(cim.b.e()), mapT, 4)), dVar);
            case 1:
                com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar2 = (com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a) obj3;
                xi0.b displayCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
                List list6 = (List) obj4;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list6, 10));
                Iterator it13 = list6.iterator();
                while (it13.hasNext()) {
                    v1.c.A(arrayList4, (xi0.b) it13.next(), displayCurrency);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : arrayList4) {
                    Pair pair = (Pair) obj6;
                    if (!Intrinsics.f(pair.f186385a, pair.f186386b)) {
                        arrayList5.add(obj6);
                    }
                }
                return cpk.a.a(aVar2.f70963r, arrayList5);
            case 2:
                return Integer.valueOf(((ml3.h) obj4).f206592c.handleMultiple((SQLiteConnection) obj2, (List) obj3));
            case 3:
                ((ml3.r) obj4).f206621b.insert((SQLiteConnection) obj2, (ml3.o) obj3);
                return Unit.f186387a;
            case 4:
                ((ml3.t) obj4).f206623b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return Unit.f186387a;
            case 5:
                ((ml3.z) obj4).f206630b.insert((SQLiteConnection) obj2, (ml3.u) obj3);
                return Unit.f186387a;
            case 6:
                f0 card = (f0) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                efm.d0 d0VarFirstOrError = m70.a.g(((yua.q) ((h0) obj4).f207016y).p((String) obj3, true), null, new mh1.e(15), 1).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return new ufm.i(ue0.e.F(d0VarFirstOrError, zhm.f0.f322471a), new mlk.b0(new avc.o(card, i2), 3), 1);
            case 7:
                ggk.y yVar = (ggk.y) obj4;
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                return new mlk.s(yVar.f143798a, cards, yVar.d, yVar.f143800c, (mlk.w) obj3, yVar.e);
            case 8:
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar3 = (com.revolut.sso.impl.ui.combined_authentication.flow.c) obj4;
                Claim claim = (Claim) obj3;
                ukl.f result = (ukl.f) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, ukl.c.f280794a) || Intrinsics.f(result, ukl.e.f280796a)) {
                    cVar3.b3();
                } else {
                    if (!(result instanceof ukl.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar3.l2(new lr.l(cVar3, claim, result, (Continuation) null, 28), new yi5.b(26));
                }
                return Unit.f186387a;
            case 9:
                CombinedAuthenticationFlowContract$State update = (CombinedAuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return CombinedAuthenticationFlowContract$State.a(update, null, null, a1.m(((CombinedAuthenticationFlowContract$State) ((j2) ((com.revolut.sso.impl.ui.combined_authentication.flow.c) obj4).G.f22677a).getValue()).f106407c, (WebAuthnEvidence) obj3), null, 11);
            case 10:
                CombinedAuthenticationFlowContract$State update2 = (CombinedAuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return CombinedAuthenticationFlowContract$State.a(update2, null, null, a1.m(((CombinedAuthenticationFlowContract$State) ((j2) ((com.revolut.sso.impl.ui.combined_authentication.flow.c) obj4).G.f22677a).getValue()).f106407c, (Evidence) obj3), null, 11);
            case 11:
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j jVar2 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) obj4;
                String str = (String) obj3;
                s7a.a0 output = (s7a.a0) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                s7a.c0 c0Var = output.f260599a;
                if (c0Var instanceof rl7.a) {
                    jVar2.l2(new mll.c0(jVar2, str, (rl7.a) c0Var, null, 1), new mm7.h(1, jVar2, vl7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 1));
                }
                return Unit.f186387a;
            case 12:
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j jVar3 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) obj4;
                dj0.d dVar4 = (dj0.d) obj3;
                Throwable it14 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                ServerError serverErrorA = jVar3.f75434w.a(it14);
                Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
                if (numValueOf != null && numValueOf.intValue() == 1006) {
                    jVar3.l2(new p0(jVar3, dVar4, continuation, 18), new yi5.b(26));
                } else {
                    vl7.a.g(jVar3, it14);
                }
                return Boolean.TRUE;
            case 13:
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j jVar4 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) obj4;
                Intrinsics.checkNotNullParameter((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.a) obj2, "it");
                jVar4.l2(new com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.a(jVar4, ((CarOnboardingFlowContract$Step.ProofOfDrivingNumber) obj3).f75427b, null), new lrk.h(1, jVar4, vl7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 28));
                return Unit.f186387a;
            case 14:
                mmc.d dVar5 = (mmc.d) obj4;
                yki.l lVar = (yki.l) obj3;
                AutoInvestMoveControllerApi$Result result2 = (AutoInvestMoveControllerApi$Result) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof AutoInvestMoveControllerApi$Result.Cancel) {
                    oki.h.D2(lVar);
                } else {
                    if (!(result2 instanceof AutoInvestMoveControllerApi$Result.Move)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar5.l2(new p0(dVar5, lVar, continuation, 20), new yi5.b(26));
                }
                return Unit.f186387a;
            case 15:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PennyTopUpControllerExtension", null, error, h0Var);
                ((mn6.j) obj4).t2();
                ((Function0) obj3).invoke();
                return Boolean.TRUE;
            case 16:
                com.revolut.feature.tax_residency.impl.exemption.flows.main.a aVar3 = (com.revolut.feature.tax_residency.impl.exemption.flows.main.a) obj4;
                yki.l lVar2 = (yki.l) obj3;
                vne.e result3 = (vne.e) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!(result3 instanceof vne.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                TaxExemptionAggregate taxExemptionAggregate = ((vne.d) result3).f290799a;
                String str2 = taxExemptionAggregate.f89973g;
                if (str2 != null) {
                    aVar3.C1(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, str2, null, null, 6)));
                } else {
                    oki.h.w2(lVar2, new TaxExemptionFlowContract$Step.EditAmount(taxExemptionAggregate), ModalDestination.Style.POPUP.f98311a);
                }
                return Unit.f186387a;
            case 17:
                com.revolut.sso.impl.ui.manual_review.b bVar3 = (com.revolut.sso.impl.ui.manual_review.b) obj4;
                AuthResult authResult = (AuthResult) obj3;
                d67.u outputData = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!(outputData instanceof d67.s)) {
                    throw new IllegalStateException("Unreachable state");
                }
                bVar3.C2(new mnl.d(authResult));
                return Unit.f186387a;
            case 18:
                com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.a aVar4 = (com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.a) obj4;
                yki.l lVar3 = (yki.l) obj3;
                no6.d result4 = (no6.d) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (result4 instanceof no6.e) {
                    aVar4.C2(new mo6.c(((no6.e) result4).f217925a));
                } else {
                    if (!Intrinsics.f(result4, d.a.f217924a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(lVar3);
                }
                return Unit.f186387a;
            case 19:
                com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a aVar5 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a) obj4;
                String str3 = (String) obj3;
                y7a.v outputData2 = (y7a.v) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                y7a.w wVar = outputData2.f311454a;
                if (wVar instanceof to7.j) {
                    aVar5.H2(aVar5.f75622q, new s(str3, wVar, 20));
                }
                return Unit.f186387a;
            case 20:
                mp7.h update3 = (mp7.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return mp7.h.a(update3, null, null, null, r0.q(update3.d, new Pair((String) obj4, ((to7.j) ((y7a.w) obj3)).f272536a)), 7);
            case 21:
                mpd.a update4 = (mpd.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return mpd.a.a(update4, null, null, null, false, mpd.b.a((mpd.b) obj4, null, null, null, (LocalDate) obj3, null, false, 55), 63);
            case 22:
                final com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a aVar6 = (com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a) obj3;
                cli.y yVar2 = aVar6.f87685s;
                DatePickerContract$OutputData result5 = (DatePickerContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                int i32 = mpd.o.f207803a[((CustomPeriodSelectContract$ModalStep.DatePicker) ((CustomPeriodSelectContract$ModalStep) obj4)).f87681b.ordinal()];
                if (i32 == 1) {
                    final LocalDate localDate = result5.f87668a;
                    aVar6.H2(yVar2, new Function1() { // from class: mpd.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            a update5 = (a) obj7;
                            switch (i3) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(update5, "$this$update");
                                    a aVarA = a.a(update5, null, localDate, null, false, null, LDSFile.EF_SOD_TAG);
                                    return a.a(aVarA, null, null, null, aVar6.I2(aVarA), null, 95);
                                default:
                                    Intrinsics.checkNotNullParameter(update5, "$this$update");
                                    a aVarA2 = a.a(update5, null, null, localDate, false, null, LDSFile.EF_DG15_TAG);
                                    return a.a(aVarA2, null, null, null, aVar6.I2(aVarA2), null, 95);
                            }
                        }
                    });
                } else {
                    if (i32 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final LocalDate localDate2 = result5.f87668a;
                    aVar6.H2(yVar2, new Function1() { // from class: mpd.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            a update5 = (a) obj7;
                            switch (i5) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(update5, "$this$update");
                                    a aVarA = a.a(update5, null, localDate2, null, false, null, LDSFile.EF_SOD_TAG);
                                    return a.a(aVarA, null, null, null, aVar6.I2(aVarA), null, 95);
                                default:
                                    Intrinsics.checkNotNullParameter(update5, "$this$update");
                                    a aVarA2 = a.a(update5, null, null, localDate2, false, null, LDSFile.EF_DG15_TAG);
                                    return a.a(aVarA2, null, null, null, aVar6.I2(aVarA2), null, 95);
                            }
                        }
                    });
                }
                return Unit.f186387a;
            case 23:
                com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.a aVar7 = (com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.a) obj4;
                AddDeclarationFlowContract$Step.TaxResidencyDeclaration taxResidencyDeclaration = (AddDeclarationFlowContract$Step.TaxResidencyDeclaration) obj3;
                ppe.f output2 = (ppe.f) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof ppe.c) {
                    aVar7.C2(new mpe.c(taxResidencyDeclaration.f90198a, ((ppe.c) output2).f238591b));
                } else if (output2 instanceof ppe.d) {
                    aVar7.C2(new mpe.d(((ppe.d) output2).f238593a));
                } else {
                    if (!(output2 instanceof ppe.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar7.C2(new mpe.d("Unexpected primary residency request for " + aVar7.o.f90192a + " flow"));
                }
                return Unit.f186387a;
            case 24:
                mq4.o oVar = (mq4.o) obj4;
                mq4.g gVar2 = (mq4.g) obj3;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ResourceImage resourceImageA = oVar.a();
                xi0.b currency = oVar.f207868a.f69167b;
                Intrinsics.checkNotNullParameter(currency, "currency");
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                String string = u80.o.b(new u80.g(new dj0.d(0L, currency), u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
                bw0.e eVar = bw0.e.SuggestionsElseCalculator;
                zhm.f0 f0Var = zhm.f0.f322471a;
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                bw0.h hVar2 = new bw0.h("", string, (TextClause) null, true, (List) f0Var, Boolean.FALSE, (List) f0Var, false, false, false, false, eVar, (Clause) new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 25860);
                bw0.m.Companion.getClass();
                List listC = zhm.u.c(new CenteredAmountDelegate.Model("id_secured_credit_card_amount", null, hVar2, null, bw0.k.a(), null, null, true, false, currency, null, 1122));
                aw0.e eVarA = oVar.f207870c.a(false, gVar2.f207857a, null);
                com.revolut.feature.credit.card.api.navigation.a screenMode = gVar2.f207857a;
                TextLocalisedClause textLocalisedClauseA = oq4.h.a(screenMode);
                Intrinsics.checkNotNullParameter(screenMode, "screenMode");
                return new mq4.j(eVarA, textLocalisedClauseA, resourceImageA, listC);
            case 25:
                ProductIntroView productIntroView = (ProductIntroView) obj4;
                g3 g3Var = (g3) obj3;
                o2 o2Var = g3Var.f208260a;
                jv0.m mVar = (jv0.m) obj2;
                if (mVar instanceof jv0.o) {
                    ProgressPagingIndicatorView progressPagingIndicatorView = productIntroView.f56309s;
                    jv0.o oVar2 = (jv0.o) mVar;
                    boolean z = oVar2.f178755a;
                    r2 story = g3Var.f208261b;
                    o2Var.getClass();
                    Intrinsics.checkNotNullParameter(story, "story");
                    progressPagingIndicatorView.setModel(new l3(oVar2.f178756b, o2Var.f208351a.indexOf(story), o2Var.f208351a.size(), oVar2.f178757c, z));
                } else {
                    ProductIntroView.Companion companion = ProductIntroView.INSTANCE;
                }
                return Unit.f186387a;
            case 26:
                Integer num = (Integer) obj4;
                BluePromptActivity bluePromptActivity = (BluePromptActivity) obj3;
                rp0.a0 it15 = (rp0.a0) obj2;
                BluePromptActivity.Companion companion2 = BluePromptActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Integer.valueOf(kli.a.s(it15.f256040a ? BluePromptActivity.E0 : num.intValue(), bluePromptActivity));
            case 27:
                msk.b bVar4 = (msk.b) obj4;
                yj1.c cVar4 = (yj1.c) obj3;
                od0.i learnAirTipOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(learnAirTipOptional, "learnAirTipOptional");
                yj1.a aVar8 = (yj1.a) learnAirTipOptional.f224257a;
                if (aVar8 == null) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                String str4 = aVar8.f314373a;
                d5d.a aVar9 = new d5d.a(com.google.android.gms.internal.mlkit_vision_face.a.o(bVar4.f208677a, "_", str4), aVar8.f314374b, aVar8.f314375c, aVar8.d, aVar8.e, new nsk.a(str4, cVar4));
                od0.h hVar3 = od0.i.Companion;
                e5d.c cVar5 = new e5d.c(aVar9, "wealth_asset_details");
                hVar3.getClass();
                return od0.h.a(cVar5);
            case 28:
                com.revolut.feature.apm.bizum.impl.ui.transfer.flow.a aVar10 = (com.revolut.feature.apm.bizum.impl.ui.transfer.flow.a) obj4;
                BizumTransferAmountScreen bizumTransferAmountScreen = (BizumTransferAmountScreen) obj3;
                jt1.f output3 = (jt1.f) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof jt1.d) {
                    aVar10.I2();
                } else {
                    if (!(output3 instanceof jt1.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jt1.e eVar2 = (jt1.e) output3;
                    aVar10.E2(new BizumTransferFlowContract$Step.Review(new BizumTransferReviewContract$InputData(((BizumTransferAmountContract$InputData) bizumTransferAmountScreen.G).getF61604a(), eVar2.f178281a, eVar2.f178282b)), false, TransitionAnimation.SLIDE_END_TO_START.f98395a, false);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e eVar3 = (com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e) obj4;
                GroupDetailsFlowContract$Step.UntrustedGroupPrompt untrustedGroupPrompt = (GroupDetailsFlowContract$Step.UntrustedGroupPrompt) obj3;
                d67.u it16 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                if (Intrinsics.f(it16, d67.t.f111465a) || Intrinsics.f(it16, d67.q.f111462a)) {
                    oki.h.D2(eVar3.f79475s);
                } else {
                    if ((it16 instanceof d67.p) || Intrinsics.f(it16, d67.r.f111463a)) {
                        throw new IllegalStateException("Output " + it16 + " is illegal");
                    }
                    if (!Intrinsics.f(it16, d67.s.f111464a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar3.l2(new com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.d(eVar3, untrustedGroupPrompt, null), new com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.b(1, 0, com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e.class, eVar3, "handleJoinGroupError", "handleJoinGroupError(Ljava/lang/Throwable;)Z"));
                }
                return Unit.f186387a;
        }
    }
}
