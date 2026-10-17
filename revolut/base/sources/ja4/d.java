package ja4;

import c84.t;
import elm.f;
import ft3.h1;
import gim.i;
import gsh.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import oy3.g;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.a f172437w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f172438x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.a aVar, g gVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f172437w = aVar;
        this.f172438x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f172437w, this.f172438x, continuation, 0);
            default:
                return new d(this.f172437w, this.f172438x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.a aVar = this.f172437w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    o7.b bVar = aVar.f67614q;
                    h1 h1VarF = w0.F(aVar.f67613p.f67609a);
                    this.v = 1;
                    w wVar = new w((r10.a) bVar.f222639b, this.f172438x, h1VarF, null, 13);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(f.f127540b, wVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(aVar, (it3.d) obj2, this, 2) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    d dVar = new d(aVar, this.f172438x, null, 0);
                    this.v = 1;
                    if (aVar.p2(this, dVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
