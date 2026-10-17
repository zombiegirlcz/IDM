package bzg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f20020w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f20020w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.v, this.f20020w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            oxg.q qVar = aVar2.f95121s;
            oxg.l lVar = (oxg.l) this.f20020w;
            this.u = 1;
            obj2 = qVar.d(lVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aii.u uVar = (aii.u) obj2;
        if (uVar != null) {
            return aVar2.C1(uVar);
        }
        return null;
    }
}
