package com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ErrorDialogPayload", "Landroid/os/Parcelable;", "<init>", "()V", "InsufficientBalance", "GenericError", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ErrorDialogPayload$GenericError;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ErrorDialogPayload$InsufficientBalance;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AirportLoungePassCheckoutScreenContract$ErrorDialogPayload implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ErrorDialogPayload$GenericError;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ErrorDialogPayload;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GenericError extends AirportLoungePassCheckoutScreenContract$ErrorDialogPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GenericError f99044a = new GenericError();

        @NotNull
        public static final Parcelable.Creator<GenericError> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GenericError.f99044a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GenericError[i];
            }
        }

        private GenericError() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ErrorDialogPayload$InsufficientBalance;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ErrorDialogPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InsufficientBalance extends AirportLoungePassCheckoutScreenContract$ErrorDialogPayload {

        @NotNull
        public static final Parcelable.Creator<InsufficientBalance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f99045a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InsufficientBalance((dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InsufficientBalance[i];
            }
        }

        public InsufficientBalance(dj0.d amountLacking) {
            Intrinsics.checkNotNullParameter(amountLacking, "amountLacking");
            this.f99045a = amountLacking;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InsufficientBalance) && Intrinsics.f(this.f99045a, ((InsufficientBalance) obj2).f99045a);
        }

        public final int hashCode() {
            return this.f99045a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99045a);
        }
    }

    private AirportLoungePassCheckoutScreenContract$ErrorDialogPayload() {
    }
}
