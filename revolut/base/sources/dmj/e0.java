package dmj;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.insurance_credit.impl.ui.flow.InsuranceCreditFlowContract$Step;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.a;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.navigation.JuniorAppLinkShareFeatureConfig;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.AnalyticsDashboardFlowContract$Step;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.a;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.documents.DocumentsToAcceptScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$OutputData;
import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreenContract$DomainState;
import com.youTransactor.uCube.rpc.Constants;
import fth.e;
import ip0.br;
import ip0.cr;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import sgm.e3;
import vkm.j2;
import yhm.m;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f116150b;

    public /* synthetic */ e0(com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar, com.revolut.kompot.navigable.vc.modal.a aVar) {
        this.f116149a = 4;
        this.f116150b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v14 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Object objA;
        int i = this.f116149a;
        int i2 = 0;
        int i3 = 5;
        int i5 = 2;
        int i6 = 1;
        Object obj3 = this.f116150b;
        switch (i) {
            case 0:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) obj3;
                w6c.e output = (w6c.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof w6c.b) && !(output instanceof w6c.a)) {
                    if (output instanceof w6c.c) {
                        PaymentMethod paymentMethod = ((w6c.c) output).f295413a;
                        pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : 0;
                        if (pocket == 0) {
                            edl.a.n(paymentMethod, "EsimMobilePlanPhoneNumberCheckoutScreenModel");
                            return Unit.f186387a;
                        }
                        cVar.H2(cVar.z, new f0(pocket, i2));
                    } else {
                        if (!(output instanceof w6c.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        w6c.h hVar = ((w6c.d) output).f295414a;
                        if (hVar == null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "EsimMobilePlanPhoneNumberCheckoutScreenModel", "Can not update topped-up balance: topUpTarget is null", null, h0Var);
                        } else {
                            yji.l.a1(cVar, cVar.f101383q.f(new u6c.p(hVar.f295415a, (String) null, (u6c.u) null, u6c.t.ESIM_MOBILE_PLANS, (Long) null, (xi0.b) null, false, Constants.TAG_POWER_OFF_TIMEOUT), hVar.f295416b, hVar.f295417c), null, null, new chf.a(cVar, hVar, pocket, 13), 3);
                        }
                    }
                }
                return Unit.f186387a;
            case 1:
                SelectIdentityScreenContract$DomainState.SelectionState selectionState = (SelectIdentityScreenContract$DomainState.SelectionState) obj3;
                SelectIdentityScreenContract$DomainState update = (SelectIdentityScreenContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ConsentChallenge.Qr.Delegated consentChallenge = update.f106455a;
                long j2 = update.f106457c;
                Intrinsics.checkNotNullParameter(consentChallenge, "consentChallenge");
                Intrinsics.checkNotNullParameter(selectionState, "selectionState");
                return new SelectIdentityScreenContract$DomainState(consentChallenge, selectionState, j2);
            case 2:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) ((dnc.x) obj3).f116286c.getValue();
            case 3:
                do2.q qVar = (do2.q) obj3;
                do2.g currentState = (do2.g) obj2;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                fo2.f fVar = new fo2.f(qVar.I2(), currentState.f116375b.b());
                qVar.f116392r.getClass();
                List list = fo2.g.a(fVar).f316033b;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof fo2.c) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            case 4:
                com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar = (com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d) obj3;
                yja.b result = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                int i21 = do8.p.f116461a[result.ordinal()];
                if (i21 != 1) {
                    if (i21 == 2) {
                        Object content = ((do8.i) ((j2) dVar.f77293x.f22677a).getValue()).f116451a.getContent();
                        if (content == null) {
                            throw new IllegalArgumentException("Cannot launch app link sharing. Profile is not present in state");
                        }
                        dVar.C1(zh9.u0.b(new FeatureCommand(new JuniorAppLinkShareFeatureConfig(((JuniorBankingProfile) content).f77099b))));
                    } else {
                        if (i21 != 3 && i21 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            throw new IllegalStateException(("Unexpected product article result " + result).toString());
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
                }
                return Unit.f186387a;
            case 5:
                doc.j updateState = (doc.j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return doc.j.a(updateState, null, null, (koc.g) obj3, null, null, 27);
            case 6:
                doc.j updateState2 = (doc.j) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return doc.j.a(updateState2, null, null, null, null, (eoc.e) obj3, 15);
            case 7:
                return doc.j.a((doc.j) obj2, (doc.d) obj3, null, null, null, null, 30);
            case 8:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((doc.b0) obj3).b();
            case 9:
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.b) obj3;
                eii.k result2 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof eii.i) {
                    Object obj5 = ((eii.i) result2).f126655a;
                    AccountId accountId = obj5 instanceof AccountId ? (AccountId) obj5 : null;
                    if (accountId != null) {
                        oki.h.t2(bVar, bVar.f87602t, new AnalyticsDashboardFlowContract$Step.BudgetCreation(accountId), true, null, false, 12);
                    }
                }
                return Unit.f186387a;
            case 10:
                com.revolut.feature.tax_residency.impl.flows.single_tin.c cVar2 = (com.revolut.feature.tax_residency.impl.flows.single_tin.c) obj3;
                eoe.f outputData = (eoe.f) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof eoe.c) {
                    cVar2.J2();
                } else if (outputData instanceof eoe.d) {
                    cVar2.K2();
                } else {
                    if (!(outputData instanceof eoe.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar2.I2();
                }
                return Unit.f186387a;
            case 11:
                com.revolut.feature.user_declarations.shared.flows.pep.a aVar = (com.revolut.feature.user_declarations.shared.flows.pep.a) obj3;
                com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.a outputData2 = (com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.a) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof kog.h) {
                    ivh.c.Z2(aVar.f94640r, "PepFlowModel: pep connections submission", "PEP_PERSONS_LIST_CONTINUE_BUTTON", new dg4.c(aVar, outputData2, pocket, i3), null, null, 56);
                } else {
                    if (!Intrinsics.f(outputData2, a.C0582a.f94669a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.C2(PepFlowControllerDescriptor$OutputData.Cancel.f105066a);
                }
                return Unit.f186387a;
            case 12:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                e3 e3Var = ((doh.j) obj3).f116570p;
                return pd.b.r(((e8h.u) e3Var.f262806b).d.f(Unit.f186387a, false), new x8h.d(e3Var, 12));
            case 13:
                cp4.l key = (cp4.l) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                return (ql4.a) ((dp4.q) obj3).f116681b.a(key);
            case 14:
                cp4.n key2 = (cp4.n) obj2;
                Intrinsics.checkNotNullParameter(key2, "key");
                return (List) ((dp4.r) obj3).f116685b.a(key2);
            case 15:
                cp4.r key3 = (cp4.r) obj2;
                Intrinsics.checkNotNullParameter(key3, "key");
                return (nl4.e) ((dp4.s) obj3).f116690b.a(key3);
            case 16:
                cp4.t key4 = (cp4.t) obj2;
                Intrinsics.checkNotNullParameter(key4, "key");
                return (ol4.a) ((dp4.t) obj3).f116695b.a(key4);
            case 17:
                cp4.k0 key5 = (cp4.k0) obj2;
                Intrinsics.checkNotNullParameter(key5, "key");
                return (CreditCardSecurityDeposit) ((xx4.d) ((a5h.g) obj3).f1407c).a(key5);
            case 18:
                dr2.d update2 = (dr2.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return dr2.d.a(update2, (xq2.c) obj3, null, 2);
            case 19:
                return dr2.d.a((dr2.d) obj2, null, (dr2.f) obj3, 1);
            case 20:
                com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a aVar2 = (com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a) obj3;
                fr8.n data = (fr8.n) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                int i22 = dr8.c.f117104a[aVar2.f77446t.f77443b.ordinal()];
                int i32 = 26;
                if (i22 == 1) {
                    aVar2.l2(new dr8.d(aVar2, data, pocket, i6), new yi5.b(i32));
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.l2(new dr8.d(aVar2, data, pocket, i5), new yi5.b(i32));
                }
                return Unit.f186387a;
            case 21:
                Unit it11 = (Unit) obj2;
                KProperty[] kPropertyArr = DocumentsToAcceptScreen.j0;
                Intrinsics.checkNotNullParameter(it11, "it");
                ((drg.l) ((DocumentsToAcceptScreen) obj3).T2()).C2();
                return Unit.f186387a;
            case 22:
                bjl.y it12 = (bjl.y) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                oki.h.D2(((com.revolut.feature.wealth_protection.sso.animation.impl.ui.flow.a) obj3).f96298p);
                return Unit.f186387a;
            case 23:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return zhm.d0.P0(zhm.d0.P0((List) pair.f186385a, new dsd.h()), new bm8.a((dsd.i) obj3, (Set) pair.f186386b, i3));
            case 24:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                aim.e eVarB = zhm.u.b();
                CounterTextDelegate.Model model = new CounterTextDelegate.Model("HEADER_LIST_ID", null, CounterTextDelegate.c.a.f52173a, null, false, null, null, 0, 0, 0, 0, 2042);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model);
                eVarB.addAll(((ws2.c) ((com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.b) obj3).f64361b).f());
                return zhm.u.a(eVarB);
            case 25:
                dt4.f update3 = (dt4.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data model2 = Data.copy$default(update3.f117367a, (dt4.e) obj3, null, false, 6, null);
                Intrinsics.checkNotNullParameter(model2, "model");
                return new dt4.f(model2);
            case 26:
                com.revolut.feature.credit.card.impl.ui.instalment.term.b bVar2 = (com.revolut.feature.credit.card.impl.ui.instalment.term.b) obj3;
                yp4.d result3 = (yp4.d) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                try {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    bVar2.J2(result3.f315784a.intValue());
                    objA = Unit.f186387a;
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th11) {
                    m.Companion companion4 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th11);
                }
                Throwable thA2 = yhm.m.a(objA);
                if (thA2 != null) {
                    hx7.e.n(thA2);
                }
                return Unit.f186387a;
            case 27:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                dt4.l lVar = ((dt4.r) obj3).f117384c;
                aim.e eVarB2 = zhm.u.b();
                pb0 pb0VarB = nb0.b(pb0.Companion, "id_instalment_term_transaction_loading", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(pb0VarB);
                cr crVar = new cr("id_instalment_term_slider", br.CENTER);
                yp0.b.l(crVar, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(crVar);
                List listK = zhm.v.k(new s7("id_instalment_term_item_principal_amount", 0, 0, 0, 0, false, null, 126), new s7("id_instalment_term_item_interest", 0, 0, 0, 0, false, null, 126), new s7("id_instalment_term_item_total_interest", 0, 0, 0, 0, false, null, 126), new s7("id_instalment_term_item_total_to_repay", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB2.addAll(listK);
                return new dt4.m(lVar, zhm.u.a(eVarB2), dt4.j.f117371a);
            case 28:
                com.revolut.feature.insurance_credit.impl.ui.flow.a aVar3 = (com.revolut.feature.insurance_credit.impl.ui.flow.a) obj3;
                com.revolut.feature.insurance_credit.impl.ui.screen.details.a output2 = (com.revolut.feature.insurance_credit.impl.ui.screen.details.a) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof tt7.l) {
                    com.revolut.feature.insurance_credit.impl.ui.flow.a.K2(aVar3, new InsuranceCreditFlowContract$Step.CancellationPrompt(((tt7.l) output2).f274250a));
                } else if (output2 instanceof a.b) {
                    com.revolut.feature.insurance_credit.impl.ui.flow.a.K2(aVar3, InsuranceCreditFlowContract$Step.Documents.f75813a);
                } else if (output2 instanceof tt7.m) {
                    tt7.m mVar = (tt7.m) output2;
                    com.revolut.feature.insurance_credit.impl.ui.flow.a.K2(aVar3, new InsuranceCreditFlowContract$Step.CoverageDetails(mVar.f274251a, mVar.f274252b));
                } else if (output2 instanceof a.C0506a) {
                    com.revolut.feature.insurance_credit.impl.ui.flow.a.K2(aVar3, InsuranceCreditFlowContract$Step.Claim.f75808a);
                } else {
                    if (!(output2 instanceof a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.revolut.feature.insurance_credit.impl.ui.flow.a.K2(aVar3, InsuranceCreditFlowContract$Step.GetHelp.f75814a);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.workflow.chat.impl.ui.flow.a aVar4 = (com.revolut.feature.workflow.chat.impl.ui.flow.a) obj3;
                fth.e it15 = (fth.e) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                if (!(it15 instanceof e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar4.C1(new ExternalDestination.Browser("revolut://app/chat", null));
                aVar4.I2();
                return Unit.f186387a;
        }
    }

    public /* synthetic */ e0(com.revolut.kompot.navigable.vc.modal.a aVar, com.revolut.feature.credit.card.impl.ui.instalment.term.b bVar) {
        this.f116149a = 26;
        this.f116150b = bVar;
    }

    public /* synthetic */ e0(Object obj2, int i) {
        this.f116149a = i;
        this.f116150b = obj2;
    }
}
