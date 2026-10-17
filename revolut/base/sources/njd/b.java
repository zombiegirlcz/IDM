package njd;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.shops.impl.ui.notification_opt_in.ShopsNotificationOptInScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n68.x;
import nfj.l;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShopsNotificationOptInScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ShopsNotificationOptInScreen shopsNotificationOptInScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shopsNotificationOptInScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.O.getValue();
        String listId = model.f52613a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SHOPS_ADS_NOTIFICATIONS_ACCEPT_BUTTON")) {
            fVar.n2(new x(fVar, null, 17), new l(fVar, 18));
        } else if (Intrinsics.f(listId, "SHOPS_ADS_NOTIFICATIONS_REJECT_BUTTON")) {
            fVar.B2();
        }
        return Unit.f186387a;
    }
}
