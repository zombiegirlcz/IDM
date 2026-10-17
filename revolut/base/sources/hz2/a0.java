package hz2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f156984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.cardagreements.screens.overview.a f156985x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.feature.card_management.impl.cardagreements.screens.overview.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f156985x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f156985x, continuation, 0);
                a0Var.f156984w = obj2;
                return a0Var;
            default:
                a0 a0Var2 = new a0(this.f156985x, continuation, 1);
                a0Var2.f156984w = obj2;
                return a0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.f156984w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_management.impl.cardagreements.screens.overview.a aVar2 = this.f156985x;
                    z zVar = new z(aVar2, coroutineScope, null, 0);
                    this.f156984w = null;
                    this.v = 1;
                    if (u0.b0(aVar2.X(), "ACCEPT_BUTTON_TAG", zVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f156984w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_management.impl.cardagreements.screens.overview.a aVar4 = this.f156985x;
                    z zVar2 = new z(aVar4, coroutineScope2, null, 1);
                    this.f156984w = null;
                    this.v = 1;
                    if (u0.b0(aVar4.X(), "ACCEPT_BUTTON_TAG", zVar2, this) == aVar3) {
                        return aVar3;
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
