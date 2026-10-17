package g23;

import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends yji.n implements j23.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sh5.d f139831l;

    public r(sh5.d cryptoFcaDisclaimerWidget) {
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        this.f139831l = cryptoFcaDisclaimerWidget;
    }

    @Override // j23.e
    public final Object r0(ty0.a aVar, Continuation continuation) {
        CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) this.f139831l).d(aVar);
        if (cryptoFcaRisksDestinationD == null) {
            return Boolean.FALSE;
        }
        A2(cryptoFcaRisksDestinationD);
        return Boolean.TRUE;
    }
}
