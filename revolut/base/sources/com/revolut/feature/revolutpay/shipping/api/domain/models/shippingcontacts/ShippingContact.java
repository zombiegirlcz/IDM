package com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nec.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/revolutpay/shipping/api/domain/models/shippingcontacts/ShippingContact;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "nec/a", "feature_revolut_pay_shipping_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShippingContact implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f84741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f84742c;
    public final String d;
    public final String e;

    @NotNull
    public static final Parcelable.Creator<ShippingContact> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShippingContact(parcel.readString(), (Address) parcel.readParcelable(ShippingContact.class.getClassLoader()), a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShippingContact[i];
        }
    }

    public ShippingContact(String id10, Address address, a type, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f84740a = id10;
        this.f84741b = address;
        this.f84742c = type;
        this.d = str;
        this.e = str2;
    }

    public static ShippingContact a(ShippingContact shippingContact, Address address) {
        String id10 = shippingContact.f84740a;
        a type = shippingContact.f84742c;
        String str = shippingContact.d;
        String str2 = shippingContact.e;
        shippingContact.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ShippingContact(id10, address, type, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShippingContact)) {
            return false;
        }
        ShippingContact shippingContact = (ShippingContact) obj2;
        return Intrinsics.f(this.f84740a, shippingContact.f84740a) && Intrinsics.f(this.f84741b, shippingContact.f84741b) && this.f84742c == shippingContact.f84742c && Intrinsics.f(this.d, shippingContact.d) && Intrinsics.f(this.e, shippingContact.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f84742c.hashCode() + ((this.f84741b.hashCode() + (this.f84740a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84740a);
        dest.writeParcelable(this.f84741b, i);
        dest.writeString(this.f84742c.name());
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
