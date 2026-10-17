package d76;

import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import efm.r;
import k18.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pt5.t;
import rd0.e;
import tof.cc;
import tof.i7;
import tof.i9;
import tof.p0;
import tof.y6;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements t {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc f111827b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f111828a;

    static {
        i7.c cVar = i7.Companion;
        y6[] y6VarArr = {y6.DEFI_SWAP, y6.DEFI_TOPUP, y6.DEFI_TRANSFER};
        cVar.getClass();
        f111827b = i7.c.d(y6VarArr);
    }

    public b(c accountsInteractor) {
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        this.f111828a = accountsInteractor;
    }

    @Override // pt5.t
    public final r a(CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode, ft5.a params) {
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        Intrinsics.checkNotNullParameter(params, "params");
        if (currencyMode instanceof CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency) {
            return nim.a.w(e.c(q.q(nim.a.v(this.f111828a.F(), new q09.a(15))), g.f186406a), new a94.q(this, ((CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency) currencyMode).f71405a, 19));
        }
        if (!(currencyMode instanceof CryptoInvestmentsFeatureConfig.CurrencyMode.AllCurrencies)) {
            throw new NoWhenBranchMatchedException();
        }
        i7.c cVar = i7.Companion;
        y6[] y6VarArr = {y6.DEFI_TOPUP, y6.DEFI_TRANSFER};
        cVar.getClass();
        return zi0.c.j(i7.c.b(i7.c.d(y6VarArr), i7.c.a(i7.c.d(y6.DEFI_SWAP), new i9(p0.BUY))));
    }
}
