package com.revolut.feature.revolutpay.api.shared.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w6c.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/api/shared/navigation/PaymentBreakdownControllerDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentBreakdownControllerDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PaymentBreakdownControllerDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Quote f84441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f84442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f84443c;
    public final PaymentBreakdownControllerDescriptor$BreakdownDisclaimer d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentBreakdownControllerDescriptor$InputData(Quote.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), j.valueOf(parcel.readString()), (PaymentBreakdownControllerDescriptor$BreakdownDisclaimer) parcel.readParcelable(PaymentBreakdownControllerDescriptor$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentBreakdownControllerDescriptor$InputData[i];
        }
    }

    public PaymentBreakdownControllerDescriptor$InputData(Quote quote, d totalInRequestedCurrency, j variant, PaymentBreakdownControllerDescriptor$BreakdownDisclaimer disclaimer) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(totalInRequestedCurrency, "totalInRequestedCurrency");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f84441a = quote;
        this.f84442b = totalInRequestedCurrency;
        this.f84443c = variant;
        this.d = disclaimer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentBreakdownControllerDescriptor$InputData)) {
            return false;
        }
        PaymentBreakdownControllerDescriptor$InputData paymentBreakdownControllerDescriptor$InputData = (PaymentBreakdownControllerDescriptor$InputData) obj2;
        return Intrinsics.f(this.f84441a, paymentBreakdownControllerDescriptor$InputData.f84441a) && Intrinsics.f(this.f84442b, paymentBreakdownControllerDescriptor$InputData.f84442b) && this.f84443c == paymentBreakdownControllerDescriptor$InputData.f84443c && Intrinsics.f(this.d, paymentBreakdownControllerDescriptor$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f84443c.hashCode() + v7.c(this.f84441a.hashCode() * 31, 31, this.f84442b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84441a.writeToParcel(dest, i);
        dest.writeSerializable(this.f84442b);
        dest.writeString(this.f84443c.name());
        dest.writeParcelable(this.d, i);
    }
}
