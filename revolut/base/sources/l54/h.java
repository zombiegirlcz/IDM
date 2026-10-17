package l54;

import c84.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import ufm.n;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b f192156w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f192156w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f192156w, continuation, 0);
            case 1:
                return new h(this.f192156w, continuation, 1);
            default:
                return new h(this.f192156w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar = this.f192156w;
                    g gVar = new g(bVar, null);
                    this.v = 1;
                    if (bVar.p2(this, gVar) == aVar) {
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
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (t.N2(this.f192156w, null, this, 3) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar2 = this.f192156w;
                if (i3 == 0) {
                    o.b(obj2);
                    n nVarH = bVar2.f67135r.h(w0.F(bVar2.f67133p.f67121c));
                    this.v = 1;
                    obj2 = nim.a.b(nVarH, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
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
                if (t.N2(bVar2, dVar, this, 2) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
        }
    }
}
