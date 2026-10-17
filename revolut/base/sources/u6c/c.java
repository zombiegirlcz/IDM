package u6c;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.BillingAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f277547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f277548c;
    public final String d;
    public final BillingAddress e;
    public final String f;

    public c(String pan, int i, int i2, String str, BillingAddress billingAddress, String cvv) {
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        this.f277546a = pan;
        this.f277547b = i;
        this.f277548c = i2;
        this.d = str;
        this.e = billingAddress;
        this.f = cvv;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f277546a, cVar.f277546a) && this.f277547b == cVar.f277547b && this.f277548c == cVar.f277548c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f277548c, j6.a.b(this.f277547b, this.f277546a.hashCode() * 31, 31), 31);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        BillingAddress billingAddress = this.e;
        return this.f.hashCode() + ((iHashCode + (billingAddress != null ? billingAddress.hashCode() : 0)) * 31);
    }
}
