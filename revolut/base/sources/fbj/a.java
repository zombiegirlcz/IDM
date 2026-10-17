package fbj;

import com.revolut.retail.feature.crypto_deposits.api.interactors.CryptoDepositsInteractor$Companion;
import efm.d0;
import efm.r;
import iyi.j;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import w4l.k;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
public interface a {

    @NotNull
    public static final CryptoDepositsInteractor$Companion Companion = CryptoDepositsInteractor$Companion.f100035a;

    r b(wk5.a aVar, b bVar);

    r c(k kVar);

    r d(String str, wk5.a aVar, boolean z);

    Object e(j jVar);

    Flow f(a3 a3Var, k kVar);

    efm.b g(String str, String str2);

    d0 validateRestriction();
}
