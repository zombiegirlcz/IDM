package yrb;

import java.math.BigDecimal;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nel.s0;
import vkm.j2;
import vkm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f316223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f316224x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f316225y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, Continuation continuation, s sVar) {
        super(3, continuation);
        this.u = i;
        this.f316225y = sVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m mVar = new m(0, continuation, this.f316225y);
                mVar.f316223w = flowCollector;
                mVar.f316224x = obj3;
                return mVar.invokeSuspend(Unit.f186387a);
            case 1:
                m mVar2 = new m(1, continuation, this.f316225y);
                mVar2.f316223w = flowCollector;
                mVar2.f316224x = obj3;
                return mVar2.invokeSuspend(Unit.f186387a);
            case 2:
                m mVar3 = new m(2, continuation, this.f316225y);
                mVar3.f316223w = flowCollector;
                mVar3.f316224x = obj3;
                return mVar3.invokeSuspend(Unit.f186387a);
            default:
                m mVar4 = new m(3, continuation, this.f316225y);
                mVar4.f316223w = flowCollector;
                mVar4.f316224x = obj3;
                return mVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f316223w;
                    String str = (String) this.f316224x;
                    s sVar = this.f316225y;
                    Flow flowE = boh.f.e(nim.a.v(kdh.b.b0(sVar.f316232l, str, 6), new fjm.j(sVar, 15)), new n(sVar, 0));
                    this.f316223w = null;
                    this.f316224x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f316223w;
                    Pair pair = (Pair) this.f316224x;
                    bfl.g gVar = (bfl.g) pair.f186385a;
                    s0 s0Var = (s0) pair.f186386b;
                    Map map = this.f316225y.f316236q;
                    nel.n nVar = s0Var.e;
                    qrb.q.Companion.getClass();
                    qrb.q qVarA = qrb.p.a(nVar);
                    if (qVarA == null || !map.containsKey(qVarA)) {
                        throw new IllegalStateException("No " + o0.f186429a.b(orb.j.class) + " found for instrument type " + nVar.f214597c);
                    }
                    Flow flowB = ((orb.j) r0.h(qVarA, map)).b(gVar, s0Var);
                    this.f316223w = null;
                    this.f316224x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f316223w;
                    s0 s0Var2 = (s0) this.f316224x;
                    Map map2 = this.f316225y.f316236q;
                    nel.n nVar2 = s0Var2.e;
                    qrb.q.Companion.getClass();
                    qrb.q qVarA2 = qrb.p.a(nVar2);
                    if (qVarA2 == null || !map2.containsKey(qVarA2)) {
                        throw new IllegalStateException("No " + o0.f186429a.b(orb.j.class) + " found for instrument type " + nVar2.f214597c);
                    }
                    Flow flowC = ((orb.j) r0.h(qVarA2, map2)).c(s0Var2.d, s0Var2.e);
                    this.f316223w = null;
                    this.f316224x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowC, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f316223w;
                    yhm.r rVar = (yhm.r) this.f316224x;
                    bfl.g gVar2 = (bfl.g) rVar.f314201a;
                    qrb.k kVar = (qrb.k) rVar.f314202b;
                    BigDecimal bigDecimal = (BigDecimal) rVar.f314203c;
                    s sVar2 = this.f316225y;
                    Map map3 = sVar2.f316236q;
                    nel.n nVarN = kVar.n();
                    qrb.q.Companion.getClass();
                    qrb.q qVarA3 = qrb.p.a(nVarN);
                    if (qVarA3 == null || !map3.containsKey(qVarA3)) {
                        throw new IllegalStateException("No " + o0.f186429a.b(orb.j.class) + " found for instrument type " + nVarN.f214597c);
                    }
                    orb.j jVar = (orb.j) r0.h(qVarA3, map3);
                    q0 q0VarD = c8g.c.d(jVar.d(gVar2, kVar, bigDecimal, ((x) ((j2) sVar2.z.f22677a).getValue()).f316253c), new xnd.c(sVar2, jVar, 6));
                    this.f316223w = null;
                    this.f316224x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, q0VarD, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
