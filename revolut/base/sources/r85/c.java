package r85;

import efm.d0;
import efm.r;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import r6d.h;
import y45.f;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b f252370w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f252370w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f252370w, continuation, 0);
            default:
                return new c(this.f252370w, continuation, 1);
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
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                d0 d0VarF = this.f252370w.f70596r.f(false);
                this.v = 1;
                Object objB = nim.a.b(d0VarF, this);
                return objB == aVar ? aVar : objB;
            default:
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
                com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b bVar = this.f252370w;
                r rVarG = m70.a.g(((f) bVar.f70594p).l(bVar.o.f70587a, w4l.i.f294643c), null, new h(11), 1);
                this.v = 1;
                Object objC = nim.a.c(rVarG, this);
                return objC == aVar2 ? aVar2 : objC;
        }
    }
}
