package gc1;

import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlow;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlowContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ma1.t;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f142306w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f142306w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f142306w, continuation, 0);
            case 1:
                return new p(this.f142306w, continuation, 1);
            default:
                return new p(this.f142306w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        q qVar = this.f142306w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return Unit.f186387a;
                }
                yhm.o.b(obj2);
                dfc.a aVar2 = qVar.f142308q;
                this.v = 1;
                aVar2.getClass();
                throw new IllegalStateException("Locations is not supported in Retail app");
            case 1:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ma1.o oVar = qVar.f142307p;
                    this.v = 1;
                    Object objB = nim.a.b(((t) oVar.f203895b).b(), this);
                    if (objB != obj3) {
                        objB = Unit.f186387a;
                    }
                    if (objB == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    ma1.o oVar2 = qVar.f142307p;
                    this.v = 1;
                    Object objB2 = nim.a.b(((t) oVar2.f203895b).b(), this);
                    if (objB2 != obj4) {
                        objB2 = Unit.f186387a;
                    }
                    if (objB2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yji.l.i2(qVar, new CardReaderConnectionFlow(new CardReaderConnectionFlowContract$InputData(false)), null, new gaf.l(5), 1);
                return Unit.f186387a;
        }
    }
}
