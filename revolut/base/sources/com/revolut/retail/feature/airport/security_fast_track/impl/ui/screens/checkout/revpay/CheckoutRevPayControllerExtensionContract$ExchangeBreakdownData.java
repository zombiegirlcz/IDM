package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.revpay;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/checkout/revpay/CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f98826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckoutRevPayControllerExtensionContract$CheckoutPrice f98827b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData(e.valueOf(parcel.readString()), CheckoutRevPayControllerExtensionContract$CheckoutPrice.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData[i];
        }
    }

    public CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData(e assetType, CheckoutRevPayControllerExtensionContract$CheckoutPrice checkoutPrice) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        this.f98826a = assetType;
        this.f98827b = checkoutPrice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData)) {
            return false;
        }
        CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData checkoutRevPayControllerExtensionContract$ExchangeBreakdownData = (CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData) obj2;
        return this.f98826a == checkoutRevPayControllerExtensionContract$ExchangeBreakdownData.f98826a && Intrinsics.f(this.f98827b, checkoutRevPayControllerExtensionContract$ExchangeBreakdownData.f98827b);
    }

    public final int hashCode() {
        return this.f98827b.hashCode() + (this.f98826a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98826a.name());
        this.f98827b.writeToParcel(dest, i);
    }
}
