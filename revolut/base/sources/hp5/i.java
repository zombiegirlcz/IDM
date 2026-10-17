package hp5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154477b;

    public i(String addressId, String transactionId) {
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f154476a = addressId;
        this.f154477b = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f154476a, iVar.f154476a) && Intrinsics.f(this.f154477b, iVar.f154477b);
    }

    public final int hashCode() {
        return this.f154477b.hashCode() + (this.f154476a.hashCode() * 31);
    }
}
