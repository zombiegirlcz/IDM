package epl;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.details.ConnectedAppDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConnectedAppDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConnectedAppDetailsScreen connectedAppDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = connectedAppDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.O.getValue();
        Intrinsics.h(item);
        h hVar = (h) eVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f58316a;
        if (Intrinsics.f(str, "REVOKE_ACCESS")) {
            hVar.C2(d.f128205a);
        } else {
            hx7.e.n(new IllegalStateException(p.a.p("Item with ", str, " id is not handled")));
        }
        return Unit.f186387a;
    }
}
