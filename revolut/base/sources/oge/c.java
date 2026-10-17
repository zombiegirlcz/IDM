package oge;

import cie.c1;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.h;
import vkm.q;
import vkm.v1;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f225127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f225128x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f225129y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Continuation continuation, f fVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f225129y = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c cVar = new c(continuation, this.f225129y, 0);
                cVar.f225127w = flowCollector;
                cVar.f225128x = obj3;
                return cVar.invokeSuspend(Unit.f186387a);
            default:
                c cVar2 = new c(continuation, this.f225129y, 1);
                cVar2.f225127w = flowCollector;
                cVar2.f225128x = obj3;
                return cVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f225127w;
                    ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) this.f225128x;
                    h hVarR = q.r(d.f225130a, this.f225129y.f225133m.a(oi0.d.K(productAccountDescriptor$Value)));
                    this.f225127w = null;
                    this.f225128x = null;
                    this.v = 1;
                    q.w(flowCollector);
                    Object objCollect = hVarR.collect(new c1(flowCollector, productAccountDescriptor$Value, 1), this);
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
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f225127w;
                    v1 v1Var = new v1(new of6.d(this.f225129y, (ProductAccountDescriptor$Value) this.f225128x, (Continuation) null, 1));
                    this.f225127w = null;
                    this.f225128x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, v1Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
