package wed;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ SharedAlertsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SharedAlertsScreen sharedAlertsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedAlertsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Unit unit;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            q qVarI3 = this.v.T2();
            this.u = 1;
            f0 f0Var = (f0) qVarI3;
            if (((l) f0Var.t2()).f296744c.isEmpty()) {
                unit = Unit.f186387a;
            } else {
                f0Var.x2(new wd3.a(8));
                j60.a.v(f0Var.f296726q, false, null, 3);
                z1 z1Var = f0Var.f296731x;
                Unit unit2 = Unit.f186387a;
                z1Var.k(unit2);
                unit = unit2;
            }
            if (unit == aVar) {
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
