package com.revolut.feature.rev_points.spare_change.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import ht0.b0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeFullBannerGridControllerApi$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_spare_change_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsSpareChangeFullBannerGridControllerApi$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RevPointsSpareChangeFullBannerGridControllerApi$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsSpareChangeFullBannerGridControllerApi$InputData f84137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f84138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f84139c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsSpareChangeFullBannerGridControllerApi$Destination(RevPointsSpareChangeFullBannerGridControllerApi$InputData.CREATOR.createFromParcel(parcel), null, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsSpareChangeFullBannerGridControllerApi$Destination[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RevPointsSpareChangeFullBannerGridControllerApi$Destination(RevPointsSpareChangeControllerApi$InputData inputData, Function1 function1, b0 b0Var, int i) {
        function1 = (i & 2) != 0 ? null : function1;
        b0Var = (i & 4) != 0 ? null : b0Var;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this(new RevPointsSpareChangeFullBannerGridControllerApi$InputData(inputData), function1, b0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsSpareChangeFullBannerGridControllerApi$Destination)) {
            return false;
        }
        RevPointsSpareChangeFullBannerGridControllerApi$Destination revPointsSpareChangeFullBannerGridControllerApi$Destination = (RevPointsSpareChangeFullBannerGridControllerApi$Destination) obj2;
        return Intrinsics.f(this.f84137a, revPointsSpareChangeFullBannerGridControllerApi$Destination.f84137a) && Intrinsics.f(this.f84138b, revPointsSpareChangeFullBannerGridControllerApi$Destination.f84138b) && Intrinsics.f(this.f84139c, revPointsSpareChangeFullBannerGridControllerApi$Destination.f84139c);
    }

    public final int hashCode() {
        int iHashCode = this.f84137a.hashCode() * 31;
        Function1 function1 = this.f84138b;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function0 function0 = this.f84139c;
        return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84137a.writeToParcel(dest, i);
    }

    public RevPointsSpareChangeFullBannerGridControllerApi$Destination(RevPointsSpareChangeFullBannerGridControllerApi$InputData inputData, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f84137a = inputData;
        this.f84138b = function1;
        this.f84139c = function0;
    }
}
