package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment.TravelHotelsRoomsSelectionAmendmentScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.booking.TravelHotelsRoomsSelectionBookingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/room/selection/TravelHotelsRoomsSelectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RoomSelectionBooking", "RoomSelectionAmendment", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/room/selection/TravelHotelsRoomsSelectionFlowContract$Step$RoomSelectionAmendment;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/room/selection/TravelHotelsRoomsSelectionFlowContract$Step$RoomSelectionBooking;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsRoomsSelectionFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/room/selection/TravelHotelsRoomsSelectionFlowContract$Step$RoomSelectionAmendment;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/room/selection/TravelHotelsRoomsSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoomSelectionAmendment implements TravelHotelsRoomsSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RoomSelectionAmendment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsRoomsSelectionAmendmentScreenContract$InputData f93753a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoomSelectionAmendment(TravelHotelsRoomsSelectionAmendmentScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoomSelectionAmendment[i];
            }
        }

        public RoomSelectionAmendment(TravelHotelsRoomsSelectionAmendmentScreenContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f93753a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RoomSelectionAmendment) && Intrinsics.f(this.f93753a, ((RoomSelectionAmendment) obj2).f93753a);
        }

        public final int hashCode() {
            return this.f93753a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93753a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/room/selection/TravelHotelsRoomsSelectionFlowContract$Step$RoomSelectionBooking;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/room/selection/TravelHotelsRoomsSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoomSelectionBooking implements TravelHotelsRoomsSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RoomSelectionBooking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsRoomsSelectionBookingScreenContract$InputData f93754a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoomSelectionBooking(TravelHotelsRoomsSelectionBookingScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoomSelectionBooking[i];
            }
        }

        public RoomSelectionBooking(TravelHotelsRoomsSelectionBookingScreenContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f93754a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RoomSelectionBooking) && Intrinsics.f(this.f93754a, ((RoomSelectionBooking) obj2).f93754a);
        }

        public final int hashCode() {
            return this.f93754a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93754a.writeToParcel(dest, i);
        }
    }
}
