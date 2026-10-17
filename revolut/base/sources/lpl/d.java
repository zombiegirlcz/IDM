package lpl;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.details.ConnectedClientScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConnectedClientScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConnectedClientScreen connectedClientScreen, Continuation continuation) {
        super(2, continuation);
        this.v = connectedClientScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Q.getValue();
        String listId = model.f53228a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "CONNECTED_CLIENT_DISCONNECT_LIST_ID")) {
            hVar.C2(e.f199150a);
        } else {
            hx7.e.n(new IllegalStateException(p.a.p("Item with ", listId, " id is not handled")));
        }
        return Unit.f186387a;
    }
}
