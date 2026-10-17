package com.revolut.feature.rev_points.spare_change.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPointsProductRate;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeBreakdownControllerApi$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_spare_change_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsSpareChangeBreakdownControllerApi$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsSpareChangeBreakdownControllerApi$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpareChangeCalculations f84121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84123c;
    public final boolean d;
    public final RevPointsProductRate e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsSpareChangeBreakdownControllerApi$InputData((SpareChangeCalculations) parcel.readParcelable(RevPointsSpareChangeBreakdownControllerApi$InputData.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, (RevPointsProductRate) parcel.readParcelable(RevPointsSpareChangeBreakdownControllerApi$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsSpareChangeBreakdownControllerApi$InputData[i];
        }
    }

    public RevPointsSpareChangeBreakdownControllerApi$InputData(SpareChangeCalculations calculations, int i, boolean z, boolean z3, RevPointsProductRate revPointsProductRate) {
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        this.f84121a = calculations;
        this.f84122b = i;
        this.f84123c = z;
        this.d = z3;
        this.e = revPointsProductRate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsSpareChangeBreakdownControllerApi$InputData)) {
            return false;
        }
        RevPointsSpareChangeBreakdownControllerApi$InputData revPointsSpareChangeBreakdownControllerApi$InputData = (RevPointsSpareChangeBreakdownControllerApi$InputData) obj2;
        return Intrinsics.f(this.f84121a, revPointsSpareChangeBreakdownControllerApi$InputData.f84121a) && this.f84122b == revPointsSpareChangeBreakdownControllerApi$InputData.f84122b && this.f84123c == revPointsSpareChangeBreakdownControllerApi$InputData.f84123c && this.d == revPointsSpareChangeBreakdownControllerApi$InputData.d && Intrinsics.f(this.e, revPointsSpareChangeBreakdownControllerApi$InputData.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.b(this.f84122b, this.f84121a.hashCode() * 31, 31), 31, this.f84123c), 31, this.d);
        RevPointsProductRate revPointsProductRate = this.e;
        return iC + (revPointsProductRate == null ? 0 : revPointsProductRate.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84121a, i);
        dest.writeInt(this.f84122b);
        dest.writeInt(this.f84123c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
    }

    public /* synthetic */ RevPointsSpareChangeBreakdownControllerApi$InputData(SpareChangeCalculations spareChangeCalculations, int i, boolean z, int i2) {
        this(spareChangeCalculations, i, z, (i2 & 8) != 0, null);
    }
}
