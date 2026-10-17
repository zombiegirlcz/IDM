package qna;

import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import q97.b1;
import vkm.q0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f247911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f247912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f247913y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Continuation continuation, s sVar) {
        super(3, continuation);
        this.u = i;
        this.f247913y = sVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(0, continuation, this.f247913y);
                iVar.f247911w = flowCollector;
                iVar.f247912x = obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            case 1:
                i iVar2 = new i(1, continuation, this.f247913y);
                iVar2.f247911w = flowCollector;
                iVar2.f247912x = obj3;
                return iVar2.invokeSuspend(Unit.f186387a);
            default:
                i iVar3 = new i(2, continuation, this.f247913y);
                iVar3.f247911w = flowCollector;
                iVar3.f247912x = obj3;
                return iVar3.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        Flow q0Var;
        int i2;
        vkm.f fVarJ;
        int i3 = this.u;
        s sVar = this.f247913y;
        Continuation continuation = null;
        switch (i3) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f247911w;
                    Flow b1Var = ((Boolean) this.f247912x).booleanValue() ? new b1(rd0.e.b(xv5.c.b(sVar.v)), 9) : new go.g(null, 2);
                    this.f247911w = null;
                    this.f247912x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, b1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f247911w;
                    Flow flowA = ((Boolean) this.f247912x).booleanValue() ? sVar.u.a() : new go.g(null, 2);
                    this.f247911w = null;
                    this.f247912x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowA, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f247911w;
                    qla.a aVar4 = (qla.a) this.f247912x;
                    hwl.c cVar = sVar.f247931w;
                    oqk.b bVar = sVar.f247928r;
                    int i22 = h.f247910a[aVar4.ordinal()];
                    int i32 = 29;
                    int i33 = 5;
                    int i43 = 0;
                    if (i22 != 1) {
                        if (i22 == 2) {
                            q0 q0Var2 = new q0(mo3.a.g(rd0.e.b(bVar.b()), null, null, 3), new q(i43, continuation, sVar), 1);
                            q0 q0VarI2 = sVar.I2();
                            q0 q0VarJ2 = sVar.J2();
                            cVar.getClass();
                            Boolean bool = (Boolean) jo0.g.u.getValue();
                            bool.booleanValue();
                            fVarJ = vkm.q.J(q0Var2, q0VarI2, q0VarJ2, new q0(new go.g(bool, 2), new jkh.g(sVar, continuation, i32), 1));
                        } else {
                            if (i22 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fVarJ = vkm.q.J(sVar.I2(), sVar.J2(), new q0(new b1(rd0.e.b(xv5.c.b(sVar.v)), 10), new k(i33, continuation, sVar), 1));
                        }
                        i2 = 1;
                    } else {
                        q0 q0Var3 = new q0(mo3.a.g(rd0.e.b(bVar.b()), null, null, 3), new q(i43, continuation, sVar), 1);
                        q0 q0VarI22 = sVar.I2();
                        Set set = sVar.f247926p;
                        if (set.isEmpty()) {
                            q0Var = vkm.i.f290039a;
                            i = 1;
                        } else {
                            Set<tla.a> set2 = set;
                            ArrayList arrayList = new ArrayList(w.t(set2, 10));
                            for (tla.a aVar5 : set2) {
                                arrayList.add(vkm.q.Q(rd0.e.e(aVar5.a(), h0.f322473a, new otd.a(3, 25, null)), new q7b.j(continuation, aVar5, 18)));
                            }
                            i = 1;
                            q0Var = new q0(new j23.b((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 15), new k(i, continuation, sVar), 1);
                        }
                        ji5.m mVar = sVar.o;
                        q0 q0Var4 = new q0(vkm.q.Q(vkm.q.Q(mVar.b(), new ji5.k(continuation, mVar, i)), new i(i43, continuation, sVar)), new k(i43, continuation, sVar), i);
                        uke.a aVar6 = sVar.f247930t;
                        q0 q0Var5 = new q0(vkm.q.Q(rd0.e.e(mo3.a.g(nim.a.v(vkm.q.Q(aVar6.a(), new uec.d(continuation, aVar6, 5)), new ql6.s(27)), null, new qjj.g(14), 1), h0.f322473a, new otd.a(3, 27, null)), new i(1, continuation, sVar)), new k(4, continuation, sVar), 1);
                        q0 q0VarJ22 = sVar.J2();
                        cVar.getClass();
                        Boolean bool2 = (Boolean) jo0.g.u.getValue();
                        bool2.booleanValue();
                        i2 = 1;
                        fVarJ = vkm.q.J(q0Var3, q0VarI22, q0Var, q0Var4, q0Var5, q0VarJ22, new q0(new go.g(bool2, 2), new jkh.g(sVar, continuation, 29), 1));
                    }
                    this.f247911w = null;
                    this.f247912x = null;
                    this.v = i2;
                    if (vkm.q.u(flowCollector3, fVarJ, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
