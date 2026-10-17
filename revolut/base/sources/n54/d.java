package n54;

import c84.t;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import ufm.n;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a f212545w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f212545w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f212545w, continuation, 0);
            default:
                return new d(this.f212545w, continuation, 1);
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
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a aVar2 = this.f212545w;
                    c cVar = new c(aVar2, null);
                    this.v = 1;
                    if (aVar2.p2(this, cVar) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a aVar4 = this.f212545w;
                if (i2 == 0) {
                    o.b(obj2);
                    n nVarH = aVar4.f67146r.h(w0.F(aVar4.f67144p.f67139a));
                    this.v = 1;
                    obj2 = nim.a.b(nVarH, this);
                    if (obj2 == aVar3) {
                        return aVar3;
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
                it3.e eVar = (it3.e) obj2;
                Intrinsics.h(eVar);
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                it3.d dVar = eVar instanceof it3.d ? (it3.d) eVar : null;
                this.v = 2;
                if (t.N2(aVar4, dVar, this, 2) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
        }
    }
}
