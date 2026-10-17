package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$Tooltip", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlansDashboardLayout$PlanPageLayout$Tooltip implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlansDashboardLayout$PlanPageLayout$Tooltip> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlansDashboardLayout$ClickAction f102791b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlansDashboardLayout$PlanPageLayout$Tooltip(parcel.readString(), (PlansDashboardLayout$ClickAction) parcel.readParcelable(PlansDashboardLayout$PlanPageLayout$Tooltip.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlansDashboardLayout$PlanPageLayout$Tooltip[i];
        }
    }

    public PlansDashboardLayout$PlanPageLayout$Tooltip(String icon, PlansDashboardLayout$ClickAction plansDashboardLayout$ClickAction) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f102790a = icon;
        this.f102791b = plansDashboardLayout$ClickAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlansDashboardLayout$PlanPageLayout$Tooltip)) {
            return false;
        }
        PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip = (PlansDashboardLayout$PlanPageLayout$Tooltip) obj2;
        return Intrinsics.f(this.f102790a, plansDashboardLayout$PlanPageLayout$Tooltip.f102790a) && Intrinsics.f(this.f102791b, plansDashboardLayout$PlanPageLayout$Tooltip.f102791b);
    }

    public final int hashCode() {
        int iHashCode = this.f102790a.hashCode() * 31;
        PlansDashboardLayout$ClickAction plansDashboardLayout$ClickAction = this.f102791b;
        return iHashCode + (plansDashboardLayout$ClickAction == null ? 0 : plansDashboardLayout$ClickAction.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102790a);
        dest.writeParcelable(this.f102791b, i);
    }
}
