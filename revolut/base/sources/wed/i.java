package wed;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedAlertsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SharedAlertsScreen sharedAlertsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedAlertsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarI3 = this.v.T2();
        Intrinsics.h(item);
        f0 f0Var = (f0) qVarI3;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f58316a;
        if (Intrinsics.f(str, "SWITCH_ASSET_ACTION_ID")) {
            f0Var.n2(new w3k.i(f0Var, new s(f0Var, 1), null, 24), new whi.b(6));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown listId=", str));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
