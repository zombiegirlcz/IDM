package hbj;

import aii.e;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoDepositInput.DeFi f150753a;

    public a(CryptoDepositInput.DeFi input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f150753a = input;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f150753a.equals(((a) obj2).f150753a);
    }

    public final int hashCode() {
        return this.f150753a.hashCode();
    }
}
