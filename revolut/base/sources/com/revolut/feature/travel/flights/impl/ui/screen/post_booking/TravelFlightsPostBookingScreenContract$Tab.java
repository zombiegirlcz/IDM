package com.revolut.feature.travel.flights.impl.ui.screen.post_booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreenContract$Tab", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "<init>", "()V", "Companion", "Overview", "CheckIn", "Manage", "a", "Lcom/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreenContract$Tab$CheckIn;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreenContract$Tab$Manage;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreenContract$Tab$Overview;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelFlightsPostBookingScreenContract$Tab implements FixedIdPagerItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreenContract$Tab$CheckIn;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreenContract$Tab;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CheckIn extends TravelFlightsPostBookingScreenContract$Tab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CheckIn f93390a = new CheckIn();

        @NotNull
        public static final Parcelable.Creator<CheckIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CheckIn.f93390a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CheckIn[i];
            }
        }

        private CheckIn() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreenContract$Tab$Manage;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreenContract$Tab;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Manage extends TravelFlightsPostBookingScreenContract$Tab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Manage f93391a = new Manage();

        @NotNull
        public static final Parcelable.Creator<Manage> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Manage.f93391a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Manage[i];
            }
        }

        private Manage() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreenContract$Tab$Overview;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreenContract$Tab;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Overview extends TravelFlightsPostBookingScreenContract$Tab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Overview f93392a = new Overview();

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Overview.f93392a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overview[i];
            }
        }

        private Overview() {
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

    /* JADX INFO: renamed from: com.revolut.feature.travel.flights.impl.ui.screen.post_booking.TravelFlightsPostBookingScreenContract$Tab$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    private TravelFlightsPostBookingScreenContract$Tab() {
    }
}
