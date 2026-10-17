package jfb;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class t0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.reverywhere.impl.web_app.d f173839w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(com.revolut.feature.retail.reverywhere.impl.web_app.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f173839w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t0 t0Var = new t0(this.f173839w, continuation, 0);
                t0Var.v = obj2;
                return t0Var;
            default:
                t0 t0Var2 = new t0(this.f173839w, continuation, 1);
                t0Var2.v = obj2;
                return t0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t0) create((g0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.retail.reverywhere.impl.web_app.d dVar = this.f173839w;
        switch (i) {
            case 0:
                g0 g0Var = (g0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.B, new jeg.g(g0Var, 3));
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.B, new j45.m(data, 24));
                break;
        }
        return Unit.f186387a;
    }
}
