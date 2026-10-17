package com.revolut.feature.revolutpay.api.shared.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.order.CheckoutMode;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.BuyNowPayLater;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.SplitBillPaymentParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/PaymentInitiationParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentInitiationParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentInitiationParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethod f84327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84328c;
    public final CheckoutMode d;
    public final String e;
    public final PaymentOptionsDiscount f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f84329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SplitBillPaymentParams f84330h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BuyNowPayLater f84331j;
    public final String k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentInitiationParams(parcel.readString(), (PaymentMethod) parcel.readParcelable(PaymentInitiationParams.class.getClassLoader()), parcel.readString(), (CheckoutMode) parcel.readParcelable(PaymentInitiationParams.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : PaymentOptionsDiscount.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : SplitBillPaymentParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? BuyNowPayLater.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentInitiationParams[i];
        }
    }

    public PaymentInitiationParams(String orderToken, PaymentMethod paymentMethod, String str, CheckoutMode checkoutMode, String str2, PaymentOptionsDiscount paymentOptionsDiscount, List list, SplitBillPaymentParams splitBillPaymentParams, String str3, BuyNowPayLater buyNowPayLater, String str4) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(checkoutMode, "checkoutMode");
        this.f84326a = orderToken;
        this.f84327b = paymentMethod;
        this.f84328c = str;
        this.d = checkoutMode;
        this.e = str2;
        this.f = paymentOptionsDiscount;
        this.f84329g = list;
        this.f84330h = splitBillPaymentParams;
        this.i = str3;
        this.f84331j = buyNowPayLater;
        this.k = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentInitiationParams)) {
            return false;
        }
        PaymentInitiationParams paymentInitiationParams = (PaymentInitiationParams) obj2;
        return Intrinsics.f(this.f84326a, paymentInitiationParams.f84326a) && Intrinsics.f(this.f84327b, paymentInitiationParams.f84327b) && Intrinsics.f(this.f84328c, paymentInitiationParams.f84328c) && Intrinsics.f(this.d, paymentInitiationParams.d) && Intrinsics.f(this.e, paymentInitiationParams.e) && Intrinsics.f(this.f, paymentInitiationParams.f) && Intrinsics.f(this.f84329g, paymentInitiationParams.f84329g) && Intrinsics.f(this.f84330h, paymentInitiationParams.f84330h) && Intrinsics.f(this.i, paymentInitiationParams.i) && Intrinsics.f(this.f84331j, paymentInitiationParams.f84331j) && Intrinsics.f(this.k, paymentInitiationParams.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f84327b.hashCode() + (this.f84326a.hashCode() * 31)) * 31;
        String str = this.f84328c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PaymentOptionsDiscount paymentOptionsDiscount = this.f;
        int iHashCode4 = (iHashCode3 + (paymentOptionsDiscount == null ? 0 : paymentOptionsDiscount.hashCode())) * 31;
        List list = this.f84329g;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        SplitBillPaymentParams splitBillPaymentParams = this.f84330h;
        int iHashCode6 = (iHashCode5 + (splitBillPaymentParams == null ? 0 : splitBillPaymentParams.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BuyNowPayLater buyNowPayLater = this.f84331j;
        int iHashCode8 = (iHashCode7 + (buyNowPayLater == null ? 0 : buyNowPayLater.hashCode())) * 31;
        String str4 = this.k;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84326a);
        dest.writeParcelable(this.f84327b, i);
        dest.writeString(this.f84328c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        PaymentOptionsDiscount paymentOptionsDiscount = this.f;
        if (paymentOptionsDiscount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentOptionsDiscount.writeToParcel(dest, i);
        }
        dest.writeStringList(this.f84329g);
        SplitBillPaymentParams splitBillPaymentParams = this.f84330h;
        if (splitBillPaymentParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            splitBillPaymentParams.writeToParcel(dest, i);
        }
        dest.writeString(this.i);
        BuyNowPayLater buyNowPayLater = this.f84331j;
        if (buyNowPayLater == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buyNowPayLater.writeToParcel(dest, i);
        }
        dest.writeString(this.k);
    }

    public /* synthetic */ PaymentInitiationParams(String str, PaymentMethod paymentMethod, String str2, CheckoutMode checkoutMode, String str3, PaymentOptionsDiscount paymentOptionsDiscount, List list, SplitBillPaymentParams splitBillPaymentParams, String str4, BuyNowPayLater buyNowPayLater, int i) {
        this(str, paymentMethod, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? new CheckoutMode.Regular(false) : checkoutMode, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : paymentOptionsDiscount, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : splitBillPaymentParams, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : buyNowPayLater, (String) null);
    }
}
