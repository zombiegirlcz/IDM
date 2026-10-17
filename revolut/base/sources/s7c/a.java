package s7c;

import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentOptionsDiscount;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.BuyNowPayLater;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.SplitBillPaymentParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u6c.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod f260662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f260664c;
    public final String d;
    public final List e;
    public final SplitBillPaymentParams f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f260665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f260666h;
    public final PaymentOptionsDiscount i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BuyNowPayLater f260667j;
    public final String k;

    public a(PaymentMethod paymentMethod, String str, u uVar, String str2, List list, SplitBillPaymentParams splitBillPaymentParams, String str3, String str4, PaymentOptionsDiscount paymentOptionsDiscount, BuyNowPayLater buyNowPayLater, String str5) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f260662a = paymentMethod;
        this.f260663b = str;
        this.f260664c = uVar;
        this.d = str2;
        this.e = list;
        this.f = splitBillPaymentParams;
        this.f260665g = str3;
        this.f260666h = str4;
        this.i = paymentOptionsDiscount;
        this.f260667j = buyNowPayLater;
        this.k = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f260662a, aVar.f260662a) && Intrinsics.f(this.f260663b, aVar.f260663b) && this.f260664c == aVar.f260664c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f260665g, aVar.f260665g) && Intrinsics.f(this.f260666h, aVar.f260666h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f260667j, aVar.f260667j) && Intrinsics.f(this.k, aVar.k);
    }

    public final int hashCode() {
        int iHashCode = this.f260662a.hashCode() * 31;
        String str = this.f260663b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u uVar = this.f260664c;
        int iHashCode3 = (iHashCode2 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        SplitBillPaymentParams splitBillPaymentParams = this.f;
        int iHashCode6 = (iHashCode5 + (splitBillPaymentParams == null ? 0 : splitBillPaymentParams.hashCode())) * 31;
        String str3 = this.f260665g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f260666h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PaymentOptionsDiscount paymentOptionsDiscount = this.i;
        int iHashCode9 = (iHashCode8 + (paymentOptionsDiscount == null ? 0 : paymentOptionsDiscount.hashCode())) * 31;
        BuyNowPayLater buyNowPayLater = this.f260667j;
        int iHashCode10 = (iHashCode9 + (buyNowPayLater == null ? 0 : buyNowPayLater.hashCode())) * 31;
        String str5 = this.k;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }
}
