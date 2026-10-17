package com.revolut.feature.card_order_new.impl.kompot.screen.address_verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/screen/address_verification/CardDeliveryAddressVerificationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ConfirmDifferentAddressDialog", "ShowDeliveryToForm", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/address_verification/CardDeliveryAddressVerificationScreenContract$ModalStep$ConfirmDifferentAddressDialog;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/address_verification/CardDeliveryAddressVerificationScreenContract$ModalStep$ShowDeliveryToForm;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardDeliveryAddressVerificationScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/address_verification/CardDeliveryAddressVerificationScreenContract$ModalStep$ConfirmDifferentAddressDialog;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/address_verification/CardDeliveryAddressVerificationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmDifferentAddressDialog implements CardDeliveryAddressVerificationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ConfirmDifferentAddressDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Address f65144a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmDifferentAddressDialog((Address) parcel.readParcelable(ConfirmDifferentAddressDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmDifferentAddressDialog[i];
            }
        }

        public ConfirmDifferentAddressDialog(Address currentAddress) {
            Intrinsics.checkNotNullParameter(currentAddress, "currentAddress");
            this.f65144a = currentAddress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmDifferentAddressDialog) && Intrinsics.f(this.f65144a, ((ConfirmDifferentAddressDialog) obj2).f65144a);
        }

        public final int hashCode() {
            return this.f65144a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65144a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/address_verification/CardDeliveryAddressVerificationScreenContract$ModalStep$ShowDeliveryToForm;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/address_verification/CardDeliveryAddressVerificationScreenContract$ModalStep;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowDeliveryToForm implements CardDeliveryAddressVerificationScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowDeliveryToForm f65145a = new ShowDeliveryToForm();

        @NotNull
        public static final Parcelable.Creator<ShowDeliveryToForm> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowDeliveryToForm.f65145a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowDeliveryToForm[i];
            }
        }

        private ShowDeliveryToForm() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
