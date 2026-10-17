package ved;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.mi;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedAlertDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SharedAlertDetailsScreen sharedAlertDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedAlertDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((TrendViewDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TrendViewDelegate.a aVar = (TrendViewDelegate.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarI3 = this.v.T2();
        mi miVar = aVar instanceof mi ? (mi) aVar : null;
        Integer num = miVar != null ? new Integer(miVar.f54485b) : null;
        j2 j2Var = oVarI3.f288285w;
        od0.i.Companion.getClass();
        od0.i iVarA = od0.h.a(num);
        j2Var.getClass();
        j2Var.g(null, iVarA);
        return Unit.f186387a;
    }
}
