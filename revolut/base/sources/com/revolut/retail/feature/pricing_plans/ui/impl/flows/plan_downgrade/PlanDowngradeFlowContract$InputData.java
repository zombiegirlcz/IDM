package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import hha.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanDowngradeFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanDowngradeFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f103154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103155c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanDowngradeFlowContract$InputData(parcel.readString(), i.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanDowngradeFlowContract$InputData[i];
        }
    }

    public PlanDowngradeFlowContract$InputData(String selectedPlanId, i selectedBilling, boolean z) {
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        this.f103153a = selectedPlanId;
        this.f103154b = selectedBilling;
        this.f103155c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanDowngradeFlowContract$InputData)) {
            return false;
        }
        PlanDowngradeFlowContract$InputData planDowngradeFlowContract$InputData = (PlanDowngradeFlowContract$InputData) obj2;
        return Intrinsics.f(this.f103153a, planDowngradeFlowContract$InputData.f103153a) && this.f103154b == planDowngradeFlowContract$InputData.f103154b && this.f103155c == planDowngradeFlowContract$InputData.f103155c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103155c) + ((this.f103154b.hashCode() + (this.f103153a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103153a);
        dest.writeString(this.f103154b.name());
        dest.writeInt(this.f103155c ? 1 : 0);
    }
}
