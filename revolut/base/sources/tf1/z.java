package tf1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class z extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f270207w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f270208x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f270207w = c0Var;
        this.f270208x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z zVar = new z(this.f270207w, this.f270208x, continuation);
        zVar.v = obj2;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        FlowCollector flowCollector = (FlowCollector) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            c0 c0Var = this.f270207w;
            jt0.b bVar = c0Var.f270150b;
            Continuation continuation = null;
            wkm.l lVarQ = vkm.q.Q(rd0.e.n(((qm.e) bVar.f178265b).f(), zhm.h0.f322473a), new s9b.n(continuation, bVar, 27));
            sx2.r rVar = new sx2.r(c0Var, continuation, 26);
            this.v = null;
            this.u = 1;
            vkm.q.w(flowCollector);
            Object objCollect = lVarQ.collect(new akg.m(new te8.j(new y(flowCollector, c0Var, this.f270208x, 0), 7), rVar, 5), this);
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
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
    }
}
