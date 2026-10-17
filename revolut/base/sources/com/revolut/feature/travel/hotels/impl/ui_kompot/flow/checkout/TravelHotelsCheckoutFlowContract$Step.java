package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomDetailsParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionParams;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SearchResults", "LocationPicker", "Property", "RoomsSelection", "RoomDetails", "Checkout", "CancellationPolicy", "GuestPicker", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$CancellationPolicy;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$Checkout;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$GuestPicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$LocationPicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$Property;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$RoomDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$RoomsSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$SearchResults;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsCheckoutFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$CancellationPolicy;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationPolicy implements TravelHotelsCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CancellationPolicy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsCancellationPolicyScreenContract$InputData f93704a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancellationPolicy(TravelHotelsCancellationPolicyScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationPolicy[i];
            }
        }

        public CancellationPolicy(TravelHotelsCancellationPolicyScreenContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f93704a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancellationPolicy) && Intrinsics.f(this.f93704a, ((CancellationPolicy) obj2).f93704a);
        }

        public final int hashCode() {
            return this.f93704a.f93869a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93704a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$Checkout;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout implements TravelHotelsCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsCheckoutParams f93705a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(TravelHotelsCheckoutParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(TravelHotelsCheckoutParams checkoutParams) {
            Intrinsics.checkNotNullParameter(checkoutParams, "checkoutParams");
            this.f93705a = checkoutParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Checkout) && Intrinsics.f(this.f93705a, ((Checkout) obj2).f93705a);
        }

        public final int hashCode() {
            return this.f93705a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93705a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$GuestPicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GuestPicker implements TravelHotelsCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GuestPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsGuestPickerScreenContract$InputData f93709a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GuestPicker(TravelHotelsGuestPickerScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GuestPicker[i];
            }
        }

        public GuestPicker(TravelHotelsGuestPickerScreenContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f93709a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GuestPicker) && Intrinsics.f(this.f93709a, ((GuestPicker) obj2).f93709a);
        }

        public final int hashCode() {
            return this.f93709a.f93958a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93709a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$LocationPicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationPicker implements TravelHotelsCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LocationPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f93710a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LocationPicker(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocationPicker[i];
            }
        }

        public LocationPicker(boolean z) {
            this.f93710a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LocationPicker) && this.f93710a == ((LocationPicker) obj2).f93710a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f93710a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f93710a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$Property;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Property implements TravelHotelsCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Property> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HotelsPropertyInputData f93711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f93712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f93713c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Property((HotelsPropertyInputData) parcel.readParcelable(Property.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Property[i];
            }
        }

        public Property(HotelsPropertyInputData propertyInputData, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(propertyInputData, "propertyInputData");
            this.f93711a = propertyInputData;
            this.f93712b = z;
            this.f93713c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Property)) {
                return false;
            }
            Property property = (Property) obj2;
            return Intrinsics.f(this.f93711a, property.f93711a) && this.f93712b == property.f93712b && this.f93713c == property.f93713c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f93713c) + j6.a.c(this.f93711a.hashCode() * 31, 31, this.f93712b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93711a, i);
            dest.writeInt(this.f93712b ? 1 : 0);
            dest.writeInt(this.f93713c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$RoomDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoomDetails implements TravelHotelsCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RoomDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsRoomDetailsParams f93714a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoomDetails(TravelHotelsRoomDetailsParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoomDetails[i];
            }
        }

        public RoomDetails(TravelHotelsRoomDetailsParams roomDetails) {
            Intrinsics.checkNotNullParameter(roomDetails, "roomDetails");
            this.f93714a = roomDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RoomDetails) && Intrinsics.f(this.f93714a, ((RoomDetails) obj2).f93714a);
        }

        public final int hashCode() {
            return this.f93714a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93714a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$RoomsSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoomsSelection implements TravelHotelsCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RoomsSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsRoomsSelectionParams f93715a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoomsSelection(TravelHotelsRoomsSelectionParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoomsSelection[i];
            }
        }

        public RoomsSelection(TravelHotelsRoomsSelectionParams roomsSelection) {
            Intrinsics.checkNotNullParameter(roomsSelection, "roomsSelection");
            this.f93715a = roomsSelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RoomsSelection) && Intrinsics.f(this.f93715a, ((RoomsSelection) obj2).f93715a);
        }

        public final int hashCode() {
            return this.f93715a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93715a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$SearchResults;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchResults implements TravelHotelsCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SearchResults> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f93716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f93717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f93718c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SearchResults(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchResults[i];
            }
        }

        public SearchResults() {
            this(null, false, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SearchResults)) {
                return false;
            }
            SearchResults searchResults = (SearchResults) obj2;
            return this.f93716a == searchResults.f93716a && this.f93717b == searchResults.f93717b && Intrinsics.f(this.f93718c, searchResults.f93718c);
        }

        public final int hashCode() {
            int iC = j6.a.c(Boolean.hashCode(this.f93716a) * 31, 31, this.f93717b);
            String str = this.f93718c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f93716a ? 1 : 0);
            dest.writeInt(this.f93717b ? 1 : 0);
            dest.writeString(this.f93718c);
        }

        public SearchResults(String str, boolean z, boolean z3) {
            this.f93716a = z;
            this.f93717b = z3;
            this.f93718c = str;
        }
    }
}
