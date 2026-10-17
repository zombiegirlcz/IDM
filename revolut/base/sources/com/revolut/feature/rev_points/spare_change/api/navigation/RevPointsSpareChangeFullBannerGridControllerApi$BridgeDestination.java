package com.revolut.feature.rev_points.spare_change.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_rev_points_spare_change_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsSpareChangeFullBannerGridControllerApi$InputData f84136a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination(RevPointsSpareChangeFullBannerGridControllerApi$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination[i];
        }
    }

    public RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination(RevPointsSpareChangeFullBannerGridControllerApi$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f84136a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination) && Intrinsics.f(this.f84136a, ((RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination) obj2).f84136a);
    }

    public final int hashCode() {
        return this.f84136a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84136a.writeToParcel(dest, i);
    }
}
