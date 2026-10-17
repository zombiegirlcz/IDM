package nhg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f215479w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f215479w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g0(this.v, this.f215479w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        efm.d0 d0VarC = ((s06.j) this.v.f94332r).c(((hfg.s) this.f215479w).d, false, lg0.a.IGNORE);
        this.u = 1;
        Object objB = nim.a.b(d0VarC, this);
        return objB == aVar ? aVar : objB;
    }
}
