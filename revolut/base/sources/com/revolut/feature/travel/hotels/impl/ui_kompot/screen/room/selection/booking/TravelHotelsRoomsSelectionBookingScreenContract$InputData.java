package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/room/selection/booking/TravelHotelsRoomsSelectionBookingScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsRoomsSelectionBookingScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsRoomsSelectionBookingScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f94005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f94006c;
    public final ArrayList d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TravelHotelsRoomsSelectionBookingScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new TravelHotelsRoomsSelectionBookingScreenContract$InputData(string, localDate, localDate2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsRoomsSelectionBookingScreenContract$InputData[i];
        }
    }

    public TravelHotelsRoomsSelectionBookingScreenContract$InputData(String propertyId, LocalDate checkIn, LocalDate checkOut, ArrayList roomsOccupancySelection) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        Intrinsics.checkNotNullParameter(roomsOccupancySelection, "roomsOccupancySelection");
        this.f94004a = propertyId;
        this.f94005b = checkIn;
        this.f94006c = checkOut;
        this.d = roomsOccupancySelection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsRoomsSelectionBookingScreenContract$InputData)) {
            return false;
        }
        TravelHotelsRoomsSelectionBookingScreenContract$InputData travelHotelsRoomsSelectionBookingScreenContract$InputData = (TravelHotelsRoomsSelectionBookingScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94004a, travelHotelsRoomsSelectionBookingScreenContract$InputData.f94004a) && Intrinsics.f(this.f94005b, travelHotelsRoomsSelectionBookingScreenContract$InputData.f94005b) && Intrinsics.f(this.f94006c, travelHotelsRoomsSelectionBookingScreenContract$InputData.f94006c) && this.d.equals(travelHotelsRoomsSelectionBookingScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + y.a(y.a(this.f94004a.hashCode() * 31, 31, this.f94005b), 31, this.f94006c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94004a);
        dest.writeSerializable(this.f94005b);
        dest.writeSerializable(this.f94006c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
