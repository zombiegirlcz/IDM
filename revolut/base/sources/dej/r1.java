package dej;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentMethod.Pocket f113639c;

    public r1(String str, String str2, PaymentMethod.Pocket pocket) {
        this.f113637a = str;
        this.f113638b = str2;
        this.f113639c = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f113637a, r1Var.f113637a) && Intrinsics.f(this.f113638b, r1Var.f113638b) && Intrinsics.f(this.f113639c, r1Var.f113639c);
    }

    public final int hashCode() {
        String str = this.f113637a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f113638b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PaymentMethod.Pocket pocket = this.f113639c;
        return iHashCode2 + (pocket != null ? pocket.hashCode() : 0);
    }
}
