package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$Subtitle", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlansDashboardLayout$PlanPageLayout$Subtitle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlansDashboardLayout$PlanPageLayout$Subtitle> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$TextStyle f102785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$TextStyle f102786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$Tooltip f102787c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlansDashboardLayout$PlanPageLayout$Subtitle(parcel.readInt() == 0 ? null : PlansDashboardLayout$PlanPageLayout$TextStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlansDashboardLayout$PlanPageLayout$TextStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PlansDashboardLayout$PlanPageLayout$Tooltip.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlansDashboardLayout$PlanPageLayout$Subtitle[i];
        }
    }

    public PlansDashboardLayout$PlanPageLayout$Subtitle(PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle, PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle2, PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip) {
        this.f102785a = plansDashboardLayout$PlanPageLayout$TextStyle;
        this.f102786b = plansDashboardLayout$PlanPageLayout$TextStyle2;
        this.f102787c = plansDashboardLayout$PlanPageLayout$Tooltip;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlansDashboardLayout$PlanPageLayout$Subtitle)) {
            return false;
        }
        PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle = (PlansDashboardLayout$PlanPageLayout$Subtitle) obj2;
        return Intrinsics.f(this.f102785a, plansDashboardLayout$PlanPageLayout$Subtitle.f102785a) && Intrinsics.f(this.f102786b, plansDashboardLayout$PlanPageLayout$Subtitle.f102786b) && Intrinsics.f(this.f102787c, plansDashboardLayout$PlanPageLayout$Subtitle.f102787c);
    }

    public final int hashCode() {
        PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle = this.f102785a;
        int iHashCode = (plansDashboardLayout$PlanPageLayout$TextStyle == null ? 0 : plansDashboardLayout$PlanPageLayout$TextStyle.hashCode()) * 31;
        PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle2 = this.f102786b;
        int iHashCode2 = (iHashCode + (plansDashboardLayout$PlanPageLayout$TextStyle2 == null ? 0 : plansDashboardLayout$PlanPageLayout$TextStyle2.hashCode())) * 31;
        PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip = this.f102787c;
        return iHashCode2 + (plansDashboardLayout$PlanPageLayout$Tooltip != null ? plansDashboardLayout$PlanPageLayout$Tooltip.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle = this.f102785a;
        if (plansDashboardLayout$PlanPageLayout$TextStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plansDashboardLayout$PlanPageLayout$TextStyle.writeToParcel(dest, i);
        }
        PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle2 = this.f102786b;
        if (plansDashboardLayout$PlanPageLayout$TextStyle2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plansDashboardLayout$PlanPageLayout$TextStyle2.writeToParcel(dest, i);
        }
        PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip = this.f102787c;
        if (plansDashboardLayout$PlanPageLayout$Tooltip == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plansDashboardLayout$PlanPageLayout$Tooltip.writeToParcel(dest, i);
        }
    }
}
