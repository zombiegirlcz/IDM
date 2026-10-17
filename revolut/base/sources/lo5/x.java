package lo5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f197417a;

    public x(CryptoAddress selectedCryptoAddress) {
        Intrinsics.checkNotNullParameter(selectedCryptoAddress, "selectedCryptoAddress");
        this.f197417a = selectedCryptoAddress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f197417a, ((x) obj2).f197417a);
    }

    public final int hashCode() {
        return this.f197417a.hashCode();
    }
}
