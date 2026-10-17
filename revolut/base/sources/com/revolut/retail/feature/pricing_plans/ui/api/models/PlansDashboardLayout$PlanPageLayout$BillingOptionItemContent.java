package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$Badge f102753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$Subtitle f102754c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent(parcel.readString(), parcel.readInt() == 0 ? null : PlansDashboardLayout$PlanPageLayout$Badge.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PlansDashboardLayout$PlanPageLayout$Subtitle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent[i];
        }
    }

    public PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent(String str, PlansDashboardLayout$PlanPageLayout$Badge plansDashboardLayout$PlanPageLayout$Badge, PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle) {
        this.f102752a = str;
        this.f102753b = plansDashboardLayout$PlanPageLayout$Badge;
        this.f102754c = plansDashboardLayout$PlanPageLayout$Subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent)) {
            return false;
        }
        PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent plansDashboardLayout$PlanPageLayout$BillingOptionItemContent = (PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent) obj2;
        return Intrinsics.f(this.f102752a, plansDashboardLayout$PlanPageLayout$BillingOptionItemContent.f102752a) && Intrinsics.f(this.f102753b, plansDashboardLayout$PlanPageLayout$BillingOptionItemContent.f102753b) && Intrinsics.f(this.f102754c, plansDashboardLayout$PlanPageLayout$BillingOptionItemContent.f102754c);
    }

    public final int hashCode() {
        String str = this.f102752a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PlansDashboardLayout$PlanPageLayout$Badge plansDashboardLayout$PlanPageLayout$Badge = this.f102753b;
        int iHashCode2 = (iHashCode + (plansDashboardLayout$PlanPageLayout$Badge == null ? 0 : plansDashboardLayout$PlanPageLayout$Badge.hashCode())) * 31;
        PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle = this.f102754c;
        return iHashCode2 + (plansDashboardLayout$PlanPageLayout$Subtitle != null ? plansDashboardLayout$PlanPageLayout$Subtitle.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102752a);
        PlansDashboardLayout$PlanPageLayout$Badge plansDashboardLayout$PlanPageLayout$Badge = this.f102753b;
        if (plansDashboardLayout$PlanPageLayout$Badge == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plansDashboardLayout$PlanPageLayout$Badge.writeToParcel(dest, i);
        }
        PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle = this.f102754c;
        if (plansDashboardLayout$PlanPageLayout$Subtitle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plansDashboardLayout$PlanPageLayout$Subtitle.writeToParcel(dest, i);
        }
    }
}
