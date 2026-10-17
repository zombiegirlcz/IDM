package m66;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.defi.settings.impl.navigation.DeFiRecoveryPhraseDestination;
import com.revolut.feature.defi.settings.impl.ui.settings.DeFiSettingsScreen;
import com.revolut.feature.tab.crypto.api.navigation.CryptoCurrencyChangerDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        e eVar = (e) this.receiver;
        KProperty[] kPropertyArr = DeFiSettingsScreen.R;
        g gVar = (g) eVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "DEFI_SETTINGS_DISPLAY_CURRENCY_LIST_ID")) {
            gVar.C1(CryptoCurrencyChangerDestination.f89777b);
        } else if (Intrinsics.f(str, "DEFI_SETTINGS_RECOVERY_PHRASE_LIST_ID")) {
            gVar.C1(new DeFiRecoveryPhraseDestination(gVar.f203022p.f71878a));
        }
        return Unit.f186387a;
    }
}
