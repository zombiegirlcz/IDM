package com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddNewAddress", "EditShippingContact", "ShippingContactOptions", "DeleteAddressConfirmation", "Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep$AddNewAddress;", "Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep$DeleteAddressConfirmation;", "Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep$EditShippingContact;", "Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep$ShippingContactOptions;", "feature_revolut_pay_shipping_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ShippingContactsContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep$AddNewAddress;", "Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shipping_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddNewAddress implements ShippingContactsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddNewAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Address f84751a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddNewAddress((Address) parcel.readParcelable(AddNewAddress.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewAddress[i];
            }
        }

        public AddNewAddress(Address address) {
            this.f84751a = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddNewAddress) && Intrinsics.f(this.f84751a, ((AddNewAddress) obj2).f84751a);
        }

        public final int hashCode() {
            Address address = this.f84751a;
            if (address == null) {
                return 0;
            }
            return address.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84751a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep$DeleteAddressConfirmation;", "Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shipping_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteAddressConfirmation implements ShippingContactsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DeleteAddressConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84752a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteAddressConfirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteAddressConfirmation[i];
            }
        }

        public DeleteAddressConfirmation(String shippingContactId) {
            Intrinsics.checkNotNullParameter(shippingContactId, "shippingContactId");
            this.f84752a = shippingContactId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteAddressConfirmation) && Intrinsics.f(this.f84752a, ((DeleteAddressConfirmation) obj2).f84752a);
        }

        public final int hashCode() {
            return this.f84752a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84752a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep$EditShippingContact;", "Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shipping_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditShippingContact implements ShippingContactsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EditShippingContact> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShippingContact f84753a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditShippingContact((ShippingContact) parcel.readParcelable(EditShippingContact.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditShippingContact[i];
            }
        }

        public EditShippingContact(ShippingContact shippingContact) {
            Intrinsics.checkNotNullParameter(shippingContact, "shippingContact");
            this.f84753a = shippingContact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditShippingContact) && Intrinsics.f(this.f84753a, ((EditShippingContact) obj2).f84753a);
        }

        public final int hashCode() {
            return this.f84753a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84753a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep$ShippingContactOptions;", "Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shipping_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShippingContactOptions implements ShippingContactsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShippingContactOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84754a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShippingContactOptions(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShippingContactOptions[i];
            }
        }

        public ShippingContactOptions(String shippingContactId) {
            Intrinsics.checkNotNullParameter(shippingContactId, "shippingContactId");
            this.f84754a = shippingContactId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShippingContactOptions) && Intrinsics.f(this.f84754a, ((ShippingContactOptions) obj2).f84754a);
        }

        public final int hashCode() {
            return this.f84754a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84754a);
        }
    }
}
