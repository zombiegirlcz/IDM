package wje;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.feature.tab.crypto.api.navigation.CryptoCurrencyChangerDestination;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CryptoSettingsScreen cryptoSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
        switch (str.hashCode()) {
            case -1542494989:
                if (str.equals("CRYPTO_SETTINGS_SPARE_CHANGE_LIST_ID")) {
                    aVar2.l2(new q(aVar2, null, null), new yi5.b(26));
                }
                break;
            case -1043688838:
                if (str.equals("CRYPTO_SETTINGS_VOLATILITY_ALERT_ID")) {
                    Object obj3 = model.u;
                    soa.b bVar = obj3 instanceof soa.b ? (soa.b) obj3 : null;
                    if (bVar != null) {
                        aVar2.C1(new KompotProfileFeatureConfig.NotificationSettingDetailsDestination(bVar));
                    }
                }
                break;
            case -869364246:
                if (str.equals("CRYPTO_SETTINGS_WEALTH_PROTECTION_LIST_ID")) {
                    aVar2.C1(new SecurityHubDestination((SecurityHubStartScreen) SecurityHubStartScreen.WealthProtection.f85392a, false, (String) null, true, 22));
                }
                break;
            case 1342307532:
                if (str.equals("CRYPTO_SETTINGS_CURRENCY_LIST_ID")) {
                    aVar2.C1(CryptoCurrencyChangerDestination.f89777b);
                }
                break;
        }
        return Unit.f186387a;
    }
}
