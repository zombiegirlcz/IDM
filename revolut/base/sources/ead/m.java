package ead;

import au6.i1;
import au6.k1;
import et6.p1;
import et6.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;
import vkm.y;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f124204w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f124205x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f124206y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, o oVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f124206y = oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m mVar = new m(0, this.f124206y, continuation);
                mVar.f124204w = flowCollector;
                mVar.f124205x = obj3;
                return mVar.invokeSuspend(Unit.f186387a);
            case 1:
                m mVar2 = new m(1, this.f124206y, continuation);
                mVar2.f124204w = flowCollector;
                mVar2.f124205x = obj3;
                return mVar2.invokeSuspend(Unit.f186387a);
            default:
                m mVar3 = new m(2, this.f124206y, continuation);
                mVar3.f124204w = flowCollector;
                mVar3.f124205x = obj3;
                return mVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f124204w;
                    o oVar = this.f124206y;
                    v60.g gVar = oVar.f124208p;
                    String invoiceId = oVar.o.f86422a;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                    p1 p1Var = (p1) gVar.d;
                    Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                    k1 k1Var = (k1) p1Var.f129298b;
                    k1Var.getClass();
                    Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                    y yVarE = rd0.e.e(new y(new a35.j(2, 6, null), new v1(new i1(k1Var, invoiceId, null, 1))), h0.f322473a, new a82.q(3, 3, null));
                    this.f124204w = null;
                    this.f124205x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, yVarE, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f124204w;
                    o oVar2 = this.f124206y;
                    v60.g gVar2 = oVar2.f124208p;
                    String invoiceId2 = oVar2.o.f86422a;
                    gVar2.getClass();
                    Intrinsics.checkNotNullParameter(invoiceId2, "invoiceId");
                    p1 p1Var2 = (p1) gVar2.d;
                    Intrinsics.checkNotNullParameter(invoiceId2, "invoiceId");
                    k1 k1Var2 = (k1) p1Var2.f129298b;
                    k1Var2.getClass();
                    Intrinsics.checkNotNullParameter(invoiceId2, "invoiceId");
                    y yVarE2 = rd0.e.e(new y(new a35.j(2, 5, null), new v1(new i1(k1Var2, invoiceId2, null, 0))), h0.f322473a, new a82.q(3, 2, null));
                    this.f124204w = null;
                    this.f124205x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, yVarE2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f124204w;
                    o oVar3 = this.f124206y;
                    v60.g gVar3 = oVar3.f124208p;
                    String invoiceId3 = oVar3.o.f86422a;
                    gVar3.getClass();
                    Intrinsics.checkNotNullParameter(invoiceId3, "invoiceId");
                    vkm.d dVarB = rd0.e.b(((p1) gVar3.d).d(invoiceId3, false));
                    t0 t0Var = (t0) gVar3.f286251b;
                    akg.n nVarB = t0.b(t0Var);
                    vkm.d dVarA = t0Var.a();
                    od0.i.Companion.getClass();
                    akg.n nVarV = nim.a.v(nim.a.u(new xsd.a(2, 17, null), u0.m(u0.i(dVarB, nVarB, dVarA), zi0.c.i(od0.i.f224256b))), new zrd.q(gVar3, 5));
                    this.f124204w = null;
                    this.f124205x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, nVarV, this) == aVar3) {
                        return aVar3;
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
