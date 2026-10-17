package mk5;

import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j f206185a = new j();

    private j() {
    }

    public static boolean a(CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "<this>");
        if (inputData.f70947g) {
            return false;
        }
        CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint entrypoint = inputData.d;
        return ((entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.DepositWidget) || (entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.OrdersWidget) || (entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.RecurringStrategy) || (entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.TakeProfitStopLossBuy)) ? false : true;
    }
}
