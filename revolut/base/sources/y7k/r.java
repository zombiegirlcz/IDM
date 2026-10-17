package y7k;

import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrf.f f311568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentLinksTransferData f311569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f311570c;
    public final int d;

    public r(hrf.f direction, PaymentLinksTransferData paymentLinksTransferData, s extraData, int i) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f311568a = direction;
        this.f311569b = paymentLinksTransferData;
        this.f311570c = extraData;
        this.d = i;
    }

    public static r a(r rVar, PaymentLinksTransferData paymentLinksTransferData, s extraData, int i, int i2) {
        hrf.f direction = rVar.f311568a;
        if ((i2 & 2) != 0) {
            paymentLinksTransferData = rVar.f311569b;
        }
        if ((i2 & 4) != 0) {
            extraData = rVar.f311570c;
        }
        if ((i2 & 8) != 0) {
            i = rVar.d;
        }
        rVar.getClass();
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return new r(direction, paymentLinksTransferData, extraData, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f311568a == rVar.f311568a && Intrinsics.f(this.f311569b, rVar.f311569b) && Intrinsics.f(this.f311570c, rVar.f311570c) && this.d == rVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f311568a.hashCode() * 31;
        PaymentLinksTransferData paymentLinksTransferData = this.f311569b;
        return Integer.hashCode(this.d) + ((this.f311570c.hashCode() + ((iHashCode + (paymentLinksTransferData == null ? 0 : paymentLinksTransferData.hashCode())) * 31)) * 31);
    }
}
