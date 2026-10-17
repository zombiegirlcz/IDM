package ved;

import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreen;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedAlertDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SharedAlertDetailsScreen sharedAlertDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedAlertDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarI3 = this.v.T2();
        String actionId = yVar.f167226b.f58316a;
        oVarI3.getClass();
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        if (Intrinsics.f(actionId, "ALERT_DETAILS_DELETE_ACTION_ID")) {
            oVarI3.l2(new n(oVarI3, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
