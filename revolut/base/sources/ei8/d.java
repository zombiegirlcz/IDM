package ei8;

import cn3.b;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.domain.joint_account.JointAccountData;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardActionParcel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelAction;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelParcel;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.JuniorPersonalDataCreationFlowContract$Step;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubInputData;
import com.revolut.feature.shops.api.navigation.AdsFullScreenPromptType;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$TabPagerItem;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import d67.p;
import d67.q;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import eif.j;
import ej6.i0;
import ej6.n;
import elf.a1;
import ggk.g1;
import ip0.u20;
import ip0.w20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import klj.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import qje.o;
import til.m;
import tj2.f;
import zh9.d1;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;
import zm3.l;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f126452b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f126451a = i;
        this.f126452b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        com.revolut.kompot.common.b bVar;
        CreditCardModelAction dialogue;
        int i = 2;
        int i2 = 26;
        int i3 = 27;
        boolean z = true;
        z = true;
        int i5 = 0;
        Continuation continuation = null;
        switch (this.f126451a) {
            case 0:
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e eVar = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e) this.f126452b;
                u result = (u) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if ((result instanceof p) || Intrinsics.f(result, q.f111462a) || Intrinsics.f(result, r.f111463a) || Intrinsics.f(result, t.f111465a)) {
                    eVar.B2();
                } else {
                    if (!Intrinsics.f(result, s.f111464a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.r2(eVar.f77039t);
                    oki.h.t2(eVar, eVar.f77039t, JuniorPersonalDataCreationFlowContract$Step.InviteJunior.f77008a, false, null, false, 12);
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.b) this.f126452b;
                cn3.b outputData = (cn3.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof cn3.c) {
                    List list = ((cn3.c) outputData).f25344a;
                    ArrayList<zm3.a> arrayList = new ArrayList(w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((cn3.e) it8.next()).f25347a);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (zm3.a aVar : arrayList) {
                        l lVar = aVar instanceof l ? (l) aVar : null;
                        if (lVar != null) {
                            arrayList2.add(lVar);
                        }
                    }
                    List listB0 = d0.B0(arrayList, arrayList2);
                    if (!listB0.isEmpty()) {
                        IllegalStateException illegalStateException = new IllegalStateException("Unsupported contacts type: " + listB0);
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    } else if (arrayList2.isEmpty()) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Empty selected contacts");
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                    } else {
                        bVar2.l2(new j(bVar2, arrayList2, continuation, i), new yi5.b(i2));
                    }
                } else if (outputData instanceof b.a) {
                    c84.t.J2(bVar2, false, null, null, 7);
                }
                return Unit.f186387a;
            case 2:
                com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d dVar = (com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) this.f126452b;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var3);
                dVar.C2(new n(error));
                return Boolean.FALSE;
            case 3:
                return ej6.l.a((ej6.l) obj2, null, null, null, null, null, null, (i0) this.f126452b, 63);
            case 4:
                return ej6.l.a((ej6.l) obj2, null, null, null, (OutboundPaymentExtras) this.f126452b, null, null, null, LDSFile.EF_SOD_TAG);
            case 5:
                ej9.n nVar = (ej9.n) this.f126452b;
                List transactionRepayment = (List) obj2;
                Intrinsics.checkNotNullParameter(transactionRepayment, "transactionRepayment");
                List<dj9.t> list2 = transactionRepayment;
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                for (dj9.t tVar : list2) {
                    String transactionId = nVar.f126819a;
                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    arrayList3.add(new d1(tVar.getInstalmentIndex(), tVar.getAmount(), tVar.getFee(), tVar.getLateInterest(), transactionId, tVar.getPlanId()));
                }
                return arrayList3;
            case 6:
                AdsFullScreenPromptType currentPrompt = (AdsFullScreenPromptType) this.f126452b;
                ejd.e updateState = (ejd.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                updateState.getClass();
                Intrinsics.checkNotNullParameter(currentPrompt, "currentPrompt");
                return new ejd.e(currentPrompt);
            case 7:
                com.revolut.feature.atm.impl.ui.redesign.details.a aVar2 = (com.revolut.feature.atm.impl.ui.redesign.details.a) this.f126452b;
                m mVar = aVar2.f63169w;
                tj2.f output = (tj2.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof tj2.e) {
                    bVar = m.a(mVar, new WorkflowConfiguration.Workflow(((tj2.e) output).f271602a, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), null, 6);
                } else if (output instanceof tj2.d) {
                    bVar = m.a(mVar, new WorkflowConfiguration.CreateWorkflow(((tj2.d) output).f271601a, null, 62), null, 6);
                } else {
                    if (!Intrinsics.f(output, f.a.f271603a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new com.revolut.kompot.common.b(aVar2.e1(new rtc.g(new SecurityHubInputData(new SecurityHubStartScreen.TransactionsLimitChange(com.revolut.feature.wallets.api.module.a.ATM_ROLLING_DAY.a(), false), true, null, true))), (ModalDestination.Style) null, 6);
                }
                aVar2.C1(bVar);
                return Unit.f186387a;
            case 8:
                ek7.p pVar = (ek7.p) this.f126452b;
                ek7.i updateState2 = (ek7.i) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                mj7.b bVar3 = pVar.f126974r;
                return ek7.i.a(updateState2, bVar3.b(), bVar3.a(), null, null, false, false, false, 4089);
            case 9:
                ek7.i iVar = (ek7.i) this.f126452b;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ek7.q.b(iVar);
            case 10:
                TabCryptoFlowContract$TabPagerItem tabCryptoFlowContract$TabPagerItem = (TabCryptoFlowContract$TabPagerItem) this.f126452b;
                o updateState3 = (o) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return o.a(updateState3, tabCryptoFlowContract$TabPagerItem.f89793a, null, false, null, 14);
            case 11:
                ekf.j jVar = (ekf.j) this.f126452b;
                dii.g result2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof dii.e) {
                    jVar.T2(new ebg.o(jVar, continuation, 14), new yi5.b(i3));
                }
                return Unit.f186387a;
            case 12:
                ekf.m mVar2 = (ekf.m) this.f126452b;
                dii.g result3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof dii.f) {
                    mVar2.T2(new ebg.o(mVar2, continuation, 15), new yi5.b(i3));
                }
                return Unit.f186387a;
            case 13:
                a1 a1Var = (a1) this.f126452b;
                dii.g outputData2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof dii.f) {
                    a1Var.T2(new ebg.o(a1Var, continuation, 16), new yi5.b(i3));
                }
                return Unit.f186387a;
            case 14:
                tjg.e eVar2 = (tjg.e) this.f126452b;
                zm0.d it9 = (zm0.d) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = it9.f323321c;
                if (obj3 != eVar2 && obj3 != null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                ((eli.l) this.f126452b).f127486c = null;
                return Unit.f186387a;
            case 16:
                mlj.i iVar2 = (mlj.i) this.f126452b;
                elj.g update = (elj.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return elj.g.a(update, null, null, iVar2, 3);
            case 17:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b bVar4 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b) this.f126452b;
                k result4 = (k) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                bVar4.H2(bVar4.u, new elj.l(result4, i5));
                return Unit.f186387a;
            case 18:
                em3.e eVar3 = (em3.e) this.f126452b;
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                eVar3.C2(new el3.h(error2));
                return Boolean.TRUE;
            case 19:
                emk.k kVar = (emk.k) this.f126452b;
                g1 layout = (g1) obj2;
                Intrinsics.checkNotNullParameter(layout, "layout");
                return nim.a.v(rd0.e.b(kVar.f127688q.r(layout.f143718a)), new d(layout, 20));
            case 20:
                g1 g1Var = (g1) this.f126452b;
                hha.d pricingPlan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                return new Pair(pricingPlan, g1Var);
            case 21:
                com.revolut.feature.backgroundpicker.impl.ui.flow.theme_customisation.a aVar3 = (com.revolut.feature.backgroundpicker.impl.ui.flow.theme_customisation.a) this.f126452b;
                Intrinsics.checkNotNullParameter((em2.g) obj2, "it");
                aVar3.C2(aii.q.f5292a);
                return Unit.f186387a;
            case 22:
                en8.e eVar4 = (en8.e) this.f126452b;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                Data data = eVar4.f127764b;
                u20 u20Var = new u20("JUNIOR_SAVING_LOADING", w20.PICTURE_80DP);
                yp0.b.l(u20Var, 0, 0, 0, 0, null, false, 63);
                return new en8.i(zhm.u.c(u20Var), en8.p.a((JuniorBankingProfile) data.getContent()), null, f0.f322471a);
            case 23:
                coa.a aVar4 = (coa.a) this.f126452b;
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                boolean z3 = aVar4.f;
                int i6 = z3 ? 1 : 2;
                int i21 = z3 ? 1 : 3;
                if (aVar4.f25501b == null) {
                    return f0.f322471a;
                }
                if (z3) {
                    return d0.E0(eoa.e.a(i21, i6), eoa.e.a(i6, 0));
                }
                return d0.E0(eoa.e.a(2, i6 + i21), d0.E0(eoa.e.a(i21, i6), eoa.e.a(i6, 0)));
            case 24:
                com.revolut.feature.tax_residency.impl.flows.submit.a aVar5 = (com.revolut.feature.tax_residency.impl.flows.submit.a) this.f126452b;
                Throwable error3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error3, "error");
                gom.e.f145194a.e(error3);
                aVar5.G2(new eoe.d(error3));
                return Boolean.FALSE;
            case 25:
                com.revolut.feature.bank_account_switching.impl.ui.review_joint.a aVar6 = (com.revolut.feature.bank_account_switching.impl.ui.review_joint.a) this.f126452b;
                gq2.i result5 = (gq2.i) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (result5 instanceof gq2.i) {
                    aVar6.l2(new ep2.k(aVar6, continuation, i5), new yi5.b(i2));
                }
                return Unit.f186387a;
            case 26:
                return ep2.f.a((ep2.f) obj2, zi0.c.P((gp2.a) this.f126452b, false, null, 3));
            case 27:
                ep7.k kVar2 = (ep7.k) this.f126452b;
                ty0.a clickData = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                kVar2.C1(sl7.b.a(clickData.f275446b));
                return Unit.f186387a;
            case 28:
                wn2.a selection = (wn2.a) this.f126452b;
                eq2.e update2 = (eq2.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                JointAccountData jointAccountData = update2.f128225a;
                mn2.a serviceType = update2.f128227c;
                wn2.d dVar2 = update2.d;
                Intrinsics.checkNotNullParameter(jointAccountData, "jointAccountData");
                Intrinsics.checkNotNullParameter(selection, "selection");
                Intrinsics.checkNotNullParameter(serviceType, "serviceType");
                return new eq2.e(jointAccountData, selection, serviceType, dVar2);
            default:
                com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d dVar3 = (com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d) this.f126452b;
                zl4.f result6 = (zl4.f) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                if (result6 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardActionParcel creditCardActionParcel = result6.f323182a;
                Intrinsics.checkNotNullParameter(creditCardActionParcel, "<this>");
                if (creditCardActionParcel instanceof CreditCardModelParcel.ContextualParcel) {
                    dialogue = new CreditCardModelAction.Contextual(((CreditCardModelParcel.ContextualParcel) creditCardActionParcel).f68852a);
                } else if (creditCardActionParcel instanceof CreditCardModelParcel.DeeplinkParcel) {
                    CreditCardModelParcel.DeeplinkParcel deeplinkParcel = (CreditCardModelParcel.DeeplinkParcel) creditCardActionParcel;
                    dialogue = new CreditCardModelAction.Deeplink(deeplinkParcel.f68853a, deeplinkParcel.f68854b);
                } else {
                    if (!(creditCardActionParcel instanceof CreditCardModelParcel.DialogParcel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dialogue = new CreditCardModelAction.Dialogue(((CreditCardModelParcel.DialogParcel) creditCardActionParcel).f68855a);
                }
                dVar3.J2(dialogue);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f126451a = i;
        this.f126452b = obj3;
    }
}
