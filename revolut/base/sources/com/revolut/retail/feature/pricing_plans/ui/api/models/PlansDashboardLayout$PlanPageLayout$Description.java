package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$Description", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlansDashboardLayout$PlanPageLayout$Description implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlansDashboardLayout$PlanPageLayout$Description> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$Tooltip f102775b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlansDashboardLayout$PlanPageLayout$Description(parcel.readString(), parcel.readInt() == 0 ? null : PlansDashboardLayout$PlanPageLayout$Tooltip.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlansDashboardLayout$PlanPageLayout$Description[i];
        }
    }

    public PlansDashboardLayout$PlanPageLayout$Description(String text, PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f102774a = text;
        this.f102775b = plansDashboardLayout$PlanPageLayout$Tooltip;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlansDashboardLayout$PlanPageLayout$Description)) {
            return false;
        }
        PlansDashboardLayout$PlanPageLayout$Description plansDashboardLayout$PlanPageLayout$Description = (PlansDashboardLayout$PlanPageLayout$Description) obj2;
        return Intrinsics.f(this.f102774a, plansDashboardLayout$PlanPageLayout$Description.f102774a) && Intrinsics.f(this.f102775b, plansDashboardLayout$PlanPageLayout$Description.f102775b);
    }

    public final int hashCode() {
        int iHashCode = this.f102774a.hashCode() * 31;
        PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip = this.f102775b;
        return iHashCode + (plansDashboardLayout$PlanPageLayout$Tooltip == null ? 0 : plansDashboardLayout$PlanPageLayout$Tooltip.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102774a);
        PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip = this.f102775b;
        if (plansDashboardLayout$PlanPageLayout$Tooltip == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plansDashboardLayout$PlanPageLayout$Tooltip.writeToParcel(dest, i);
        }
    }
}
