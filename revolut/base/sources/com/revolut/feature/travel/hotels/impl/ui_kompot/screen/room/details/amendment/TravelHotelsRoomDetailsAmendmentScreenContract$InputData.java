package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.amendment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/room/details/amendment/TravelHotelsRoomDetailsAmendmentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsRoomDetailsAmendmentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsRoomDetailsAmendmentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f93998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f93999c;
    public final TravelHotelsRoomsInformation d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsRoomDetailsAmendmentScreenContract$InputData(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (TravelHotelsRoomsInformation) parcel.readParcelable(TravelHotelsRoomDetailsAmendmentScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsRoomDetailsAmendmentScreenContract$InputData[i];
        }
    }

    public TravelHotelsRoomDetailsAmendmentScreenContract$InputData(String bookingId, LocalDate newCheckIn, LocalDate newCheckOut, TravelHotelsRoomsInformation selectedBed, boolean z) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(newCheckIn, "newCheckIn");
        Intrinsics.checkNotNullParameter(newCheckOut, "newCheckOut");
        Intrinsics.checkNotNullParameter(selectedBed, "selectedBed");
        this.f93997a = bookingId;
        this.f93998b = newCheckIn;
        this.f93999c = newCheckOut;
        this.d = selectedBed;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsRoomDetailsAmendmentScreenContract$InputData)) {
            return false;
        }
        TravelHotelsRoomDetailsAmendmentScreenContract$InputData travelHotelsRoomDetailsAmendmentScreenContract$InputData = (TravelHotelsRoomDetailsAmendmentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93997a, travelHotelsRoomDetailsAmendmentScreenContract$InputData.f93997a) && Intrinsics.f(this.f93998b, travelHotelsRoomDetailsAmendmentScreenContract$InputData.f93998b) && Intrinsics.f(this.f93999c, travelHotelsRoomDetailsAmendmentScreenContract$InputData.f93999c) && Intrinsics.f(this.d, travelHotelsRoomDetailsAmendmentScreenContract$InputData.d) && this.e == travelHotelsRoomDetailsAmendmentScreenContract$InputData.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + y.a(y.a(this.f93997a.hashCode() * 31, 31, this.f93998b), 31, this.f93999c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93997a);
        dest.writeSerializable(this.f93998b);
        dest.writeSerializable(this.f93999c);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
