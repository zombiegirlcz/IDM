package au6;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxCalendarEventsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxProfileService;
import com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.JuniorCardProfileScreenContract;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class a3 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9494w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f9495x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9496y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f9496y = obj2;
    }

    private final Object b(Object obj2) throws Throwable {
        Flow flowI;
        btk.n nVar = (btk.n) this.f9496y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f9494w;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.v;
            nel.n nVar2 = (nel.n) this.f9495x;
            if (nVar2.d()) {
                vrl.g gVar = nVar.f18646b;
                String securityRef = nVar2.f214596b;
                Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                xi0.b.Companion.getClass();
                flowI = nim.a.v(vkm.q.q(nim.a.v(((vrl.m) gVar).f(new InvestOrdersParams.OrdersByCurrency(xi0.a.a(securityRef), null, null, 30), loadingStrategy), new vq0.g(19))), btk.l.f18643a);
            } else {
                flowI = zi0.c.i(Boolean.FALSE);
            }
            Flow flowE = boh.f.e(flowI, new a26.s(nVar, nVar2, 10));
            this.v = null;
            this.f9495x = null;
            this.f9494w = 1;
            vkm.q.w(flowCollector);
            Object objCollect = flowE.collect(new bq5.o(flowCollector, 7), this);
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
            if (objCollect == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                a3 a3Var = new a3((c3) this.f9496y, (Continuation) obj4, 0);
                a3Var.f9495x = (String) obj3;
                return a3Var.invokeSuspend(Unit.f186387a);
            case 1:
                a3 a3Var2 = new a3((r3) this.f9496y, (Continuation) obj4, 1);
                a3Var2.f9495x = (String) obj3;
                return a3Var2.invokeSuspend(Unit.f186387a);
            case 2:
                a3 a3Var3 = new a3((Continuation) obj4, (aui.j) this.f9496y, 2);
                a3Var3.v = (FlowCollector) obj2;
                a3Var3.f9495x = obj3;
                return a3Var3.invokeSuspend(Unit.f186387a);
            case 3:
                a3 a3Var4 = new a3((Continuation) obj4, (aw1.q) this.f9496y, 3);
                a3Var4.v = (FlowCollector) obj2;
                a3Var4.f9495x = obj3;
                return a3Var4.invokeSuspend(Unit.f186387a);
            case 4:
                a3 a3Var5 = new a3((Continuation) obj4, (com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f) this.f9496y, 4);
                a3Var5.v = (FlowCollector) obj2;
                a3Var5.f9495x = obj3;
                return a3Var5.invokeSuspend(Unit.f186387a);
            case 5:
                a3 a3Var6 = new a3((Continuation) obj4, (com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) this.f9496y, 5);
                a3Var6.v = (FlowCollector) obj2;
                a3Var6.f9495x = obj3;
                return a3Var6.invokeSuspend(Unit.f186387a);
            case 6:
                a3 a3Var7 = new a3((Continuation) obj4, (com.revolut.feature.rev_points.impl.ui.trophy_room.home.b) this.f9496y, 6);
                a3Var7.v = (FlowCollector) obj2;
                a3Var7.f9495x = obj3;
                return a3Var7.invokeSuspend(Unit.f186387a);
            case 7:
                a3 a3Var8 = new a3((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.a) this.f9496y, 7);
                a3Var8.v = (FlowCollector) obj2;
                a3Var8.f9495x = obj3;
                return a3Var8.invokeSuspend(Unit.f186387a);
            case 8:
                a3 a3Var9 = new a3((Continuation) obj4, (b47.h) this.f9496y, 8);
                a3Var9.v = (FlowCollector) obj2;
                a3Var9.f9495x = obj3;
                return a3Var9.invokeSuspend(Unit.f186387a);
            case 9:
                a3 a3Var10 = new a3((Continuation) obj4, (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) this.f9496y, 9);
                a3Var10.v = (FlowCollector) obj2;
                a3Var10.f9495x = obj3;
                return a3Var10.invokeSuspend(Unit.f186387a);
            case 10:
                a3 a3Var11 = new a3((Continuation) obj4, (b4c.u) this.f9496y, 10);
                a3Var11.v = (FlowCollector) obj2;
                a3Var11.f9495x = obj3;
                return a3Var11.invokeSuspend(Unit.f186387a);
            case 11:
                a3 a3Var12 = new a3((Continuation) obj4, (com.revolut.feature_move_money.impl.amount.c) this.f9496y, 11);
                a3Var12.v = (FlowCollector) obj2;
                a3Var12.f9495x = obj3;
                return a3Var12.invokeSuspend(Unit.f186387a);
            case 12:
                a3 a3Var13 = new a3((Continuation) obj4, (b8e.m) this.f9496y, 12);
                a3Var13.v = (FlowCollector) obj2;
                a3Var13.f9495x = obj3;
                return a3Var13.invokeSuspend(Unit.f186387a);
            case 13:
                a3 a3Var14 = new a3((Continuation) obj4, (r10.t) this.f9496y, 13);
                a3Var14.v = (FlowCollector) obj2;
                a3Var14.f9495x = obj3;
                return a3Var14.invokeSuspend(Unit.f186387a);
            case 14:
                a3 a3Var15 = new a3((Continuation) obj4, (bb8.j) this.f9496y, 14);
                a3Var15.v = (FlowCollector) obj2;
                a3Var15.f9495x = obj3;
                return a3Var15.invokeSuspend(Unit.f186387a);
            case 15:
                a3 a3Var16 = new a3((Continuation) obj4, (bcj.l) this.f9496y, 15);
                a3Var16.v = (FlowCollector) obj2;
                a3Var16.f9495x = obj3;
                return a3Var16.invokeSuspend(Unit.f186387a);
            case 16:
                a3 a3Var17 = new a3((Continuation) obj4, (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) this.f9496y, 16);
                a3Var17.v = (FlowCollector) obj2;
                a3Var17.f9495x = obj3;
                return a3Var17.invokeSuspend(Unit.f186387a);
            case 17:
                a3 a3Var18 = new a3((Continuation) obj4, (bfh.o) this.f9496y, 17);
                a3Var18.v = (FlowCollector) obj2;
                a3Var18.f9495x = obj3;
                return a3Var18.invokeSuspend(Unit.f186387a);
            case 18:
                a3 a3Var19 = new a3((Continuation) obj4, (bg2.x) this.f9496y, 18);
                a3Var19.v = (FlowCollector) obj2;
                a3Var19.f9495x = obj3;
                return a3Var19.invokeSuspend(Unit.f186387a);
            case 19:
                a3 a3Var20 = new a3((Continuation) obj4, (bh5.e) this.f9496y, 19);
                a3Var20.v = (FlowCollector) obj2;
                a3Var20.f9495x = obj3;
                return a3Var20.invokeSuspend(Unit.f186387a);
            case 20:
                a3 a3Var21 = new a3((Continuation) obj4, (bh8.u) this.f9496y, 20);
                a3Var21.v = (FlowCollector) obj2;
                a3Var21.f9495x = obj3;
                return a3Var21.invokeSuspend(Unit.f186387a);
            case 21:
                a3 a3Var22 = new a3((Continuation) obj4, (bi2.o) this.f9496y, 21);
                a3Var22.v = (FlowCollector) obj2;
                a3Var22.f9495x = obj3;
                return a3Var22.invokeSuspend(Unit.f186387a);
            case 22:
                a3 a3Var23 = new a3((Continuation) obj4, (com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.a) this.f9496y, 22);
                a3Var23.v = (FlowCollector) obj2;
                a3Var23.f9495x = obj3;
                return a3Var23.invokeSuspend(Unit.f186387a);
            case 23:
                a3 a3Var24 = new a3((Continuation) obj4, (bmb.u) this.f9496y, 23);
                a3Var24.v = (FlowCollector) obj2;
                a3Var24.f9495x = obj3;
                return a3Var24.invokeSuspend(Unit.f186387a);
            case 24:
                a3 a3Var25 = new a3((Continuation) obj4, (bmj.h) this.f9496y, 24);
                a3Var25.v = (FlowCollector) obj2;
                a3Var25.f9495x = obj3;
                return a3Var25.invokeSuspend(Unit.f186387a);
            case 25:
                a3 a3Var26 = new a3((Continuation) obj4, (bo8.b0) this.f9496y, 25);
                a3Var26.v = (FlowCollector) obj2;
                a3Var26.f9495x = obj3;
                return a3Var26.invokeSuspend(Unit.f186387a);
            case 26:
                a3 a3Var27 = new a3((Continuation) obj4, (com.revolut.feature.wealth_discovery.impl.collection.most_traded.a) this.f9496y, 26);
                a3Var27.v = (FlowCollector) obj2;
                a3Var27.f9495x = obj3;
                return a3Var27.invokeSuspend(Unit.f186387a);
            case 27:
                a3 a3Var28 = new a3((Continuation) obj4, (btk.k) this.f9496y, 27);
                a3Var28.v = (FlowCollector) obj2;
                a3Var28.f9495x = obj3;
                return a3Var28.invokeSuspend(Unit.f186387a);
            case 28:
                a3 a3Var29 = new a3((Continuation) obj4, (btk.n) this.f9496y, 28);
                a3Var29.v = (FlowCollector) obj2;
                a3Var29.f9495x = obj3;
                return a3Var29.invokeSuspend(Unit.f186387a);
            default:
                a3 a3Var30 = new a3((Continuation) obj4, (bvd.a) this.f9496y, 29);
                a3Var30.v = (FlowCollector) obj2;
                a3Var30.f9495x = obj3;
                return a3Var30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        od0.h hVar;
        Object taxCalendarEvent;
        od0.h hVar2;
        Object taxProfile;
        md6.e eVar;
        Flow flowV;
        xzg.z yVar;
        Flow v1Var;
        int i = this.u;
        vkm.s1 s1Var = vkm.s1.f290118a;
        int i2 = 12;
        int i3 = 20;
        int i5 = 6;
        w4l.h loadingStrategy = w4l.h.f294642c;
        int i6 = 4;
        int i21 = 3;
        w4l.i loadingStrategy2 = w4l.i.f294643c;
        Continuation continuation = null;
        Object obj3 = this.f9496y;
        int i22 = 1;
        switch (i) {
            case 0:
                String str = (String) this.f9495x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.f9494w;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    hVar = od0.i.Companion;
                    FreelancerTaxCalendarEventsService freelancerTaxCalendarEventsService = ((c3) obj3).f9507c;
                    this.f9495x = null;
                    this.v = hVar;
                    this.f9494w = 1;
                    taxCalendarEvent = freelancerTaxCalendarEventsService.getTaxCalendarEvent(str, this);
                    if (taxCalendarEvent == aVar) {
                        return aVar;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od0.h hVar3 = (od0.h) this.v;
                    yhm.o.b(obj2);
                    hVar = hVar3;
                    taxCalendarEvent = obj2;
                }
                TaxHubCalendarEvent taxHubCalendarEventD = bu6.f.d((wt6.b) taxCalendarEvent);
                hVar.getClass();
                return od0.h.a(taxHubCalendarEventD);
            case 1:
                String str2 = (String) this.f9495x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.f9494w;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    hVar2 = od0.i.Companion;
                    FreelancerTaxProfileService freelancerTaxProfileService = ((r3) obj3).f9613b;
                    this.f9495x = null;
                    this.v = hVar2;
                    this.f9494w = 1;
                    taxProfile = freelancerTaxProfileService.getTaxProfile(str2, this);
                    if (taxProfile == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od0.h hVar4 = (od0.h) this.v;
                    yhm.o.b(obj2);
                    hVar2 = hVar4;
                    taxProfile = obj2;
                }
                FreelancerTaxProfile freelancerTaxProfileB = bu6.f.b((wt6.g) taxProfile);
                hVar2.getClass();
                return od0.h.a(freelancerTaxProfileB);
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.f9494w;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.v;
                    mti.a aVar4 = ((aui.j) obj3).o;
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    pti.e eVar2 = aVar4.f208843a;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.d dVarB = eVar2.d.b(Unit.f186387a, loadingStrategy2);
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar3) {
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
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.f9494w;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.v;
                    rv1.r rVar = (rv1.r) ((aw1.q) obj3).o;
                    vkm.y yVarE = rd0.e.e(nim.a.u(new rv1.p(rVar, null), rVar.c()), zhm.h0.f322473a, new a82.q(3, 5, null));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector2, yVarE, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.f9494w;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.v;
                    xq2.a aVar7 = (xq2.a) ((Pair) this.f9495x).f186385a;
                    com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f fVar = (com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f) obj3;
                    Intrinsics.h(aVar7);
                    efm.r rVarX = fVar.f79662p.h(aVar7).x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                    vkm.y yVarE2 = rd0.e.e(new vkm.q0(new vkm.y(new com.revolut.feature.payments.profile.impl.ui_kompot.scanner.c(fVar, null), rd0.e.b(rVarX)), new com.revolut.feature.payments.profile.impl.ui_kompot.scanner.d(fVar, null), 1), zhm.h0.f322473a, new com.revolut.feature.payments.profile.impl.ui_kompot.scanner.e(fVar, null));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector3, yVarE2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.f9494w;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.v;
                    Flow flowD = ((com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) obj3).z.d(new mga.b(null));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector4, flowD, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                com.revolut.feature.rev_points.impl.ui.trophy_room.home.b bVar = (com.revolut.feature.rev_points.impl.ui.trophy_room.home.b) obj3;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.f9494w;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.v;
                    w4l.k loadingStrategy3 = (w4l.k) this.f9495x;
                    vkm.d dVarB2 = rd0.e.b(bVar.f83928p.c(loadingStrategy3 instanceof w4l.i));
                    u29.d dVar = bVar.o;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    Continuation continuation2 = null;
                    v0b.b bVarH = ta6.a.h(dVarB2, xam.a.h(new u29.c(dVar, loadingStrategy3, continuation2, i22), f39.c.b(dVar.f276567b)), rd0.e.b(bVar.f83929q.q()), new b1c.o(i6, 0, continuation2));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector5, bVarH, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.a aVar10 = (com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.a) obj3;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.f9494w;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.v;
                    v0f.p pVarC = aVar10.f74166r.c();
                    Flow flowB = ((zfc.d) aVar10.f74168t).b(loadingStrategy);
                    et6.c1 c1Var = aVar10.o;
                    c1Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    Continuation continuation3 = null;
                    akg.n nVarV = nim.a.v(nim.a.u(new a2c.c(2, 11, continuation3), zh9.u0.m(zh9.u0.i(pVarC, flowB, nim.a.v(((zfc.d) c1Var.f129204a).a(), new et6.w(20))), zh9.u0.m(new vkm.v1(new b27.k(aVar10, continuation3, 0)), new vkm.v1(new b27.k(aVar10, continuation3, i22))))), new a26.p(aVar10, 7));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector6, nVarV, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                b47.h hVar5 = (b47.h) obj3;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.f9494w;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) this.v;
                    r10.f fVar2 = hVar5.o;
                    String taxProfileId = hVar5.f12197q.f74365a;
                    fVar2.getClass();
                    Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    r3 r3Var = (r3) fVar2.b;
                    r3Var.getClass();
                    Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    t38.e eVarM = zh9.u0.m(r3Var.f.b(taxProfileId, loadingStrategy), hVar5.f12196p.j(loadingStrategy));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector7, eVarM, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar13 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) obj3;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.f9494w;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.v;
                    CfdOrderData cfdOrderData = (CfdOrderData) this.f9495x;
                    boolean z = cfdOrderData.e.compareTo(BigDecimal.ZERO) == 0;
                    t2b.f fVar3 = aVar13.f82251r;
                    f8l.e eVarB = z ? f8l.e.MARKET : u2b.c.b(cfdOrderData.f82170b);
                    b4b.p pVar = aVar13.o;
                    String str3 = pVar.f12238c;
                    nel.n nVar = pVar.f12237b;
                    bfl.g gVar = cfdOrderData.f82169a;
                    CfdOpenPositionsDelegate$OpenPositions cfdOpenPositionsDelegate$OpenPositions = cfdOrderData.d;
                    Flow flowA = fVar3.a(eVarB, str3, nVar, gVar, cfdOpenPositionsDelegate$OpenPositions.f82237a, cfdOpenPositionsDelegate$OpenPositions.f82238b, cfdOrderData.f82171c, z ? null : cfdOrderData.e);
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector8, flowA, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                b4c.u uVar = (b4c.u) obj3;
                kpj.e eVar3 = uVar.f12282q;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.f9494w;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) this.v;
                    w4l.k loadingStrategy4 = (w4l.k) this.f9495x;
                    k3c.p pVar2 = (k3c.p) uVar.o;
                    pVar2.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    akg.n nVarV2 = nim.a.v(pVar2.f180682c.b(Unit.f186387a, loadingStrategy2), b4c.r.f12276a);
                    eVar3.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    go.g gVarI = zi0.c.i(kpj.e.f188254c);
                    akg.n nVarV3 = nim.a.v(uVar.f12281p.b(Intrinsics.f(loadingStrategy4, loadingStrategy2)), b4c.s.f12277a);
                    eVar3.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    uf0.b bVarG = yh5.b.g(nVarV2, gVarI, nVarV3, ((zfc.d) eVar3.f188256b).b(loadingStrategy4));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector9, bVarG, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                com.revolut.feature_move_money.impl.amount.c cVar = (com.revolut.feature_move_money.impl.amount.c) obj3;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.f9494w;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.v;
                    yhm.r rVar2 = (yhm.r) this.f9495x;
                    b6i.v vVar = (b6i.v) rVar2.f314201a;
                    wkm.l lVarC = ((q6i.a0) cVar.I).c(vVar.f12831a, vVar.f12832b, vVar.f12833c, (TransferAvailability) rVar2.f314202b, (CreditCardInterest) rVar2.f314203c);
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    vkm.q.w(flowCollector10);
                    Object objCollect = lVarC.collect(new ahe.f0(flowCollector10, cVar, vVar, i6), this);
                    if (objCollect != aVar16) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar16) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.f9494w;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) this.v;
                    Subaccount subaccount = (Subaccount) this.f9495x;
                    b8e.m mVar = (b8e.m) obj3;
                    i4b.f fVar4 = mVar.f13223t;
                    xi0.b currency = subaccount.getCurrency();
                    SubaccountType subaccountType = mVar.u.f89058b;
                    if (subaccountType instanceof SubaccountType.Personal) {
                        eVar = md6.e.PERSONAL_SUBACCOUNT;
                    } else if (subaccountType instanceof SubaccountType.Group) {
                        eVar = md6.e.GROUP_SUBACCOUNT;
                    } else if (subaccountType instanceof SubaccountType.Junior) {
                        eVar = md6.e.YOUTH_SUBACCOUNT;
                    } else if (subaccountType instanceof SubaccountType.Pro) {
                        eVar = md6.e.PRO_SUBACCOUNT;
                    } else if (subaccountType instanceof SubaccountType.ProTax) {
                        eVar = md6.e.PRO_TAX_SUBACCOUNT;
                    } else if (subaccountType instanceof SubaccountType.Joint) {
                        eVar = md6.e.JOINT_SUBACCOUNT;
                    } else {
                        if (!(subaccountType instanceof SubaccountType.Teen)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVar = md6.e.TEEN_SUBACCOUNT;
                    }
                    vkm.y yVarJ = fVar4.j(new md6.a(eVar, currency, (md6.d) null, (md6.f) null, 60));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector11, yVarJ, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.f9494w;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.v;
                    int i105 = ba8.a.f13983a[((bla.c) this.f9495x).ordinal()];
                    if (i105 == 1) {
                        flowV = nim.a.v(hj8.a.e((hj8.a) ((r10.t) obj3).f250858b, loadingStrategy), ba8.b.f13984a);
                    } else {
                        if (i105 != 2 && i105 != 3 && i105 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowV = zi0.c.i(Boolean.FALSE);
                    }
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector12, flowV, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.f9494w;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.v;
                    wkm.l lVarE = hj8.a.e(((bb8.j) obj3).o, (w4l.k) this.f9495x);
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector13, lVarE, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.f9494w;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.v;
                    Pair pair = (Pair) this.f9495x;
                    xi0.b currency2 = (xi0.b) pair.f186385a;
                    wk5.a blockchain = (wk5.a) pair.f186386b;
                    rbj.f fVar5 = ((bcj.l) obj3).f14463n;
                    fVar5.getClass();
                    Intrinsics.checkNotNullParameter(currency2, "currency");
                    Intrinsics.checkNotNullParameter(blockchain, "blockchain");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    sfm.b bVar2 = new sfm.b(new ufm.i(eda.f.a(fVar5.f253130b, currency2, null, null, 6), new rbf.c(new r7i.r(27), 11), 1), new rbf.c(new qz9.o(fVar5, 14, blockchain, loadingStrategy), i2), 2);
                    Intrinsics.checkNotNullExpressionValue(bVar2, "flatMapObservable(...)");
                    vkm.d dVarB3 = rd0.e.b(bVar2);
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector14, dVarB3, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar21 = (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) obj3;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.f9494w;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.v;
                    q7c.g gVar2 = aVar21.o;
                    PayWithAnyControllerDescriptor$InputData payWithAnyControllerDescriptor$InputData = aVar21.f84726r;
                    u6c.n nVar2 = new u6c.n(payWithAnyControllerDescriptor$InputData.e, payWithAnyControllerDescriptor$InputData.f, payWithAnyControllerDescriptor$InputData.f84430a, payWithAnyControllerDescriptor$InputData.f84431b, payWithAnyControllerDescriptor$InputData.f84432c, payWithAnyControllerDescriptor$InputData.f84436l, payWithAnyControllerDescriptor$InputData.f84435j, payWithAnyControllerDescriptor$InputData.k, 128);
                    k6c.a aVar22 = k6c.b.Companion;
                    akg.n nVarD = gVar2.d(nVar2);
                    cge.h hVar6 = ((q7c.l) aVar21.f84724p).f242823b;
                    ProductSpaceIdentifier.Favourites spaceIdentifier = ProductSpaceIdentifier.Favourites.f89744c;
                    com.revolut.feature.tab.accounts.models.spaces.b productSubspace = com.revolut.feature.tab.accounts.models.spaces.b.f89758c;
                    Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
                    Intrinsics.checkNotNullParameter(productSubspace, "productSubspace");
                    vge.y2 y2Var = hVar6.f23955b;
                    y2Var.getClass();
                    Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
                    Intrinsics.checkNotNullParameter(productSubspace, "productSubspace");
                    Continuation continuation4 = null;
                    ahe.l lVar = new ahe.l(new t38.e(y2Var.b(new vge.v2(spaceIdentifier, productSubspace.a())), 24, new vkm.v1(new c5a.m0(hVar6, new c7e.i(spaceIdentifier, productSubspace, 15), zhm.f0.f322471a, continuation4, 7)), new bwb.n(hVar6, continuation4, 9)), i2);
                    bec.n0 n0Var = new bec.n0(3, 0, null);
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    vkm.q.w(flowCollector15);
                    Object objG = mif.e0.g(this, s1Var, new vdl.c1((Function3) n0Var, continuation4, 15), flowCollector15, new Flow[]{nVarD, lVar});
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG == obj4) {
                        return obj4;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.f9494w;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.v;
                    vkm.d dVarB4 = rd0.e.b(((ael.k) ((bfh.o) obj3).o).f((String) this.f9495x));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector16, dVarB4, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.f9494w;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.v;
                    Pair pair2 = (Pair) this.f9495x;
                    Flow flowA2 = vo9.a.a(((bg2.x) obj3).v, (io3.d) pair2.f186385a, (AccountId) pair2.f186386b, 4);
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector17, flowA2, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.f9494w;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.v;
                    qg5.c cVar2 = (qg5.c) ((bh5.e) obj3).f15229p;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    akg.n nVarV4 = nim.a.v(cVar2.f245653c.a(Unit.f186387a, loadingStrategy2), bh5.d.f15228a);
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector18, nVarV4, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                bh8.u uVar2 = (bh8.u) obj3;
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.f9494w;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) this.v;
                    akg.n nVarV5 = nim.a.v(uVar2.f15259q.m((2 & 1) != 0 ? w4l.h.f294642c : w4l.i.f294643c, false), bh8.s.f15256a);
                    vkm.d dVarB5 = rd0.e.b(uVar2.f15262t.a(false));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    vkm.q.w(flowCollector19);
                    Object objG2 = mif.e0.g(this, s1Var, new vdl.c1(bh8.t.f15257a, (Continuation) null, 15), flowCollector19, new Flow[]{nVarV5, dVarB5});
                    if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                        objG2 = Unit.f186387a;
                    }
                    if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                        objG2 = Unit.f186387a;
                    }
                    if (objG2 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.f9494w;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.v;
                    bi2.f fVar6 = ((bi2.o) obj3).o;
                    Continuation continuation5 = null;
                    vkm.y yVarE3 = rd0.e.e(nim.a.u(new b96.d(fVar6, continuation5, 14), vw1.b.c(fVar6.f15380a)), zhm.h0.f322473a, new a82.q(3, i5, continuation5));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector20, yVarE3, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.a aVar27 = (com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.a) obj3;
                JuniorCardProfileScreenContract.Input input = aVar27.o;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.f9494w;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.v;
                    w4l.k kVar = (w4l.k) this.f9495x;
                    int i115 = 2;
                    akg.n nVarV6 = nim.a.v(zh9.u0.i(hj8.a.a(aVar27.f77091p, input.f77090a, kVar), rd0.e.b(aVar27.f77092q.a0(input.f77090a, kVar.equals(loadingStrategy2))), new bbk.z(((com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a) aVar27.f77093r).v.B(new yi5.b(i115)), i115)), bj8.g.f15586a);
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector21, nVarV6, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                bmb.u uVar3 = (bmb.u) obj3;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.f9494w;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.v;
                    vkm.d dVarB6 = rd0.e.b(uVar3.f16803p.q());
                    ijb.a aVar30 = uVar3.o;
                    ncd.h savingsProductAccountType = ncd.h.PERSONAL;
                    olb.d dVar2 = (olb.d) aVar30;
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(savingsProductAccountType, "savingsProductAccountType");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    akg.n nVarV7 = nim.a.v(zh9.u0.i(dVarB6, dVar2.j(ncd.g.a(), ncd.m.a(), savingsProductAccountType, loadingStrategy), nim.a.A(nim.a.v(uVar3.f16804q.l(loadingStrategy), new blh.y(10)), new blh.y(11))), new bmb.t(uVar3));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector22, nVarV7, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.f9494w;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = (FlowCollector) this.v;
                    bmj.h hVar7 = (bmj.h) obj3;
                    dfj.i1 i1Var = hVar7.f16842p;
                    String phoneNumberId = hVar7.o.f101365a.f100470a;
                    i1Var.getClass();
                    Intrinsics.checkNotNullParameter(phoneNumberId, "phoneNumberId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    nfj.u0 u0Var = (nfj.u0) i1Var.f113996a;
                    u0Var.getClass();
                    Intrinsics.checkNotNullParameter(phoneNumberId, "phoneNumberId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.d dVarB7 = u0Var.f215056h.b(phoneNumberId, loadingStrategy2);
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector23, dVarB7, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                bo8.b0 b0Var = (bo8.b0) obj3;
                bo8.c cVar3 = b0Var.o;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.f9494w;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) this.v;
                    w4l.k loadingStrategy5 = (w4l.k) this.f9495x;
                    akg.n nVarV8 = nim.a.v(zh9.u0.i(hj8.a.a(b0Var.f17299p, cVar3.f17307a, loadingStrategy5), b0Var.f17302s.c(cVar3.f17307a, loadingStrategy5), new bbk.z(((com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.a) b0Var.f17305x).f77275q.B(new zmb.c(16)), i2)), new bng.a(8));
                    akg.n nVarV9 = nim.a.v(zh9.u0.m(rd0.e.b(te8.z.b(b0Var.f17300q, cVar3.f17307a, loadingStrategy5.equals(loadingStrategy2), 4)), b0Var.f17301r.e(cVar3.f17307a, loadingStrategy5)), new bng.a(7));
                    fmc.z zVar = b0Var.f17303t;
                    String juniorId = cVar3.f17307a;
                    zVar.getClass();
                    Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                    Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                    gb8.b bVar3 = (gb8.b) zVar.f136369b;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                    a07.p pVar3 = new a07.p(nim.a.v(bVar3.e.b(Unit.f186387a, loadingStrategy5), new jb8.a(juniorId, i22)), 9);
                    Continuation continuation6 = null;
                    vkm.v1 v1Var2 = new vkm.v1(new bo8.x(b0Var, continuation6, 0));
                    int i119 = 3;
                    a35.k kVar2 = new a35.k(i119, 20, continuation6);
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    uf0.b bVarG2 = yh5.b.g(nVarV8, nVarV9, pVar3, new bo8.w(yh5.b.e(rd0.e.e(v1Var2, h0Var, kVar2), rd0.e.e(new vkm.v1(new bo8.x(b0Var, continuation6, i22)), h0Var, new a35.k(i119, 21, continuation6)), rd0.e.e(new vkm.v1(new bo8.x(b0Var, continuation6, 2)), h0Var, new a35.k(i119, 22, continuation6))), 0));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector24, bVarG2, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.f9494w;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) this.v;
                    boh.r rVar3 = (boh.r) this.f9495x;
                    xzg.b0 b0Var2 = rVar3.f17479a;
                    xzg.d0 d0Var = rVar3.f17480b;
                    com.revolut.feature.wealth_discovery.impl.collection.most_traded.a aVar34 = (com.revolut.feature.wealth_discovery.impl.collection.most_traded.a) obj3;
                    su9.c cVar4 = aVar34.o;
                    MostTradedAssetsDestination mostTradedAssetsDestination = aVar34.f96132t;
                    Intrinsics.checkNotNullParameter(mostTradedAssetsDestination, "<this>");
                    if (mostTradedAssetsDestination instanceof MostTradedAssetsDestination.Stocks) {
                        yVar = new xzg.y(null);
                    } else if (mostTradedAssetsDestination instanceof MostTradedAssetsDestination.Cfd) {
                        yVar = new xzg.y(xzg.x.CFD);
                    } else {
                        if (!(mostTradedAssetsDestination instanceof MostTradedAssetsDestination.Crypto)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yVar = xzg.w.f310036a;
                    }
                    vkm.d dVarB8 = rd0.e.b(pd.b.r(nim.a.w(cVar4.i(yVar, b0Var2, mostTradedAssetsDestination instanceof MostTradedAssetsDestination.Cfd ? xzg.e0.IGNORE_EMPTY : xzg.e0.ALLOW_EMPTY), new bhl.g(d0Var, i3)), new bnj.n(aVar34, b0Var2, i6)));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector25, dVarB8, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                btk.k kVar3 = (btk.k) obj3;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.f9494w;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = (FlowCollector) this.v;
                    if (((Boolean) this.f9495x).booleanValue()) {
                        btk.n nVar3 = kVar3.f18639m;
                        String ref2 = kVar3.f18638l.f18628a;
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        efm.r rVarX2 = ((ael.k) nVar3.f18645a).e(ref2).x();
                        Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
                        v1Var = new vkm.q0(vkm.q.Q(rd0.e.b(rVarX2), new a3(continuation, nVar3, 28)), new btd.e(kVar3, continuation, i21), 1);
                    } else {
                        v1Var = new vkm.v1(new brc.h(kVar3, continuation, i5));
                    }
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector26, v1Var, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                return b(obj2);
            default:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.f9494w;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector27 = (FlowCollector) this.v;
                    xi0.b displayCurrency = (xi0.b) this.f9495x;
                    bwd.c cVar5 = ((bvd.a) obj3).f19020b;
                    Intrinsics.h(displayCurrency);
                    String str4 = displayCurrency.f306286a;
                    cVar5.getClass();
                    Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
                    vkm.d dVarB9 = cVar5.f.b(str4, ((qe0.s) cVar5.e.getValue()).c(str4 + "_STAKING_REWARD_TIMESTAMP", loadingStrategy2));
                    this.v = null;
                    this.f9495x = null;
                    this.f9494w = 1;
                    if (vkm.q.u(flowCollector27, dVarB9, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f9496y = obj2;
    }
}
