package em4;

import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import kotlin.jvm.internal.Intrinsics;
import ll4.u;
import ll4.y;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f127616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardAutopayPayments f127617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xw4.a f127618c;
    public final y d;
    public final wi0.b e;

    public h(u managementInfo, CreditCardAutopayPayments creditCardAutopayPayments, xw4.a paymentState, y creditPaymentInfo, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(managementInfo, "managementInfo");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f127616a = managementInfo;
        this.f127617b = creditCardAutopayPayments;
        this.f127618c = paymentState;
        this.d = creditPaymentInfo;
        this.e = countryCode;
    }

    public final g a() {
        u uVar = this.f127616a;
        if (uVar.f196550x) {
            return g.DayZero;
        }
        xw4.a aVar = xw4.a.TERMINATED;
        xw4.a aVar2 = this.f127618c;
        if (aVar2 == aVar) {
            return g.Terminated;
        }
        if (aVar2 == xw4.a.OVERDUE) {
            return g.Overdue;
        }
        long j2 = uVar.f196539h;
        return (j2 != uVar.f196543n || j2 == 0) ? uVar.f196551y ? g.PaidLessThanMin : j2 == 0 ? g.PaidInFull : g.MinPaid : g.NotPaid;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f127616a, hVar.f127616a) && Intrinsics.f(this.f127617b, hVar.f127617b) && this.f127618c == hVar.f127618c && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f127616a.hashCode() * 31;
        CreditCardAutopayPayments creditCardAutopayPayments = this.f127617b;
        return this.e.f297794a.hashCode() + ((this.d.hashCode() + ((this.f127618c.hashCode() + ((iHashCode + (creditCardAutopayPayments == null ? 0 : creditCardAutopayPayments.hashCode())) * 31)) * 31)) * 31);
    }
}
