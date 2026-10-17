package com.revolut.feature.transfer.core.api.ui.reference;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer/core/api/ui/reference/ReferenceFeatureConfig$BridgeDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReferenceFeatureConfig$BridgeDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ReferenceFeatureConfig$BridgeDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReferenceInputData f92159b;

    /* JADX INFO: loaded from: classes9.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReferenceFeatureConfig$BridgeDestination(parcel.readString(), ReferenceInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReferenceFeatureConfig$BridgeDestination[i];
        }
    }

    public ReferenceFeatureConfig$BridgeDestination(String requestId, ReferenceInputData inputData) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f92158a = requestId;
        this.f92159b = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReferenceFeatureConfig$BridgeDestination)) {
            return false;
        }
        ReferenceFeatureConfig$BridgeDestination referenceFeatureConfig$BridgeDestination = (ReferenceFeatureConfig$BridgeDestination) obj2;
        return Intrinsics.f(this.f92158a, referenceFeatureConfig$BridgeDestination.f92158a) && Intrinsics.f(this.f92159b, referenceFeatureConfig$BridgeDestination.f92159b);
    }

    public final int hashCode() {
        return this.f92159b.hashCode() + (this.f92158a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92158a);
        this.f92159b.writeToParcel(dest, i);
    }
}
