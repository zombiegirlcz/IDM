package foa;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NotificationSettingDetailsViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(NotificationSettingDetailsViewController notificationSettingDetailsViewController, Continuation continuation) {
        super(2, continuation);
        this.v = notificationSettingDetailsViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a aVar2 = (com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a) cVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        aVar2.l2(new h(aVar2, model, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
