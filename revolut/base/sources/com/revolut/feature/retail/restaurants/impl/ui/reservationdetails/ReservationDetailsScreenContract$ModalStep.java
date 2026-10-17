package com.revolut.feature.retail.restaurants.impl.ui.reservationdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/restaurants/impl/ui/reservationdetails/ReservationDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CancelReservation", "Lcom/revolut/feature/retail/restaurants/impl/ui/reservationdetails/ReservationDetailsScreenContract$ModalStep$CancelReservation;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReservationDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/reservationdetails/ReservationDetailsScreenContract$ModalStep$CancelReservation;", "Lcom/revolut/feature/retail/restaurants/impl/ui/reservationdetails/ReservationDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelReservation implements ReservationDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancelReservation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reservation f82872a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelReservation(Reservation.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelReservation[i];
            }
        }

        public CancelReservation(Reservation reservation) {
            Intrinsics.checkNotNullParameter(reservation, "reservation");
            this.f82872a = reservation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelReservation) && Intrinsics.f(this.f82872a, ((CancelReservation) obj2).f82872a);
        }

        public final int hashCode() {
            return this.f82872a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f82872a.writeToParcel(dest, i);
        }
    }
}
