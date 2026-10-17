package lo5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f197395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f197396b;

    public b0(CryptoAddress cryptoAddress, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        this.f197395a = cryptoAddress;
        this.f197396b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f197395a, b0Var.f197395a) && Intrinsics.f(this.f197396b, b0Var.f197396b);
    }

    public final int hashCode() {
        int iHashCode = this.f197395a.hashCode() * 31;
        xi0.b bVar = this.f197396b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
