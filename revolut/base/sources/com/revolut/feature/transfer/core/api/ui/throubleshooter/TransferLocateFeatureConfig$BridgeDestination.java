package com.revolut.feature.transfer.core.api.ui.throubleshooter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer/core/api/ui/throubleshooter/TransferLocateFeatureConfig$BridgeDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferLocateFeatureConfig$BridgeDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TransferLocateFeatureConfig$BridgeDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferLocateInputData f92163a;

    /* JADX INFO: loaded from: classes9.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferLocateFeatureConfig$BridgeDestination(TransferLocateInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferLocateFeatureConfig$BridgeDestination[i];
        }
    }

    public TransferLocateFeatureConfig$BridgeDestination(TransferLocateInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f92163a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TransferLocateFeatureConfig$BridgeDestination) && Intrinsics.f(this.f92163a, ((TransferLocateFeatureConfig$BridgeDestination) obj2).f92163a);
    }

    public final int hashCode() {
        return this.f92163a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f92163a.writeToParcel(dest, i);
    }
}
