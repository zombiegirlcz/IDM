package foa;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NotificationSettingDetailsViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(NotificationSettingDetailsViewController notificationSettingDetailsViewController, Continuation continuation) {
        super(2, continuation);
        this.v = notificationSettingDetailsViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a aVar2 = (com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a) cVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        RowDelegate.Model model2 = (RowDelegate.Model) model.f53305b;
        if (kotlin.text.a0.H(model2.f53228a, "MARKET_ALERT_SETTINGS_OPTION_", false)) {
            Object obj3 = model2.u;
            a59.a aVar3 = obj3 instanceof a59.a ? (a59.a) obj3 : null;
            if (aVar3 != null) {
                a59.b bVarG = ifk.b.G(aVar2.o.f81460a.f81462a);
                if (bVarG == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                aVar2.n2(new l(aVar2, bVarG, aVar3, null), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
