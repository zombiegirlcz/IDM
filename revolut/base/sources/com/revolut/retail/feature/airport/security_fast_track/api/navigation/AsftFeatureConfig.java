package com.revolut.retail.feature.airport.security_fast_track.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassRefundBreakdown;
import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/navigation/AsftFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Home", "HomeDestination", "PassDetailsDestination", "PassBookingDestination", "WidgetDestination", "Lcom/revolut/retail/feature/airport/security_fast_track/api/navigation/AsftFeatureConfig$Home;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AsftFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/navigation/AsftFeatureConfig$Home;", "Lcom/revolut/retail/feature/airport/security_fast_track/api/navigation/AsftFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends AsftFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f98751g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home((ActivityAnimation) parcel.readParcelable(Home.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home() {
            this(null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF98751g() {
            return this.f98751g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && Intrinsics.f(this.f98751g, ((Home) obj2).f98751g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f98751g;
            if (activityAnimation == null) {
                return 0;
            }
            return activityAnimation.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98751g, i);
        }

        public Home(ActivityAnimation activityAnimation) {
            super(activityAnimation, new HomeDestination(null), false, null, 0, 60);
            this.f98751g = activityAnimation;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/navigation/AsftFeatureConfig$PassBookingDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PassBookingDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PassBookingDestination f98753a = new PassBookingDestination();

        @NotNull
        public static final Parcelable.Creator<PassBookingDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PassBookingDestination.f98753a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassBookingDestination[i];
            }
        }

        private PassBookingDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/navigation/AsftFeatureConfig$PassDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassDetailsDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<PassDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f98755b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PassDetailsDestination(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassDetailsDestination[i];
            }
        }

        public PassDetailsDestination(String passId, boolean z) {
            Intrinsics.checkNotNullParameter(passId, "passId");
            this.f98754a = passId;
            this.f98755b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PassDetailsDestination)) {
                return false;
            }
            PassDetailsDestination passDetailsDestination = (PassDetailsDestination) obj2;
            return Intrinsics.f(this.f98754a, passDetailsDestination.f98754a) && this.f98755b == passDetailsDestination.f98755b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f98755b) + (this.f98754a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98754a);
            dest.writeInt(this.f98755b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/navigation/AsftFeatureConfig$WidgetDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "PassAvailableSoon", "Lcom/revolut/retail/feature/airport/security_fast_track/api/navigation/AsftFeatureConfig$WidgetDestination$PassAvailableSoon;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class WidgetDestination implements KompotDestination {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/navigation/AsftFeatureConfig$WidgetDestination$PassAvailableSoon;", "Lcom/revolut/retail/feature/airport/security_fast_track/api/navigation/AsftFeatureConfig$WidgetDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PassAvailableSoon extends WidgetDestination {

            @NotNull
            public static final Parcelable.Creator<PassAvailableSoon> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f98756a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f98757b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f98758c;
            public final String d;
            public final OffsetDateTime e;
            public final AsftPassRefundBreakdown f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PassAvailableSoon(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), (OffsetDateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : AsftPassRefundBreakdown.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PassAvailableSoon[i];
                }
            }

            public PassAvailableSoon(int i, String termsUrl, String passId, String airportDescription, OffsetDateTime offsetDateTime, AsftPassRefundBreakdown asftPassRefundBreakdown) {
                Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
                Intrinsics.checkNotNullParameter(passId, "passId");
                Intrinsics.checkNotNullParameter(airportDescription, "airportDescription");
                this.f98756a = i;
                this.f98757b = termsUrl;
                this.f98758c = passId;
                this.d = airportDescription;
                this.e = offsetDateTime;
                this.f = asftPassRefundBreakdown;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PassAvailableSoon)) {
                    return false;
                }
                PassAvailableSoon passAvailableSoon = (PassAvailableSoon) obj2;
                return this.f98756a == passAvailableSoon.f98756a && Intrinsics.f(this.f98757b, passAvailableSoon.f98757b) && Intrinsics.f(this.f98758c, passAvailableSoon.f98758c) && Intrinsics.f(this.d, passAvailableSoon.d) && Intrinsics.f(this.e, passAvailableSoon.e) && Intrinsics.f(this.f, passAvailableSoon.f);
            }

            public final int hashCode() {
                int iC = p.a.c(p.a.c(p.a.c(Integer.hashCode(this.f98756a) * 31, 31, this.f98757b), 31, this.f98758c), 31, this.d);
                OffsetDateTime offsetDateTime = this.e;
                int iHashCode = (iC + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
                AsftPassRefundBreakdown asftPassRefundBreakdown = this.f;
                return iHashCode + (asftPassRefundBreakdown != null ? asftPassRefundBreakdown.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f98756a);
                dest.writeString(this.f98757b);
                dest.writeString(this.f98758c);
                dest.writeString(this.d);
                dest.writeSerializable(this.e);
                AsftPassRefundBreakdown asftPassRefundBreakdown = this.f;
                if (asftPassRefundBreakdown == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    asftPassRefundBreakdown.writeToParcel(dest, i);
                }
            }
        }

        private WidgetDestination() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/navigation/AsftFeatureConfig$HomeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HomeDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<HomeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransitionAnimation f98752a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HomeDestination((TransitionAnimation) parcel.readParcelable(HomeDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HomeDestination[i];
            }
        }

        public HomeDestination(TransitionAnimation transitionAnimation) {
            this.f98752a = transitionAnimation;
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: Y0, reason: from getter */
        public final TransitionAnimation getF98752a() {
            return this.f98752a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof HomeDestination) && Intrinsics.f(this.f98752a, ((HomeDestination) obj2).f98752a);
        }

        public final int hashCode() {
            TransitionAnimation transitionAnimation = this.f98752a;
            if (transitionAnimation == null) {
                return 0;
            }
            return transitionAnimation.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98752a, i);
        }

        public HomeDestination() {
            this(null);
        }
    }
}
