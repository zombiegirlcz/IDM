package dlk;

import afa.u;
import bqg.c;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationConfig;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationContent;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationDetails;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationPrompt;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationSuccessSheet;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$Step;
import com.revolut.feature.insurance_embedded.impl.R$string;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_transfer.impl.ui.flow.transfer.JuniorTransferFlowContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.upgrade_to_metal.UpgradeToMetalAtCostOfPremiumScreen;
import dcl.m0;
import dp4.c1;
import dp4.d1;
import dp4.e0;
import dp4.q0;
import dx4.e1;
import dx4.g2;
import efm.d0;
import h93.f0;
import h93.g0;
import io.fotoapparat.exception.camera.CameraException;
import io.reactivex.rxjava3.core.ObservableSource;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import nx4.o0;
import nx4.u0;
import rp0.y;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f115789w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f115790x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(dyb.a aVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 29;
        this.f115789w = aVar;
        this.f115790x = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v58, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e) this.f115789w, (e) this.f115790x, continuation, 0);
            case 1:
                return new k((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e) this.f115789w, (e) this.f115790x, continuation, 1);
            case 2:
                return new k((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e) this.f115789w, (Function0) this.f115790x, continuation, 2);
            case 3:
                k kVar = new k((u) this.f115790x, continuation, 3);
                kVar.f115789w = obj2;
                return kVar;
            case 4:
                k kVar2 = new k((ObservableSource) this.f115790x, continuation, 4);
                kVar2.f115789w = obj2;
                return kVar2;
            case 5:
                return new k((com.revolut.feature.contacts.impl.ui.contact.screen.details.a) this.f115789w, (iy9.b) this.f115790x, continuation, 5);
            case 6:
                return new k((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) this.f115789w, (String) this.f115790x, continuation, 6);
            case 7:
                return new k((com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d) this.f115789w, (LinkAccountFlowContract$Step) this.f115790x, continuation, 7);
            case 8:
                return new k((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.b) this.f115790x, continuation, 8);
            case 9:
                return new k((dp4.l) this.f115789w, (String) this.f115790x, continuation, 9);
            case 10:
                return new k((e0) this.f115789w, (String) this.f115790x, continuation, 10);
            case 11:
                return new k((q0) this.f115789w, (String) this.f115790x, continuation, 11);
            case 12:
                return new k((c1) this.f115789w, (String) this.f115790x, continuation, 12);
            case 13:
                return new k((d1) this.f115789w, (String) this.f115790x, continuation, 13);
            case 14:
                return new k((dpd.k) this.f115789w, (skm.r) this.f115790x, continuation, 14);
            case 15:
                return new k((dqg.e) this.f115789w, (String) this.f115790x, continuation, 15);
            case 16:
                k kVar3 = new k((dr2.m) this.f115790x, continuation, 16);
                kVar3.f115789w = obj2;
                return kVar3;
            case 17:
                return new k((dr2.m) this.f115789w, (CameraException) this.f115790x, continuation, 17);
            case 18:
                return new k((com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a) this.f115789w, (JuniorBankingProfile) this.f115790x, continuation, 18);
            case 19:
                k kVar4 = new k((ds2.i) this.f115790x, continuation, 19);
                kVar4.f115789w = obj2;
                return kVar4;
            case 20:
                return new k((com.revolut.feature.credit.card.impl.ui.instalment.hub.a) this.f115789w, (yx4.b) this.f115790x, continuation, 20);
            case 21:
                k kVar5 = new k((dsd.i) this.f115790x, continuation, 21);
                kVar5.f115789w = obj2;
                return kVar5;
            case 22:
                return new k((dte.f) this.f115789w, (AppTipUIModel) this.f115790x, continuation, 22);
            case 23:
                return new k((dw7.h) this.f115789w, (f0) this.f115790x, continuation, 23);
            case 24:
                return new k((dw7.h) this.f115789w, (f9i.c) this.f115790x, continuation, 24);
            case 25:
                return new k((com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a) this.f115789w, (String) this.f115790x, continuation, 25);
            case 26:
                k kVar6 = new k((pfm.a) this.f115790x, continuation, 26);
                kVar6.f115789w = obj2;
                return kVar6;
            case 27:
                return new k((dx5.n) this.f115789w, (ty0.a) this.f115790x, continuation, 27);
            case 28:
                return new k((dx5.n) this.f115789w, (xi0.b) this.f115790x, continuation, 28);
            default:
                return new k((dyb.a) this.f115789w, (Function1) this.f115790x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v31, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v33, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationDetails] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objB;
        Object objG;
        com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.b bVar;
        Object cancellationConfig;
        hl4.e eVar;
        Object creditLimitCap;
        Object repaymentDetails;
        Object objCreditLimitDecreaseDormancyAcceptance;
        Object statementBottomSheetContent;
        Object objE;
        Object objPostSavingsEligibility;
        ?? arrayList;
        npg.d dVar;
        Object objT;
        Object obj3;
        int i = this.u;
        int i2 = 8;
        int i3 = 13;
        int i5 = 3;
        int i6 = 10;
        int i21 = 0;
        ?? creditCardCancellationDetails = 0;
        Object obj4 = null;
        g2 g2VarJ = null;
        Object obj5 = this.f115790x;
        int i22 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e) this.f115789w;
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.c cVar = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.c(eVar2, (e) obj5, null);
                    this.v = 1;
                    if (eVar2.p2(this, cVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                e eVar3 = (e) obj5;
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar4 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e) this.f115789w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    clk.c cVar2 = eVar4.f103501r;
                    d0 d0VarE = cVar2.f25045a.e();
                    ch6.d dVar2 = new ch6.d(new ce9.a(cVar2, 17), i3);
                    d0VarE.getClass();
                    ufm.i iVar = new ufm.i(d0VarE, dVar2, 0);
                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                    this.v = 1;
                    objB = nim.a.b(iVar, this);
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                if (((Boolean) objB).booleanValue()) {
                    eVar4.f2(new UpgradeToMetalAtCostOfPremiumScreen(), ModalDestination.Style.POPUP.f98311a, new m0(eVar3, eVar4, 25));
                } else {
                    eVar3.invoke();
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar5 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e) this.f115789w;
                    o oVar = new o(eVar5, (Function0) obj5, null);
                    this.v = 1;
                    if (eVar5.p2(this, oVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                wjk.d dVar3 = (wjk.d) this.f115789w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    int i66 = p.f115797a[dVar3.ordinal()];
                    if (i66 == 1) {
                        this.f115789w = null;
                        this.v = 1;
                        if (((u) obj5).invoke(this) == aVar4) {
                            return aVar4;
                        }
                    } else if (i66 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    ProducerScope producerScope = (ProducerScope) this.f115789w;
                    AtomicReference atomicReference = new AtomicReference();
                    ((ObservableSource) obj5).subscribe(new dlm.c(producerScope, atomicReference, i21));
                    d8e.a aVar6 = new d8e.a(atomicReference, i2);
                    this.v = 1;
                    if (com.bumptech.glide.d.d(producerScope, aVar6, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar8 = (com.revolut.feature.contacts.impl.ui.contact.screen.details.a) this.f115789w;
                    dg4.c cVar3 = new dg4.c(aVar8, (iy9.b) obj5, creditCardCancellationDetails, i5);
                    this.v = 1;
                    if (aVar8.p2(this, cVar3) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar10 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) this.f115789w).f101386t, (String) obj5, aVar10, null, this, 4);
                return objX1 == aVar9 ? aVar9 : objX1;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d dVar4 = (com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d) this.f115789w;
                    com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.a aVar12 = new com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.a(dVar4, (LinkAccountFlowContract$Step) obj5, null);
                    this.v = 1;
                    if (dVar4.p2(this, aVar12) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.b bVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.b) obj5;
                    frd.i iVar2 = bVar2.f87600r;
                    this.f115789w = bVar2;
                    this.v = 1;
                    objG = iVar2.g(this);
                    if (objG == aVar13) {
                        return aVar13;
                    }
                    bVar = bVar2;
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.b) this.f115789w;
                    yhm.o.b(obj2);
                    objG = obj2;
                }
                return bVar.C1((aii.u) objG);
            case 9:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    cancellationConfig = ((dp4.l) this.f115789w).f116662a.getCancellationConfig((String) obj5, this);
                    if (cancellationConfig == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    cancellationConfig = obj2;
                }
                hn4.b bVar3 = (hn4.b) cancellationConfig;
                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                String journeyType = bVar3.getJourneyType();
                hl4.e eVar6 = hl4.e.NOT_AVAILABLE;
                hl4.e[] eVarArrValues = hl4.e.values();
                int length = eVarArrValues.length;
                while (true) {
                    if (i21 < length) {
                        eVar = eVarArrValues[i21];
                        if (!a0.z(eVar.name(), journeyType, true)) {
                            i21++;
                        }
                    } else {
                        eVar = null;
                    }
                }
                if (eVar == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("There is no enum value for: ", journeyType));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                } else {
                    eVar6 = eVar;
                }
                hn4.c content = bVar3.getContent();
                hn4.e prompt = content.getPrompt();
                CreditCardCancellationPrompt creditCardCancellationPrompt = new CreditCardCancellationPrompt(prompt.getTitle(), prompt.getSubtitle(), prompt.getIcon(), hx7.e.q(prompt.getConfirmAction()), hx7.e.q(prompt.getCancelAction()));
                CreditCardDialogModel creditCardDialogModelA = hx7.b.A(content.getWithdrawalNotice());
                hn4.f successSheet = content.getSuccessSheet();
                CreditCardCancellationSuccessSheet creditCardCancellationSuccessSheet = new CreditCardCancellationSuccessSheet(successSheet.getTitle(), successSheet.getSubtitle());
                hn4.d terminatedRepayment = content.getTerminatedRepayment();
                if (terminatedRepayment != null) {
                    String title = terminatedRepayment.getTitle();
                    String description = terminatedRepayment.getDescription();
                    List items = terminatedRepayment.getItems();
                    ArrayList arrayList2 = new ArrayList(w.t(items, 10));
                    Iterator it8 = items.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(jo4.a.a((io4.f) it8.next()));
                    }
                    creditCardCancellationDetails = new CreditCardCancellationDetails(title, description, arrayList2);
                }
                return new CreditCardCancellationConfig(eVar6, new CreditCardCancellationContent(creditCardCancellationPrompt, creditCardDialogModelA, creditCardCancellationSuccessSheet, creditCardCancellationDetails));
            case 10:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    creditLimitCap = ((e0) this.f115789w).f116637a.getCreditLimitCap((String) obj5, this);
                    if (creditLimitCap == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    creditLimitCap = obj2;
                }
                return c8g.c.t((kn4.a) creditLimitCap);
            case 11:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    repaymentDetails = ((q0) this.f115789w).f116683a.getRepaymentDetails((String) obj5, this);
                    if (repaymentDetails == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    repaymentDetails = obj2;
                }
                lo4.a aVar17 = (lo4.a) repaymentDetails;
                Intrinsics.checkNotNullParameter(aVar17, "<this>");
                nx4.d1 details = aVar17.getDetails();
                if (details != null) {
                    DateTimeFormatter dateTimeFormatter = o0.f220296a;
                    g2VarJ = o0.j(details, r0.g());
                }
                List<lo4.b> suggestions = aVar17.getSuggestions();
                ArrayList arrayList3 = new ArrayList(w.t(suggestions, 10));
                for (lo4.b bVar4 : suggestions) {
                    Intrinsics.checkNotNullParameter(bVar4, "<this>");
                    xi0.a aVar18 = xi0.b.Companion;
                    String currency = bVar4.getCurrency();
                    aVar18.getClass();
                    arrayList3.add(new wm4.b(new dj0.d(bVar4.getAmount(), xi0.a.a(currency)), bVar4.getTitle()));
                }
                return new wm4.a(g2VarJ, arrayList3);
            case 12:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objCreditLimitDecreaseDormancyAcceptance = ((c1) this.f115789w).f116610a.creditLimitDecreaseDormancyAcceptance((String) obj5, this);
                    if (objCreditLimitDecreaseDormancyAcceptance == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objCreditLimitDecreaseDormancyAcceptance = obj2;
                }
                mn4.a aVar20 = (mn4.a) objCreditLimitDecreaseDormancyAcceptance;
                Intrinsics.checkNotNullParameter(aVar20, "<this>");
                return new kl4.d(kl4.c.valueOf(aVar20.getResult()));
            case 13:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    statementBottomSheetContent = ((d1) this.f115789w).f116632a.getStatementBottomSheetContent((String) obj5, this);
                    if (statementBottomSheetContent == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    statementBottomSheetContent = obj2;
                }
                uo4.a aVar22 = (uo4.a) statementBottomSheetContent;
                Intrinsics.checkNotNullParameter(aVar22, "<this>");
                List items2 = aVar22.getItems();
                ArrayList arrayList4 = new ArrayList();
                Iterator it9 = items2.iterator();
                while (it9.hasNext()) {
                    e1 e1VarP = o0.p((nx4.m0) it9.next(), aVar22.getItems());
                    if (e1VarP != null) {
                        arrayList4.add(e1VarP);
                    }
                }
                u0 actionFooter = aVar22.getActionFooter();
                return new zm4.a(arrayList4, actionFooter != null ? boh.f.v(actionFooter) : null);
            case 14:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    efm.r rVarE = ((dpd.k) this.f115789w).f116870l.E();
                    this.v = 1;
                    objE = nim.a.e(rVarE, this);
                    if (objE == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objE = obj2;
                }
                if (((rp0.p) objE) != null) {
                    ((skm.r) obj5).U("");
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objPostSavingsEligibility = ((dqg.e) this.f115789w).f116981a.postSavingsEligibility((String) obj5, this);
                    if (objPostSavingsEligibility == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objPostSavingsEligibility = obj2;
                }
                bqg.c cVar4 = (bqg.c) objPostSavingsEligibility;
                Intrinsics.checkNotNullParameter(cVar4, "<this>");
                npg.f fVarValueOf = npg.f.valueOf(cVar4.getStatus());
                List<c.a> checks = cVar4.getChecks();
                if (checks != null) {
                    arrayList = new ArrayList();
                    for (c.a aVar25 : checks) {
                        npg.c cVar5 = (npg.c) zpg.b.f324300a.get(aVar25.getName());
                        String status = aVar25.getStatus();
                        npg.d[] dVarArrValues = npg.d.values();
                        int length2 = dVarArrValues.length;
                        int i108 = 0;
                        while (true) {
                            if (i108 < length2) {
                                dVar = dVarArrValues[i108];
                                if (!a0.z(dVar.name(), status, true)) {
                                    i108++;
                                }
                            } else {
                                dVar = null;
                            }
                        }
                        npg.e eVar7 = (cVar5 == null || dVar == null) ? null : new npg.e(cVar5, dVar, aVar25.getLocalisedMessage());
                        if (eVar7 != null) {
                            arrayList.add(eVar7);
                        }
                    }
                } else {
                    arrayList = zhm.f0.f322471a;
                }
                return new npg.g(fVarValueOf, arrayList);
            case 16:
                dr2.m mVar = (dr2.m) obj5;
                Pair pair = (Pair) this.f115789w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                try {
                    if (i109 == 0) {
                        yhm.o.b(obj2);
                        xq2.a aVar27 = (xq2.a) pair.f186385a;
                        vrh.b bVar5 = mVar.f117082q;
                        Intrinsics.h(aVar27);
                        this.f115789w = null;
                        this.v = 1;
                        if (((com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a) bVar5).R2(aVar27, this) == aVar26) {
                            return aVar26;
                        }
                    } else {
                        if (i109 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    break;
                } catch (Throwable th10) {
                    mVar.l1().M0(new aii.i(th10, (aii.a) null, 6));
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                dr2.m mVar2 = (dr2.m) this.f115789w;
                dg4.c cVar6 = new dg4.c(mVar2, (CameraException) obj5, creditCardCancellationDetails, i2);
                this.v = 1;
                Object objB2 = pu7.a.B(mVar2.k, "camera_exception_handling", cVar6, this);
                return objB2 == aVar28 ? aVar28 : objB2;
            case 18:
                com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a aVar29 = (com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a) this.f115789w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    JuniorTransferFlowContract$InputData juniorTransferFlowContract$InputData = aVar29.f77446t;
                    if (juniorTransferFlowContract$InputData.f77443b == hrf.f.OUTGOING && juniorTransferFlowContract$InputData.d) {
                        dg4.c cVar7 = new dg4.c(aVar29, (JuniorBankingProfile) obj5, creditCardCancellationDetails, 9);
                        this.v = 1;
                        if (pu7.a.B(aVar29.k, "NAVIGATE_TO_FIRST_PARTY_MARKETING_PROMPT_IF_AVAILABLE", cVar7, this) == aVar30) {
                            return aVar30;
                        }
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar29.I2();
                return Unit.f186387a;
            case 19:
                y yVar = (y) this.f115789w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    j60.a aVar32 = ((ds2.i) obj5).f117183r;
                    Intrinsics.h(yVar);
                    efm.b bVarG = aVar32.G(yVar);
                    this.f115789w = null;
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.hub.a aVar34 = (com.revolut.feature.credit.card.impl.ui.instalment.hub.a) this.f115789w;
                dg4.c cVar8 = new dg4.c(aVar34, (yx4.b) obj5, creditCardCancellationDetails, i6);
                this.v = 1;
                Object objP2 = aVar34.p2(this, cVar8);
                return objP2 == aVar33 ? aVar33 : objP2;
            case 21:
                List list = (List) this.f115789w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xld.d dVar5 = (xld.d) ((dsd.i) obj5).k;
                this.f115789w = null;
                this.v = 1;
                List listA = ((lmd.e) dVar5).a(list);
                return listA == aVar35 ? aVar35 : listA;
            case 22:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    ate.e eVar8 = ((dte.f) this.f115789w).f117437l;
                    String str = ((AppTipUIModel) obj5).f57725a;
                    this.v = 1;
                    Object objB3 = eVar8.f9038b.b(str, this);
                    if (objB3 != aVar36) {
                        objB3 = Unit.f186387a;
                    }
                    if (objB3 == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                dw7.h hVar = (dw7.h) this.f115789w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    dw7.g gVar = new dw7.g(hVar, (f0) obj5, creditCardCancellationDetails, i22);
                    this.v = 1;
                    objT = do3.q.t(hVar, gVar, this);
                    if (objT == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objT = obj2;
                }
                hVar.f120345q.a(new TextLocalisedClause(R$string.embedded_insurance_scheme_insurance_activation_clipboard_banner_card_number_copied, null, null, 14), ((g0) objT).f150129b, true);
                return Unit.f186387a;
            case 24:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((dw7.h) this.f115789w).G1((f9i.c) obj5, this) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a aVar40 = (com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a) this.f115789w;
                dg4.c cVar9 = new dg4.c(aVar40, (String) obj5, creditCardCancellationDetails, i3);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar40.k, "TransactionsDayNightLimitsDeeplink", cVar9, this);
                return objB4 == aVar39 ? aVar39 : objB4;
            case 26:
                FlowCollector flowCollector = (FlowCollector) this.f115789w;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    this.f115789w = flowCollector;
                    this.v = 1;
                    if (nim.a.a((pfm.a) obj5, this) == aVar41) {
                        return aVar41;
                    }
                } else {
                    if (i119 != 1) {
                        if (i119 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                Unit unit = Unit.f186387a;
                this.f115789w = null;
                this.v = 2;
                if (flowCollector.emit(unit, this) == aVar41) {
                    return aVar41;
                }
                return Unit.f186387a;
            case 27:
                dx5.n nVar = (dx5.n) this.f115789w;
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    be5.e eVar9 = nVar.f120889y;
                    this.v = 1;
                    eVar9.getClass();
                    if (aVar42 == null) {
                        return aVar42;
                    }
                    obj3 = null;
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    obj3 = obj2;
                }
                aii.u uVar = (aii.u) obj3;
                if (uVar != null) {
                    return nVar.C1(uVar);
                }
                return null;
            case 28:
                dx5.n nVar2 = (dx5.n) this.f115789w;
                fim.a aVar43 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    be5.e eVar10 = nVar2.f120889y;
                    nVar2.f120882p.f71547a.f71519b.getClass();
                    this.v = 1;
                    eVar10.getClass();
                    if (aVar43 == null) {
                        return aVar43;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    obj4 = obj2;
                }
                nVar2.x2(new aq4.i(i5, (TextLocalisedClause) obj4));
                return Unit.f186387a;
            default:
                fim.a aVar44 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 != 0) {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                dyb.a aVar45 = (dyb.a) this.f115789w;
                dg4.c cVar10 = new dg4.c(aVar45, (Function1) obj5, (Continuation) null);
                this.v = 1;
                Object objY2 = aVar45.Y2(this, cVar10);
                return objY2 == aVar44 ? aVar44 : objY2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f115789w = obj2;
        this.f115790x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f115790x = obj2;
    }
}
