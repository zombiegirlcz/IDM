package cql;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.impl.ui.signin_sessions_flow.bottom_dialog.SignInSessionsBottomSheet;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SignInSessionsBottomSheet v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SignInSessionsBottomSheet signInSessionsBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.v = signInSessionsBottomSheet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.T.getValue();
        String listId = model.f53228a;
        Object obj3 = model.u;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        RevolutAccountSession revolutAccountSession = obj3 instanceof RevolutAccountSession ? (RevolutAccountSession) obj3 : null;
        if (revolutAccountSession == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", j6.a.q("Parcel type is not supported: ", obj3 != null ? obj3.getClass().getName() : null), null, h0Var);
        } else {
            hVar.C2(new e(revolutAccountSession));
        }
        return Unit.f186387a;
    }
}
