package jpl;

import cjl.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.api.navigation.RevolutSsoConnectedAppDetailsDestination;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.ConnectedClientDetailsDestination;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        gjl.b bVar = this.v.f177321c;
        String listId = model.f53228a;
        Object obj3 = model.u;
        d dVar = (d) bVar;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj3 != null) {
            if (a0.H(listId, "CONNECTED_APP_", false)) {
                if (obj3 instanceof h) {
                    dVar.A2(new RevolutSsoConnectedAppDetailsDestination(((h) obj3).f24713a));
                } else {
                    RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState(p.a.p("Unexpected ", obj3.getClass().getName(), " parcel type"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
                }
            } else if (a0.H(listId, "CONNECTED_OAUTH_APP_", false)) {
                if (obj3 instanceof com.revolut.sso.api.models.a) {
                    com.revolut.sso.api.models.a aVar2 = (com.revolut.sso.api.models.a) obj3;
                    dVar.A2(new ConnectedClientDetailsDestination(aVar2.f106006a, aVar2.f106007b));
                } else {
                    RevolutSSOException.IllegalState illegalState2 = new RevolutSSOException.IllegalState(p.a.p("Unexpected ", obj3.getClass().getName(), " parcel type"));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalState2, h0Var2);
                }
            }
        }
        return Unit.f186387a;
    }
}
