package com.revolut.retail.feature.payments.bank_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferWithdrawalBridgeFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankTransferWithdrawalBridgeFeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<BankTransferWithdrawalBridgeFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BankTransferFlowInputData.NewTransfer f101963g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferWithdrawalBridgeFeatureConfig$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BridgeDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BankTransferFlowInputData.NewTransfer f101964a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BridgeDestination(BankTransferFlowInputData.NewTransfer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BridgeDestination[i];
            }
        }

        public BridgeDestination(BankTransferFlowInputData.NewTransfer inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f101964a = inputData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BankTransferFlowInputData.NewTransfer getF101964a() {
            return this.f101964a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BridgeDestination) && Intrinsics.f(this.f101964a, ((BridgeDestination) obj2).f101964a);
        }

        public final int hashCode() {
            return this.f101964a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f101964a.writeToParcel(dest, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankTransferWithdrawalBridgeFeatureConfig(BankTransferFlowInputData.NewTransfer.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankTransferWithdrawalBridgeFeatureConfig[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankTransferWithdrawalBridgeFeatureConfig(BankTransferFlowInputData.NewTransfer inputData) {
        super((ActivityAnimation) null, (ParcelableDestination) new BridgeDestination(inputData), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f101963g = inputData;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BankTransferWithdrawalBridgeFeatureConfig) && Intrinsics.f(this.f101963g, ((BankTransferWithdrawalBridgeFeatureConfig) obj2).f101963g);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.f101963g.hashCode();
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f101963g.writeToParcel(dest, i);
    }
}
