package lo5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f197419a;

    public z(CryptoAddress beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f197419a = beneficiary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f197419a, ((z) obj2).f197419a);
    }

    public final int hashCode() {
        return this.f197419a.hashCode();
    }
}
