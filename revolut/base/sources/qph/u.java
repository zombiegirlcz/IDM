package qph;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f248421w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f248422x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a f248423y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f248423y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u uVar = new u(0, this.f248423y, continuation);
                uVar.f248421w = flowCollector;
                uVar.f248422x = obj3;
                return uVar.invokeSuspend(Unit.f186387a);
            default:
                u uVar2 = new u(1, this.f248423y, continuation);
                uVar2.f248421w = flowCollector;
                uVar2.f248422x = obj3;
                return uVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f248421w;
                    Pair pair = (Pair) this.f248422x;
                    String str = (String) pair.f186385a;
                    List list = (List) pair.f186386b;
                    if (str == null || d0.W(str)) {
                        str = null;
                    }
                    if (list == null || str == null) {
                        gVar = null;
                    } else {
                        zsc.m.Companion.getClass();
                        zsc.m mVarA = zsc.l.a(str);
                        com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar2 = this.f248423y;
                        zsc.f fVar = new zsc.f(aVar2.z, mVarA);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (fVar.a((zel.g) obj3)) {
                                arrayList.add(obj3);
                            }
                        }
                        gVar = aVar2.f96223x.P(arrayList, aVar2.o.f96208a, w4l.h.f294642c);
                    }
                    if (gVar == null) {
                        gVar = new go.g(null, 2);
                    }
                    this.f248421w = null;
                    this.f248422x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f248421w;
                    w4l.k loadingStrategy = (w4l.k) this.f248422x;
                    com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar4 = this.f248423y;
                    jul.o oVar = aVar4.f96217p;
                    zel.f instrumentGroup = aVar4.o.f96208a;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    Flow flowE = boh.f.e(((kbb.c) oVar.f178695b).M(instrumentGroup, loadingStrategy), new pza.d(oVar, 23, instrumentGroup, loadingStrategy));
                    this.f248421w = null;
                    this.f248422x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowE, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
