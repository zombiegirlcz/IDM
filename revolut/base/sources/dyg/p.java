package dyg;

import aii.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f121124w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a aVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f121124w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.v, this.f121124w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            oxg.m mVar = aVar2.f95048p;
            oxg.l lVar = (oxg.l) this.f121124w;
            this.u = 1;
            obj2 = ((oxg.q) mVar).d(lVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        u uVar = (u) obj2;
        if (uVar != null) {
            return aVar2.C1(uVar);
        }
        return null;
    }
}
