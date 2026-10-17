package l3d;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import n4d.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends gim.i implements Function3 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Integer D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f191887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f191888x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h0 f191889y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Continuation continuation, h0 h0Var, String str, boolean z, boolean z3, boolean z4, Integer num, List list) {
        super(3, continuation);
        this.f191889y = h0Var;
        this.E = str;
        this.A = z;
        this.B = z3;
        this.C = z4;
        this.D = num;
        this.z = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(continuation, this.f191889y, (String) this.E, this.A, this.B, this.C, this.D, this.z);
                c0Var.f191887w = flowCollector;
                c0Var.f191888x = obj3;
                return c0Var.invokeSuspend(Unit.f186387a);
            default:
                c0 c0Var2 = new c0(continuation, this.f191889y, this.z, this.A, this.B, this.C, this.D, (List) this.E);
                c0Var2.f191887w = flowCollector;
                c0Var2.f191888x = obj3;
                return c0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowQ;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f191887w;
                    List list = (List) this.f191888x;
                    if (list.isEmpty()) {
                        flowQ = new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
                    } else {
                        String orderingKey = (String) this.E;
                        h0 h0Var = this.f191889y;
                        r0 r0Var = h0Var.f191909a;
                        Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
                        w4l.h loadingStrategy = w4l.h.f294642c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        flowQ = vkm.q.Q(mo3.a.f(rd0.e.b(r0Var.k.e(orderingKey, loadingStrategy)), new f28.b0(orderingKey, 7), new k8d.t(20), new l2c.v(2)), new c0((Continuation) null, h0Var, list, this.A, this.B, this.C, this.D, this.z));
                    }
                    this.f191887w = null;
                    this.f191888x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowQ, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f191887w;
                    ogd.a aVar3 = (ogd.a) this.f191888x;
                    Set setI1 = zhm.d0.i1(this.z);
                    List list2 = (List) this.E;
                    h0 h0Var2 = this.f191889y;
                    Flow flowH = xam.a.h(new g0(h0Var2, aVar3, list2, this.D, this.A, this.B, this.C, null), h0Var2.f191909a.g(zhm.d0.d1(setI1), true));
                    this.f191887w = null;
                    this.f191888x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowH, this) == aVar2) {
                        return aVar2;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Continuation continuation, h0 h0Var, List list, boolean z, boolean z3, boolean z4, Integer num, List list2) {
        super(3, continuation);
        this.f191889y = h0Var;
        this.z = list;
        this.A = z;
        this.B = z3;
        this.C = z4;
        this.D = num;
        this.E = list2;
    }
}
