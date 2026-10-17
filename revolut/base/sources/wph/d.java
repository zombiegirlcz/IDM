package wph;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a f299326w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f299326w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f299326w, continuation, 0);
            default:
                return new d(this.f299326w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a aVar2 = this.f299326w;
                    c cVar = new c(aVar2, null, 0);
                    this.v = 1;
                    if (u0.b0(aVar2.X(), "UPDATE_SCREENER_BUTTON_TAG", cVar, this) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a aVar4 = this.f299326w;
                    c cVar2 = new c(aVar4, null, 1);
                    this.v = 1;
                    if (u0.b0(aVar4.X(), "UPDATE_SCREENER_BUTTON_TAG", cVar2, this) == aVar3) {
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
