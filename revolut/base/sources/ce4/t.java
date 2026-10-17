package ce4;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.z1;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d f23386w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a f23387x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ oki.g f23388y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar, com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a aVar, oki.g gVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f23386w = dVar;
        this.f23387x = aVar;
        this.f23388y = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f23386w, this.f23387x, this.f23388y, continuation, 0);
            default:
                return new t(this.f23386w, this.f23387x, this.f23388y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                n nVar = this.f23386w.f67998q;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    List list = ((nf4.h) this.f23387x).f214811a;
                    this.v = 1;
                    if (nVar.j(list, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        z1 z1Var = nVar.e;
                        Unit unit = Unit.f186387a;
                        z1Var.k(unit);
                        this.f23388y.pop();
                        return unit;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                wy3.j jVar = nVar.d;
                if (jVar != null) {
                    nVar.f23376c = jVar;
                }
                nVar.d = null;
                if (Unit.f186387a == aVar) {
                    return aVar;
                }
                z1 z1Var2 = nVar.e;
                Unit unit2 = Unit.f186387a;
                z1Var2.k(unit2);
                this.f23388y.pop();
                return unit2;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar = this.f23386w;
                    t tVar = new t(dVar, this.f23387x, this.f23388y, null, 0);
                    this.v = 1;
                    if (dVar.p2(this, tVar) == aVar2) {
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
