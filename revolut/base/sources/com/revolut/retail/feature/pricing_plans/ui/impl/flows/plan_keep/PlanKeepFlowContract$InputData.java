package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep;

import android.os.Parcel;
import android.os.Parcelable;
import ggk.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_keep/PlanKeepFlowContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanKeepFlowContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanKeepFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f103184a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanKeepFlowContract$InputData(c0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanKeepFlowContract$InputData[i];
        }
    }

    public PlanKeepFlowContract$InputData(c0 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f103184a = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PlanKeepFlowContract$InputData) && this.f103184a == ((PlanKeepFlowContract$InputData) obj2).f103184a;
    }

    public final int hashCode() {
        return this.f103184a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103184a.name());
    }

    public PlanKeepFlowContract$InputData() {
        this(c0.SHOW_BENEFITS_TO_LOSE);
    }
}
