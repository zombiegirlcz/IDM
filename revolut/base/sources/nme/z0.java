package nme;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.tab.lifestyle.impl.ui.screen.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new z0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            mk0.a aVar2 = this.v.f89941a0;
            int i2 = zle.a.f323249a;
            tk0.b bVar = new tk0.b("lifestyle_brand_grid_hint_shown");
            Boolean bool = Boolean.TRUE;
            this.u = 1;
            if (aVar2.e(bVar, bool, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
