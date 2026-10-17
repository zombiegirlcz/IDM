package wje;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreen;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreenContract$ModalStep;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreenContract$Parcel$AutoEarn;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CryptoSettingsScreen cryptoSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarD3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.tab.crypto.impl.ui.settings.a aVar2 = (com.revolut.feature.tab.crypto.impl.ui.settings.a) hVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj3 = model.u;
        if (Intrinsics.f(str, "CRYPTO_SETTINGS_VOLATILITY_ALERT_ID")) {
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.profile.notificationsettings.api.domain.NotificationSetting");
            aVar2.l2(new p(aVar2, (soa.b) obj3, null), new yi5.b(26));
        } else if (Intrinsics.f(str, "CRYPTO_SETTINGS_AUTO_EARN_ID")) {
            com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.G;
            CryptoSettingsScreenContract$Parcel$AutoEarn cryptoSettingsScreenContract$Parcel$AutoEarn = obj3 instanceof CryptoSettingsScreenContract$Parcel$AutoEarn ? (CryptoSettingsScreenContract$Parcel$AutoEarn) obj3 : null;
            if (cryptoSettingsScreenContract$Parcel$AutoEarn != null) {
                if (cryptoSettingsScreenContract$Parcel$AutoEarn.f89800a) {
                    oki.h.v2(aVar3, CryptoSettingsScreenContract$ModalStep.FlexibleDisableModalStep.f89798a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    oki.h.v2(aVar3, CryptoSettingsScreenContract$ModalStep.FlexibleModalStep.f89799a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                }
            }
        }
        return Unit.f186387a;
    }
}
