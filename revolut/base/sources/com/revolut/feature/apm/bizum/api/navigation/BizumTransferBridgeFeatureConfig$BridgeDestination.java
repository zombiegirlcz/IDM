package com.revolut.feature.apm.bizum.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/bizum/api/navigation/BizumTransferBridgeFeatureConfig$BridgeDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_apm_bizum_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BizumTransferBridgeFeatureConfig$BridgeDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BizumTransferBridgeFeatureConfig$BridgeDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumTransferInputData f61560a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BizumTransferBridgeFeatureConfig$BridgeDestination(BizumTransferInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BizumTransferBridgeFeatureConfig$BridgeDestination[i];
        }
    }

    public BizumTransferBridgeFeatureConfig$BridgeDestination(BizumTransferInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f61560a = inputData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BizumTransferInputData getF61560a() {
        return this.f61560a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BizumTransferBridgeFeatureConfig$BridgeDestination) && Intrinsics.f(this.f61560a, ((BizumTransferBridgeFeatureConfig$BridgeDestination) obj2).f61560a);
    }

    public final int hashCode() {
        return this.f61560a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f61560a.writeToParcel(dest, i);
    }
}
