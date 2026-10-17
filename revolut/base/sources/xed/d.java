package xed;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts.SharedCompletedAlertsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedCompletedAlertsScreen f304615w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SharedCompletedAlertsScreen sharedCompletedAlertsScreen, Continuation continuation) {
        super(2, continuation);
        this.f304615w = sharedCompletedAlertsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f304615w, continuation);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh vhVar = (vh) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            h hVar = (h) this.f304615w.f86729d0.getValue();
            Intrinsics.h(vhVar);
            this.v = null;
            this.u = 1;
            n nVar = (n) hVar;
            nVar.getClass();
            nVar.l2(new m(nVar, vhVar, null), new yi5.b(26));
            if (Unit.f186387a == aVar) {
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
