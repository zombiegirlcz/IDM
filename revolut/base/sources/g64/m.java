package g64;

import com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData;
import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import skm.h2;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a f140849w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f140849w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f140849w, continuation, 0);
            default:
                return new m(this.f140849w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar2 = this.f140849w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    nw3.d dVar = aVar2.f67203p;
                    CardOrderingFlowContract$InputData cardOrderingFlowContract$InputData = aVar2.f67204q;
                    h1 h1VarF = w0.F(cardOrderingFlowContract$InputData.getF68243a());
                    boolean f = cardOrderingFlowContract$InputData.getF();
                    this.v = 1;
                    obj2 = dVar.e(h1VarF, f, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (c84.t.N2(aVar2, (it3.d) obj2, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                long jF = kotlin.time.b.f(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.C);
                f fVar = new f(this.f140849w, null, 4);
                this.v = 1;
                Object objB = h2.b(jF, fVar, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
