package com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPointsProductRate;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/rev_points/spare_change/impl/ui/screen/full_multiplier_spare_change/RevPointsSpareChangeFullMultiplierControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Breakdown", "Lcom/revolut/feature/rev_points/spare_change/impl/ui/screen/full_multiplier_spare_change/RevPointsSpareChangeFullMultiplierControllerContract$ModalStep$Breakdown;", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsSpareChangeFullMultiplierControllerContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/spare_change/impl/ui/screen/full_multiplier_spare_change/RevPointsSpareChangeFullMultiplierControllerContract$ModalStep$Breakdown;", "Lcom/revolut/feature/rev_points/spare_change/impl/ui/screen/full_multiplier_spare_change/RevPointsSpareChangeFullMultiplierControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Breakdown extends RevPointsSpareChangeFullMultiplierControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Breakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpareChangeCalculations f84171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RevPointsProductRate f84172b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Breakdown((SpareChangeCalculations) parcel.readParcelable(Breakdown.class.getClassLoader()), (RevPointsProductRate) parcel.readParcelable(Breakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Breakdown[i];
            }
        }

        public Breakdown(SpareChangeCalculations calculations, RevPointsProductRate revPointsProductRate) {
            Intrinsics.checkNotNullParameter(calculations, "calculations");
            this.f84171a = calculations;
            this.f84172b = revPointsProductRate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Breakdown)) {
                return false;
            }
            Breakdown breakdown = (Breakdown) obj2;
            return Intrinsics.f(this.f84171a, breakdown.f84171a) && Intrinsics.f(this.f84172b, breakdown.f84172b);
        }

        public final int hashCode() {
            int iHashCode = this.f84171a.hashCode() * 31;
            RevPointsProductRate revPointsProductRate = this.f84172b;
            return iHashCode + (revPointsProductRate == null ? 0 : revPointsProductRate.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84171a, i);
            dest.writeParcelable(this.f84172b, i);
        }
    }

    private RevPointsSpareChangeFullMultiplierControllerContract$ModalStep() {
    }
}
