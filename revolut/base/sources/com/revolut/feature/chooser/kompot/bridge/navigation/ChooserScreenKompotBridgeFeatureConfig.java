package com.revolut.feature.chooser.kompot.bridge.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/chooser/kompot/bridge/navigation/ChooserScreenKompotBridgeFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "ChooserScreenBridgeBizDestination", "feature_chooser_kompot_bridge_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChooserScreenKompotBridgeFeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<ChooserScreenKompotBridgeFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChooserConfiguration f65929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f65930h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/chooser/kompot/bridge/navigation/ChooserScreenKompotBridgeFeatureConfig$ChooserScreenBridgeBizDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_chooser_kompot_bridge_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooserScreenBridgeBizDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ChooserScreenBridgeBizDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChooserConfiguration f65931a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChooserScreenBridgeBizDestination((ChooserConfiguration) parcel.readParcelable(ChooserScreenBridgeBizDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooserScreenBridgeBizDestination[i];
            }
        }

        public ChooserScreenBridgeBizDestination(ChooserConfiguration chooserConfiguration) {
            Intrinsics.checkNotNullParameter(chooserConfiguration, "chooserConfiguration");
            this.f65931a = chooserConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChooserScreenBridgeBizDestination) && Intrinsics.f(this.f65931a, ((ChooserScreenBridgeBizDestination) obj2).f65931a);
        }

        public final int hashCode() {
            return this.f65931a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65931a, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChooserScreenKompotBridgeFeatureConfig((ChooserConfiguration) parcel.readParcelable(ChooserScreenKompotBridgeFeatureConfig.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChooserScreenKompotBridgeFeatureConfig[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooserScreenKompotBridgeFeatureConfig(ChooserConfiguration chooserConfiguration, int i) {
        super((ActivityAnimation) null, (ParcelableDestination) new ChooserScreenBridgeBizDestination(chooserConfiguration), false, Integer.valueOf(i), 0, 53);
        Intrinsics.checkNotNullParameter(chooserConfiguration, "chooserConfiguration");
        this.f65929g = chooserConfiguration;
        this.f65930h = i;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: c */
    public final Integer getF89982h() {
        return Integer.valueOf(this.f65930h);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChooserScreenKompotBridgeFeatureConfig)) {
            return false;
        }
        ChooserScreenKompotBridgeFeatureConfig chooserScreenKompotBridgeFeatureConfig = (ChooserScreenKompotBridgeFeatureConfig) obj2;
        return Intrinsics.f(this.f65929g, chooserScreenKompotBridgeFeatureConfig.f65929g) && this.f65930h == chooserScreenKompotBridgeFeatureConfig.f65930h;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return Integer.hashCode(this.f65930h) + (this.f65929g.hashCode() * 31);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65929g, i);
        dest.writeInt(this.f65930h);
    }
}
