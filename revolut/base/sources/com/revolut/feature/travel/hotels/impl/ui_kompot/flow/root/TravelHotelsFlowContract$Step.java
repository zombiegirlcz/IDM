package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsBookingDetailsParams;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$PagerItem;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyOnMap;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$À\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Home", "CheckoutFlow", "SuggestedExperiences", "PastAndCancelledBookings", "LocationPicker", "TravellerInfo", "Policies", "BookingDetails", "BookingAmendment", "CancellationPolicy", "CampaignHub", "GuestPicker", "OpenFavoritesGrid", "MapPreview", "ActiveBookings", "PriceBreakdown", "OptIn", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$ActiveBookings;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$BookingAmendment;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$BookingDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$CampaignHub;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$CancellationPolicy;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$CheckoutFlow;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$GuestPicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$Home;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$LocationPicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$MapPreview;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$OpenFavoritesGrid;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$OptIn;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$PastAndCancelledBookings;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$Policies;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$PriceBreakdown;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$SuggestedExperiences;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$TravellerInfo;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$ActiveBookings;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActiveBookings implements TravelHotelsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActiveBookings f93775a = new ActiveBookings();

        @NotNull
        public static final Parcelable.Creator<ActiveBookings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ActiveBookings.f93775a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$BookingAmendment;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingAmendment implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BookingAmendment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93776a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BookingAmendment(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookingAmendment[i];
            }
        }

        public BookingAmendment(String bookingId) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f93776a = bookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BookingAmendment) && Intrinsics.f(this.f93776a, ((BookingAmendment) obj2).f93776a);
        }

        public final int hashCode() {
            return this.f93776a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93776a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$BookingDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingDetails implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BookingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsBookingDetailsParams f93777a;

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
            this.f93777a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BookingDetails) && Intrinsics.f(this.f93777a, ((BookingDetails) obj2).f93777a);
        }

        public final int hashCode() {
            return this.f93777a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93777a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$CampaignHub;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CampaignHub implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CampaignHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsCampaignsHubScreenContract$InputData f93778a;

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
            this.f93778a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CampaignHub) && Intrinsics.f(this.f93778a, ((CampaignHub) obj2).f93778a);
        }

        public final int hashCode() {
            return this.f93778a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93778a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$CancellationPolicy;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationPolicy implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CancellationPolicy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsCancellationPolicyScreenContract$InputData f93779a;

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
            this.f93779a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancellationPolicy) && Intrinsics.f(this.f93779a, ((CancellationPolicy) obj2).f93779a);
        }

        public final int hashCode() {
            return this.f93779a.f93869a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93779a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$CheckoutFlow;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckoutFlow implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CheckoutFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsCheckoutFlowContract$InputData f93780a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckoutFlow((TravelHotelsCheckoutFlowContract$InputData) parcel.readParcelable(CheckoutFlow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CheckoutFlow[i];
            }
        }

        public CheckoutFlow(TravelHotelsCheckoutFlowContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f93780a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CheckoutFlow) && Intrinsics.f(this.f93780a, ((CheckoutFlow) obj2).f93780a);
        }

        public final int hashCode() {
            return this.f93780a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93780a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$GuestPicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GuestPicker implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GuestPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsGuestPickerScreenContract$InputData f93785a;

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
            this.f93785a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GuestPicker) && Intrinsics.f(this.f93785a, ((GuestPicker) obj2).f93785a);
        }

        public final int hashCode() {
            return this.f93785a.f93958a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93785a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$Home;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f93786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelHotelsHomeFlowContract$PagerItem f93787b;

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

        public Home() {
            this((TravelHotelsHomeFlowContract$PagerItem) null, 3);
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
            return this.f93786a == home.f93786a && this.f93787b == home.f93787b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f93786a) * 31;
            TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem = this.f93787b;
            return iHashCode + (travelHotelsHomeFlowContract$PagerItem == null ? 0 : travelHotelsHomeFlowContract$PagerItem.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f93786a ? 1 : 0);
            TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem = this.f93787b;
            if (travelHotelsHomeFlowContract$PagerItem == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                travelHotelsHomeFlowContract$PagerItem.writeToParcel(dest, i);
            }
        }

        public /* synthetic */ Home(TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem, int i) {
            this(false, (i & 2) != 0 ? null : travelHotelsHomeFlowContract$PagerItem);
        }

        public Home(boolean z, TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem) {
            this.f93786a = z;
            this.f93787b = travelHotelsHomeFlowContract$PagerItem;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$LocationPicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationPicker implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LocationPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f93788a;

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
            this.f93788a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LocationPicker) && this.f93788a == ((LocationPicker) obj2).f93788a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f93788a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f93788a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$MapPreview;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MapPreview implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MapPreview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsPropertyOnMap f93789a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MapPreview(TravelHotelsPropertyOnMap.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MapPreview[i];
            }
        }

        public MapPreview(TravelHotelsPropertyOnMap property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f93789a = property;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MapPreview) && Intrinsics.f(this.f93789a, ((MapPreview) obj2).f93789a);
        }

        public final int hashCode() {
            return this.f93789a.f93948a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93789a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$OpenFavoritesGrid;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenFavoritesGrid implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenFavoritesGrid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsFavoritesGridScreenContract$InputData f93790a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenFavoritesGrid(TravelHotelsFavoritesGridScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenFavoritesGrid[i];
            }
        }

        public OpenFavoritesGrid(TravelHotelsFavoritesGridScreenContract$InputData favoritesInputData) {
            Intrinsics.checkNotNullParameter(favoritesInputData, "favoritesInputData");
            this.f93790a = favoritesInputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenFavoritesGrid) && Intrinsics.f(this.f93790a, ((OpenFavoritesGrid) obj2).f93790a);
        }

        public final int hashCode() {
            return this.f93790a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93790a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$OptIn;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OptIn implements TravelHotelsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OptIn f93791a = new OptIn();

        @NotNull
        public static final Parcelable.Creator<OptIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OptIn.f93791a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptIn[i];
            }
        }

        private OptIn() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$PastAndCancelledBookings;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PastAndCancelledBookings implements TravelHotelsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PastAndCancelledBookings f93792a = new PastAndCancelledBookings();

        @NotNull
        public static final Parcelable.Creator<PastAndCancelledBookings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PastAndCancelledBookings.f93792a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PastAndCancelledBookings[i];
            }
        }

        private PastAndCancelledBookings() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$Policies;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Policies implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Policies> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93793a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Policies(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Policies[i];
            }
        }

        public Policies(String propertyId) {
            Intrinsics.checkNotNullParameter(propertyId, "propertyId");
            this.f93793a = propertyId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Policies) && Intrinsics.f(this.f93793a, ((Policies) obj2).f93793a);
        }

        public final int hashCode() {
            return this.f93793a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93793a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$PriceBreakdown;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PriceBreakdown implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PriceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsPriceBreakdownScreenContract$InputData f93794a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PriceBreakdown(TravelHotelsPriceBreakdownScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceBreakdown[i];
            }
        }

        public PriceBreakdown(TravelHotelsPriceBreakdownScreenContract$InputData inputPriceBreakdown) {
            Intrinsics.checkNotNullParameter(inputPriceBreakdown, "inputPriceBreakdown");
            this.f93794a = inputPriceBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PriceBreakdown) && Intrinsics.f(this.f93794a, ((PriceBreakdown) obj2).f93794a);
        }

        public final int hashCode() {
            return this.f93794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93794a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$SuggestedExperiences;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SuggestedExperiences implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SuggestedExperiences> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93795a;

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
            this.f93795a = staysBookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SuggestedExperiences) && Intrinsics.f(this.f93795a, ((SuggestedExperiences) obj2).f93795a);
        }

        public final int hashCode() {
            return this.f93795a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93795a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$TravellerInfo;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TravellerInfo implements TravelHotelsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TravellerInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsTravellerInformationEditScreenContract$InputData f93796a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TravellerInfo((TravelHotelsTravellerInformationEditScreenContract$InputData) parcel.readParcelable(TravellerInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TravellerInfo[i];
            }
        }

        public TravellerInfo(TravelHotelsTravellerInformationEditScreenContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f93796a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TravellerInfo) && Intrinsics.f(this.f93796a, ((TravellerInfo) obj2).f93796a);
        }

        public final int hashCode() {
            return this.f93796a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93796a, i);
        }
    }
}
