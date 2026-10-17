package com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/acquiring/card_reader/order/impl/ui/screen/checkout/CheckoutScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckoutScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CheckoutScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VatSelection f60601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f60602b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckoutScreenContract$InputData((VatSelection) parcel.readParcelable(CheckoutScreenContract$InputData.class.getClassLoader()), (Address) parcel.readParcelable(CheckoutScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckoutScreenContract$InputData[i];
        }
    }

    public CheckoutScreenContract$InputData(VatSelection vatSelection, Address deliveryAddress) {
        Intrinsics.checkNotNullParameter(vatSelection, "vatSelection");
        Intrinsics.checkNotNullParameter(deliveryAddress, "deliveryAddress");
        this.f60601a = vatSelection;
        this.f60602b = deliveryAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckoutScreenContract$InputData)) {
            return false;
        }
        CheckoutScreenContract$InputData checkoutScreenContract$InputData = (CheckoutScreenContract$InputData) obj2;
        return Intrinsics.f(this.f60601a, checkoutScreenContract$InputData.f60601a) && Intrinsics.f(this.f60602b, checkoutScreenContract$InputData.f60602b);
    }

    public final int hashCode() {
        return this.f60602b.hashCode() + (this.f60601a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60601a, i);
        dest.writeParcelable(this.f60602b, i);
    }
}
