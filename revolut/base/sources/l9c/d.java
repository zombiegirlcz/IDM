package l9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c f193123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f193124c;
    public final int d;
    public final String e;
    public final String f;

    public d(String lastFour, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c cVar, int i, int i2, String paymentMethodId, String cvv) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        this.f193122a = lastFour;
        this.f193123b = cVar;
        this.f193124c = i;
        this.d = i2;
        this.e = paymentMethodId;
        this.f = cvv;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f193122a, dVar.f193122a) && this.f193123b == dVar.f193123b && this.f193124c == dVar.f193124c && this.d == dVar.d && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f193122a.hashCode() * 31;
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c cVar = this.f193123b;
        return this.f.hashCode() + p.a.c(j6.a.b(this.d, j6.a.b(this.f193124c, (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31), 31, this.e);
    }
}
