package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.revpay;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/checkout/revpay/CheckoutRevPayControllerExtensionContract$CheckoutPrice", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckoutRevPayControllerExtensionContract$CheckoutPrice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CheckoutRevPayControllerExtensionContract$CheckoutPrice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Quote f98823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f98824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f98825c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckoutRevPayControllerExtensionContract$CheckoutPrice((Quote) parcel.readParcelable(CheckoutRevPayControllerExtensionContract$CheckoutPrice.class.getClassLoader()), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckoutRevPayControllerExtensionContract$CheckoutPrice[i];
        }
    }

    public CheckoutRevPayControllerExtensionContract$CheckoutPrice(Quote quote, d checkoutPrice, d originalPrice) {
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        this.f98823a = quote;
        this.f98824b = checkoutPrice;
        this.f98825c = originalPrice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckoutRevPayControllerExtensionContract$CheckoutPrice)) {
            return false;
        }
        CheckoutRevPayControllerExtensionContract$CheckoutPrice checkoutRevPayControllerExtensionContract$CheckoutPrice = (CheckoutRevPayControllerExtensionContract$CheckoutPrice) obj2;
        return Intrinsics.f(this.f98823a, checkoutRevPayControllerExtensionContract$CheckoutPrice.f98823a) && Intrinsics.f(this.f98824b, checkoutRevPayControllerExtensionContract$CheckoutPrice.f98824b) && Intrinsics.f(this.f98825c, checkoutRevPayControllerExtensionContract$CheckoutPrice.f98825c);
    }

    public final int hashCode() {
        Quote quote = this.f98823a;
        return this.f98825c.hashCode() + v7.c((quote == null ? 0 : quote.hashCode()) * 31, 31, this.f98824b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98823a, i);
        dest.writeSerializable(this.f98824b);
        dest.writeSerializable(this.f98825c);
    }
}
