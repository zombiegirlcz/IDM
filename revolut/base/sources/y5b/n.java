package y5b;

import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsBillingService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f311055w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311055w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f311055w, continuation, 0);
            default:
                return new n(this.f311055w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                p pVar = this.f311055w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsBillingService cobrandedCardsBillingService = pVar.f311057a;
                    this.v = 1;
                    if (cobrandedCardsBillingService.cancelPlanTermination(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                pVar.f311059c.clear();
                pVar.f311058b.clear();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                p pVar2 = this.f311055w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsBillingService cobrandedCardsBillingService2 = pVar2.f311057a;
                    this.v = 1;
                    if (cobrandedCardsBillingService2.schedulePlanTermination(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                pVar2.f311059c.clear();
                pVar2.f311058b.clear();
                return Unit.f186387a;
        }
    }
}
