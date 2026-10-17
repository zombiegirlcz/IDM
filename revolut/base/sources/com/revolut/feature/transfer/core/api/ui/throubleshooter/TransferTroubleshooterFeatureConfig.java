package com.revolut.feature.transfer.core.api.ui.throubleshooter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferTroubleshooterFeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<TransferTroubleshooterFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TransferTroubleshooterInputData f92171g;

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterFeatureConfig$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BridgeDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferTroubleshooterInputData f92172a;

        /* JADX INFO: loaded from: classes9.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BridgeDestination(TransferTroubleshooterInputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BridgeDestination[i];
            }
        }

        public BridgeDestination(TransferTroubleshooterInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f92172a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BridgeDestination) && Intrinsics.f(this.f92172a, ((BridgeDestination) obj2).f92172a);
        }

        public final int hashCode() {
            return this.f92172a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f92172a.writeToParcel(dest, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferTroubleshooterFeatureConfig(TransferTroubleshooterInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferTroubleshooterFeatureConfig[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferTroubleshooterFeatureConfig(TransferTroubleshooterInputData inputData) {
        super((ActivityAnimation) null, (ParcelableDestination) new BridgeDestination(inputData), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f92171g = inputData;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TransferTroubleshooterFeatureConfig) && Intrinsics.f(this.f92171g, ((TransferTroubleshooterFeatureConfig) obj2).f92171g);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.f92171g.hashCode();
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f92171g.writeToParcel(dest, i);
    }
}
