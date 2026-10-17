package buf;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrf.c f18791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hrf.h f18792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentPocketInfo f18793c;

    public d(hrf.c cVar, hrf.h hVar, PaymentPocketInfo paymentPocketInfo) {
        this.f18791a = cVar;
        this.f18792b = hVar;
        this.f18793c = paymentPocketInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f18791a, dVar.f18791a) && Intrinsics.f(this.f18792b, dVar.f18792b) && Intrinsics.f(this.f18793c, dVar.f18793c);
    }

    public final int hashCode() {
        hrf.c cVar = this.f18791a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        hrf.h hVar = this.f18792b;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        PaymentPocketInfo paymentPocketInfo = this.f18793c;
        return iHashCode2 + (paymentPocketInfo != null ? paymentPocketInfo.hashCode() : 0);
    }
}
