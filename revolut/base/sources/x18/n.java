package x18;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreen;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SmartFeedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(SmartFeedScreen smartFeedScreen, Continuation continuation) {
        super(2, continuation);
        this.v = smartFeedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        Set set;
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.d();
        Intrinsics.h(item);
        com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b bVar = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b) pVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj3 = item.f58324n;
        tdh.a aVar2 = obj3 instanceof tdh.a ? (tdh.a) obj3 : null;
        if (aVar2 != null) {
            j2 j2Var = bVar.A;
            do {
                value = j2Var.getValue();
                set = (Set) value;
                if (set == null) {
                    set = h0.f322473a;
                }
            } while (!j2Var.h(value, gc0.c.A(set, aVar2)));
        }
        return Unit.f186387a;
    }
}
