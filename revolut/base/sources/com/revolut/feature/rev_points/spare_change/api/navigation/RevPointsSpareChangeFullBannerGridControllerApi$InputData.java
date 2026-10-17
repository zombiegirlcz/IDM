package com.revolut.feature.rev_points.spare_change.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeFullBannerGridControllerApi$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_spare_change_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsSpareChangeFullBannerGridControllerApi$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsSpareChangeFullBannerGridControllerApi$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsSpareChangeControllerApi$InputData f84140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsSpareChangeFullBannerGridControllerApi$CompletionMode f84141b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsSpareChangeFullBannerGridControllerApi$InputData(RevPointsSpareChangeControllerApi$InputData.CREATOR.createFromParcel(parcel), RevPointsSpareChangeFullBannerGridControllerApi$CompletionMode.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsSpareChangeFullBannerGridControllerApi$InputData[i];
        }
    }

    public RevPointsSpareChangeFullBannerGridControllerApi$InputData(RevPointsSpareChangeControllerApi$InputData spareChangeInputData, RevPointsSpareChangeFullBannerGridControllerApi$CompletionMode completionMode) {
        Intrinsics.checkNotNullParameter(spareChangeInputData, "spareChangeInputData");
        Intrinsics.checkNotNullParameter(completionMode, "completionMode");
        this.f84140a = spareChangeInputData;
        this.f84141b = completionMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsSpareChangeFullBannerGridControllerApi$InputData)) {
            return false;
        }
        RevPointsSpareChangeFullBannerGridControllerApi$InputData revPointsSpareChangeFullBannerGridControllerApi$InputData = (RevPointsSpareChangeFullBannerGridControllerApi$InputData) obj2;
        return Intrinsics.f(this.f84140a, revPointsSpareChangeFullBannerGridControllerApi$InputData.f84140a) && this.f84141b == revPointsSpareChangeFullBannerGridControllerApi$InputData.f84141b;
    }

    public final int hashCode() {
        return this.f84141b.hashCode() + (this.f84140a.f84125a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84140a.writeToParcel(dest, i);
        this.f84141b.writeToParcel(dest, i);
    }

    public /* synthetic */ RevPointsSpareChangeFullBannerGridControllerApi$InputData(RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData) {
        this(revPointsSpareChangeControllerApi$InputData, RevPointsSpareChangeFullBannerGridControllerApi$CompletionMode.NAVIGATE_BACK);
    }
}
