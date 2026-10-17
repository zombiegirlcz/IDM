package s38;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import t38.p;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ io3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f259449w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(io3.d dVar, h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f259449w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f259449w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            io3.d dVar = this.v;
            sfe.m mVar = new sfe.m("PERFORM_DEACTIVATE_ACTION", new ProductAccountId(dVar.f163145a, null), dVar);
            p pVar = this.f259449w.o;
            this.u = 1;
            if (pVar.b3(mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
