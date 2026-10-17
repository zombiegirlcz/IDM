package r74;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b f252006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ty0.a f252007x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b bVar, ty0.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f252006w = bVar;
        this.f252007x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f252006w, this.f252007x, continuation, 0);
            default:
                return new r(this.f252006w, this.f252007x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar = this.f252006w.f67335p;
                String str = this.f252007x.f275445a;
                lg0.a aVar2 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, str, aVar2, null, this, 4);
                return objX1 == aVar ? aVar : objX1;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar2 = this.f252006w.f67335p;
                String str2 = this.f252007x.f275445a;
                lg0.a aVar4 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX12 = lg0.b.x1(xVar2, str2, aVar4, null, this, 4);
                return objX12 == aVar3 ? aVar3 : objX12;
        }
    }
}
