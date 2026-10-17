package x61;

import com.revolut.domain.models.openbanking.ExternalPaymentStatus$State;
import com.revolut.domain.models.openbanking.ExternalPaymentStatus$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExternalPaymentStatus$Type f303014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExternalPaymentStatus$State f303015c;
    public final dj0.d d;

    public e(String paymentId, ExternalPaymentStatus$Type externalPaymentStatus$Type, ExternalPaymentStatus$State state, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f303013a = paymentId;
        this.f303014b = externalPaymentStatus$Type;
        this.f303015c = state;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f303013a, eVar.f303013a) && this.f303014b == eVar.f303014b && this.f303015c == eVar.f303015c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f303013a.hashCode() * 31;
        ExternalPaymentStatus$Type externalPaymentStatus$Type = this.f303014b;
        int iHashCode2 = (this.f303015c.hashCode() + ((iHashCode + (externalPaymentStatus$Type == null ? 0 : externalPaymentStatus$Type.hashCode())) * 31)) * 31;
        dj0.d dVar = this.d;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
