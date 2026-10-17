package zrd;

import ahe.m0;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$InputData;
import dmj.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;
import xkf.b2;
import zh9.u0;
import zhm.a0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f324701w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f324702x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a f324703y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f324703y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                r rVar = new r(0, this.f324703y, continuation);
                rVar.f324701w = flowCollector;
                rVar.f324702x = obj3;
                return rVar.invokeSuspend(Unit.f186387a);
            case 1:
                r rVar2 = new r(1, this.f324703y, continuation);
                rVar2.f324701w = flowCollector;
                rVar2.f324702x = obj3;
                return rVar2.invokeSuspend(Unit.f186387a);
            default:
                r rVar3 = new r(2, this.f324703y, continuation);
                rVar3.f324701w = flowCollector;
                rVar3.f324702x = obj3;
                return rVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i;
        int i2;
        int i3;
        int i5;
        List listK;
        akg.n nVarV;
        Flow m0Var;
        md6.b bVarS;
        int i6 = this.u;
        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar = this.f324703y;
        switch (i6) {
            case 0:
                dsd.f fVar = aVar.v;
                cli.y yVar = aVar.f88028y;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f324701w;
                    Pair pair = (Pair) this.f324702x;
                    amd.a aVar3 = (amd.a) pair.f186385a;
                    amd.b bVar = (amd.b) pair.f186386b;
                    aVar.H2(yVar, new xnd.c(bVar, aVar3, 10));
                    vkm.y yVarL = aVar.u.l(aVar3, bVar != null ? fVar.a(bVar) : fVar.b(((a) ((j2) yVar.f22677a).getValue()).f324680c));
                    this.f324701w = null;
                    this.f324702x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, yVarL, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f324701w;
                    yld.g netWorthType = ((a) ((j2) aVar.f88028y.f22677a).getValue()).f324680c;
                    TotalWealthContract$InputData totalWealthContract$InputData = aVar.o;
                    NetWorthAccount netWorthAccount = totalWealthContract$InputData.f88017b;
                    boolean z = netWorthAccount instanceof NetWorthAccount.Junior;
                    int i32 = 6;
                    w4l.j jVar = w4l.j.f294644c;
                    NetWorthAccount.Personal personal = NetWorthAccount.Personal.f87455a;
                    if (z) {
                        nVarV = aVar.f88023r.i(((NetWorthAccount.Junior) netWorthAccount).f87454a);
                        i2 = 1;
                        i = 3;
                    } else {
                        if (!Intrinsics.f(netWorthAccount, personal)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dsd.i iVar = aVar.f88022q;
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
                        int i33 = dsd.g.f117298b[netWorthType.ordinal()];
                        i = 3;
                        if (i33 == 1) {
                            i2 = 1;
                            i3 = 2;
                            i5 = 0;
                            listK = zhm.v.k((gsd.c) iVar.f117299a, (vsd.c) iVar.f117300b, (zsd.l) iVar.f117301c, (rsd.k) iVar.d, (psd.j) iVar.e, (gsd.c) iVar.f);
                        } else {
                            if (i33 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = 1;
                            i3 = 2;
                            listK = zhm.v.k((osd.e) iVar.f117302g, (gsd.c) iVar.i, (xsd.i) iVar.f117304j, (vsd.c) iVar.f117303h);
                            i5 = 0;
                        }
                        List list = listK;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((frd.k) it8.next()).b());
                        }
                        nVarV = nim.a.v(u0.m(nim.a.u(new dlk.k(iVar, (Continuation) null, 21), new cqh.m((Flow[]) d0.d1(arrayList).toArray(new Flow[i5]), arrayList, 13)), nim.a.v(((xq3.j) iVar.f117305l).i(jVar), new ds4.b(i3))), new e0(iVar, 23));
                    }
                    Flow flowQ = vkm.q.q(rd0.e.b(aVar.f88024s.J(AccountId.Personal.f51414a, jVar)));
                    NetWorthAccount netWorthAccount2 = totalWealthContract$InputData.f88017b;
                    if (netWorthAccount2 instanceof NetWorthAccount.Junior) {
                        m0Var = zi0.c.i(yld.c.PIE_CHART);
                    } else {
                        if (!Intrinsics.f(netWorthAccount2, personal)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m0Var = new m0(rd0.e.e(aVar.f88025t.f196949a.b(qmd.a.NET_WORTH), h0.f322473a, new z6k.l(i, 11, null)), 27);
                    }
                    j23.b bVarD = yh5.b.d(nim.a.v(u0.i(nVarV, flowQ, m0Var), new zr2.o(i32)), vkm.q.q(vkm.q.Q(yh5.b.d(aVar.A, aVar.B), new r(0, aVar, null))));
                    this.f324701w = null;
                    this.f324702x = null;
                    this.v = i2;
                    vkm.q.w(flowCollector2);
                    Object objCollect = bVarD.collect(new b2(flowCollector2, aVar, 26), this);
                    fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                    if (objCollect != aVar5) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar5) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f324701w;
                    c cVar = (c) this.f324702x;
                    zjh.j jVar2 = aVar.f88027x;
                    List groups = cVar.f324682a;
                    jVar2.getClass();
                    Intrinsics.checkNotNullParameter(groups, "groups");
                    i4b.f fVar2 = (i4b.f) jVar2.f322839a;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it9 = groups.iterator();
                    while (it9.hasNext()) {
                        a0.x(((amd.j) it9.next()).f6333b, arrayList2);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it10 = arrayList2.iterator();
                    while (it10.hasNext()) {
                        switch (dsd.j.f117306a[((amd.d) it10.next()).f6312a.ordinal()]) {
                            case 1:
                            case 2:
                                bVarS = zjh.j.s(md6.e.CURRENCY);
                                break;
                            case 3:
                                bVarS = zjh.j.s(md6.e.JOINT);
                                break;
                            case 4:
                                bVarS = zjh.j.s(md6.e.PRO);
                                break;
                            case 5:
                            case 6:
                                bVarS = zjh.j.s(md6.e.LINKED);
                                break;
                            case 7:
                                bVarS = zjh.j.s(md6.e.SAVINGS);
                                break;
                            case 8:
                                bVarS = zjh.j.s(md6.e.JOINT_SAVINGS);
                                break;
                            case 9:
                                bVarS = zjh.j.s(md6.e.INVEST);
                                break;
                            case 10:
                                bVarS = zjh.j.s(md6.e.CRYPTO);
                                break;
                            case 11:
                            case 12:
                            case 13:
                                bVarS = zjh.j.s(md6.e.CREDIT);
                                break;
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                                bVarS = null;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        if (bVarS != null) {
                            arrayList3.add(bVarS);
                        }
                    }
                    vkm.y yVarJ = fVar2.j(new md6.c(arrayList3));
                    this.f324701w = null;
                    this.f324702x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, yVarJ, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
