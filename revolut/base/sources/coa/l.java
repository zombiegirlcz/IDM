package coa;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_categories.NotificationCategoriesViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ NotificationCategoriesViewController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(NotificationCategoriesViewController notificationCategoriesViewController, Continuation continuation) {
        super(2, continuation);
        this.u = notificationCategoriesViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((i) ((c) this.u.N.getValue())).I2();
        return Unit.f186387a;
    }
}
