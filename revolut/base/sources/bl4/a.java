package bl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16464b;

    public a(String facilityId, String paymentId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        this.f16463a = facilityId;
        this.f16464b = paymentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f16463a, aVar.f16463a) && Intrinsics.f(this.f16464b, aVar.f16464b);
    }

    public final int hashCode() {
        return this.f16464b.hashCode() + (this.f16463a.hashCode() * 31);
    }
}
