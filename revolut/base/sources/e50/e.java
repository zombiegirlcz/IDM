package e50;

import com.revolut.chat.ui.inbox.InboxScreen;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import v30.y;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InboxScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InboxScreen inboxScreen, Continuation continuation) {
        super(2, continuation);
        this.v = inboxScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh vhVar = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        SwipeToActionDelegate.SwipeAction swipeAction = vhVar.f54883a;
        String itemId = swipeAction.f53505a;
        Object obj3 = swipeAction.f;
        u uVar = (u) mVarE3;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (a0.H(itemId, "FEED_ACTION_ARCHIVE_ID_PREFIX", false) && (obj3 instanceof y)) {
            uVar.l2(new dz6.o(uVar, obj3, null, 20), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
