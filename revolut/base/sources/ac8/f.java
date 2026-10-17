package ac8;

import a26.j;
import a2g.m;
import a35.k;
import a9d.p;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.q;
import vkm.y;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a f3102w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3102w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f3102w, continuation, 0);
            default:
                return new f(this.f3102w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a.I2(this.f3102w, this) == aVar) {
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
                com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a aVar3 = this.f3102w;
                if (i2 == 0) {
                    o.b(obj2);
                    y yVarE = rd0.e.e(mo3.a.h(rd0.e.b(aVar3.f76829p.e0(aVar3.o.f76822a, w4l.h.f294642c)), new m(11), new p(10), 2), h0.f322473a, new k(3, 2, null));
                    this.v = 1;
                    obj2 = q.x(yVarE, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar3.H2(aVar3.z, new j((List) obj2, 6));
                return Unit.f186387a;
        }
    }
}
