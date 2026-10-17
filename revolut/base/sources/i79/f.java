package i79;

import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.notification_centre.impl.ui.inbox.LegacyInboxScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LegacyInboxScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LegacyInboxScreen legacyInboxScreen, Continuation continuation) {
        super(2, continuation);
        this.v = legacyInboxScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh vhVar = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = ((NotificationCentreItemDelegate.Model) vhVar.f54884b).f52872l;
        Continuation continuation = null;
        s69.d item = obj3 instanceof s69.d ? (s69.d) obj3 : null;
        LegacyInboxScreen legacyInboxScreen = this.v;
        if (item != null) {
            h hVarE3 = legacyInboxScreen.d();
            String actionId = vhVar.f54883a.f53505a;
            k kVar = (k) hVarE3;
            kVar.getClass();
            Intrinsics.checkNotNullParameter(actionId, "actionId");
            Intrinsics.checkNotNullParameter(item, "item");
            if (Intrinsics.f(actionId, "DELETE_ACTION_ID")) {
                kVar.A1(new i44.a(kVar, item, continuation, 7), new yi5.b(25));
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Swipe action ", actionId, " was not handled"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            }
        }
        legacyInboxScreen.O.e();
        return Unit.f186387a;
    }
}
