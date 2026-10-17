package xnl;

import akl.l;
import akl.r;
import gkl.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rqk.k;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.passcode.change_flow.a f307517w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.sso.impl.ui.passcode.change_flow.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f307517w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f307517w, continuation, 0);
            default:
                return new e(this.f307517w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.sso.impl.ui.passcode.change_flow.a aVar2 = this.f307517w;
                l lVar = aVar2.f106594p;
                String str = ((k) aVar2.f106596r).f256593p;
                m mVar = m.PIN;
                h0 h0Var = h0.f322473a;
                this.v = 1;
                Object objF = ((r) lVar).f(str, null, mVar, null, h0Var, this);
                return objF == aVar ? aVar : objF;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.sso.impl.ui.passcode.change_flow.a aVar4 = this.f307517w;
                e eVar = new e(aVar4, null, 0);
                this.v = 1;
                Object objP2 = aVar4.p2(this, eVar);
                return objP2 == aVar3 ? aVar3 : objP2;
        }
    }
}
