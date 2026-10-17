package f03;

import do3.q;
import gim.i;
import h93.f0;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n14.k;
import pfm.h;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f130995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f0 f130996x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, f0 f0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f130995w = dVar;
        this.f130996x = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f130995w, this.f130996x, continuation, 0);
            case 1:
                return new c(this.f130995w, this.f130996x, continuation, 1);
            default:
                return new c(this.f130995w, this.f130996x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    h hVarG = ((x) this.f130995w.f130999n).G(this.f130996x.f150110a);
                    this.v = 1;
                    if (nim.a.a(hVarG, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                f0 f0Var = this.f130996x;
                b bVar = new b(f0Var, 0);
                d dVar = this.f130995w;
                c cVar = new c(dVar, f0Var, null, 0);
                this.v = 1;
                Object objW = k.W(dVar, null, null, bVar, cVar, this, 3);
                return objW == aVar2 ? aVar2 : objW;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                d dVar2 = this.f130995w;
                c cVar2 = new c(dVar2, this.f130996x, null, 1);
                this.v = 1;
                Object objU = q.u(dVar2, cVar2, this);
                return objU == aVar3 ? aVar3 : objU;
        }
    }
}
