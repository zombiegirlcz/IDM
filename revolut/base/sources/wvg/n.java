package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements oim.n {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f300420w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ a1 f300421x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f300422y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Continuation continuation, int i) {
        super(4, continuation);
        this.u = i;
        this.f300422y = obj2;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.u) {
            case 0:
                n nVar = new n((o) this.f300422y, (Continuation) obj5, 0);
                nVar.f300421x = (l) obj3;
                nVar.f300420w = (String) obj4;
                return nVar.invokeSuspend(Unit.f186387a);
            case 1:
                n nVar2 = new n((q) this.f300422y, (Continuation) obj5, 1);
                nVar2.f300421x = (p) obj3;
                nVar2.f300420w = (String) obj4;
                return nVar2.invokeSuspend(Unit.f186387a);
            case 2:
                n nVar3 = new n((v) this.f300422y, (Continuation) obj5, 2);
                nVar3.f300421x = (e) obj3;
                nVar3.f300420w = (String) obj4;
                return nVar3.invokeSuspend(Unit.f186387a);
            case 3:
                n nVar4 = new n((e0) this.f300422y, (Continuation) obj5, 3);
                nVar4.f300421x = (d1) obj3;
                nVar4.f300420w = (String) obj4;
                return nVar4.invokeSuspend(Unit.f186387a);
            case 4:
                n nVar5 = new n((g0) this.f300422y, (Continuation) obj5, 4);
                nVar5.f300421x = (f1) obj3;
                nVar5.f300420w = (String) obj4;
                return nVar5.invokeSuspend(Unit.f186387a);
            case 5:
                n nVar6 = new n((t0) this.f300422y, (Continuation) obj5, 5);
                nVar6.f300421x = (b2) obj3;
                nVar6.f300420w = (String) obj4;
                return nVar6.invokeSuspend(Unit.f186387a);
            case 6:
                n nVar7 = new n((n1) this.f300422y, (Continuation) obj5, 6);
                nVar7.f300421x = (h1) obj3;
                nVar7.f300420w = (String) obj4;
                return nVar7.invokeSuspend(Unit.f186387a);
            case 7:
                n nVar8 = new n((n1) this.f300422y, (Continuation) obj5, 7);
                nVar8.f300421x = (o1) obj3;
                nVar8.f300420w = (String) obj4;
                return nVar8.invokeSuspend(Unit.f186387a);
            case 8:
                n nVar9 = new n((x1) this.f300422y, (Continuation) obj5, 8);
                nVar9.f300421x = (i1) obj3;
                nVar9.f300420w = (String) obj4;
                return nVar9.invokeSuspend(Unit.f186387a);
            default:
                n nVar10 = new n((x1) this.f300422y, (Continuation) obj5, 9);
                nVar10.f300421x = (p1) obj3;
                nVar10.f300420w = (String) obj4;
                return nVar10.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                l lVar = (l) this.f300421x;
                String str = this.f300420w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ComplexWealthAnalyticsService complexWealthAnalyticsService = ((o) this.f300422y).f300430a;
                String str2 = lVar.f300412a;
                String strT = nz8.d.t(lVar.f300413b, null);
                String str3 = lVar.d.f306286a;
                List list = lVar.f300414c;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(kotlin.jvm.internal.s.Q((iwg.a) it8.next()));
                }
                String strR = kotlin.jvm.internal.s.R(lVar.e);
                String str4 = lVar.f;
                this.f300421x = null;
                this.f300420w = null;
                this.v = 1;
                Object combinedPerformanceChart = complexWealthAnalyticsService.getCombinedPerformanceChart(str2, strT, arrayList, str3, strR, str4, str, this);
                return combinedPerformanceChart == aVar ? aVar : combinedPerformanceChart;
            case 1:
                p pVar = (p) this.f300421x;
                String str5 = this.f300420w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ComplexWealthAnalyticsService complexWealthAnalyticsService2 = ((q) this.f300422y).f300451a;
                String str6 = pVar.f300441a;
                String strT2 = nz8.d.t(pVar.f300443c, null);
                String str7 = pVar.d.f306286a;
                List list2 = pVar.f300442b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(kotlin.jvm.internal.s.Q((iwg.a) it9.next()));
                }
                this.f300421x = null;
                this.f300420w = null;
                this.v = 1;
                Object combinedPnlChart = complexWealthAnalyticsService2.getCombinedPnlChart(str6, strT2, str7, arrayList2, str5, this);
                return combinedPnlChart == aVar2 ? aVar2 : combinedPnlChart;
            case 2:
                e eVar = (e) this.f300421x;
                String str8 = this.f300420w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ComplexWealthAnalyticsService complexWealthAnalyticsService3 = ((v) this.f300422y).f300479a;
                String str9 = eVar.f300358a;
                String strT3 = nz8.d.t(eVar.f300360c, null);
                String strPrint = w.f300487a.print(eVar.d);
                Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                String str10 = eVar.e.f306286a;
                List list3 = eVar.f300359b;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(kotlin.jvm.internal.s.Q((iwg.a) it10.next()));
                }
                String str11 = eVar.f;
                this.f300421x = null;
                this.f300420w = null;
                this.v = 1;
                Object combinedTotalValueChart = complexWealthAnalyticsService3.getCombinedTotalValueChart(str9, strT3, strPrint, str10, arrayList3, str11, str8, this);
                return combinedTotalValueChart == aVar3 ? aVar3 : combinedTotalValueChart;
            case 3:
                e0 e0Var = (e0) this.f300422y;
                d1 d1Var = (d1) this.f300421x;
                String str12 = this.f300420w;
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
                ComplexWealthAnalyticsService complexWealthAnalyticsService4 = e0Var.f300362a;
                String str13 = d1Var.f300353a;
                eel.c cVar = d1Var.f300355c;
                String strQ = kotlin.jvm.internal.s.Q(d1Var.f300354b);
                String strT4 = nz8.d.t(cVar, e0Var.e);
                String str14 = d1Var.e.f306286a;
                String strR2 = kotlin.jvm.internal.s.R(d1Var.f);
                String strPrint2 = f0.f300367a.print(d1Var.d);
                Intrinsics.checkNotNullExpressionValue(strPrint2, "print(...)");
                String str15 = d1Var.f300356g;
                String str16 = d1Var.f300357h;
                boolean z = cVar == eel.c.YEAR_TO_DATE;
                this.f300421x = null;
                this.f300420w = null;
                this.v = 1;
                Object performanceChart = complexWealthAnalyticsService4.getPerformanceChart(str13, strQ, strT4, str14, strR2, strPrint2, str15, str16, z, str12, this);
                return performanceChart == aVar4 ? aVar4 : performanceChart;
            case 4:
                f1 f1Var = (f1) this.f300421x;
                String str17 = this.f300420w;
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
                ComplexWealthAnalyticsService complexWealthAnalyticsService5 = ((g0) this.f300422y).f300375a;
                String str18 = f1Var.f300368a;
                String strQ2 = kotlin.jvm.internal.s.Q(f1Var.f300370c);
                String strT5 = nz8.d.t(f1Var.d, null);
                String strPrint3 = h0.f300384a.print(f1Var.e);
                Intrinsics.checkNotNullExpressionValue(strPrint3, "print(...)");
                String str19 = f1Var.f.f306286a;
                String str20 = f1Var.f300369b;
                this.f300421x = null;
                this.f300420w = null;
                this.v = 1;
                Object pnl2 = complexWealthAnalyticsService5.getPnl(str18, strQ2, strT5, strPrint3, str19, str20, "1D", str17, this);
                return pnl2 == aVar5 ? aVar5 : pnl2;
            case 5:
                t0 t0Var = (t0) this.f300422y;
                b2 b2Var = (b2) this.f300421x;
                String str21 = this.f300420w;
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
                ComplexWealthAnalyticsService complexWealthAnalyticsService6 = t0Var.f300473a;
                String str22 = b2Var.f300332a;
                eel.c cVar2 = b2Var.f300334c;
                String strQ3 = kotlin.jvm.internal.s.Q(b2Var.f300333b);
                String strT6 = nz8.d.t(cVar2, t0Var.e);
                String strPrint4 = u0.f300478a.print(b2Var.d);
                Intrinsics.checkNotNullExpressionValue(strPrint4, "print(...)");
                String str23 = b2Var.e.f306286a;
                String str24 = b2Var.f;
                String str25 = b2Var.f300335g;
                boolean z3 = cVar2 == eel.c.YEAR_TO_DATE;
                this.f300421x = null;
                this.f300420w = null;
                this.v = 1;
                Object totalValueChart = complexWealthAnalyticsService6.getTotalValueChart(str22, strQ3, strT6, strPrint4, str23, str24, str25, z3, str21, this);
                return totalValueChart == aVar6 ? aVar6 : totalValueChart;
            case 6:
                h1 h1Var = (h1) this.f300421x;
                String str26 = this.f300420w;
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
                ComplexWealthAnalyticsService complexWealthAnalyticsService7 = ((n1) this.f300422y).f300425a;
                String str27 = h1Var.f300385a;
                String strT7 = nz8.d.t(h1Var.f300387c, null);
                String str28 = h1Var.d.f306286a;
                List list4 = h1Var.f300386b;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it11 = list4.iterator();
                while (it11.hasNext()) {
                    arrayList4.add(kotlin.jvm.internal.s.Q((iwg.a) it11.next()));
                }
                zhm.f0 f0Var = zhm.f0.f322471a;
                String strR3 = kotlin.jvm.internal.s.R(h1Var.e);
                List<String> listL = zhm.v.l(h1Var.f);
                this.f300421x = null;
                this.f300420w = null;
                this.v = 1;
                Object realtimePerformanceChart = complexWealthAnalyticsService7.getRealtimePerformanceChart(str27, strT7, str28, arrayList4, f0Var, strR3, listL, str26, this);
                return realtimePerformanceChart == aVar7 ? aVar7 : realtimePerformanceChart;
            case 7:
                o1 o1Var = (o1) this.f300421x;
                String str29 = this.f300420w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ComplexWealthAnalyticsService complexWealthAnalyticsService8 = ((n1) this.f300422y).f300425a;
                String str30 = o1Var.f300436a;
                String str31 = o1Var.f300438c;
                String strT8 = nz8.d.t(o1Var.d, null);
                String str32 = o1Var.e.f306286a;
                List<String> listC = str31 == null ? zhm.u.c(kotlin.jvm.internal.s.Q(o1Var.f300437b)) : zhm.f0.f322471a;
                List<String> listL2 = zhm.v.l(str31);
                String strR4 = kotlin.jvm.internal.s.R(o1Var.f);
                List<String> listL3 = zhm.v.l(o1Var.f300439g);
                this.f300421x = null;
                this.f300420w = null;
                this.v = 1;
                Object realtimePerformanceChart2 = complexWealthAnalyticsService8.getRealtimePerformanceChart(str30, strT8, str32, listC, listL2, strR4, listL3, str29, this);
                return realtimePerformanceChart2 == aVar8 ? aVar8 : realtimePerformanceChart2;
            case 8:
                i1 i1Var = (i1) this.f300421x;
                String str33 = this.f300420w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ComplexWealthAnalyticsService complexWealthAnalyticsService9 = ((x1) this.f300422y).f300494a;
                String str34 = i1Var.f300393a;
                String strT9 = nz8.d.t(i1Var.f300395c, null);
                String str35 = i1Var.d.f306286a;
                List list5 = i1Var.f300394b;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it12 = list5.iterator();
                while (it12.hasNext()) {
                    arrayList5.add(kotlin.jvm.internal.s.Q((iwg.a) it12.next()));
                }
                zhm.f0 f0Var2 = zhm.f0.f322471a;
                String str36 = i1Var.e;
                this.f300421x = null;
                this.f300420w = null;
                this.v = 1;
                Object realtimeTotalValueChart = complexWealthAnalyticsService9.getRealtimeTotalValueChart(str34, strT9, str35, arrayList5, f0Var2, str36, str33, this);
                return realtimeTotalValueChart == aVar9 ? aVar9 : realtimeTotalValueChart;
            default:
                p1 p1Var = (p1) this.f300421x;
                String str37 = this.f300420w;
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
                ComplexWealthAnalyticsService complexWealthAnalyticsService10 = ((x1) this.f300422y).f300494a;
                String str38 = p1Var.f300446a;
                String str39 = p1Var.f300448c;
                String strT10 = nz8.d.t(p1Var.d, null);
                String str40 = p1Var.e.f306286a;
                List<String> listC2 = str39 == null ? zhm.u.c(kotlin.jvm.internal.s.Q(p1Var.f300447b)) : zhm.f0.f322471a;
                List<String> listL4 = zhm.v.l(str39);
                String str41 = p1Var.f;
                this.f300421x = null;
                this.f300420w = null;
                this.v = 1;
                Object realtimeTotalValueChart2 = complexWealthAnalyticsService10.getRealtimeTotalValueChart(str38, strT10, str40, listC2, listL4, str41, str37, this);
                return realtimeTotalValueChart2 == aVar10 ? aVar10 : realtimeTotalValueChart2;
        }
    }
}
