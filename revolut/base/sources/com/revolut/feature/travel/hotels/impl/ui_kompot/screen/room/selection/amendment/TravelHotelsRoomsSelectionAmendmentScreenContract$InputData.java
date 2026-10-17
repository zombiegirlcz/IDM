package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/room/selection/amendment/TravelHotelsRoomsSelectionAmendmentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsRoomsSelectionAmendmentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsRoomsSelectionAmendmentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f94002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f94003c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsRoomsSelectionAmendmentScreenContract$InputData(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsRoomsSelectionAmendmentScreenContract$InputData[i];
        }
    }

    public TravelHotelsRoomsSelectionAmendmentScreenContract$InputData(String bookingId, LocalDate newCheckIn, LocalDate newCheckOut) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(newCheckIn, "newCheckIn");
        Intrinsics.checkNotNullParameter(newCheckOut, "newCheckOut");
        this.f94001a = bookingId;
        this.f94002b = newCheckIn;
        this.f94003c = newCheckOut;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsRoomsSelectionAmendmentScreenContract$InputData)) {
            return false;
        }
        TravelHotelsRoomsSelectionAmendmentScreenContract$InputData travelHotelsRoomsSelectionAmendmentScreenContract$InputData = (TravelHotelsRoomsSelectionAmendmentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94001a, travelHotelsRoomsSelectionAmendmentScreenContract$InputData.f94001a) && Intrinsics.f(this.f94002b, travelHotelsRoomsSelectionAmendmentScreenContract$InputData.f94002b) && Intrinsics.f(this.f94003c, travelHotelsRoomsSelectionAmendmentScreenContract$InputData.f94003c);
    }

    public final int hashCode() {
        return this.f94003c.hashCode() + y.a(this.f94001a.hashCode() * 31, 31, this.f94002b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94001a);
        dest.writeSerializable(this.f94002b);
        dest.writeSerializable(this.f94003c);
    }
}
