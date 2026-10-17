package com.revolut.retail.feature.airportlounges.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Home", "SchemeLounges", "PassPurchase", "PassRefund", "FindLounges", "HomeDestination", "SchemeLoungesDestination", "PurchasePassDestination", "PassDetailsDestination", "PassRefundDestination", "FindLoungesDestination", "Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$FindLounges;", "Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$Home;", "Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$PassPurchase;", "Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$PassRefund;", "Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$SchemeLounges;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AirportLoungesFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$FindLounges;", "Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FindLounges extends AirportLoungesFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<FindLounges> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f98943g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FindLounges(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FindLounges[i];
            }
        }

        public FindLounges() {
            this(false);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FindLounges) && this.f98943g == ((FindLounges) obj2).f98943g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return Boolean.hashCode(this.f98943g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f98943g ? 1 : 0);
        }

        public FindLounges(boolean z) {
            super(new FindLoungesDestination(z));
            this.f98943g = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$Home;", "Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends AirportLoungesFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f98945g;

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
        public final ActivityAnimation getF98953g() {
            return this.f98945g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && Intrinsics.f(this.f98945g, ((Home) obj2).f98945g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f98945g;
            if (activityAnimation == null) {
                return 0;
            }
            return activityAnimation.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98945g, i);
        }

        public Home(ActivityAnimation activityAnimation) {
            super(new HomeDestination((ZoomTransitionAnimation.Default) null, 3));
            this.f98945g = activityAnimation;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$HomeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HomeDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<HomeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f98946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransitionAnimation f98947c;

        /* JADX INFO: loaded from: classes10.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HomeDestination((TransitionAnimation) parcel.readParcelable(HomeDestination.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HomeDestination[i];
            }
        }

        public HomeDestination() {
            this((ZoomTransitionAnimation.Default) null, 3);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: Y0, reason: from getter */
        public final TransitionAnimation getF() {
            return this.f98947c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HomeDestination)) {
                return false;
            }
            HomeDestination homeDestination = (HomeDestination) obj2;
            return this.f98946b == homeDestination.f98946b && Intrinsics.f(this.f98947c, homeDestination.f98947c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f98946b) * 31;
            TransitionAnimation transitionAnimation = this.f98947c;
            return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: n1, reason: from getter */
        public final boolean getF76966b() {
            return this.f98946b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f98946b ? 1 : 0);
            dest.writeParcelable(this.f98947c, i);
        }

        public /* synthetic */ HomeDestination(ZoomTransitionAnimation.Default r110, int i) {
            this((TransitionAnimation) ((i & 2) != 0 ? null : r110), true);
        }

        public HomeDestination(TransitionAnimation transitionAnimation, boolean z) {
            super(IOData$EmptyInput.f98299a);
            this.f98946b = z;
            this.f98947c = transitionAnimation;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$PassDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "<init>", "()V", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PassDetailsDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PassDetailsDestination f98948b = new PassDetailsDestination();

        @NotNull
        public static final Parcelable.Creator<PassDetailsDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes10.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PassDetailsDestination.f98948b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassDetailsDestination[i];
            }
        }

        private PassDetailsDestination() {
            super(IOData$EmptyInput.f98299a);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$PassPurchase;", "Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig;", "<init>", "()V", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PassPurchase extends AirportLoungesFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final PassPurchase f98949g = new PassPurchase();

        @NotNull
        public static final Parcelable.Creator<PassPurchase> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PassPurchase.f98949g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassPurchase[i];
            }
        }

        private PassPurchase() {
            super(PurchasePassDestination.f98952a);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$PassRefund;", "Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig;", "<init>", "()V", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PassRefund extends AirportLoungesFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final PassRefund f98950g = new PassRefund();

        @NotNull
        public static final Parcelable.Creator<PassRefund> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PassRefund.f98950g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassRefund[i];
            }
        }

        private PassRefund() {
            super(PassRefundDestination.f98951b);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$PassRefundDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "<init>", "()V", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PassRefundDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PassRefundDestination f98951b = new PassRefundDestination();

        @NotNull
        public static final Parcelable.Creator<PassRefundDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes10.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PassRefundDestination.f98951b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassRefundDestination[i];
            }
        }

        private PassRefundDestination() {
            super(IOData$EmptyInput.f98299a);
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

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$PurchasePassDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PurchasePassDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PurchasePassDestination f98952a = new PurchasePassDestination();

        @NotNull
        public static final Parcelable.Creator<PurchasePassDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes10.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PurchasePassDestination.f98952a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurchasePassDestination[i];
            }
        }

        private PurchasePassDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$SchemeLounges;", "Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SchemeLounges extends AirportLoungesFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SchemeLounges> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f98953g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SchemeLounges((ActivityAnimation) parcel.readParcelable(SchemeLounges.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SchemeLounges[i];
            }
        }

        public SchemeLounges() {
            this(null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF98953g() {
            return this.f98953g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SchemeLounges) && Intrinsics.f(this.f98953g, ((SchemeLounges) obj2).f98953g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f98953g;
            if (activityAnimation == null) {
                return 0;
            }
            return activityAnimation.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98953g, i);
        }

        public SchemeLounges(ActivityAnimation activityAnimation) {
            super(new SchemeLoungesDestination(true));
            this.f98953g = activityAnimation;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$SchemeLoungesDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SchemeLoungesDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SchemeLoungesDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f98954b;

        /* JADX INFO: loaded from: classes10.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SchemeLoungesDestination(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SchemeLoungesDestination[i];
            }
        }

        public SchemeLoungesDestination() {
            this(true);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SchemeLoungesDestination) && this.f98954b == ((SchemeLoungesDestination) obj2).f98954b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f98954b);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: n1, reason: from getter */
        public final boolean getF76966b() {
            return this.f98954b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f98954b ? 1 : 0);
        }

        public SchemeLoungesDestination(boolean z) {
            super(IOData$EmptyInput.f98299a);
            this.f98954b = z;
        }
    }

    public AirportLoungesFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/navigation/AirportLoungesFeatureConfig$FindLoungesDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FindLoungesDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<FindLoungesDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f98944a;

        /* JADX INFO: loaded from: classes10.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FindLoungesDestination(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FindLoungesDestination[i];
            }
        }

        public FindLoungesDestination(boolean z) {
            this.f98944a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FindLoungesDestination) && this.f98944a == ((FindLoungesDestination) obj2).f98944a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f98944a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f98944a ? 1 : 0);
        }

        public FindLoungesDestination() {
            this(false);
        }
    }
}
