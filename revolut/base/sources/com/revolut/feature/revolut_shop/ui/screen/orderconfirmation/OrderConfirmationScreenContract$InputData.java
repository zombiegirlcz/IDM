package com.revolut.feature.revolut_shop.ui.screen.orderconfirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolut_shop/ui/screen/orderconfirmation/OrderConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderConfirmationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OrderConfirmationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84241b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderConfirmationScreenContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderConfirmationScreenContract$InputData[i];
        }
    }

    public OrderConfirmationScreenContract$InputData(String orderId, boolean z) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f84240a = orderId;
        this.f84241b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderConfirmationScreenContract$InputData)) {
            return false;
        }
        OrderConfirmationScreenContract$InputData orderConfirmationScreenContract$InputData = (OrderConfirmationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f84240a, orderConfirmationScreenContract$InputData.f84240a) && this.f84241b == orderConfirmationScreenContract$InputData.f84241b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84241b) + (this.f84240a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84240a);
        dest.writeInt(this.f84241b ? 1 : 0);
    }
}
