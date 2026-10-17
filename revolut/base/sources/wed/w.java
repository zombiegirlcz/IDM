package wed;

import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.s0;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f296760w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f296761x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f0 f296762y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, Continuation continuation, f0 f0Var) {
        super(3, continuation);
        this.u = i;
        this.f296762y = f0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                w wVar = new w(0, continuation, this.f296762y);
                wVar.f296760w = flowCollector;
                wVar.f296761x = obj3;
                return wVar.invokeSuspend(Unit.f186387a);
            case 1:
                w wVar2 = new w(1, continuation, this.f296762y);
                wVar2.f296760w = flowCollector;
                wVar2.f296761x = obj3;
                return wVar2.invokeSuspend(Unit.f186387a);
            default:
                w wVar3 = new w(2, continuation, this.f296762y);
                wVar3.f296760w = flowCollector;
                wVar3.f296761x = obj3;
                return wVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Integer num;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f296760w;
                    f0 f0Var = this.f296762y;
                    go.g gVarB = ((l2d.n) f0Var.f296727r).b(zhm.d0.d1(((l) f0Var.t2()).f296742a));
                    this.f296760w = null;
                    this.f296761x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = gVarB.collect(new wa3.h(new s0(flowCollector, f0Var, 7), 14), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
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
                    FlowCollector flowCollector2 = this.f296760w;
                    Pair pair = (Pair) this.f296761x;
                    List list = (List) pair.f186385a;
                    w4l.k loadingStrategy = (w4l.k) pair.f186386b;
                    f0 f0Var2 = this.f296762y;
                    int i3 = u.f296756a[((l) f0Var2.t2()).d.ordinal()];
                    if (i3 == 1) {
                        num = null;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        num = new Integer(list.size() == 1 ? 100 : list.size() * 4);
                    }
                    efd.a aVar3 = f0Var2.f296727r;
                    mgd.g queryParams = new mgd.g(list, zhm.u.c(((l) f0Var2.t2()).d), (List) null, (List) null, num, false, (List) null, Constants.TAG_OS_VERSION);
                    l2d.n nVar = (l2d.n) aVar3;
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(queryParams, "queryParams");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    wkm.l lVarD = nVar.d(queryParams, true, loadingStrategy);
                    this.f296760w = null;
                    this.f296761x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect2 = lVarD.collect(new l2d.e(flowCollector2, queryParams, 1), this);
                    if (objCollect2 != aVar2) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar2) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar2) {
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
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f296760w;
                    j23.b bVarE = ((l2d.n) this.f296762y.f296727r).e((Map) this.f296761x, true);
                    this.f296760w = null;
                    this.f296761x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, bVarE, this) == aVar4) {
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
