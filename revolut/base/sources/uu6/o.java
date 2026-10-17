package uu6;

import au6.d0;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import et6.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import te0.w;
import tof.s9;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f283153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f283154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a f283155y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f283155y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(0, this.f283155y, continuation);
                oVar.f283153w = flowCollector;
                oVar.f283154x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            case 1:
                o oVar2 = new o(1, this.f283155y, continuation);
                oVar2.f283153w = flowCollector;
                oVar2.f283154x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
            default:
                o oVar3 = new o(2, this.f283155y, continuation);
                oVar3.f283153w = flowCollector;
                oVar3.f283154x = obj3;
                return oVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f283153w;
                    com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a aVar2 = this.f283155y;
                    r10.r rVar = aVar2.f73707p;
                    String str = aVar2.f73709r.f73705a;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_payment-payment-AcquiringPayment-Id$-id$0");
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    z zVar = (z) rVar.f250852b;
                    Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_payment-payment-AcquiringPayment-Id$-id$0");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    d0 d0Var = (d0) zVar.f129388a;
                    d0Var.getClass();
                    Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_payment-payment-AcquiringPayment-Id$-id$0");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    Flow flowE = boh.f.e(d0Var.f.b(new AcquiringPayment$Id(str), loadingStrategy), new eq4.g(rVar, 21));
                    this.f283153w = null;
                    this.f283154x = null;
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f283153w;
                    List list = (List) this.f283154x;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it8 = list.iterator();
                    while (true) {
                        String str2 = null;
                        if (it8.hasNext()) {
                            pr6.o oVar = (pr6.o) it8.next();
                            String str3 = oVar.f238958h;
                            if (str3 != null && oVar.d == pr6.m.RELEASED) {
                                str2 = str3;
                            }
                            if (str2 != null) {
                                linkedHashSet.add(str2);
                            }
                        } else {
                            if (linkedHashSet.isEmpty()) {
                                od0.i.Companion.getClass();
                                gVar = new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
                            } else {
                                gVar = nim.a.v(rd0.e.b(whf.b.a(this.f283155y.f73711t, w.h(new s9(linkedHashSet)), null, null, null, 14)), p.f283156a);
                            }
                            this.f283153w = null;
                            this.f283154x = null;
                            this.v = 1;
                            if (vkm.q.u(flowCollector2, gVar, this) == aVar3) {
                                return aVar3;
                            }
                        }
                    }
                } else {
                    if (i2 != 1) {
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
                    FlowCollector flowCollector3 = this.f283153w;
                    com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a aVar5 = this.f283155y;
                    z zVar2 = aVar5.o;
                    String str4 = aVar5.f73709r.f73705a;
                    zVar2.getClass();
                    Intrinsics.checkNotNullParameter(str4, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_payment-payment-AcquiringPayment-Id$-id$0");
                    w4l.i loadingStrategy2 = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    d0 d0Var2 = (d0) zVar2.f129388a;
                    d0Var2.getClass();
                    Intrinsics.checkNotNullParameter(str4, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_payment-payment-AcquiringPayment-Id$-id$0");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.d dVarB = d0Var2.f9512g.b(new AcquiringPayment$Id(str4), loadingStrategy2);
                    this.f283153w = null;
                    this.f283154x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB, this) == aVar4) {
                        return aVar4;
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
