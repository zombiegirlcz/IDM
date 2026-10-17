package com.revolut.feature.payments.who_to_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/navigation/RecipientSelectionFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecipientSelectionFeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<RecipientSelectionFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f80011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RecipientSelectionInputData f80012h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/navigation/RecipientSelectionFeatureConfig$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BridgeDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecipientSelectionInputData f80014b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BridgeDestination(parcel.readString(), RecipientSelectionInputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BridgeDestination[i];
            }
        }

        public BridgeDestination(String requestId, RecipientSelectionInputData inputData) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f80013a = requestId;
            this.f80014b = inputData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final RecipientSelectionInputData getF80014b() {
            return this.f80014b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF80013a() {
            return this.f80013a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BridgeDestination)) {
                return false;
            }
            BridgeDestination bridgeDestination = (BridgeDestination) obj2;
            return Intrinsics.f(this.f80013a, bridgeDestination.f80013a) && Intrinsics.f(this.f80014b, bridgeDestination.f80014b);
        }

        public final int hashCode() {
            return this.f80014b.hashCode() + (this.f80013a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80013a);
            this.f80014b.writeToParcel(dest, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecipientSelectionFeatureConfig(parcel.readString(), RecipientSelectionInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecipientSelectionFeatureConfig[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipientSelectionFeatureConfig(String requestId, RecipientSelectionInputData inputData) {
        super((ActivityAnimation) null, (ParcelableDestination) new BridgeDestination(requestId, inputData), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f80011g = requestId;
        this.f80012h = inputData;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecipientSelectionFeatureConfig)) {
            return false;
        }
        RecipientSelectionFeatureConfig recipientSelectionFeatureConfig = (RecipientSelectionFeatureConfig) obj2;
        return Intrinsics.f(this.f80011g, recipientSelectionFeatureConfig.f80011g) && Intrinsics.f(this.f80012h, recipientSelectionFeatureConfig.f80012h);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.f80012h.hashCode() + (this.f80011g.hashCode() * 31);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80011g);
        this.f80012h.writeToParcel(dest, i);
    }
}
