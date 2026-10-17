package hcj;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f150907a;

    public h(CryptoAddress beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f150907a = beneficiary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f150907a, ((h) obj2).f150907a);
    }

    public final int hashCode() {
        return this.f150907a.hashCode();
    }
}
