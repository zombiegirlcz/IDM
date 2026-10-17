package jq9;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f177495a;

    public a0(CryptoAddress cryptoAddress) {
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        this.f177495a = cryptoAddress;
    }

    @Override // jq9.t
    public final String a() {
        return CryptoAddress.e(this.f177495a, 0, 3).f186223a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f177495a, ((a0) obj2).f177495a);
    }

    public final int hashCode() {
        return this.f177495a.hashCode();
    }
}
