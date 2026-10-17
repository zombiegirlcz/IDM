package ksg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.voluntary.offboarding.impl.ui.remove_obstacles.RemoveObstaclesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RemoveObstaclesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RemoveObstaclesScreen removeObstaclesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = removeObstaclesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) this.v.T2();
        kVar.getClass();
        if (Intrinsics.f(model != null ? model.f52373a : null, "ERROR_STATE_ID")) {
            kVar.z2();
        }
        return Unit.f186387a;
    }
}
