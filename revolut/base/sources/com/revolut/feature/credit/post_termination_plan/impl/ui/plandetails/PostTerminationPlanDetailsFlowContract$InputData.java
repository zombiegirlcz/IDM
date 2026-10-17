package com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/post_termination_plan/impl/ui/plandetails/PostTerminationPlanDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_post_termination_plan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PostTerminationPlanDetailsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PostTerminationPlanDetailsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPostTerminationPlanDetails f70667b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PostTerminationPlanDetailsFlowContract$InputData(parcel.readString(), (CreditPostTerminationPlanDetails) parcel.readParcelable(PostTerminationPlanDetailsFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostTerminationPlanDetailsFlowContract$InputData[i];
        }
    }

    public PostTerminationPlanDetailsFlowContract$InputData(String planId, CreditPostTerminationPlanDetails creditPostTerminationPlanDetails) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f70666a = planId;
        this.f70667b = creditPostTerminationPlanDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PostTerminationPlanDetailsFlowContract$InputData)) {
            return false;
        }
        PostTerminationPlanDetailsFlowContract$InputData postTerminationPlanDetailsFlowContract$InputData = (PostTerminationPlanDetailsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f70666a, postTerminationPlanDetailsFlowContract$InputData.f70666a) && Intrinsics.f(this.f70667b, postTerminationPlanDetailsFlowContract$InputData.f70667b);
    }

    public final int hashCode() {
        int iHashCode = this.f70666a.hashCode() * 31;
        CreditPostTerminationPlanDetails creditPostTerminationPlanDetails = this.f70667b;
        return iHashCode + (creditPostTerminationPlanDetails == null ? 0 : creditPostTerminationPlanDetails.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70666a);
        dest.writeParcelable(this.f70667b, i);
    }
}
