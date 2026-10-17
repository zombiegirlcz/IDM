package m94;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.e f203629w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f203629w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f203629w, continuation, 0);
            case 1:
                return new e(this.f203629w, continuation, 1);
            default:
                return new e(this.f203629w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.e eVar = this.f203629w;
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.c cVar = new com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.c(eVar, null, 2);
                this.v = 1;
                Object objB = pu7.a.B(eVar.k, "confirm debts plugin", cVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.e eVar2 = this.f203629w;
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.a aVar3 = new com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.a(eVar2, null);
                this.v = 1;
                Object objB2 = pu7.a.B(eVar2.k, "confirm intro", aVar3, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.e eVar3 = this.f203629w;
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.b bVar = new com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.b(eVar3, null);
                this.v = 1;
                Object objB3 = pu7.a.B(eVar3.k, "confirm intro", bVar, this);
                return objB3 == aVar4 ? aVar4 : objB3;
        }
    }
}
