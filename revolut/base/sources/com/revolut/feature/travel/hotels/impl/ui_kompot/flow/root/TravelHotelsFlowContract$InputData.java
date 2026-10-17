package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsBookingDetailsParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomDetailsParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionParams;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$PagerItem;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$InputData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Home", "SuggestedExperiences", "RoomDetails", "RoomsSelection", "SearchResults", "Checkout", "Property", "BookingDetails", "CampaignHub", "ActiveBookings", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$ActiveBookings;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$BookingDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$CampaignHub;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$Checkout;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$Home;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$Property;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$RoomDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$RoomsSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$SearchResults;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$SuggestedExperiences;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelHotelsFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$ActiveBookings;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActiveBookings extends TravelHotelsFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActiveBookings f93761a = new ActiveBookings();

        @NotNull
        public static final Parcelable.Creator<ActiveBookings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ActiveBookings.f93761a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveBookings[i];
            }
        }

        private ActiveBookings() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$BookingDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingDetails extends TravelHotelsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<BookingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsBookingDetailsParams f93762a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BookingDetails(TravelHotelsBookingDetailsParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookingDetails[i];
            }
        }

        public BookingDetails(TravelHotelsBookingDetailsParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f93762a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BookingDetails) && Intrinsics.f(this.f93762a, ((BookingDetails) obj2).f93762a);
        }

        public final int hashCode() {
            return this.f93762a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93762a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$CampaignHub;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CampaignHub extends TravelHotelsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CampaignHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsCampaignsHubScreenContract$InputData f93763a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CampaignHub((TravelHotelsCampaignsHubScreenContract$InputData) parcel.readParcelable(CampaignHub.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CampaignHub[i];
            }
        }

        public CampaignHub(TravelHotelsCampaignsHubScreenContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f93763a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CampaignHub) && Intrinsics.f(this.f93763a, ((CampaignHub) obj2).f93763a);
        }

        public final int hashCode() {
            return this.f93763a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93763a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$Checkout;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout extends TravelHotelsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsCheckoutParams f93764a;

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

        public Checkout(TravelHotelsCheckoutParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f93764a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Checkout) && Intrinsics.f(this.f93764a, ((Checkout) obj2).f93764a);
        }

        public final int hashCode() {
            return this.f93764a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93764a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$Property;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Property extends TravelHotelsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Property> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HotelsPropertyInputData f93767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f93768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f93769c;

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
            this.f93767a = propertyInputData;
            this.f93768b = z;
            this.f93769c = z3;
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
            return Intrinsics.f(this.f93767a, property.f93767a) && this.f93768b == property.f93768b && this.f93769c == property.f93769c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f93769c) + j6.a.c(this.f93767a.hashCode() * 31, 31, this.f93768b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93767a, i);
            dest.writeInt(this.f93768b ? 1 : 0);
            dest.writeInt(this.f93769c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$RoomDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoomDetails extends TravelHotelsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RoomDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsRoomDetailsParams f93770a;

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
            this.f93770a = roomDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RoomDetails) && Intrinsics.f(this.f93770a, ((RoomDetails) obj2).f93770a);
        }

        public final int hashCode() {
            return this.f93770a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93770a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$RoomsSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoomsSelection extends TravelHotelsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RoomsSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsRoomsSelectionParams f93771a;

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
            this.f93771a = roomsSelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RoomsSelection) && Intrinsics.f(this.f93771a, ((RoomsSelection) obj2).f93771a);
        }

        public final int hashCode() {
            return this.f93771a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93771a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$SuggestedExperiences;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SuggestedExperiences extends TravelHotelsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SuggestedExperiences> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93774a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SuggestedExperiences(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SuggestedExperiences[i];
            }
        }

        public SuggestedExperiences(String staysBookingId) {
            Intrinsics.checkNotNullParameter(staysBookingId, "staysBookingId");
            this.f93774a = staysBookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SuggestedExperiences) && Intrinsics.f(this.f93774a, ((SuggestedExperiences) obj2).f93774a);
        }

        public final int hashCode() {
            return this.f93774a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93774a);
        }
    }

    private TravelHotelsFlowContract$InputData() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$Home;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends TravelHotelsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f93765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelHotelsHomeFlowContract$PagerItem f93766b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home(parcel.readInt() != 0, parcel.readInt() == 0 ? null : TravelHotelsHomeFlowContract$PagerItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home(boolean z, TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem) {
            this.f93765a = z;
            this.f93766b = travelHotelsHomeFlowContract$PagerItem;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Home)) {
                return false;
            }
            Home home = (Home) obj2;
            return this.f93765a == home.f93765a && this.f93766b == home.f93766b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f93765a) * 31;
            TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem = this.f93766b;
            return iHashCode + (travelHotelsHomeFlowContract$PagerItem == null ? 0 : travelHotelsHomeFlowContract$PagerItem.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f93765a ? 1 : 0);
            TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem = this.f93766b;
            if (travelHotelsHomeFlowContract$PagerItem == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                travelHotelsHomeFlowContract$PagerItem.writeToParcel(dest, i);
            }
        }

        public Home() {
            this(false, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData$SearchResults;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchResults extends TravelHotelsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SearchResults> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f93772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f93773b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SearchResults(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchResults[i];
            }
        }

        public SearchResults(boolean z, boolean z3) {
            this.f93772a = z;
            this.f93773b = z3;
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
            return this.f93772a == searchResults.f93772a && this.f93773b == searchResults.f93773b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f93773b) + (Boolean.hashCode(this.f93772a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f93772a ? 1 : 0);
            dest.writeInt(this.f93773b ? 1 : 0);
        }

        public SearchResults() {
            this(false, false);
        }
    }
}
