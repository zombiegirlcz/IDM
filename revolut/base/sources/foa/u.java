package foa;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsContract$Steps;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsViewController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NotificationSettingDetailsViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(NotificationSettingDetailsViewController notificationSettingDetailsViewController, Continuation continuation) {
        super(2, continuation);
        this.v = notificationSettingDetailsViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, continuation);
        uVar.u = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        a59.b bVarG = ifk.b.G(aVar2.o.f81460a.f81462a);
        if (kotlin.text.a0.H(model.f53228a, "MARKET_ALERT_SETTINGS_OPTION_", false) && bVarG == a59.b.WEALTH_INSIGHTS) {
            Object obj3 = model.u;
            a59.a aVar3 = obj3 instanceof a59.a ? (a59.a) obj3 : null;
            if (aVar3 != null) {
                oki.h.v2(aVar2.f81474x, new NotificationSettingDetailsContract$Steps.InsightMarketAlertModeInfo(aVar3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
