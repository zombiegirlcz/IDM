package wed;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedAlertsScreen f296733w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SharedAlertsScreen sharedAlertsScreen, Continuation continuation) {
        super(2, continuation);
        this.f296733w = sharedAlertsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f296733w, continuation);
        gVar.v = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh vhVar = (vh) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            q qVarI3 = this.f296733w.T2();
            Intrinsics.h(vhVar);
            this.v = null;
            this.u = 1;
            f0 f0Var = (f0) qVarI3;
            f0Var.getClass();
            f0Var.l2(new e0(f0Var, vhVar, null), new yi5.b(26));
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
