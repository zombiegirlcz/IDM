package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricingplans.models.PricingPlanUpdateSource;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/feedback/PlanCancelFeedbackScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanCancelFeedbackScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanCancelFeedbackScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iha.a f103511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f103512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanUpdateSource f103513c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanCancelFeedbackScreenContract$InputData(parcel.readInt() == 0 ? null : iha.a.valueOf(parcel.readString()), parcel.readInt() != 0, (PricingPlanUpdateSource) parcel.readParcelable(PlanCancelFeedbackScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanCancelFeedbackScreenContract$InputData[i];
        }
    }

    public PlanCancelFeedbackScreenContract$InputData(iha.a aVar, boolean z, PricingPlanUpdateSource pricingPlanUpdateSource) {
        this.f103511a = aVar;
        this.f103512b = z;
        this.f103513c = pricingPlanUpdateSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanCancelFeedbackScreenContract$InputData)) {
            return false;
        }
        PlanCancelFeedbackScreenContract$InputData planCancelFeedbackScreenContract$InputData = (PlanCancelFeedbackScreenContract$InputData) obj2;
        return this.f103511a == planCancelFeedbackScreenContract$InputData.f103511a && this.f103512b == planCancelFeedbackScreenContract$InputData.f103512b && Intrinsics.f(this.f103513c, planCancelFeedbackScreenContract$InputData.f103513c);
    }

    public final int hashCode() {
        iha.a aVar = this.f103511a;
        int iC = j6.a.c((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f103512b);
        PricingPlanUpdateSource pricingPlanUpdateSource = this.f103513c;
        return iC + (pricingPlanUpdateSource != null ? pricingPlanUpdateSource.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        iha.a aVar = this.f103511a;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeInt(this.f103512b ? 1 : 0);
        dest.writeParcelable(this.f103513c, i);
    }
}
