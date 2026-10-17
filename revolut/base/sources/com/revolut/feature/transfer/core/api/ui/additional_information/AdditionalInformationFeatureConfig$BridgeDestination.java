package com.revolut.feature.transfer.core.api.ui.additional_information;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer/core/api/ui/additional_information/AdditionalInformationFeatureConfig$BridgeDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalInformationFeatureConfig$BridgeDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AdditionalInformationFeatureConfig$BridgeDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdditionalInformationInputData f92154b;

    /* JADX INFO: loaded from: classes9.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalInformationFeatureConfig$BridgeDestination(parcel.readString(), AdditionalInformationInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalInformationFeatureConfig$BridgeDestination[i];
        }
    }

    public AdditionalInformationFeatureConfig$BridgeDestination(String requestId, AdditionalInformationInputData inputData) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f92153a = requestId;
        this.f92154b = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalInformationFeatureConfig$BridgeDestination)) {
            return false;
        }
        AdditionalInformationFeatureConfig$BridgeDestination additionalInformationFeatureConfig$BridgeDestination = (AdditionalInformationFeatureConfig$BridgeDestination) obj2;
        return Intrinsics.f(this.f92153a, additionalInformationFeatureConfig$BridgeDestination.f92153a) && Intrinsics.f(this.f92154b, additionalInformationFeatureConfig$BridgeDestination.f92154b);
    }

    public final int hashCode() {
        return this.f92154b.hashCode() + (this.f92153a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92153a);
        this.f92154b.writeToParcel(dest, i);
    }
}
