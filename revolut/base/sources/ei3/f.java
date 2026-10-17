package ei3;

import c7i.d0;
import com.revolut.data.model.Data;
import gr.r;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.joda.time.DateTime;
import tof.cc;
import tof.fc;
import tof.hc;
import tof.i1;
import tof.i7;
import tof.n7;
import tof.ob;
import tof.q6;
import tof.y6;
import vkm.q;
import vkm.v1;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f126366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f126367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f126368y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, long j2, Object obj2, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.z = obj2;
        this.f126367x = j2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (this.u) {
            case 0:
                m mVar = (m) this.z;
                int i = 0;
                f fVar = new f(i, this.f126367x, mVar, (Continuation) obj4);
                fVar.f126366w = flowCollector;
                fVar.f126368y = obj3;
                return fVar.invokeSuspend(Unit.f186387a);
            case 1:
                lr.j jVar = (lr.j) this.z;
                int i2 = 1;
                f fVar2 = new f(i2, this.f126367x, jVar, (Continuation) obj4);
                fVar2.f126366w = flowCollector;
                fVar2.f126368y = (Object[]) obj3;
                return fVar2.invokeSuspend(Unit.f186387a);
            default:
                zge.i iVar = (zge.i) this.z;
                int i3 = 2;
                f fVar3 = new f(i3, this.f126367x, iVar, (Continuation) obj4);
                fVar3.f126366w = flowCollector;
                fVar3.f126368y = obj3;
                return fVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        long j2 = this.f126367x;
        Object obj3 = this.z;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f126366w;
                    v1 v1Var = new v1(new d0(this.f126367x, (dj0.d) this.f126368y, (m) obj3, (Continuation) null, 1));
                    this.f126366w = null;
                    this.f126368y = null;
                    this.v = 1;
                    if (q.u(flowCollector, v1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f126366w;
                    r rVar = new r(((lr.j) obj3).f199346b + j2, kotlin.collections.d.v0((gr.q[]) ((Object[]) this.f126368y)));
                    this.f126366w = null;
                    this.f126368y = null;
                    this.v = 1;
                    if (flowCollector2.emit(rVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f126366w;
                    n38.a aVar4 = (n38.a) ((Data) this.f126368y).getContent();
                    q6[] elements = {i1.f272794a, (aVar4 == null || (str = aVar4.f211924b) == null) ? null : new hc(str, null)};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    List listL = kotlin.collections.d.L(elements);
                    com.revolut.domain.interactors.transactions.a aVar5 = ((zge.i) obj3).d;
                    i7.c cVar = i7.Companion;
                    i7[] i7VarArr = {new cc(v.k(y6.TRANSFER, y6.TOPUP)), new n7(), new ob(new DateTime(j2), false), fc.b(i7.y.f272830a)};
                    cVar.getClass();
                    vkm.d dVarB = rd0.e.b(com.revolut.domain.interactors.transactions.a.d(aVar5, i7.c.a(i7VarArr), listL, null, null, null, 28));
                    this.f126366w = null;
                    this.f126368y = null;
                    this.v = 1;
                    if (q.u(flowCollector3, dVarB, this) == aVar3) {
                        return aVar3;
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
