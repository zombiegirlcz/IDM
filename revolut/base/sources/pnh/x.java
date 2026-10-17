package pnh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.ui.impl.trades.b f237803w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dfl.e f237804x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.feature.wealth.ui.impl.trades.b bVar, dfl.e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f237803w = bVar;
        this.f237804x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f237803w, this.f237804x, continuation, 0);
            default:
                return new x(this.f237803w, this.f237804x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((x) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    dfl.e eVar = this.f237804x;
                    com.revolut.feature.wealth.ui.impl.trades.b bVar = this.f237803w;
                    w wVar = new w(bVar, eVar, null);
                    this.v = 1;
                    if (bVar.p2(this, wVar) == aVar) {
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
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.wealth.ui.impl.trades.b bVar2 = this.f237803w;
                t tVar = new t(bVar2, 0);
                ack.n nVar = new ack.n(19);
                x xVar = new x(bVar2, this.f237804x, null, 0);
                this.v = 1;
                Object objP = n14.k.P(bVar2.X(), null, tVar, nVar, xVar, this);
                return objP == aVar2 ? aVar2 : objP;
        }
    }
}
