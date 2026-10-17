package eq4;

import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelAction;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditCardModelAction.Deeplink f128243w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d dVar, CreditCardModelAction.Deeplink deeplink, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f128243w = deeplink;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f128243w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        CreditCardModelAction.Deeplink deeplink = this.f128243w;
        com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d dVar = this.v;
        e eVar = new e(dVar, deeplink, null);
        this.u = 1;
        Object objB = pu7.a.B(dVar.k, "Open deeplink", eVar, this);
        return objB == aVar ? aVar : objB;
    }
}
