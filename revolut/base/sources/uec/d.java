package uec;

import a83.o0;
import afl.t0;
import androidx.room.util.DBUtil;
import au6.s0;
import b9.w2;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreenContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import dcl.m0;
import dcl.n0;
import et6.a1;
import fdl.z0;
import gim.i;
import hcl.b1;
import hcl.e1;
import hcl.h1;
import hcl.k1;
import hcl.l1;
import hcl.p1;
import hcl.s1;
import hcl.t1;
import hcl.v0;
import hcl.w1;
import hcl.y0;
import hwi.a0;
import hwi.s0;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jel.y1;
import kjk.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import nii.z;
import oel.h;
import oel.j;
import oel.k;
import oel.m;
import q75.n;
import q7c.s;
import qfm.i2;
import sgm.e3;
import tof.i7;
import tof.ta;
import tof.u9;
import tof.x1;
import twb.b0;
import tx0.z4;
import uf7.f0;
import uk2.v;
import uwi.u;
import uy6.p;
import uyh.g0;
import v17.r;
import vdl.c1;
import vdl.d0;
import vkm.q;
import vkm.v1;
import vkm.y;
import yhm.o;
import zh9.u0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f279334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f279335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f279336y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f279335x = obj2;
        this.f279336y = obj3;
    }

    private final Object b(Object obj2) {
        b1 b1Var;
        Iterator it8;
        t1 t1Var;
        String ref2 = (String) this.f279334w;
        oel.a aVar = (oel.a) this.f279335x;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            n0 n0Var = ((d0) this.f279336y).f287952b;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Instant instant = aVar.d;
            Instant instant2 = aVar.i;
            String str = aVar.f224618g;
            String str2 = aVar.f224619h;
            t0 t0Var = aVar.e;
            jo3.b bVarA = hx7.a.A(t0Var.f4647a);
            jo3.b bVarA2 = hx7.a.A(t0Var.f4648b);
            boolean z = aVar.f;
            oel.e eVar = aVar.f224615a;
            String str3 = eVar.f224630a;
            ArrayList arrayList = eVar.f224631b;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                oel.d dVar = (oel.d) it9.next();
                arrayList2.add(new e1(dVar.f224627a, dVar.f224628b, dVar.f224629c));
                it9 = it9;
                ref2 = ref2;
            }
            String str4 = ref2;
            h1 h1Var = new h1(str3, arrayList2);
            oel.c cVar = aVar.f224616b;
            String str5 = cVar.f224624a;
            ArrayList arrayList3 = cVar.f224625b;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            for (Iterator it10 = arrayList3.iterator(); it10.hasNext(); it10 = it10) {
                m mVar = (m) it10.next();
                arrayList4.add(new w1(mVar.f224650a, mVar.f224651b));
            }
            ArrayList arrayList5 = cVar.f224626c;
            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
            Iterator it11 = arrayList5.iterator();
            while (it11.hasNext()) {
                oel.f fVar = (oel.f) it11.next();
                arrayList6.add(new p1(fVar.f224632a, fVar.f224633b, fVar.f224634c, fVar.d));
                it11 = it11;
                instant = instant;
                instant2 = instant2;
            }
            Instant instant3 = instant;
            Instant instant4 = instant2;
            b1 b1Var2 = new b1(arrayList4, arrayList6, str5);
            ArrayList arrayList7 = aVar.f224617c;
            ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
            Iterator it12 = arrayList7.iterator();
            while (it12.hasNext()) {
                k kVar = (k) it12.next();
                if (kVar instanceof j) {
                    s1 s1Var = s1.INFORMATIVE;
                    j jVar = (j) kVar;
                    String str6 = jVar.f224644a;
                    String str7 = jVar.f224645b;
                    ArrayList arrayList9 = jVar.f224646c;
                    b1Var = b1Var2;
                    ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                    Iterator it13 = arrayList9.iterator();
                    while (it13.hasNext()) {
                        oel.i iVar = (oel.i) it13.next();
                        arrayList10.add(new k1(iVar.f224641a, iVar.f224642b, iVar.f224643c));
                        it13 = it13;
                        it12 = it12;
                    }
                    it8 = it12;
                    t1Var = new t1(s1Var, str6, str7, arrayList10, null);
                } else {
                    b1Var = b1Var2;
                    it8 = it12;
                    if (!(kVar instanceof h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s1 s1Var2 = s1.CHRONOLOGICAL;
                    h hVar = (h) kVar;
                    String str8 = hVar.f224638a;
                    String str9 = hVar.f224639b;
                    ArrayList<oel.g> arrayList11 = hVar.f224640c;
                    ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                    for (oel.g gVar : arrayList11) {
                        arrayList12.add(new y0(gVar.f224636b, gVar.f224637c, gVar.f224635a));
                        str8 = str8;
                    }
                    t1Var = new t1(s1Var2, str8, str9, null, arrayList12);
                }
                arrayList8.add(t1Var);
                b1Var2 = b1Var;
                it12 = it8;
            }
            b1 b1Var3 = b1Var2;
            Instant instant5 = aVar.f224620j;
            oel.b bVar = aVar.k;
            v0 v0Var = bVar != null ? new v0(bVar.f224622a, hx7.a.A(bVar.f224623b)) : null;
            oel.b bVar2 = aVar.f224621l;
            l1 l1Var = new l1(str4, instant3, instant4, str, str2, bVarA, bVarA2, z, h1Var, b1Var3, arrayList8, instant5, v0Var, bVar2 != null ? new v0(bVar2.f224622a, hx7.a.A(bVar2.f224623b)) : null);
            this.f279334w = null;
            this.f279335x = null;
            this.v = 1;
            n0Var.getClass();
            if (DBUtil.performSuspending(n0Var.f113041a, false, true, new m0(n0Var, l1Var, 0), this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                d dVar = new d((Continuation) obj4, (e) this.f279336y, 0);
                dVar.f279334w = (FlowCollector) obj2;
                dVar.f279335x = obj3;
                return dVar.invokeSuspend(Unit.f186387a);
            case 1:
                d dVar2 = new d((Continuation) obj4, (f0) this.f279336y, 1);
                dVar2.f279334w = (FlowCollector) obj2;
                dVar2.f279335x = obj3;
                return dVar2.invokeSuspend(Unit.f186387a);
            case 2:
                d dVar3 = new d((Continuation) obj4, (com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a) this.f279336y, 2);
                dVar3.f279334w = (FlowCollector) obj2;
                dVar3.f279335x = obj3;
                return dVar3.invokeSuspend(Unit.f186387a);
            case 3:
                d dVar4 = new d((Continuation) obj4, (uj8.i) this.f279336y, 3);
                dVar4.f279334w = (FlowCollector) obj2;
                dVar4.f279335x = obj3;
                return dVar4.invokeSuspend(Unit.f186387a);
            case 4:
                d dVar5 = new d((Continuation) obj4, (v) this.f279336y, 4);
                dVar5.f279334w = (FlowCollector) obj2;
                dVar5.f279335x = obj3;
                return dVar5.invokeSuspend(Unit.f186387a);
            case 5:
                d dVar6 = new d((Continuation) obj4, (uke.a) this.f279336y, 5);
                dVar6.f279334w = (FlowCollector) obj2;
                dVar6.f279335x = obj3;
                return dVar6.invokeSuspend(Unit.f186387a);
            case 6:
                d dVar7 = new d((Continuation) obj4, (umd.m) this.f279336y, 6);
                dVar7.f279334w = (FlowCollector) obj2;
                dVar7.f279335x = obj3;
                return dVar7.invokeSuspend(Unit.f186387a);
            case 7:
                d dVar8 = new d((Continuation) obj4, (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a) this.f279336y, 7);
                dVar8.f279334w = (FlowCollector) obj2;
                dVar8.f279335x = obj3;
                return dVar8.invokeSuspend(Unit.f186387a);
            case 8:
                d dVar9 = new d(this.f279336y, (Continuation) obj4, 8);
                dVar9.f279334w = (FlowCollector) obj2;
                dVar9.f279335x = (Throwable) obj3;
                return dVar9.invokeSuspend(Unit.f186387a);
            case 9:
                d dVar10 = new d((Continuation) obj4, (u) this.f279336y, 9);
                dVar10.f279334w = (FlowCollector) obj2;
                dVar10.f279335x = obj3;
                return dVar10.invokeSuspend(Unit.f186387a);
            case 10:
                d dVar11 = new d((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) this.f279336y, 10);
                dVar11.f279334w = (FlowCollector) obj2;
                dVar11.f279335x = obj3;
                return dVar11.invokeSuspend(Unit.f186387a);
            case 11:
                d dVar12 = new d((Continuation) obj4, (p) this.f279336y, 11);
                dVar12.f279334w = (FlowCollector) obj2;
                dVar12.f279335x = obj3;
                return dVar12.invokeSuspend(Unit.f186387a);
            case 12:
                d dVar13 = new d((Continuation) obj4, (uyc.w) this.f279336y, 12);
                dVar13.f279334w = (FlowCollector) obj2;
                dVar13.f279335x = obj3;
                return dVar13.invokeSuspend(Unit.f186387a);
            case 13:
                d dVar14 = new d((Continuation) obj4, (com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f279336y, 13);
                dVar14.f279334w = (FlowCollector) obj2;
                dVar14.f279335x = obj3;
                return dVar14.invokeSuspend(Unit.f186387a);
            case 14:
                d dVar15 = new d((Continuation) obj4, (com.revolut.feature.rev_points.impl.ui.trophy_room.details.c) this.f279336y, 14);
                dVar15.f279334w = (FlowCollector) obj2;
                dVar15.f279335x = obj3;
                return dVar15.invokeSuspend(Unit.f186387a);
            case 15:
                d dVar16 = new d((Continuation) obj4, (r) this.f279336y, 15);
                dVar16.f279334w = (FlowCollector) obj2;
                dVar16.f279335x = obj3;
                return dVar16.invokeSuspend(Unit.f186387a);
            case 16:
                d dVar17 = new d((Continuation) obj4, (v4e.f0) this.f279336y, 16);
                dVar17.f279334w = (FlowCollector) obj2;
                dVar17.f279335x = obj3;
                return dVar17.invokeSuspend(Unit.f186387a);
            case 17:
                d dVar18 = new d((Continuation) obj4, (v8d.m) this.f279336y, 17);
                dVar18.f279334w = (FlowCollector) obj2;
                dVar18.f279335x = obj3;
                return dVar18.invokeSuspend(Unit.f186387a);
            case 18:
                d dVar19 = new d((Continuation) obj4, (v9f.p) this.f279336y, 18);
                dVar19.f279334w = (FlowCollector) obj2;
                dVar19.f279335x = obj3;
                return dVar19.invokeSuspend(Unit.f186387a);
            case 19:
                d dVar20 = new d((Continuation) obj4, (v9h.f) this.f279336y, 19);
                dVar20.f279334w = (FlowCollector) obj2;
                dVar20.f279335x = obj3;
                return dVar20.invokeSuspend(Unit.f186387a);
            case 20:
                d dVar21 = new d((Continuation) obj4, (vaa.f0) this.f279336y, 20);
                dVar21.f279334w = (FlowCollector) obj2;
                dVar21.f279335x = obj3;
                return dVar21.invokeSuspend(Unit.f186387a);
            case 21:
                d dVar22 = new d((Continuation) obj4, (vai.c) this.f279336y, 21);
                dVar22.f279334w = (FlowCollector) obj2;
                dVar22.f279335x = obj3;
                return dVar22.invokeSuspend(Unit.f186387a);
            case 22:
                d dVar23 = new d(this.f279336y, (Continuation) obj4, 22);
                dVar23.f279334w = (FlowCollector) obj2;
                dVar23.f279335x = (Throwable) obj3;
                return dVar23.invokeSuspend(Unit.f186387a);
            case 23:
                d dVar24 = new d((Continuation) obj4, (vc2.u) this.f279336y, 23);
                dVar24.f279334w = (FlowCollector) obj2;
                dVar24.f279335x = obj3;
                return dVar24.invokeSuspend(Unit.f186387a);
            case 24:
                d dVar25 = new d((Continuation) obj4, (vdg.f) this.f279336y, 24);
                dVar25.f279334w = (FlowCollector) obj2;
                dVar25.f279335x = obj3;
                return dVar25.invokeSuspend(Unit.f186387a);
            case 25:
                d dVar26 = new d((vdl.o) this.f279335x, (b80.c) this.f279336y, (Continuation) obj4, 25);
                dVar26.f279334w = (String) obj3;
                return dVar26.invokeSuspend(Unit.f186387a);
            case 26:
                d dVar27 = new d((b80.c) this.f279335x, (vdl.r) this.f279336y, (Continuation) obj4, 26);
                dVar27.f279334w = (Set) obj3;
                return dVar27.invokeSuspend(Unit.f186387a);
            case 27:
                d dVar28 = new d((b80.c) this.f279335x, (d0) this.f279336y, (Continuation) obj4, 27);
                dVar28.f279334w = (String) obj3;
                return dVar28.invokeSuspend(Unit.f186387a);
            case 28:
                d dVar29 = new d((d0) this.f279336y, (Continuation) obj4, 28);
                dVar29.f279334w = (String) obj2;
                dVar29.f279335x = (oel.a) obj3;
                return dVar29.invokeSuspend(Unit.f186387a);
            default:
                d dVar30 = new d((b80.c) this.f279335x, (d0) this.f279336y, (Continuation) obj4, 29);
                dVar30.f279334w = (Set) obj3;
                return dVar30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Flow flowC3;
        Flow flowB;
        Object objB;
        int i = this.u;
        vkm.s1 s1Var = vkm.s1.f290118a;
        w4l.h loadingStrategy = w4l.h.f294642c;
        int i2 = 5;
        int i3 = 14;
        int i5 = 4;
        int i6 = 3;
        Continuation continuation = null;
        Object obj3 = this.f279336y;
        final int i21 = 1;
        switch (i) {
            case 0:
                e eVar = (e) obj3;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.f279334w;
                    pec.k kVar = (pec.k) this.f279335x;
                    if (kVar instanceof pec.h) {
                        flowC3 = zi0.c.i(pec.b.f235360a);
                    } else if (kVar instanceof pec.g) {
                        s sVar = eVar.f279337l;
                        sVar.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        k7c.y0 y0Var = sVar.f242835a;
                        y0Var.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        flowC3 = xam.a.h(new u7k.f0(eVar, continuation, 26), nim.a.v(y0Var.d.b(Unit.f186387a, loadingStrategy), new n(13)));
                    } else if (kVar instanceof pec.i) {
                        pec.i iVar = (pec.i) kVar;
                        flowC3 = e.Z2(eVar, iVar.f235368a, iVar.f235369b);
                    } else if (kVar instanceof pec.f) {
                        Address address = ((pec.f) kVar).f235365a;
                        eVar.getClass();
                        flowC3 = xam.a.h(new u36.g(2, eVar, e.class, "loadDelivery", "loadDelivery(Lcom/revolut/feature/revolutpay/shipping/api/domain/models/shippingcontacts/ShippingContact;)Lkotlinx/coroutines/flow/Flow;", 4, 1), rd0.e.e(new v1(new b0(eVar, address, continuation, i3)), h0.f322473a, new pc2.d(i6, 24, continuation)));
                    } else {
                        if (!(kVar instanceof pec.j)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowC3 = eVar.c3(((pec.j) kVar).f235370a);
                    }
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector, flowC3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f279334w;
                    f0 f0Var = (f0) obj3;
                    r10.q qVar = f0Var.o;
                    IncentiveRewardDetailsParams params = f0Var.v.f74866a;
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(params, "params");
                    w4l.i loadingStrategy2 = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    qf7.i iVar2 = (qf7.i) qVar.f250849b;
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    y yVarE = rd0.e.e(c6d.b.i(iVar2.d.b(params, loadingStrategy2), new uf7.y(f0Var, 0)), h0.f322473a, new pc2.d(i6, 25, continuation));
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, yVarE, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f279334w;
                    akg.n nVarB = ((com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a) obj3).o.b((w4l.k) this.f279335x);
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector3, nVarB, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.f279334w;
                    akg.n nVarV = nim.a.v(((nj8.n) ((uj8.i) obj3).o).k(null, (w4l.k) this.f279335x), uj8.h.f280536a);
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector4, nVarV, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.f279334w;
                    v1 v1Var = new v1(new b0((uk2.p) this.f279335x, (v) obj3, continuation, 18));
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector5, v1Var, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.f279334w;
                    ike.a aVar7 = (ike.a) this.f279335x;
                    Flow gVar = !aVar7.f161939a ? new go.g(zi0.c.P(new ike.b(false, aVar7.f161940b), false, null, 3), 2) : nim.a.v(tzg.m.c(((uke.a) obj3).f280731b, null, null, 3), new ro7.n(aVar7, i3));
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector6, gVar, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) this.f279334w;
                    final w4l.k loadingStrategy3 = (w4l.k) this.f279335x;
                    umd.m mVar = (umd.m) obj3;
                    final w2 w2Var = mVar.f281298p;
                    qzi.i budgetingAccountType = mVar.o.f87511a;
                    w2Var.getClass();
                    Intrinsics.checkNotNullParameter(budgetingAccountType, "budgetingAccountType");
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    final int i92 = 0;
                    Flow flowE = boh.f.e(boh.f.e(((wmd.c) w2Var.f13501g).a(budgetingAccountType, loadingStrategy3), new Function1() { // from class: umd.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i92) {
                                case 0:
                                    wmd.a accountContext = (wmd.a) obj4;
                                    Intrinsics.checkNotNullParameter(accountContext, "accountContext");
                                    w2 w2Var2 = w2Var;
                                    jzi.a aVar9 = (jzi.a) w2Var2.f13499b;
                                    String str = accountContext.f298634b;
                                    w4l.k kVar2 = loadingStrategy3;
                                    Flow flowA = ((uqj.b) aVar9).a(str, kVar2);
                                    String str2 = accountContext.f298634b;
                                    ge3.e eVar2 = (ge3.e) w2Var2.d;
                                    boolean zEquals = kVar2.equals(w4l.i.f294643c);
                                    Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                                    return nim.a.v(u0.m(flowA, rd0.e.b(((le3.b0) eVar2).d.c(str2, zEquals))), new um7.d(accountContext, 2));
                                default:
                                    l budgetWithExtraData = (l) obj4;
                                    Intrinsics.checkNotNullParameter(budgetWithExtraData, "budgetWithExtraData");
                                    lzi.m mVar2 = budgetWithExtraData.f281296b;
                                    w2 w2Var3 = w2Var;
                                    akg.n nVarA = ((eqj.f) w2Var3.f13500c).a(mVar2.f200987a, loadingStrategy3);
                                    wmd.f fVar = (wmd.f) w2Var3.e;
                                    AccountId accountId = budgetWithExtraData.f281295a;
                                    AnalyticsSpendingPeriod$Interval interval = mVar2.f200989c;
                                    xi0.b currency = mVar2.f200988b.f115083b;
                                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                                    Intrinsics.checkNotNullParameter(interval, "interval");
                                    Intrinsics.checkNotNullParameter(currency, "currency");
                                    return nim.a.v(u0.i(nVarA, fVar.b(accountId, interval, currency, "Budget overview"), ((uc.d) w2Var3.f).l(accountId, interval, currency)), new toh.h(w2Var3, 24, mVar2, budgetWithExtraData));
                            }
                        }
                    }), new Function1() { // from class: umd.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i21) {
                                case 0:
                                    wmd.a accountContext = (wmd.a) obj4;
                                    Intrinsics.checkNotNullParameter(accountContext, "accountContext");
                                    w2 w2Var2 = w2Var;
                                    jzi.a aVar9 = (jzi.a) w2Var2.f13499b;
                                    String str = accountContext.f298634b;
                                    w4l.k kVar2 = loadingStrategy3;
                                    Flow flowA = ((uqj.b) aVar9).a(str, kVar2);
                                    String str2 = accountContext.f298634b;
                                    ge3.e eVar2 = (ge3.e) w2Var2.d;
                                    boolean zEquals = kVar2.equals(w4l.i.f294643c);
                                    Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                                    return nim.a.v(u0.m(flowA, rd0.e.b(((le3.b0) eVar2).d.c(str2, zEquals))), new um7.d(accountContext, 2));
                                default:
                                    l budgetWithExtraData = (l) obj4;
                                    Intrinsics.checkNotNullParameter(budgetWithExtraData, "budgetWithExtraData");
                                    lzi.m mVar2 = budgetWithExtraData.f281296b;
                                    w2 w2Var3 = w2Var;
                                    akg.n nVarA = ((eqj.f) w2Var3.f13500c).a(mVar2.f200987a, loadingStrategy3);
                                    wmd.f fVar = (wmd.f) w2Var3.e;
                                    AccountId accountId = budgetWithExtraData.f281295a;
                                    AnalyticsSpendingPeriod$Interval interval = mVar2.f200989c;
                                    xi0.b currency = mVar2.f200988b.f115083b;
                                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                                    Intrinsics.checkNotNullParameter(interval, "interval");
                                    Intrinsics.checkNotNullParameter(currency, "currency");
                                    return nim.a.v(u0.i(nVarA, fVar.b(accountId, interval, currency, "Budget overview"), ((uc.d) w2Var3.f).l(accountId, interval, currency)), new toh.h(w2Var3, 24, mVar2, budgetWithExtraData));
                            }
                        }
                    });
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector7, flowE, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.f279334w;
                    w4l.k loadingStrategy4 = (w4l.k) this.f279335x;
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a aVar10 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a) obj3;
                    wik.m mVar2 = aVar10.f103597p;
                    PlanOfferPromptScreenContract$InputData.ByOfferType byOfferType = (PlanOfferPromptScreenContract$InputData.ByOfferType) aVar10.o;
                    String type = byOfferType.f103591a;
                    String str = byOfferType.f103593c;
                    mVar2.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    kjk.o oVar = (kjk.o) mVar2.f297924b;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    vkm.d dVarB = ((x4l.c) oVar.f.getValue()).b(new l(type, str), loadingStrategy4);
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector8, dVarB, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                FlowCollector flowCollector9 = (FlowCollector) this.f279334w;
                Throwable th10 = (Throwable) this.f279335x;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    if (th10 instanceof WidgetNotAvailableException) {
                        throw th10;
                    }
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (((uw4.d) obj3).invoke(flowCollector9, th10, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                u uVar = (u) obj3;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.f279334w;
                    vkm.d dVarB2 = rd0.e.b(nim.a.w(((a0) uVar.f283692r.f120458a).e.f(Unit.f186387a, false), new dwi.f(6)));
                    dwi.b0 b0Var = uVar.f283691q;
                    String airportId = uVar.f283690p.f99030a;
                    b0Var.getClass();
                    Intrinsics.checkNotNullParameter(airportId, "airportId");
                    hwi.v0 v0Var = (hwi.v0) b0Var.f120410b;
                    v0Var.getClass();
                    Intrinsics.checkNotNullParameter(airportId, "airportId");
                    vkm.d dVarB3 = rd0.e.b(((w4l.f) v0Var.f156264g.getValue()).f(new s0(airportId), false));
                    o0 o0Var = new o0(i6, 20, continuation);
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    q.w(flowCollector10);
                    Object objG = e0.g(this, s1Var, new c1((Function3) o0Var, continuation, 15), flowCollector10, new Flow[]{dVarB2, dVarB3});
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
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a aVar12 = (com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) obj3;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) this.f279334w;
                    d3j.b bVar = aVar12.f73884q;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter("", "searchQuery");
                    efm.r map = o71.a.c(bVar.f111211a, true, 4).map(new d2i.a(new d34.b(bVar, i5), 10));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    akg.n nVarV2 = nim.a.v(u0.i(nim.a.v(rd0.e.b(map), new uwi.v(8)), nim.a.v(rd0.e.b(aVar12.f73885r.h(new cl3.c[]{cl3.c.ON_REVOLUT, cl3.c.NOT_REVOLUT})), new uwi.v(10)), nim.a.v(rd0.e.b(te0.w.f0(((au6.u0) aVar12.f73883p.f129196a).d.f(s0.a.f9616a, true))), new uwi.v(9))), ux6.o.f283888a);
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector11, nVarV2, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.f279334w;
                    vkm.d dVarB4 = rd0.e.b(((p) obj3).o.e(false));
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector12, dVarB4, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.f279334w;
                    Flow flowX1 = ((uyc.w) obj3).X1(new nii.y0(null, new z(new TextLocalisedClause(R$string.common_attachments_error_too_large, zhm.u.c("10 MB"), null, 12), null, new TextLocalisedClause(R$string.common_action_ok, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5));
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector13, flowX1, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.f279334w;
                    OrderQuoteParams orderQuoteParams = (OrderQuoteParams) this.f279335x;
                    jhi.b bVarG = mo3.a.g(rd0.e.n(o7.b.u(((com.revolut.feature_crypto_order_flow.impl.exchange.d) obj3).f96749t, orderQuoteParams), h0.f322473a), null, g0.f284366a, 1);
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    q.w(flowCollector14);
                    Object objCollect = bVarG.collect(new su4.s(flowCollector14, orderQuoteParams, 1), this);
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
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                com.revolut.feature.rev_points.impl.ui.trophy_room.details.c cVar = (com.revolut.feature.rev_points.impl.ui.trophy_room.details.c) obj3;
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.f279334w;
                    w4l.k loadingStrategy5 = (w4l.k) this.f279335x;
                    u29.d dVar = cVar.f83906p;
                    y19.i type2 = cVar.o.f83902a;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(type2, "type");
                    Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                    Continuation continuation2 = null;
                    Flow flowH = xam.a.h(new z4(dVar, type2, loadingStrategy5, continuation2, 1), f39.c.b(dVar.f276567b));
                    vkm.d dVarB5 = rd0.e.b(cVar.f83907q.q());
                    o0 o0Var2 = new o0(i6, 21, continuation2);
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    q.w(flowCollector15);
                    Object objG2 = e0.g(this, s1Var, new c1((Function3) o0Var2, continuation2, 15), flowCollector15, new Flow[]{flowH, dVarB5});
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
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                r rVar = (r) obj3;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.f279334w;
                    akg.n nVarV3 = nim.a.v(u0.i(((a1) rVar.f285258p).a(), new v1(new uvf.b(rVar, continuation, 9)), ((zfc.d) rVar.f285261s).b(loadingStrategy)), new ro7.n(rVar, 15));
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector16, nVarV3, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.f279334w;
                    y1 y1Var = (y1) this.f279335x;
                    v4e.f0 f0Var2 = (v4e.f0) obj3;
                    yhl.d dVar2 = f0Var2.f286046p;
                    String str2 = f0Var2.f286043l.f286060a;
                    LocalDate localDateE = ((l80.f) f0Var2.f286047q).e();
                    LocalDate localDate = y1Var.e;
                    if (localDate == null) {
                        localDate = y1Var.d;
                    }
                    iel.f fVar = iel.f.DATE_ASCENDING;
                    iel.e[] elements = {iel.e.CALL, iel.e.PRINCIPAL, iel.e.COUPON};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    vkm.d dVarB6 = rd0.e.b(yhl.d.c(dVar2, str2, localDateE, localDate, false, kotlin.collections.d.y0(elements), null, new Integer(10), fVar, 256));
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector17, dVarB6, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.f279334w;
                    Flow flowW = ((v8d.m) obj3).f286745r.w(((Boolean) this.f279335x).booleanValue());
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector18, flowW, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                v9f.p pVar = (v9f.p) obj3;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) this.f279334w;
                    w4l.k loadingStrategy6 = (w4l.k) this.f279335x;
                    o9f.c cVar2 = pVar.o;
                    String accountId = pVar.f287040p.f91570a;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    Intrinsics.checkNotNullParameter(loadingStrategy6, "loadingStrategy");
                    h9f.e eVar2 = cVar2.f223260a;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    Intrinsics.checkNotNullParameter(loadingStrategy6, "loadingStrategy");
                    int i110 = 18;
                    t38.e eVarM = u0.m(nim.a.v(nim.a.v(eVar2.f150245b.b(new c9f.g(accountId, u8f.d.IN), loadingStrategy6), new h8b.l(i110)), new v25.k(pVar, 22)), new tnb.k(pVar.f287042r, i110));
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector19, eVarM, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.f279334w;
                    if (((Boolean) this.f279335x).booleanValue()) {
                        od0.i.Companion.getClass();
                        flowB = new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
                    } else {
                        e3 e3Var = ((v9h.f) obj3).f287072a;
                        flowB = rd0.e.b(nim.a.w(pd.b.r(((e8h.u) e3Var.f262806b).d.f(Unit.f186387a, false), new x8h.d(e3Var, 12)), v9h.d.f287070a));
                    }
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector20, flowB, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                vaa.f0 f0Var3 = (vaa.f0) obj3;
                vaa.k kVar2 = f0Var3.o;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.f279334w;
                    f8a.a aVar23 = f0Var3.f287187p;
                    AccountId accountId2 = kVar2.f287202a;
                    s8a.e eVar3 = (s8a.e) aVar23;
                    eVar3.getClass();
                    Intrinsics.checkNotNullParameter(accountId2, "accountId");
                    t38.e eVarG = eVar3.f260947a.g(accountId2);
                    ogm.i iVar3 = f0Var3.f287189r;
                    vkm.d dVarB7 = rd0.e.b(nim.a.w(xx9.p.c((xx9.p) iVar3.f225222b, false, null, 3), new s6e.g(iVar3, 26)));
                    vaa.b bVar2 = f0Var3.f287188q;
                    AccountId accountId3 = kVar2.f287202a;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(accountId3, "accountId");
                    whf.b bVar3 = bVar2.f287179a;
                    i7.c cVar3 = i7.Companion;
                    i7[] i7VarArr = {new ta(x1.PIX), new u9(false)};
                    cVar3.getClass();
                    j23.b bVarE = yh5.b.e(eVarG, dVarB7, nim.a.v(rd0.e.b(whf.b.a(bVar3, te0.w.h(i7.c.a(i7VarArr)), null, 4, accountId3, 2)), new v80.a(11)));
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector21, bVarE, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.f279334w;
                    v1 v1Var2 = new v1(new vai.b((vai.c) obj3, ((Number) this.f279335x).longValue(), null));
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector22, v1Var2, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                FlowCollector flowCollector23 = (FlowCollector) this.f279334w;
                Throwable th11 = (Throwable) this.f279335x;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    o.b(obj2);
                    if ((th11 instanceof WidgetNotAvailableException) || (th11 instanceof CancellationException)) {
                        throw th11;
                    }
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (((vbc.d) obj3).invoke(flowCollector23, th11, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) this.f279334w;
                    vc2.h hVar = ((vc2.u) obj3).o;
                    y yVarE2 = rd0.e.e(nim.a.u(new sxe.g(hVar, continuation, 17), vw1.b.c(hVar.f287623a)), h0.f322473a, new v77.c(i6, i21, continuation));
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector24, yVarE2, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) this.f279334w;
                    vdg.f fVar2 = (vdg.f) obj3;
                    i9g.b0 b0Var2 = fVar2.f287927p;
                    String propertyId = fVar2.o.f93996a;
                    b0Var2.getClass();
                    Intrinsics.checkNotNullParameter(propertyId, "propertyId");
                    fag.t0 t0Var = b0Var2.f159780a;
                    t0Var.getClass();
                    Intrinsics.checkNotNullParameter(propertyId, "propertyId");
                    vkm.d dVarB8 = rd0.e.b(t0Var.I.f(propertyId, false));
                    this.f279334w = null;
                    this.f279335x = null;
                    this.v = 1;
                    if (q.u(flowCollector25, dVarB8, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                String str3 = (String) this.f279334w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    o.b(obj2);
                    efm.d0<z0> instrumentSummary = ((vdl.o) this.f279335x).f288011a.getInstrumentSummary(str3);
                    v6l.e0 e0Var = new v6l.e0(29, new vch.h0(i3));
                    instrumentSummary.getClass();
                    ufm.i iVar4 = new ufm.i(instrumentSummary, e0Var, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                    i2 i2VarN0 = te0.w.n0(iVar4, (b80.c) obj3);
                    this.f279334w = null;
                    this.v = 1;
                    objB = nim.a.b(i2VarN0, this);
                    if (objB == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objB, "await(...)");
                return objB;
            case 26:
                Set set = (Set) this.f279334w;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                b80.c cVar4 = (b80.c) this.f279335x;
                vc2.s sVar2 = new vc2.s((vdl.r) obj3, set, continuation, i6);
                this.f279334w = null;
                this.v = 1;
                Object objM0 = te0.w.m0(cVar4, sVar2, this);
                return objM0 == aVar29 ? aVar29 : objM0;
            case 27:
                String str4 = (String) this.f279334w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 != 0) {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                b80.c cVar5 = (b80.c) this.f279335x;
                vc2.s sVar3 = new vc2.s((d0) obj3, str4, continuation, i5);
                this.f279334w = null;
                this.v = 1;
                Object objM02 = te0.w.m0(cVar5, sVar3, this);
                return objM02 == aVar30 ? aVar30 : objM02;
            case 28:
                return b(obj2);
            default:
                Set set2 = (Set) this.f279334w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 != 0) {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                b80.c cVar6 = (b80.c) this.f279335x;
                vc2.s sVar4 = new vc2.s((d0) obj3, set2, continuation, i2);
                this.f279334w = null;
                this.v = 1;
                Object objM03 = te0.w.m0(cVar6, sVar4, this);
                return objM03 == aVar31 ? aVar31 : objM03;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f279336y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f279336y = obj2;
    }
}
