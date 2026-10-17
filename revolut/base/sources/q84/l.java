package q84;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f242979w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.debts.c f242980x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f242980x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f242980x, continuation, 0);
                lVar.f242979w = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f242980x, continuation, 1);
                lVar2.f242979w = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.f242979w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar = this.f242980x;
                    oqk.h hVar = new oqk.h(cVar, coroutineScope, (Continuation) null, 10);
                    this.f242979w = null;
                    this.v = 1;
                    if (cVar.p2(this, hVar) == aVar) {
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
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f242979w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar2 = this.f242980x;
                    com.revolut.feature.credit.application.plugins.impl.ui.debts.b bVar = new com.revolut.feature.credit.application.plugins.impl.ui.debts.b(cVar2, coroutineScope2, null);
                    this.f242979w = null;
                    this.v = 1;
                    if (cVar2.p2(this, bVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
