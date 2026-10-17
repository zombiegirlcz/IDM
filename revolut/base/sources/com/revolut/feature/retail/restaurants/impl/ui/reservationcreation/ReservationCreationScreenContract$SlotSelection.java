package com.revolut.feature.retail.restaurants.impl.ui.reservationcreation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.restaurants.impl.domain.model.ReservationArea;
import com.revolut.feature.retail.restaurants.impl.domain.model.TimeSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/restaurants/impl/ui/reservationcreation/ReservationCreationScreenContract$SlotSelection", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReservationCreationScreenContract$SlotSelection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReservationCreationScreenContract$SlotSelection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeSlot f82859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReservationArea f82860b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReservationCreationScreenContract$SlotSelection(TimeSlot.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ReservationArea.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReservationCreationScreenContract$SlotSelection[i];
        }
    }

    public ReservationCreationScreenContract$SlotSelection(TimeSlot timeSlot, ReservationArea reservationArea) {
        Intrinsics.checkNotNullParameter(timeSlot, "timeSlot");
        this.f82859a = timeSlot;
        this.f82860b = reservationArea;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReservationCreationScreenContract$SlotSelection)) {
            return false;
        }
        ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection = (ReservationCreationScreenContract$SlotSelection) obj2;
        return Intrinsics.f(this.f82859a, reservationCreationScreenContract$SlotSelection.f82859a) && Intrinsics.f(this.f82860b, reservationCreationScreenContract$SlotSelection.f82860b);
    }

    public final int hashCode() {
        int iHashCode = this.f82859a.hashCode() * 31;
        ReservationArea reservationArea = this.f82860b;
        return iHashCode + (reservationArea == null ? 0 : reservationArea.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f82859a.writeToParcel(dest, i);
        ReservationArea reservationArea = this.f82860b;
        if (reservationArea == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            reservationArea.writeToParcel(dest, i);
        }
    }
}
