package wnc;

import com.revolut.feature.wealth.models.robo.Template;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.s0;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f298777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f298778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g0 f298779y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, Continuation continuation, g0 g0Var) {
        super(3, continuation);
        this.u = i;
        this.f298779y = g0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(0, continuation, this.f298779y);
                b0Var.f298777w = flowCollector;
                b0Var.f298778x = obj3;
                return b0Var.invokeSuspend(Unit.f186387a);
            default:
                b0 b0Var2 = new b0(1, continuation, this.f298779y);
                b0Var2.f298777w = flowCollector;
                b0Var2.f298778x = obj3;
                return b0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f298777w;
                    Template template = (Template) this.f298778x;
                    vkm.d dVarD = this.f298779y.z.d(template.f95706a);
                    this.f298777w = null;
                    this.f298778x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = dVarD.collect(new s0(flowCollector, template, 11), this);
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
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f298777w;
                    List list = (List) this.f298778x;
                    g0 g0Var = this.f298779y;
                    Flow flowC3 = g0Var.f298794x.c3();
                    u29.c cVar = new u29.c(list, g0Var, (Continuation) null, 29);
                    this.f298777w = null;
                    this.f298778x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect2 = flowC3.collect(new akg.m(flowCollector2, cVar, 5), this);
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
        }
    }
}
