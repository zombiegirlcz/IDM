package mll;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mhd.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c f207073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ qll.b0 f207074x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, qll.b0 b0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207073w = cVar;
        this.f207074x = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f207073w, this.f207074x, continuation, 0);
            default:
                return new o(this.f207073w, this.f207074x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.sso.impl.ui.combined_authentication.flow.c cVar = this.f207073w;
                    o0 o0Var = new o0(cVar, this.f207074x, null, 3);
                    this.v = 1;
                    if (cVar.p2(this, o0Var) == aVar) {
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
                    qll.b0 b0Var = this.f207074x;
                    com.revolut.sso.impl.ui.combined_authentication.flow.c cVar2 = this.f207073w;
                    p pVar = new p(b0Var, cVar2, null);
                    this.v = 1;
                    if (cVar2.p2(this, pVar) == aVar2) {
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
