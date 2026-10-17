package com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Landroid/os/Parcelable;", "FlightFinder", "AirlinesHome", "AirlinesMain", "Lcom/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem$AirlinesHome;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem$AirlinesMain;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem$FlightFinder;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem implements FixedIdPagerItem, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94249a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem$AirlinesHome;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirlinesHome extends TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AirlinesHome f94250b = new AirlinesHome();

        @NotNull
        public static final Parcelable.Creator<AirlinesHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirlinesHome.f94250b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirlinesHome[i];
            }
        }

        private AirlinesHome() {
            super("TAB_AIRLINES_HOME_ID");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem$AirlinesMain;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirlinesMain extends TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AirlinesMain f94251b = new AirlinesMain();

        @NotNull
        public static final Parcelable.Creator<AirlinesMain> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirlinesMain.f94251b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirlinesMain[i];
            }
        }

        private AirlinesMain() {
            super("TAB_AIRLINES_MAIN_ID");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem$FlightFinder;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FlightFinder extends TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FlightFinder f94252b = new FlightFinder();

        @NotNull
        public static final Parcelable.Creator<FlightFinder> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FlightFinder.f94252b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlightFinder[i];
            }
        }

        private FlightFinder() {
            super("TAB_FLIGHT_FINDER_ID");
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

    public TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem(String str) {
        this.f94249a = str;
    }

    @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF94249a() {
        return this.f94249a;
    }
}
