package n0c;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import tof.a3;
import tof.i1;
import tof.s9;
import zhm.d0;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f210998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f210999x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.transactions.details.b f211000y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Continuation continuation, com.revolut.feature.rev_points.impl.ui.transactions.details.b bVar, String str, int i) {
        super(3, continuation);
        this.u = i;
        this.f211000y = bVar;
        this.z = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(continuation, this.f211000y, this.z, 0);
                sVar.f210998w = flowCollector;
                sVar.f210999x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            default:
                s sVar2 = new s(continuation, this.f211000y, this.z, 1);
                sVar2.f210998w = flowCollector;
                sVar2.f210999x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f210998w;
                    List list = (List) this.f210999x;
                    com.revolut.domain.interactors.transactions.a aVar2 = this.f211000y.f83855q;
                    s9 s9Var = new s9(y0.b(this.z));
                    List listC = list;
                    if (listC.isEmpty()) {
                        listC = zhm.u.c(i1.f272794a);
                    }
                    efm.r rVarX = com.revolut.domain.interactors.transactions.a.b(aVar2, s9Var, listC, new Integer(1), null, null, 24).o(f0.f322471a).x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                    vkm.d dVarB = rd0.e.b(rVarX);
                    this.f210998w = null;
                    this.f210999x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f210998w;
                    List list2 = (List) this.f210999x;
                    Intrinsics.h(list2);
                    a3 a3Var = (a3) d0.d0(list2);
                    if (a3Var == null || (str = a3Var.f272581b) == null) {
                        str = this.z;
                    }
                    jhi.b bVarI2 = this.f211000y.I2(str);
                    this.f210998w = null;
                    this.f210999x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, bVarI2, this) == aVar3) {
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
