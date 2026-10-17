package czj;

import com.revolut.feature.wallets.api.module.WalletLimit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletLimit f110266a;

    public c(WalletLimit walletLimit) {
        Intrinsics.checkNotNullParameter(walletLimit, "walletLimit");
        this.f110266a = walletLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f110266a, ((c) obj2).f110266a);
    }

    public final int hashCode() {
        return this.f110266a.hashCode();
    }
}
