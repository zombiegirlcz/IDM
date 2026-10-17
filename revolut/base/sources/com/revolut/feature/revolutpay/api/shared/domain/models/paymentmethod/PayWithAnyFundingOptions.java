package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.CardPaymentAvailability;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PayWithAnyFundingOptions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayWithAnyFundingOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PayWithAnyFundingOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardPaymentAvailability f84365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84367c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayWithAnyFundingOptions((CardPaymentAvailability) parcel.readParcelable(PayWithAnyFundingOptions.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayWithAnyFundingOptions[i];
        }
    }

    public PayWithAnyFundingOptions() {
        this(null, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayWithAnyFundingOptions)) {
            return false;
        }
        PayWithAnyFundingOptions payWithAnyFundingOptions = (PayWithAnyFundingOptions) obj2;
        return Intrinsics.f(this.f84365a, payWithAnyFundingOptions.f84365a) && this.f84366b == payWithAnyFundingOptions.f84366b && this.f84367c == payWithAnyFundingOptions.f84367c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84367c) + j6.a.c(this.f84365a.hashCode() * 31, 31, this.f84366b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84365a, i);
        dest.writeInt(this.f84366b ? 1 : 0);
        dest.writeInt(this.f84367c ? 1 : 0);
    }

    public PayWithAnyFundingOptions(CardPaymentAvailability cardPaymentAvailability, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(cardPaymentAvailability, "cardPaymentAvailability");
        this.f84365a = cardPaymentAvailability;
        this.f84366b = z;
        this.f84367c = z3;
    }

    public /* synthetic */ PayWithAnyFundingOptions(CardPaymentAvailability.Available available, int i) {
        this((i & 1) != 0 ? CardPaymentAvailability.NotAvailable.f84364a : available, true, true);
    }
}
