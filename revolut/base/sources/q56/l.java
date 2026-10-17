package q56;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f242306a;

    public l(CryptoAddress beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f242306a = beneficiary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f242306a, ((l) obj2).f242306a);
    }

    public final int hashCode() {
        return this.f242306a.hashCode();
    }
}
