package mpd;

import aw0.l6;
import com.revolut.data.model.Data;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.credit.api.navigation.CreditCardHomeFeatureConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.card.api.navigation.AdditionalCardsDestination;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.rev_points.models.SpareChangeRefundQuote;
import com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview;
import com.revolut.feature.salary_switch.impl.models.v2.Institution;
import com.revolut.feature.salary_switch.impl.network.PayrollService;
import com.revolut.feature.salary_switch.impl.network.PayrollServiceV2;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.impl.rewards_hub.network.RewardsHubService;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import gqc.d0;
import gqc.u;
import hs3.v;
import hs3.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import mhd.o0;
import my8.a0;
import mz3.a1;
import mz3.b0;
import mz3.x2;
import n09.j0;
import n09.m0;
import n09.x;
import n33.r2;
import qc0.e1;
import skm.e0;
import skm.p0;
import vkm.q0;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f207804w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f207805x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207804w = obj2;
        this.f207805x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p((com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a) this.f207804w, (a) this.f207805x, continuation, 0);
            case 1:
                return new p((mqc.k) this.f207804w, (String) this.f207805x, continuation, 1);
            case 2:
                return new p((mqc.r) this.f207804w, (String) this.f207805x, continuation, 2);
            case 3:
                return new p((mqc.r) this.f207804w, (kqc.i) this.f207805x, continuation, 3);
            case 4:
                return new p((mt8.d) this.f207804w, (yt8.a) this.f207805x, continuation, 4);
            case 5:
                return new p((mt8.d) this.f207804w, (a0) this.f207805x, continuation, 5);
            case 6:
                return new p((String) this.f207804w, (mtd.f) this.f207805x, continuation, 6);
            case 7:
                return new p((List) this.f207804w, (mtj.q) this.f207805x, continuation, 7);
            case 8:
                return new p((mtl.p) this.f207804w, (InvestOrdersParams) this.f207805x, continuation, 8);
            case 9:
                return new p((mu5.p) this.f207804w, (CryptoInvestmentsSortingType) this.f207805x, continuation, 9);
            case 10:
                return new p((mu8.l) this.f207804w, (e60.l) this.f207805x, continuation, 10);
            case 11:
                return new p((mv7.j) this.f207804w, (String) this.f207805x, continuation, 11);
            case 12:
                return new p((eq0.a) this.f207804w, (l6) this.f207805x, continuation, 12);
            case 13:
                return new p((mx2.f) this.f207804w, (CardDesignFeatureConfig) this.f207805x, continuation, 13);
            case 14:
                return new p((mz3.a0) this.f207804w, (PluginPayload) this.f207805x, continuation, 14);
            case 15:
                return new p((b0) this.f207804w, (PluginPayload) this.f207805x, continuation, 15);
            case 16:
                return new p((a1) this.f207804w, (PluginPayload) this.f207805x, continuation, 16);
            case 17:
                return new p((b0) this.f207804w, (PluginPayload) this.f207805x, continuation, 17);
            case 18:
                return new p((x2) this.f207804w, (PluginPayload) this.f207805x, continuation, 18);
            case 19:
                return new p((mzb.k) this.f207804w, this.f207805x, continuation, 19);
            case 20:
                p pVar = new p((mzh.e) this.f207805x, continuation, 20);
                pVar.f207804w = obj2;
                return pVar;
            case 21:
                return new p((m0) this.f207805x, continuation, 21);
            case 22:
                return new p((com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.b) this.f207804w, (r0a.n) this.f207805x, continuation, 22);
            case 23:
                p pVar2 = new p((n1g.r) this.f207805x, continuation, 23);
                pVar2.f207804w = obj2;
                return pVar2;
            case 24:
                return new p((n23.k) this.f207804w, (ty0.a) this.f207805x, continuation, 24);
            case 25:
                return new p((n2c.d) this.f207804w, (SpareChangeRefundQuote) this.f207805x, continuation, 25);
            case 26:
                return new p((n2d.g) this.f207804w, (AlertsWidgetContext) this.f207805x, continuation, 26);
            case 27:
                return new p((r2) this.f207804w, (NaviCommand) this.f207805x, continuation, 27);
            case 28:
                return new p((n3h.c) this.f207804w, (q2h.d) this.f207805x, continuation, 28);
            default:
                return new p((n3h.c) this.f207804w, (q2h.e) this.f207805x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objRequestPreview;
        Object objCreatePayrollSwitch;
        Data data;
        Object obj3;
        Object next;
        Object objA;
        e0i.a aVar;
        r0i.a aVar2;
        Object objX;
        m0 m0Var;
        Object objF;
        int i = this.u;
        int i2 = 12;
        int i3 = 10;
        int i5 = 0;
        Continuation continuation = null;
        Object obj4 = this.f207805x;
        int i6 = 1;
        switch (i) {
            case 0:
                com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a aVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a) this.f207804w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    kge.d dVar = aVar3.f87683q;
                    String str = aVar3.o.f;
                    a aVar5 = (a) obj4;
                    AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = new AnalyticsSpendingPeriod$Interval(aVar5.d, aVar5.e);
                    lzi.i iVar = lzi.i.CUSTOM;
                    this.v = 1;
                    if (dVar.B(str, analyticsSpendingPeriod$Interval, iVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar3.B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    PayrollService payrollService = ((mqc.k) this.f207804w).f207962b;
                    eqc.d dVar2 = new eqc.d(eqc.b.CLABE, (String) obj4);
                    this.v = 1;
                    objRequestPreview = payrollService.requestPreview(dVar2, this);
                    if (objRequestPreview == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objRequestPreview = obj2;
                }
                eqc.h hVar = (eqc.h) objRequestPreview;
                if (hVar.f128426b == eqc.f.CLABE) {
                    Intrinsics.checkNotNullParameter(hVar, "<this>");
                    return new SalarySwitchPreview(hVar.f128425a, new SalarySwitchPreview.Account.Clabe(hVar.f128427c));
                }
                throw new IllegalStateException("Requested a CLABE preview but received a " + hVar.f128426b);
            case 2:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((mqc.r) this.f207804w).f207970a.cancelPayrollSwitch((String) obj4, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    PayrollServiceV2 payrollServiceV2 = ((mqc.r) this.f207804w).f207970a;
                    kqc.i iVar2 = (kqc.i) obj4;
                    Intrinsics.checkNotNullParameter(iVar2, "<this>");
                    String strName = iVar2.f188366a.name();
                    Institution institution = iVar2.f188367b;
                    gqc.m0 m0Var2 = new gqc.m0(institution.f85245a.name(), institution.f85246b);
                    kqc.a aVar9 = iVar2.f188368c;
                    String strName2 = aVar9.f188361a.name();
                    String str2 = aVar9.f188362b;
                    kqc.c cVar = aVar9.f188363c;
                    d0 d0Var = new d0(strName, m0Var2, new gqc.o(strName2, str2, new u(cVar.f188364a.name(), cVar.f188365b)));
                    this.v = 1;
                    objCreatePayrollSwitch = payrollServiceV2.createPayrollSwitch(d0Var, this);
                    if (objCreatePayrollSwitch == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objCreatePayrollSwitch = obj2;
                }
                return ((eqc.k) objCreatePayrollSwitch).f128429a;
            case 4:
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
                mt8.d dVar3 = (mt8.d) this.f207804w;
                this.v = 1;
                qt8.l lVar = (qt8.l) ((qt8.d) dVar3).f249018a;
                lVar.getClass();
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, new e1((yt8.a) obj4, lVar, continuation, 25), this);
                return objJ == aVar10 ? aVar10 : objJ;
            case 5:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    mt8.d dVar4 = (mt8.d) this.f207804w;
                    this.v = 1;
                    if (((qt8.d) dVar4).f((a0) obj4, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                mtd.f fVar = (mtd.f) obj4;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    if (((String) this.f207804w).equals("REMOVE_ID")) {
                        mtd.e eVar = new mtd.e(fVar, continuation, i5);
                        this.v = 1;
                        if (u0.b0(fVar.X(), "REMOVE_ID", eVar, this) == aVar12) {
                            return aVar12;
                        }
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                fVar.B2();
                return Unit.f186387a;
            case 7:
                mtj.q qVar = (mtj.q) obj4;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    data = new Data(null, e2, false, 5, null);
                }
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    List<mtj.a> list = (List) this.f207804w;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    for (mtj.a aVar14 : list) {
                        arrayList.add(new ttj.c(aVar14.f208866a, aVar14.f208867b, aVar14.f208868c));
                    }
                    ttj.f fVar2 = new ttj.f(arrayList);
                    RewardsHubService rewardsHubService = qVar.f208893a;
                    this.v = 1;
                    if (rewardsHubService.acknowledgeChallenges(fVar2, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i74 != 1) {
                        if (i74 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        data = new Data(Unit.f186387a, null, false, 6, null);
                        return data;
                    }
                    yhm.o.b(obj2);
                }
                x4l.c cVar2 = qVar.f208899l;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar2.d(unit, false, this) == aVar13) {
                    return aVar13;
                }
                data = new Data(Unit.f186387a, null, false, 6, null);
                return data;
            case 8:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    vrl.g gVar = ((mtl.p) this.f207804w).f208928p;
                    this.v = 1;
                    Object objD = ((vrl.m) gVar).f291654a.f239331b.d((InvestOrdersParams) obj4, false, this);
                    if (objD != aVar15) {
                        objD = Unit.f186387a;
                    }
                    if (objD != aVar15) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    mk0.a aVar17 = ((mu5.p) this.f207804w).f208986a;
                    mu5.g gVar2 = mu5.p.Companion;
                    tk0.d dVar5 = new tk0.d("CRYPTO_INVESTMENTS_WIDGET_SORTING_ALG");
                    String strB = ((CryptoInvestmentsSortingType) obj4).b();
                    this.v = 1;
                    if (aVar17.e(dVar5, strB, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    mu8.l lVar2 = (mu8.l) this.f207804w;
                    File fileB = ((e60.m) ((e60.l) obj4)).b();
                    this.v = 1;
                    if (mu8.l.I2(lVar2, fileB, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar20 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(((mv7.j) this.f207804w).f209163p, (String) obj4, aVar20, null, this, 4);
                return objX1 == aVar19 ? aVar19 : objX1;
            case 12:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    eq0.a aVar22 = (eq0.a) this.f207804w;
                    if (aVar22 != null) {
                        this.v = 1;
                        if (aVar22.e((l6) obj4, this) == aVar21) {
                            return aVar21;
                        }
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objD2 = mx2.f.d((mx2.f) this.f207804w, (CardDesignFeatureConfig) obj4, this);
                return objD2 == aVar23 ? aVar23 : objD2;
            case 14:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                mz3.a0 a0Var = (mz3.a0) this.f207804w;
                String str3 = ((PluginPayload) obj4).f66247a.f168330m;
                if (str3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.v = 1;
                Object objA2 = mz3.a0.a(a0Var, str3, this);
                return objA2 == aVar24 ? aVar24 : objA2;
            case 15:
                it3.d dVar6 = ((PluginPayload) obj4).f66247a;
                b0 b0Var = (b0) this.f207804w;
                mri.w wVar = b0Var.f210584b;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    mri.w.r0(wVar, dVar6.f168323a);
                    pw5.a.w(wVar);
                    al4.q qVar2 = (al4.q) b0Var.d;
                    this.v = 1;
                    if (al4.q.a(qVar2, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i104 != 1) {
                        if (i104 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                al4.n nVar = (al4.n) b0Var.f210585c;
                String str4 = dVar6.f168332p;
                if (str4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.v = 2;
                if (((om4.x2) nVar).I(str4, this) == aVar25) {
                    return aVar25;
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a1 a1Var = (a1) this.f207804w;
                it3.d dVar7 = ((PluginPayload) obj4).f66247a;
                this.v = 1;
                Object obj5 = dVar7.e;
                if (!(obj5 instanceof y)) {
                    List list2 = dVar7.f;
                    if (list2 != null) {
                        Iterator it8 = list2.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (next instanceof y) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        obj3 = (v) next;
                    } else {
                        obj3 = null;
                    }
                } else {
                    if (obj5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.ExitMetadata");
                    }
                    obj3 = (y) obj5;
                }
                y yVar = (y) obj3;
                if (yVar != null) {
                    String str5 = yVar.f154971a;
                    if (str5 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    objA = dVar7.f168334r == it3.k.INVITATION ? a1Var.a(str5, this) : com.revolut.retail.core.navigation.a.c(new FeatureCommand(new CreditCardHomeFeatureConfig(str5)), new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AdditionalCardsDestination(str5, null), false, (Integer) null, 0, 61)));
                } else {
                    objA = DummyCommand.f98635a;
                }
                return objA == aVar26 ? aVar26 : objA;
            case 17:
                b0 b0Var2 = (b0) this.f207804w;
                mri.w wVar2 = b0Var2.f210584b;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    o95.i iVar3 = (o95.i) b0Var2.f210585c;
                    this.v = 1;
                    Object objD3 = iVar3.f223083a.d.d(new t95.d(true), true, this);
                    if (objD3 != aVar27) {
                        objD3 = Unit.f186387a;
                    }
                    if (objD3 != aVar27) {
                        objD3 = Unit.f186387a;
                    }
                    if (objD3 == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                mri.w.r0(wVar2, ((PluginPayload) obj4).f66247a.f168323a);
                pw5.a.w(wVar2);
                return Unit.f186387a;
            case 18:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    tx3.d dVar8 = ((x2) this.f207804w).f210705a;
                    String str6 = ((PluginPayload) obj4).f66247a.f168323a;
                    this.v = 1;
                    if (dVar8.a(str6, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    mzb.k kVar = (mzb.k) this.f207804w;
                    o0 o0Var = new o0(kVar, obj4, continuation, 9);
                    this.v = 1;
                    if (u0.b0(kVar.X(), "LEARN_CTA_LOADING_TAG", o0Var, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                Data data2 = (Data) this.f207804w;
                Object obj6 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    if (!data2.getLoading() && (aVar = (e0i.a) data2.getContent()) != null && (aVar2 = aVar.f121719b) != null) {
                        mzh.e eVar2 = (mzh.e) obj4;
                        this.f207804w = null;
                        this.v = 1;
                        eVar2.u = aVar2;
                        c1i.f fVar3 = new c1i.f((c1i.g) eVar2.o.f272384b, aVar2, continuation, i5);
                        p0 p0Var2 = p0.f264001a;
                        Object objJ2 = e0.J(elm.f.f127540b, fVar3, this);
                        if (objJ2 != obj6) {
                            objJ2 = Unit.f186387a;
                        }
                        if (objJ2 != obj6) {
                            objJ2 = Unit.f186387a;
                        }
                        if (objJ2 != obj6) {
                            objJ2 = Unit.f186387a;
                        }
                        if (objJ2 == obj6) {
                            return obj6;
                        }
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                m0 m0Var3 = (m0) obj4;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                int i111 = 17;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    mmh.e eVar3 = new mmh.e(m0Var3.f210958q.f139374a.d.c(Unit.f186387a, false), i111);
                    this.f207804w = m0Var3;
                    this.v = 1;
                    objX = vkm.q.x(eVar3, this);
                    if (objX == aVar30) {
                        return aVar30;
                    }
                    m0Var = m0Var3;
                } else {
                    if (i110 != 1) {
                        if (i110 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    m0 m0Var4 = (m0) this.f207804w;
                    yhm.o.b(obj2);
                    m0Var = m0Var4;
                    objX = obj2;
                }
                Iterable iterable = (Iterable) objX;
                ArrayList arrayList2 = new ArrayList(w.t(iterable, 10));
                Iterator it9 = iterable.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((u09.w) it9.next()).f276156a);
                }
                m0Var.getClass();
                List listC = zhm.u.c(x.f210970a);
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it10 = arrayList2.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(new n09.y((u09.v) it10.next()));
                }
                ArrayList arrayListE0 = zhm.d0.E0(arrayList3, listC);
                m0Var3.x2(new j0(m0Var3, arrayListE0, i5));
                lkf.v vVar = new lkf.v(new q0(vkm.q.Q(m0Var3.u, new k25.o(continuation, arrayListE0, m0Var3, i111)), new mta.c(m0Var3, continuation, 8), 1), m0Var3, 28);
                mx5.g gVar3 = new mx5.g(m0Var3, continuation, i2);
                this.f207804w = null;
                this.v = 2;
                if (vkm.q.o(vVar, gVar3, this) == aVar30) {
                    return aVar30;
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.b bVar = (com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.b) this.f207804w;
                mh1.d dVar9 = new mh1.d(bVar, (r0a.n) obj4, continuation, 6);
                this.v = 1;
                Object objP2 = bVar.p2(this, dVar9);
                return objP2 == aVar31 ? aVar31 : objP2;
            case 23:
                FlowCollector flowCollector = (FlowCollector) this.f207804w;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    Data dataP = zi0.c.P(Boolean.valueOf(((c1g.m) ((n1g.r) obj4).f211344s).a()), false, null, 3);
                    this.f207804w = null;
                    this.v = 1;
                    if (flowCollector.emit(dataP, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    j23.p pVar = ((n23.k) this.f207804w).o;
                    this.v = 1;
                    j23.a aVar34 = (j23.a) pVar;
                    aVar34.getClass();
                    if (j23.a.e(aVar34, (ty0.a) obj4, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 != 0) {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n2c.d dVar10 = (n2c.d) this.f207804w;
                o0 o0Var2 = new o0(dVar10, (SpareChangeRefundQuote) obj4, continuation, i3);
                this.v = 1;
                Object objB0 = u0.b0(dVar10.X(), "REFUND_REQUEST_BUTTON_LOADING_ID", o0Var2, this);
                return objB0 == aVar35 ? aVar35 : objB0;
            case 26:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    r2d.p pVar2 = ((n2d.g) this.f207804w).f211524l;
                    AlertsWidgetContext widgetContext = (AlertsWidgetContext) obj4;
                    pVar2.getClass();
                    Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
                    pfm.a aVar37 = new pfm.a(pVar2.a(widgetContext), new r25.c(7, new r2d.l(pVar2, i6)), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar37, "flatMapCompletable(...)");
                    this.v = 1;
                    if (nim.a.a(aVar37, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    hr6.l lVar3 = ((r2) this.f207804w).f211797h;
                    this.v = 1;
                    objF = ((ct6.m) lVar3).f((NaviCommand) obj4, this);
                    if (objF == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objF = obj2;
                }
                return new FeatureCommand((FeatureConfig) objF);
            case 28:
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
                n3h.c cVar3 = (n3h.c) this.f207804w;
                o0 o0Var3 = new o0(cVar3, (q2h.d) obj4, continuation, 11);
                this.v = 1;
                Object objB = pu7.a.B(cVar3.e, "placeCommodityOrder", o0Var3, this);
                return objB == aVar39 ? aVar39 : objB;
            default:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 != 0) {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n3h.c cVar4 = (n3h.c) this.f207804w;
                o0 o0Var4 = new o0(cVar4, (q2h.e) obj4, continuation, i2);
                this.v = 1;
                Object objB2 = pu7.a.B(cVar4.e, "placeSecurityOrder", o0Var4, this);
                return objB2 == aVar40 ? aVar40 : objB2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207805x = obj2;
    }
}
