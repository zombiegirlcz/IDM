package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanCancelFeatures$CancelReason;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/features/PlanCancelFeaturesScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanCancelFeaturesScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanCancelFeaturesScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanCancelFeatures$CancelReason f103509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f103510b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanCancelFeaturesScreenContract$InputData((PlanCancelFeatures$CancelReason) parcel.readParcelable(PlanCancelFeaturesScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanCancelFeaturesScreenContract$InputData[i];
        }
    }

    public PlanCancelFeaturesScreenContract$InputData(PlanCancelFeatures$CancelReason cancelReason, boolean z) {
        Intrinsics.checkNotNullParameter(cancelReason, "cancelReason");
        this.f103509a = cancelReason;
        this.f103510b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanCancelFeaturesScreenContract$InputData)) {
            return false;
        }
        PlanCancelFeaturesScreenContract$InputData planCancelFeaturesScreenContract$InputData = (PlanCancelFeaturesScreenContract$InputData) obj2;
        return Intrinsics.f(this.f103509a, planCancelFeaturesScreenContract$InputData.f103509a) && this.f103510b == planCancelFeaturesScreenContract$InputData.f103510b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103510b) + (this.f103509a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103509a, i);
        dest.writeInt(this.f103510b ? 1 : 0);
    }
}
