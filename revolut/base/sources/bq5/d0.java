package bq5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f17701a;

    public d0(CryptoAddress beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f17701a = beneficiary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f17701a, ((d0) obj2).f17701a);
    }

    public final int hashCode() {
        return this.f17701a.hashCode();
    }
}
