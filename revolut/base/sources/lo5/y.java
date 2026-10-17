package lo5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197418a;

    public y(String cryptoAddressId) {
        Intrinsics.checkNotNullParameter(cryptoAddressId, "cryptoAddressId");
        this.f197418a = cryptoAddressId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f197418a, ((y) obj2).f197418a);
    }

    public final int hashCode() {
        return this.f197418a.hashCode();
    }
}
