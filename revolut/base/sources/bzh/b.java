package bzh;

import com.revolut.feature_crypto_order_flow.impl.exchange.mappers.CryptoExchangeAmountInputMapper$HintDialogReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoExchangeAmountInputMapper$HintDialogReason f20028a;

    public b(CryptoExchangeAmountInputMapper$HintDialogReason cryptoExchangeAmountInputMapper$HintDialogReason) {
        this.f20028a = cryptoExchangeAmountInputMapper$HintDialogReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f20028a, ((b) obj2).f20028a);
    }

    public final int hashCode() {
        CryptoExchangeAmountInputMapper$HintDialogReason cryptoExchangeAmountInputMapper$HintDialogReason = this.f20028a;
        if (cryptoExchangeAmountInputMapper$HintDialogReason == null) {
            return 0;
        }
        return cryptoExchangeAmountInputMapper$HintDialogReason.hashCode();
    }
}
