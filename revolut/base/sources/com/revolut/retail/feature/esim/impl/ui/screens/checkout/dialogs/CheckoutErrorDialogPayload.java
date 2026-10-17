package com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutErrorDialogPayload;", "Landroid/os/Parcelable;", "<init>", "()V", "InsufficientFunds", "PriceChanged", "PhoneNumberNoLongerAvailable", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutErrorDialogPayload$InsufficientFunds;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutErrorDialogPayload$PhoneNumberNoLongerAvailable;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutErrorDialogPayload$PriceChanged;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CheckoutErrorDialogPayload implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutErrorDialogPayload$InsufficientFunds;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutErrorDialogPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InsufficientFunds extends CheckoutErrorDialogPayload {

        @NotNull
        public static final Parcelable.Creator<InsufficientFunds> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f100928a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InsufficientFunds((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InsufficientFunds[i];
            }
        }

        public InsufficientFunds(d lackingMoney) {
            Intrinsics.checkNotNullParameter(lackingMoney, "lackingMoney");
            this.f100928a = lackingMoney;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InsufficientFunds) && Intrinsics.f(this.f100928a, ((InsufficientFunds) obj2).f100928a);
        }

        public final int hashCode() {
            return this.f100928a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f100928a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutErrorDialogPayload$PhoneNumberNoLongerAvailable;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutErrorDialogPayload;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PhoneNumberNoLongerAvailable extends CheckoutErrorDialogPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PhoneNumberNoLongerAvailable f100929a = new PhoneNumberNoLongerAvailable();

        @NotNull
        public static final Parcelable.Creator<PhoneNumberNoLongerAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PhoneNumberNoLongerAvailable.f100929a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneNumberNoLongerAvailable[i];
            }
        }

        private PhoneNumberNoLongerAvailable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutErrorDialogPayload$PriceChanged;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutErrorDialogPayload;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PriceChanged extends CheckoutErrorDialogPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PriceChanged f100930a = new PriceChanged();

        @NotNull
        public static final Parcelable.Creator<PriceChanged> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PriceChanged.f100930a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceChanged[i];
            }
        }

        private PriceChanged() {
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

    private CheckoutErrorDialogPayload() {
    }
}
