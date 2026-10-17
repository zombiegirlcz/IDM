package xge;

import com.revolut.feature.tab.accounts.api.TabAccountsApi$Toggles;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vge.t2;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function3 {
    public final /* synthetic */ sfe.a A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f305698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f305699x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f305700y;
    public final /* synthetic */ qfe.l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Continuation continuation, g gVar, qfe.l lVar, sfe.a aVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f305700y = gVar;
        this.z = lVar;
        this.A = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                d dVar = new d(continuation, this.f305700y, this.z, this.A, 0);
                dVar.f305698w = flowCollector;
                dVar.f305699x = obj3;
                return dVar.invokeSuspend(Unit.f186387a);
            default:
                d dVar2 = new d(continuation, this.f305700y, this.z, this.A, 1);
                dVar2.f305698w = flowCollector;
                dVar2.f305699x = obj3;
                return dVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objF;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f305698w;
                    List list = (List) this.f305699x;
                    int i2 = 10;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (true) {
                        boolean zHasNext = it8.hasNext();
                        g gVar = this.f305700y;
                        if (zHasNext) {
                            vfe.a aVar2 = (vfe.a) it8.next();
                            List<pie.s> list2 = aVar2.f288608c;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, i2));
                            for (pie.s sVar : list2) {
                                ArrayList arrayList3 = arrayList2;
                                ProductSpaceIdentifier productSpaceIdentifier = aVar2.f288606a;
                                if (sVar instanceof pie.u) {
                                    d0 d0Var = g0.Companion;
                                    pie.v vVarA = sVar.a();
                                    d0Var.getClass();
                                    String identifier = d0.a(productSpaceIdentifier, vVarA);
                                    t2 t2Var = (t2) gVar.f305712b;
                                    t2Var.getClass();
                                    Intrinsics.checkNotNullParameter(identifier, "identifier");
                                    objF = t2Var.f(identifier);
                                } else {
                                    objF = new go.g(Boolean.FALSE, 2);
                                }
                                arrayList3.add(new t38.e(objF, 24, vkm.q.m(new hve.i(gVar, productSpaceIdentifier, sVar, false, this.A, (Continuation) null)), new e(sVar, gVar, productSpaceIdentifier, null)));
                                arrayList2 = arrayList3;
                            }
                            arrayList.add(new wyd.f((Flow[]) zhm.d0.d1(arrayList2).toArray(new Flow[0]), aVar2, 4));
                            i2 = 10;
                        } else {
                            Flow originFlow = gVar.f305717l.b(new uf0.b((Flow[]) zhm.d0.d1(arrayList).toArray(new Flow[0]), 12), new qfe.g(((jte.d) gVar.o).c(TabAccountsApi$Toggles.HomeDiscoverTilesLimitThree.f89455c) ? 3 : 2));
                            n nVar = gVar.f305719n;
                            z zVar = gVar.f305718m;
                            Intrinsics.checkNotNullParameter(originFlow, "originFlow");
                            qfe.l filterType = this.z;
                            Intrinsics.checkNotNullParameter(filterType, "filterType");
                            wa7.m mVar = zVar.f305756a;
                            if (mVar.c()) {
                                originFlow = new x(yh5.b.d(originFlow, mVar.k()), zVar, filterType, 0);
                            }
                            Intrinsics.checkNotNullParameter(originFlow, "originFlow");
                            this.f305698w = null;
                            this.f305699x = null;
                            this.v = 1;
                            vkm.q.w(flowCollector);
                            Object objCollect = originFlow.collect(new l(flowCollector, nVar, 0), this);
                            fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                            if (objCollect != aVar3) {
                                objCollect = Unit.f186387a;
                            }
                            if (objCollect != aVar3) {
                                objCollect = Unit.f186387a;
                            }
                            if (objCollect == aVar) {
                                return aVar;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f305698w;
                    List list3 = (List) this.f305699x;
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it9 = list3.iterator();
                    while (true) {
                        boolean zHasNext2 = it9.hasNext();
                        g gVar2 = this.f305700y;
                        if (zHasNext2) {
                            vfe.a aVar5 = (vfe.a) it9.next();
                            List list4 = aVar5.f288608c;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it10 = list4.iterator();
                            while (it10.hasNext()) {
                                arrayList5.add(vkm.q.m(new hve.i(gVar2, aVar5.f288606a, (pie.s) it10.next(), true, this.A, (Continuation) null)));
                            }
                            arrayList4.add(arrayList5);
                        } else {
                            Flow originFlow2 = gVar2.f305717l.a(new uf0.b((Flow[]) zhm.d0.d1(zhm.w.u(arrayList4)).toArray(new Flow[0]), 13), new qfe.g(((jte.d) gVar2.o).c(TabAccountsApi$Toggles.HomeDiscoverTilesLimitThree.f89455c) ? 3 : 2));
                            n nVar2 = gVar2.f305719n;
                            z zVar2 = gVar2.f305718m;
                            Intrinsics.checkNotNullParameter(originFlow2, "originFlow");
                            qfe.l filterType2 = this.z;
                            Intrinsics.checkNotNullParameter(filterType2, "filterType");
                            wa7.m mVar2 = zVar2.f305756a;
                            if (mVar2.c()) {
                                originFlow2 = new x(yh5.b.d(originFlow2, mVar2.k()), zVar2, filterType2, 1);
                            }
                            Intrinsics.checkNotNullParameter(originFlow2, "originFlow");
                            this.f305698w = null;
                            this.f305699x = null;
                            this.v = 1;
                            vkm.q.w(flowCollector2);
                            Object objCollect2 = originFlow2.collect(new l(flowCollector2, nVar2, 1), this);
                            fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                            if (objCollect2 != aVar6) {
                                objCollect2 = Unit.f186387a;
                            }
                            if (objCollect2 != aVar6) {
                                objCollect2 = Unit.f186387a;
                            }
                            if (objCollect2 == aVar4) {
                                return aVar4;
                            }
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
