package com.revolut.feature.revolutpay.shipping.shared.ui.delivery_methods;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/shipping/shared/ui/delivery_methods/DeliveryMethodsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shipping_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryMethodsContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DeliveryMethodsContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShippingContact f84749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeliveryMethods.DeliveryMethod f84750c;
    public final boolean d;
    public final b e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeliveryMethodsContract$InputData(parcel.readString(), (ShippingContact) parcel.readParcelable(DeliveryMethodsContract$InputData.class.getClassLoader()), (DeliveryMethods.DeliveryMethod) parcel.readParcelable(DeliveryMethodsContract$InputData.class.getClassLoader()), parcel.readInt() != 0, (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeliveryMethodsContract$InputData[i];
        }
    }

    public DeliveryMethodsContract$InputData(String orderToken, ShippingContact selectedShippingContact, DeliveryMethods.DeliveryMethod selectedDeliveryMethod, boolean z, b bVar) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(selectedShippingContact, "selectedShippingContact");
        Intrinsics.checkNotNullParameter(selectedDeliveryMethod, "selectedDeliveryMethod");
        this.f84748a = orderToken;
        this.f84749b = selectedShippingContact;
        this.f84750c = selectedDeliveryMethod;
        this.d = z;
        this.e = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeliveryMethodsContract$InputData)) {
            return false;
        }
        DeliveryMethodsContract$InputData deliveryMethodsContract$InputData = (DeliveryMethodsContract$InputData) obj2;
        return Intrinsics.f(this.f84748a, deliveryMethodsContract$InputData.f84748a) && Intrinsics.f(this.f84749b, deliveryMethodsContract$InputData.f84749b) && Intrinsics.f(this.f84750c, deliveryMethodsContract$InputData.f84750c) && this.d == deliveryMethodsContract$InputData.d && Intrinsics.f(this.e, deliveryMethodsContract$InputData.e);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f84750c.hashCode() + ((this.f84749b.hashCode() + (this.f84748a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        b bVar = this.e;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84748a);
        dest.writeParcelable(this.f84749b, i);
        dest.writeParcelable(this.f84750c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeSerializable(this.e);
    }
}
