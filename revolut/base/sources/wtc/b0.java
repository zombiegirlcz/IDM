package wtc;

import com.revolut.data.model.Data;
import com.revolut.data.network.services.TopupService;
import com.revolut.feature.apm.core.impl.topup_requests.network.ApmTopupRequestsService;
import com.revolut.feature.external_accounts.impl.domain.india.netbanking.model.IndiaNetBankingInstitutions;
import com.revolut.feature.external_accounts.impl.domain.india.netbanking.model.IndiaNetBankingProvider;
import com.revolut.feature.external_accounts.impl.repository.network.IndiaNetBankingService;
import com.revolut.feature.freelancer.impl.network.services.InvoiceTemplateService;
import com.revolut.feature.junior_allowance.impl.service.JuniorAllowanceStandingOrderService;
import com.revolut.feature.payment.counterparty.impl.data.network.PaymentCounterpartyService;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.pro.onboarding.impl.data.network.ProPostActivationFlowService;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsBillingService;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsPlanAdditionalValueService;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsWidgetService;
import com.revolut.feature.semi_independent_onboarding.impl.data.SemiIndependentOnboardingConfigService;
import com.revolut.feature.semi_independent_onboarding.impl.data.SemiIndependentOnboardingInvitationService;
import com.revolut.feature.staking.impl.service.consent.AutoStakingConsentService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import w5b.u7;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f299857w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, Continuation continuation) {
        super(i, continuation);
        this.u = 0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                int iIntValue = ((Number) obj3).intValue();
                b0 b0Var = new b0(3, (Continuation) obj4);
                b0Var.f299857w = (Data) obj2;
                b0Var.v = iIntValue;
                return b0Var.invokeSuspend(Unit.f186387a);
            case 1:
                return new b0((wvd.b) this.f299857w, (Continuation) obj4, 1).invokeSuspend(Unit.f186387a);
            case 2:
                return new b0((wz1.f) this.f299857w, (Continuation) obj4, 2).invokeSuspend(Unit.f186387a);
            case 3:
                return new b0((x0d.b) this.f299857w, (Continuation) obj4, 3).invokeSuspend(Unit.f186387a);
            case 4:
                return new b0((x0d.e) this.f299857w, (Continuation) obj4, 4).invokeSuspend(Unit.f186387a);
            case 5:
                return new b0((xe7.d) this.f299857w, (Continuation) obj4, 5).invokeSuspend(Unit.f186387a);
            case 6:
                return new b0((xg8.j) this.f299857w, (Continuation) obj4, 6).invokeSuspend(Unit.f186387a);
            case 7:
                return new b0((xia.b) this.f299857w, (Continuation) obj4, 7).invokeSuspend(Unit.f186387a);
            case 8:
                return new b0((xvj.e) this.f299857w, (Continuation) obj4, 8).invokeSuspend(Unit.f186387a);
            case 9:
                return new b0((y5b.p) this.f299857w, (Continuation) obj4, 9).invokeSuspend(Unit.f186387a);
            case 10:
                return new b0((y5b.u) this.f299857w, (Continuation) obj4, 10).invokeSuspend(Unit.f186387a);
            case 11:
                return new b0((y5b.i0) this.f299857w, (Continuation) obj4, 11).invokeSuspend(Unit.f186387a);
            case 12:
                return new b0((y9d.e) this.f299857w, (Continuation) obj4, 12).invokeSuspend(Unit.f186387a);
            case 13:
                return new b0((yn9.c) this.f299857w, (Continuation) obj4, 13).invokeSuspend(Unit.f186387a);
            case 14:
                return new b0((yue.b) this.f299857w, (Continuation) obj4, 14).invokeSuspend(Unit.f186387a);
            case 15:
                return new b0((zb8.b) this.f299857w, (Continuation) obj4, 15).invokeSuspend(Unit.f186387a);
            default:
                return new b0((zh6.c) this.f299857w, (Continuation) obj4, 16).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v30, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String strA;
        via.a aVar = null;
        switch (this.u) {
            case 0:
                Data data = (Data) this.f299857w;
                int i = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    Object content = data.getContent();
                    return new Data(content != null ? new Integer(((Number) content).intValue() + i) : null, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                AutoStakingConsentService autoStakingConsentService = ((wvd.b) this.f299857w).f300314c;
                this.v = 1;
                Object autoStakingConsent = autoStakingConsentService.getAutoStakingConsent(this);
                return autoStakingConsent == aVar3 ? aVar3 : autoStakingConsent;
            case 2:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ApmTopupRequestsService apmTopupRequestsService = ((wz1.f) this.f299857w).f301343a;
                    this.v = 1;
                    obj2 = apmTopupRequestsService.getTopupRequests(this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                arrayList = new ArrayList();
                Iterator it8 = ((Iterable) obj2).iterator();
                while (it8.hasNext()) {
                    p02.a aVarY = oc.c.y((yz1.c) it8.next());
                    if (aVarY != null) {
                        arrayList.add(aVarY);
                    }
                }
                return arrayList;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                SemiIndependentOnboardingConfigService semiIndependentOnboardingConfigService = ((x0d.b) this.f299857w).f301566a;
                this.v = 1;
                Object supervisionConfig = semiIndependentOnboardingConfigService.getSupervisionConfig(this);
                return supervisionConfig == aVar4 ? aVar4 : supervisionConfig;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                SemiIndependentOnboardingInvitationService semiIndependentOnboardingInvitationService = ((x0d.e) this.f299857w).f301571a;
                this.v = 1;
                Object guardianInvitations = semiIndependentOnboardingInvitationService.getGuardianInvitations(this);
                return guardianInvitations == aVar5 ? aVar5 : guardianInvitations;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xe7.d dVar = (xe7.d) this.f299857w;
                this.v = 1;
                Object objA = xe7.d.a(dVar, this);
                return objA == aVar6 ? aVar6 : objA;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xg8.j jVar = (xg8.j) this.f299857w;
                this.v = 1;
                Object objA2 = xg8.j.a(jVar, this);
                return objA2 == aVar7 ? aVar7 : objA2;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    ProPostActivationFlowService proPostActivationFlowService = ((xia.b) this.f299857w).f306315a;
                    this.v = 1;
                    obj2 = proPostActivationFlowService.getPostActivationFlow(this);
                    if (obj2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Response response = (Response) obj2;
                if (response.code() == 204) {
                    return via.a.NONE;
                }
                if (!response.isSuccessful()) {
                    return via.a.ORGANIC;
                }
                wia.a aVar9 = (wia.a) response.body();
                if (aVar9 != null && (strA = aVar9.getIb.b.Flow java.lang.String()) != null) {
                    via.a[] aVarArrValues = via.a.values();
                    int length = aVarArrValues.length;
                    int i33 = 0;
                    while (true) {
                        if (i33 < length) {
                            via.a aVar10 = aVarArrValues[i33];
                            if (kotlin.text.a0.z(aVar10.name(), strA, true)) {
                                aVar = aVar10;
                            } else {
                                i33++;
                            }
                        }
                    }
                    if (aVar != null) {
                        return aVar;
                    }
                }
                return via.a.ORGANIC;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xvj.e eVar = (xvj.e) this.f299857w;
                this.v = 1;
                Serializable serializableB = eVar.b(this);
                return serializableB == aVar11 ? aVar11 : serializableB;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsBillingService cobrandedCardsBillingService = ((y5b.p) this.f299857w).f311057a;
                    this.v = 1;
                    obj2 = cobrandedCardsBillingService.getBilling(this);
                    if (obj2 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return x5b.a.a((w5b.u) obj2);
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsPlanAdditionalValueService cobrandedCardsPlanAdditionalValueService = ((y5b.u) this.f299857w).f311064a;
                    this.v = 1;
                    obj2 = cobrandedCardsPlanAdditionalValueService.getCurrentPlanBenefits(this);
                    if (obj2 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return x5b.b.a((w5b.v0) obj2);
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsWidgetService cobrandedCardsWidgetService = ((y5b.i0) this.f299857w).f311045a;
                    this.v = 1;
                    obj2 = cobrandedCardsWidgetService.getWidget(this);
                    if (obj2 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return x5b.i.a((u7) obj2);
            case 12:
                Object arrayList2 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    ybh.c0 c0Var = ((y9d.e) this.f299857w).f311837a;
                    this.v = 1;
                    obj2 = ((InvoiceTemplateService) c0Var.f312297a).getTemplates(this);
                    if (obj2 != arrayList2) {
                    }
                    return arrayList2;
                }
                if (i92 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Iterable iterable = (Iterable) obj2;
                arrayList2 = new ArrayList(zhm.w.t(iterable, 10));
                Iterator it9 = iterable.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(x9d.a.a((r9d.b) it9.next()));
                }
                return arrayList2;
            case 13:
                Object arrayList3 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    PaymentCounterpartyService paymentCounterpartyService = ((yn9.c) this.f299857w).f315271a;
                    this.v = 1;
                    obj2 = paymentCounterpartyService.getPaymentCounterparties(this);
                    if (obj2 != arrayList3) {
                    }
                    return arrayList3;
                }
                if (i96 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                arrayList3 = new ArrayList();
                Iterator it10 = ((Iterable) obj2).iterator();
                while (it10.hasNext()) {
                    PaymentCounterpartyInfo paymentCounterpartyInfoA = xn9.a.a((wn9.a) it10.next());
                    if (paymentCounterpartyInfoA != null) {
                        arrayList3.add(paymentCounterpartyInfoA);
                    }
                }
                return arrayList3;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                TopupService topupService = ((yue.b) this.f299857w).f317016a;
                this.v = 1;
                Object allowedTravelCountries = topupService.getAllowedTravelCountries(this);
                return allowedTravelCountries == aVar15 ? aVar15 : allowedTravelCountries;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    JuniorAllowanceStandingOrderService juniorAllowanceStandingOrderService = ((zb8.b) this.f299857w).f320843c;
                    this.v = 1;
                    obj2 = juniorAllowanceStandingOrderService.getAllowanceStandingOrders(this);
                    if (obj2 == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return kotlin.jvm.internal.s.G((List) obj2);
            default:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    IndiaNetBankingService indiaNetBankingService = ((zh6.c) this.f299857w).f322239a;
                    this.v = 1;
                    obj2 = indiaNetBankingService.getNetBankingInstitutions(this);
                    if (obj2 == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yh6.b bVar = (yh6.b) obj2;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                List<yh6.c> listB = bVar.getTopupMethodDetails().getProviders().getPopular();
                ArrayList arrayList4 = new ArrayList(zhm.w.t(listB, 10));
                for (yh6.c cVar : listB) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    arrayList4.add(new IndiaNetBankingProvider(cVar.getId(), cVar.getName(), cVar.getLogo()));
                }
                List<yh6.c> listA = bVar.getTopupMethodDetails().getProviders().getOthers();
                ArrayList arrayList5 = new ArrayList(zhm.w.t(listA, 10));
                for (yh6.c cVar2 : listA) {
                    Intrinsics.checkNotNullParameter(cVar2, "<this>");
                    arrayList5.add(new IndiaNetBankingProvider(cVar2.getId(), cVar2.getName(), cVar2.getLogo()));
                }
                return new IndiaNetBankingInstitutions(arrayList4, arrayList5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f299857w = obj2;
    }
}
