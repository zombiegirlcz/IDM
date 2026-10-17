package za4;

import ab4.m;
import ab4.n;
import c84.t;
import elm.f;
import ft3.h1;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import prl.k;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.esign.a f320565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f320566x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.credit.application.plugins.impl.ui.esign.a aVar, n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f320565w = aVar;
        this.f320566x = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f320565w, this.f320566x, continuation, 0);
            default:
                return new d(this.f320565w, this.f320566x, continuation, 1);
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
        n nVar = this.f320566x;
        com.revolut.feature.credit.application.plugins.impl.ui.esign.a aVar = this.f320565w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ex3.a aVar3 = aVar.f67651q;
                    List list = ((m) nVar).f2878a;
                    h1 h1VarF = w0.F(aVar.f67650p.f67645a);
                    this.v = 1;
                    q24.e eVar = aVar3.f130352a;
                    eVar.getClass();
                    k kVar = new k(eVar, h1VarF, list, (Continuation) null, 15);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(f.f127540b, kVar, this);
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
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    d dVar = new d(aVar, nVar, null, 0);
                    this.v = 1;
                    if (aVar.p2(this, dVar) == aVar4) {
                        return aVar4;
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
