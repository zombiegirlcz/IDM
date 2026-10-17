package pkf;

import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositDestination;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pkf.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends yji.n implements elf.s0 {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fbj.a f237164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0 f237165n;
    public final se5.b o;

    public z(klf.h0 commonDataSource, fbj.a cryptoDepositsInteractor, a0 cryptoDepositBelowMinimumWarningMapper, se5.b transactionCryptoDepositNavigationProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositBelowMinimumWarningMapper, "cryptoDepositBelowMinimumWarningMapper");
        Intrinsics.checkNotNullParameter(transactionCryptoDepositNavigationProvider, "transactionCryptoDepositNavigationProvider");
        this.f237163l = commonDataSource;
        this.f237164m = cryptoDepositsInteractor;
        this.f237165n = cryptoDepositBelowMinimumWarningMapper;
        this.o = transactionCryptoDepositNavigationProvider;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (Intrinsics.f(str, "CryptoDepositBelowMinimum_Action")) {
            if (obj2 instanceof xi0.b) {
                com.revolut.retail.feature.crypto_deposits.api.navigation.a aVar = com.revolut.retail.feature.crypto_deposits.api.navigation.a.WALLET;
                this.o.getClass();
                A2(new CryptoDepositDestination(new CryptoDepositInput.Overview((xi0.b) obj2, aVar, false, (hbj.b) null, (wk5.a) null, 56)));
                return Boolean.TRUE;
            }
            if (obj2 instanceof a0.b) {
                A2(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig("https://ramp.revolut.com", null, 0, false, false, false, 130974))));
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
