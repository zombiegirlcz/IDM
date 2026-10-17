package y5b;

import ba6.j0;
import ba6.l0;
import com.revolut.feature.credit.application.impl.network.CreditEntryPointsService;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.donations.api.model.quote.DonationQuoteRequest;
import com.revolut.feature.donations.api.model.quote.DonationQuoteResponse;
import com.revolut.feature.donations.impl.network.service.DonationsService;
import com.revolut.feature.freelancer.impl.network.services.InvoiceTemplateService;
import com.revolut.feature.insurance_credit.impl.data.network.InsuranceCreditService;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import com.revolut.feature.pricing_plans.upgrade_prompt.impl.network.PricingPlanContextualUpsellService;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsPlansService;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsTransactionsService;
import com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName;
import com.revolut.feature.retail.reverywhere.impl.network.ReverywhereService;
import com.revolut.feature.staking.impl.service.pocket.StakingPocketService;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.topup_screen.impl.data.network.service.BrazilInboundStoredMethodDetailsService;
import com.revolut.feature.workflow.engine.shared.data.WorkflowService;
import com.revolut.retail.feature.trading_hours.impl.data.network.TradingHoursService;
import dx4.a1;
import dx4.d1;
import dx4.j1;
import dx4.y0;
import ft3.g1;
import ft3.h1;
import hha.w0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.FlowCollector;
import lr3.a;
import nx4.o0;
import retrofit2.HttpException;
import retrofit2.Response;
import tof.a3;
import va6.j;
import w5b.m5;
import w5b.q1;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f311024w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f311025x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f311025x = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0((c0) this.f311025x, (Continuation) obj4, 0);
                b0Var.f311024w = (od0.i) obj3;
                return b0Var.invokeSuspend(Unit.f186387a);
            case 1:
                b0 b0Var2 = new b0((g0) this.f311025x, (Continuation) obj4, 1);
                b0Var2.f311024w = (od0.i) obj3;
                return b0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                b0 b0Var3 = new b0((y9d.e) this.f311025x, (Continuation) obj4, 2);
                b0Var3.f311024w = (String) obj3;
                return b0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                b0 b0Var4 = new b0((ya6.z) this.f311025x, (Continuation) obj4, 3);
                b0Var4.f311024w = (DonationQuoteRequest) obj3;
                return b0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                b0 b0Var5 = new b0((ya6.z) this.f311025x, (Continuation) obj4, 4);
                b0Var5.f311024w = (ya6.w) obj3;
                return b0Var5.invokeSuspend(Unit.f186387a);
            case 5:
                b0 b0Var6 = new b0((yr3.b) this.f311025x, (Continuation) obj4, 5);
                b0Var6.f311024w = (yr3.a) obj3;
                return b0Var6.invokeSuspend(Unit.f186387a);
            case 6:
                b0 b0Var7 = new b0((ys7.d) this.f311025x, (Continuation) obj4, 6);
                b0Var7.f311024w = (String) obj3;
                return b0Var7.invokeSuspend(Unit.f186387a);
            case 7:
                b0 b0Var8 = new b0((ys7.h) this.f311025x, (Continuation) obj4, 7);
                b0Var8.f311024w = (ys7.f) obj3;
                return b0Var8.invokeSuspend(Unit.f186387a);
            case 8:
                return new b0((yvd.c) this.f311025x, (Continuation) obj4, 8).invokeSuspend(Unit.f186387a);
            case 9:
                b0 b0Var9 = new b0((a3) this.f311025x, (Continuation) obj4, 9);
                b0Var9.f311024w = (FlowCollector) obj2;
                return b0Var9.invokeSuspend(Unit.f186387a);
            case 10:
                b0 b0Var10 = new b0((z34.b) this.f311025x, (Continuation) obj4, 10);
                b0Var10.f311024w = (z34.a) obj3;
                return b0Var10.invokeSuspend(Unit.f186387a);
            case 11:
                return new b0((zeb.g) this.f311025x, (Continuation) obj4, 11).invokeSuspend(Unit.f186387a);
            case 12:
                b0 b0Var11 = new b0((zga.g) this.f311025x, (Continuation) obj4, 12);
                b0Var11.f311024w = (zga.c) obj3;
                return b0Var11.invokeSuspend(Unit.f186387a);
            case 13:
                b0 b0Var12 = new b0((zga.m) this.f311025x, (Continuation) obj4, 13);
                b0Var12.f311024w = (String) obj3;
                return b0Var12.invokeSuspend(Unit.f186387a);
            case 14:
                b0 b0Var13 = new b0((zue.a) this.f311025x, (Continuation) obj4, 14);
                b0Var13.f311024w = (String) obj3;
                return b0Var13.invokeSuspend(Unit.f186387a);
            case 15:
                b0 b0Var14 = new b0((zuh.o) this.f311025x, (Continuation) obj4, 15);
                b0Var14.f311024w = (pil.a) obj3;
                return b0Var14.invokeSuspend(Unit.f186387a);
            default:
                b0 b0Var15 = new b0((zwk.a) this.f311025x, (Continuation) obj4, 16);
                b0Var15.f311024w = (List) obj3;
                return b0Var15.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v78, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v34, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [dx4.a1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object planDashboard;
        Object transactions;
        Object template;
        Object objQuoteDonation;
        Object suggestedPointsAmounts;
        Object creditEntryPoints;
        List listO0;
        ?? arrayList;
        ?? A;
        wp3.c cVar;
        wp3.c cVar2;
        Object insuranceDetails;
        Object stakingPockets;
        dcl.q qVar;
        Object personalDetails;
        Object reverywhereConfig;
        zeb.d dVar;
        Map mapG;
        Object contextualBanner;
        Object contextualNudge;
        Object objFetchStoredMethodDetails;
        Object applicableDocuments;
        Object tradingSessionsForExchanges;
        int i = this.u;
        int i2 = 10;
        j1 j1Var = null;
        oga.f fVar = null;
        w0 w0Var = null;
        wga.i iVar = null;
        Object obj3 = this.f311025x;
        switch (i) {
            case 0:
                od0.i iVar2 = (od0.i) this.f311024w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsPlansService cobrandedCardsPlansService = ((c0) obj3).f311026a;
                    String str = (String) iVar2.f224257a;
                    this.f311024w = null;
                    this.v = 1;
                    planDashboard = cobrandedCardsPlansService.getPlanDashboard(str, this);
                    if (planDashboard == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    planDashboard = obj2;
                }
                return x5b.c.c((q1) planDashboard);
            case 1:
                od0.i iVar3 = (od0.i) this.f311024w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsTransactionsService cobrandedCardsTransactionsService = ((g0) obj3).f311039a;
                    String str2 = (String) iVar3.f224257a;
                    this.f311024w = null;
                    this.v = 1;
                    transactions = cobrandedCardsTransactionsService.getTransactions(str2, this);
                    if (transactions == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    transactions = obj2;
                }
                return xam.a.u((m5) transactions);
            case 2:
                String str3 = (String) this.f311024w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    ybh.c0 c0Var = ((y9d.e) obj3).f311837a;
                    this.f311024w = null;
                    this.v = 1;
                    template = ((InvoiceTemplateService) c0Var.f312297a).getTemplate(str3, this);
                    if (template == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    template = obj2;
                }
                return x9d.a.a((r9d.b) template);
            case 3:
                DonationQuoteRequest donationQuoteRequest = (DonationQuoteRequest) this.f311024w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    DonationsService donationsService = ((ya6.z) obj3).f311988b;
                    String str4 = donationQuoteRequest.f71966b;
                    Intrinsics.checkNotNullParameter(donationQuoteRequest, "<this>");
                    wa6.a aVar5 = new wa6.a(mo3.a.p(donationQuoteRequest.f71965a));
                    this.f311024w = null;
                    this.v = 1;
                    objQuoteDonation = donationsService.quoteDonation(str4, aVar5, this);
                    if (objQuoteDonation == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objQuoteDonation = obj2;
                }
                wa6.b bVar = (wa6.b) objQuoteDonation;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                return new DonationQuoteResponse(mo3.a.o(bVar.getCharityCreditAmount()), new BigDecimal(bVar.getCharityCreditRate()));
            case 4:
                ya6.w wVar = (ya6.w) this.f311024w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    DonationsService donationsService2 = ((ya6.z) obj3).f311988b;
                    String str5 = wVar.f311985a;
                    String str6 = wVar.f311986b;
                    this.f311024w = null;
                    this.v = 1;
                    suggestedPointsAmounts = donationsService2.getSuggestedPointsAmounts(str6, str5, 6, this);
                    if (suggestedPointsAmounts == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    suggestedPointsAmounts = obj2;
                }
                va6.j jVar = (va6.j) suggestedPointsAmounts;
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                String strB = jVar.getQuoteToken();
                List<j.a> listA = jVar.getAmounts();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(listA, 10));
                for (j.a aVar7 : listA) {
                    Intrinsics.checkNotNullParameter(aVar7, "<this>");
                    arrayList2.add(new j0(Double.parseDouble(aVar7.getPointsAmount()), mo3.a.o(aVar7.getAmount())));
                }
                return new l0(strB, arrayList2);
            case 5:
                yr3.a aVar8 = (yr3.a) this.f311024w;
                ?? arrayList3 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    String str7 = aVar8.f316112a;
                    ArrayList arrayList4 = aVar8.f316113b;
                    CreditEntryPointsService creditEntryPointsService = ((yr3.b) obj3).f316115a;
                    if (arrayList4.isEmpty()) {
                        arrayList4 = null;
                    }
                    String strK0 = (arrayList4 == null || (listO0 = zhm.d0.O0(arrayList4)) == null) ? null : zhm.d0.k0(listO0, ",", null, null, 0, null, 62);
                    this.f311024w = null;
                    this.v = 1;
                    creditEntryPoints = creditEntryPointsService.getCreditEntryPoints(str7, strK0, this);
                    if (creditEntryPoints != arrayList3) {
                    }
                    return arrayList3;
                }
                if (i32 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                creditEntryPoints = obj2;
                arrayList3 = new ArrayList();
                for (lr3.a aVar9 : (Iterable) creditEntryPoints) {
                    Intrinsics.checkNotNullParameter(aVar9, "<this>");
                    ft3.j1 j1Var2 = g1.f(aVar9.getProductType(), aVar9.getProductSubtype()).f137810a;
                    gt3.f fVarV = hb9.b.v(j1Var2, aVar9.getProductSubtype());
                    String title = aVar9.getTitle();
                    String description = aVar9.getDescription();
                    it3.j jVar2 = it3.k.Companion;
                    String productMetadataType = aVar9.getProductMetadataType();
                    jVar2.getClass();
                    it3.k kVarA = it3.j.a(productMetadataType);
                    d1 d1VarD = o0.d(aVar9.getImage());
                    nx4.l0 badge = aVar9.getBadge();
                    j1 j1VarF = badge != null ? o0.f(badge) : j1Var;
                    String button = aVar9.getButton();
                    List tags = aVar9.getTags();
                    if (tags != null) {
                        List<a.b> list = tags;
                        arrayList = new ArrayList(zhm.w.t(list, i2));
                        for (a.b bVar2 : list) {
                            String icon = bVar2.getIcon();
                            if (icon != null) {
                                a1.Companion.getClass();
                                A = y0.a(icon);
                            } else {
                                A = j1Var;
                            }
                            String text = bVar2.getText();
                            String color = bVar2.getColor();
                            if (color != null) {
                                wp3.c[] cVarArrValues = wp3.c.values();
                                int length = cVarArrValues.length;
                                int i33 = 0;
                                while (true) {
                                    if (i33 < length) {
                                        cVar2 = cVarArrValues[i33];
                                        if (!kotlin.text.a0.z(cVar2.name(), color, true)) {
                                            i33++;
                                        }
                                    } else {
                                        cVar2 = null;
                                    }
                                }
                                cVar = cVar2;
                            } else {
                                cVar = null;
                            }
                            arrayList.add(new wp3.d(text, A, cVar));
                            j1Var = null;
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = zhm.f0.f322471a;
                    }
                    ?? r262 = arrayList;
                    a.C1130a attributes = aVar9.getAttributes();
                    arrayList3.add(new wp3.e(title, description, j1Var2, fVarV, kVarA, d1VarD, j1VarF, button, r262, attributes != null ? attributes.getFacilityId() : null));
                    i2 = 10;
                    j1Var = null;
                }
                return arrayList3;
            case 6:
                String str8 = (String) this.f311024w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.f311024w = null;
                this.v = 1;
                Object objA = ys7.d.a((ys7.d) obj3, str8, this);
                return objA == aVar10 ? aVar10 : objA;
            case 7:
                ys7.f fVar2 = (ys7.f) this.f311024w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCreditService insuranceCreditService = ((ys7.h) obj3).f316424a;
                    String str9 = fVar2.f316422a;
                    this.f311024w = null;
                    this.v = 1;
                    insuranceDetails = insuranceCreditService.getInsuranceDetails(str9, this);
                    if (insuranceDetails == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    insuranceDetails = obj2;
                }
                return ifk.b.z((zr7.t) insuranceDetails);
            case 8:
                ?? arrayList5 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    yvd.c cVar3 = (yvd.c) obj3;
                    dcl.q qVar2 = cVar3.d;
                    StakingPocketService stakingPocketService = cVar3.f;
                    this.f311024w = qVar2;
                    this.v = 1;
                    stakingPockets = stakingPocketService.getStakingPockets(this);
                    if (stakingPockets != arrayList5) {
                        qVar = qVar2;
                    }
                    return arrayList5;
                }
                if (i66 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (dcl.q) this.f311024w;
                yhm.o.b(obj2);
                stakingPockets = obj2;
                List stakingPockets2 = (List) stakingPockets;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(stakingPockets2, "stakingPockets");
                List<mwd.a> list2 = stakingPockets2;
                arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                for (mwd.a stakingPocketDto : list2) {
                    Intrinsics.checkNotNullParameter(stakingPocketDto, "stakingPocketDto");
                    arrayList5.add(new zvd.b(stakingPocketDto.getId(), stakingPocketDto.getProductId(), mo3.a.o(stakingPocketDto.getStakingBalance()), mo3.a.o(stakingPocketDto.getFiatBalance()), mo3.a.o(stakingPocketDto.getUnstakingLockedBalance())));
                }
                return arrayList5;
            case 9:
                FlowCollector flowCollector = (FlowCollector) this.f311024w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    Set set = dv9.b.f118061a;
                    P2PChatItem p2PChatItemB = dv9.b.b((a3) obj3, null);
                    this.f311024w = null;
                    this.v = 1;
                    if (flowCollector.emit(p2PChatItemB, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                z34.a aVar13 = (z34.a) this.f311024w;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    h1 h1Var = aVar13.f319157a;
                    CreditPluginsService creditPluginsService = ((z34.b) obj3).f319159b;
                    String str10 = h1Var.f137835a;
                    this.f311024w = null;
                    this.v = 1;
                    personalDetails = creditPluginsService.getPersonalDetails(str10, this);
                    if (personalDetails == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    personalDetails = obj2;
                }
                w14.a aVar15 = (w14.a) personalDetails;
                Intrinsics.checkNotNullParameter(aVar15, "<this>");
                return new ev3.a(aVar15.getPartialTaxPayerNumber());
            case 11:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    zeb.g gVar = (zeb.g) obj3;
                    zeb.d dVar2 = gVar.d;
                    ReverywhereService reverywhereService = gVar.f321653a;
                    this.f311024w = dVar2;
                    this.v = 1;
                    reverywhereConfig = reverywhereService.getReverywhereConfig(this);
                    if (reverywhereConfig == aVar16) {
                        return aVar16;
                    }
                    dVar = dVar2;
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (zeb.d) this.f311024w;
                    yhm.o.b(obj2);
                    reverywhereConfig = obj2;
                }
                gfb.d dto = (gfb.d) reverywhereConfig;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(dto, "dto");
                List<gfb.c> list3 = dto.f143387a;
                int iB = q0.b(zhm.w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (gfb.c cVar4 : list3) {
                    ReverywhereMiniAppName.Companion companion = ReverywhereMiniAppName.INSTANCE;
                    String str11 = cVar4.f143383a;
                    companion.getClass();
                    ReverywhereMiniAppName reverywhereMiniAppNameA = ReverywhereMiniAppName.Companion.a(str11);
                    String str12 = cVar4.f143384b;
                    Iterable iterable = cVar4.f143385c;
                    if (iterable == null) {
                        iterable = zhm.f0.f322471a;
                    }
                    Iterable iterable2 = iterable;
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(iterable2, 10));
                    Iterator it8 = iterable2.iterator();
                    while (it8.hasNext()) {
                        arrayList6.add(new TermsScope((String) it8.next()));
                    }
                    Map map = cVar4.d;
                    if (map != null) {
                        mapG = new LinkedHashMap(q0.b(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            mapG.put(entry.getKey(), new TermsScope((String) entry.getValue()));
                        }
                    } else {
                        mapG = r0.g();
                    }
                    linkedHashMap.put(reverywhereMiniAppNameA, new zeb.c(str12, arrayList6, mapG));
                }
                return linkedHashMap;
            case 12:
                zga.g gVar2 = (zga.g) obj3;
                zga.c cVar5 = (zga.c) this.f311024w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    PricingPlanContextualUpsellService pricingPlanContextualUpsellService = gVar2.f322099a;
                    String strName = cVar5.f322092a.name();
                    String str13 = cVar5.f322094c;
                    String str14 = cVar5.d;
                    String str15 = cVar5.e;
                    List<String> list4 = cVar5.f;
                    String str16 = cVar5.f322095g;
                    this.f311024w = cVar5;
                    this.v = 1;
                    contextualBanner = pricingPlanContextualUpsellService.getContextualBanner(strName, str13, str14, str15, list4, str16, this);
                    if (contextualBanner == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    contextualBanner = obj2;
                }
                Response response = (Response) contextualBanner;
                if (response.code() == 204) {
                    return zga.e.f322098a;
                }
                if (!response.isSuccessful()) {
                    IntRange intRange = zga.g.d;
                    int i100 = intRange.f186448a;
                    int i101 = intRange.f186449b;
                    int iCode = response.code();
                    if (i100 > iCode || iCode > i101) {
                        throw new HttpException(response);
                    }
                    gVar2.f322100b.remove(cVar5.f322096h);
                    throw new HttpException(response);
                }
                xga.l lVar = (xga.l) response.body();
                if (lVar != null) {
                    Intrinsics.checkNotNullParameter(lVar, "<this>");
                    xga.h hVar = lVar.f305652a;
                    wga.g gVar3 = new wga.g(vc.o.A(hVar.f305647a));
                    xga.o oVar = hVar.f305648b;
                    oga.c cVarZ = oVar != null ? vc.o.z(oVar) : null;
                    xga.d dVar3 = hVar.f305649c;
                    wga.d dVar4 = new wga.d(gVar3, cVarZ, dVar3.f305645a.length() > 0 ? new wga.a(dVar3.f305645a) : wga.b.f297268a);
                    String str17 = lVar.f305653b.f305651a;
                    w0[] w0VarArrValues = w0.values();
                    int length2 = w0VarArrValues.length;
                    int i102 = 0;
                    while (true) {
                        if (i102 < length2) {
                            w0 w0Var2 = w0VarArrValues[i102];
                            if (kotlin.text.a0.z(w0Var2.name(), str17, true)) {
                                w0Var = w0Var2;
                            } else {
                                i102++;
                            }
                        }
                    }
                    if (w0Var == null) {
                        w0Var = w0.UNKNOWN;
                    }
                    iVar = new wga.i(dVar4, new wga.e(w0Var));
                }
                if (iVar != null) {
                    return new zga.d(iVar);
                }
                throw new IllegalArgumentException("successful response must have the response body");
            case 13:
                zga.m mVar = (zga.m) obj3;
                String str18 = (String) this.f311024w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    PricingPlanContextualUpsellService pricingPlanContextualUpsellService2 = mVar.f322104a;
                    this.f311024w = str18;
                    this.v = 1;
                    contextualNudge = pricingPlanContextualUpsellService2.getContextualNudge(this);
                    if (contextualNudge == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    contextualNudge = obj2;
                }
                Response response2 = (Response) contextualNudge;
                if (response2.code() == 204) {
                    return zga.j.f322103a;
                }
                if (!response2.isSuccessful()) {
                    IntRange intRange2 = zga.m.d;
                    int i104 = intRange2.f186448a;
                    int i105 = intRange2.f186449b;
                    int iCode2 = response2.code();
                    if (i104 > iCode2 || iCode2 > i105) {
                        throw new HttpException(response2);
                    }
                    mVar.f322105b.remove("pricing_plan_contextual_nudge_" + str18);
                    throw new HttpException(response2);
                }
                xga.u uVar = (xga.u) response2.body();
                if (uVar != null) {
                    Intrinsics.checkNotNullParameter(uVar, "<this>");
                    oga.j jVarA = vc.o.A(uVar.f305662a);
                    xga.o oVar2 = uVar.f305663b;
                    oga.c cVarZ2 = oVar2 != null ? vc.o.z(oVar2) : null;
                    oga.e eVarU = x5d.b.u(uVar.f305664c);
                    boolean z = uVar.d;
                    xga.s sVar = uVar.e;
                    fVar = new oga.f(jVarA, cVarZ2, eVarU, z, sVar != null ? x5d.b.u(sVar) : null);
                }
                if (fVar != null) {
                    return new zga.i(fVar);
                }
                throw new IllegalArgumentException("successful response must have the response body");
            case 14:
                String str19 = (String) this.f311024w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    BrazilInboundStoredMethodDetailsService brazilInboundStoredMethodDetailsService = ((zue.a) obj3).f325440a;
                    this.f311024w = null;
                    this.v = 1;
                    objFetchStoredMethodDetails = brazilInboundStoredMethodDetailsService.fetchStoredMethodDetails(str19, this);
                    if (objFetchStoredMethodDetails == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objFetchStoredMethodDetails = obj2;
                }
                return ebm.a.I((qo6.c) objFetchStoredMethodDetails);
            case 15:
                pil.a aVar20 = (pil.a) this.f311024w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    WorkflowService workflowService = ((zuh.o) obj3).f325482c;
                    String str20 = aVar20.f236615a.f297794a;
                    String str21 = aVar20.f236616b;
                    this.f311024w = null;
                    this.v = 1;
                    applicableDocuments = workflowService.getApplicableDocuments(str20, str21, this);
                    if (applicableDocuments == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    applicableDocuments = obj2;
                }
                return v13.d.w((bvh.c) applicableDocuments);
            default:
                List<String> list5 = (List) this.f311024w;
                ?? arrayList7 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    TradingHoursService tradingHoursService = ((zwk.a) obj3).f325973a;
                    this.f311024w = null;
                    this.v = 1;
                    tradingSessionsForExchanges = tradingHoursService.getTradingSessionsForExchanges(list5, this);
                    if (tradingSessionsForExchanges != arrayList7) {
                    }
                    return arrayList7;
                }
                if (i108 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                tradingSessionsForExchanges = obj2;
                Iterable iterable3 = (Iterable) tradingSessionsForExchanges;
                arrayList7 = new ArrayList(zhm.w.t(iterable3, 10));
                Iterator it9 = iterable3.iterator();
                while (it9.hasNext()) {
                    arrayList7.add(cj9.c.U((cxk.h) it9.next()));
                }
                return arrayList7;
        }
    }
}
