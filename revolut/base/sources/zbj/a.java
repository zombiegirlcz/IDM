package zbj;

import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoDepositAddress f320892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i80.a f320893b;

    public a(CryptoDepositAddress address, i80.a qrCode) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.f320892a = address;
        this.f320893b = qrCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f320892a, aVar.f320892a) && Intrinsics.f(this.f320893b, aVar.f320893b);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(this.f320893b.f159408a) + (this.f320892a.hashCode() * 31);
    }
}
