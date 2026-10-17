package com.revolut.feature.shops.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/api/config/ShopsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Home", "Map", "Lcom/revolut/feature/shops/api/config/ShopsFeatureConfig$Home;", "Lcom/revolut/feature/shops/api/config/ShopsFeatureConfig$Map;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ShopsFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/api/config/ShopsFeatureConfig$Home;", "Lcom/revolut/feature/shops/api/config/ShopsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends ShopsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f86986g;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/api/config/ShopsFeatureConfig$Home$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86987a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TransitionAnimation f86988b;

            /* JADX INFO: loaded from: classes7.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readString(), (TransitionAnimation) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination() {
                this((String) null, 3);
            }

            @Override // aii.d0
            /* JADX INFO: renamed from: Y0, reason: from getter */
            public final TransitionAnimation getF86991b() {
                return this.f86988b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f86987a, destination.f86987a) && Intrinsics.f(this.f86988b, destination.f86988b);
            }

            public final int hashCode() {
                String str = this.f86987a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                TransitionAnimation transitionAnimation = this.f86988b;
                return iHashCode + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86987a);
                dest.writeParcelable(this.f86988b, i);
            }

            public Destination(String str, TransitionAnimation transitionAnimation) {
                this.f86987a = str;
                this.f86988b = transitionAnimation;
            }

            public /* synthetic */ Destination(String str, int i) {
                this((i & 1) != 0 ? null : str, (TransitionAnimation) null);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home(parcel.readString());
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
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && Intrinsics.f(this.f86986g, ((Home) obj2).f86986g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            String str = this.f86986g;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86986g);
        }

        public Home(String str) {
            super(new Destination(str, 2));
            this.f86986g = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/api/config/ShopsFeatureConfig$Map;", "Lcom/revolut/feature/shops/api/config/ShopsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Map extends ShopsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Map> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final co3.a f86989g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/api/config/ShopsFeatureConfig$Map$Destination;", "Lcom/revolut/kompot/common/StackDestination;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements StackDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final co3.a f86990a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TransitionAnimation f86991b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((co3.a) parcel.readSerializable(), (TransitionAnimation) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Destination() {
                this(null, 0 == true ? 1 : 0, 3);
            }

            @Override // aii.d0
            /* JADX INFO: renamed from: Y0, reason: from getter */
            public final TransitionAnimation getF86991b() {
                return this.f86991b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f86990a, destination.f86990a) && Intrinsics.f(this.f86991b, destination.f86991b);
            }

            public final int hashCode() {
                co3.a aVar = this.f86990a;
                int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
                TransitionAnimation transitionAnimation = this.f86991b;
                return iHashCode + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f86990a);
                dest.writeParcelable(this.f86991b, i);
            }

            public Destination(co3.a aVar, TransitionAnimation transitionAnimation) {
                this.f86990a = aVar;
                this.f86991b = transitionAnimation;
            }

            public /* synthetic */ Destination(co3.a aVar, ZoomTransitionAnimation.Widgets widgets, int i) {
                this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? null : widgets);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Map((co3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Map[i];
            }
        }

        public Map() {
            this(null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Map) && Intrinsics.f(this.f86989g, ((Map) obj2).f86989g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            co3.a aVar = this.f86989g;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f86989g);
        }

        public Map(co3.a aVar) {
            super(new Destination(aVar, null, 2));
            this.f86989g = aVar;
        }
    }

    public ShopsFeatureConfig(StackDestination stackDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) stackDestination, false, (Integer) null, 0, 61);
    }
}
