package eje;

import aii.u;
import com.revolut.feature.settings.preview.displayCurrency.DisplayCurrencyPreviewController;
import com.revolut.feature.tab.crypto.api.TabCryptoApi$Toggles;
import com.revolut.feature.tab.crypto.api.navigation.CryptoCurrencyChangerDestination;
import com.revolut.feature.tab.crypto.api.navigation.CryptoSettingsDestination;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreen;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreenContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import y4d.l;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f126874a;

    public d(l displayCurrencyPreviewInteractor) {
        Intrinsics.checkNotNullParameter(displayCurrencyPreviewInteractor, "displayCurrencyPreviewInteractor");
        this.f126874a = displayCurrencyPreviewInteractor;
    }

    @Override // nte.a
    public final List e() {
        return TabCryptoApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoSettingsDestination) {
            return new CryptoSettingsScreen(new CryptoSettingsScreenContract$InputData(((CryptoSettingsDestination) destination).f89778a));
        }
        if (destination instanceof CryptoCurrencyChangerDestination) {
            return new DisplayCurrencyPreviewController(this.f126874a);
        }
        return null;
    }
}
