package com.revolut.feature.rev_points.spare_change.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$BridgeDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_rev_points_spare_change_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class RevPointsSpareChangeControllerApi$BridgeDestination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsSpareChangeControllerApi$Mode f84124a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RevPointsSpareChangeControllerApi$BridgeDestination> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$BridgeDestination$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsSpareChangeControllerApi$BridgeDestination((RevPointsSpareChangeControllerApi$Mode) parcel.readParcelable(RevPointsSpareChangeControllerApi$BridgeDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsSpareChangeControllerApi$BridgeDestination[i];
        }
    }

    public RevPointsSpareChangeControllerApi$BridgeDestination(RevPointsSpareChangeControllerApi$Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f84124a = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RevPointsSpareChangeControllerApi$BridgeDestination) && Intrinsics.f(this.f84124a, ((RevPointsSpareChangeControllerApi$BridgeDestination) obj2).f84124a);
    }

    public final int hashCode() {
        return this.f84124a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84124a, i);
    }
}
