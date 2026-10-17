package hcj;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f150908a;

    public i(CryptoAddress beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f150908a = beneficiary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f150908a, ((i) obj2).f150908a);
    }

    public final int hashCode() {
        return this.f150908a.hashCode();
    }
}
