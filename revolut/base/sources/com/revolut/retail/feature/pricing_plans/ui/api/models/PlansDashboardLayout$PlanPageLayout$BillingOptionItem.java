package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import hha.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$BillingOptionItem", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlansDashboardLayout$PlanPageLayout$BillingOptionItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlansDashboardLayout$PlanPageLayout$BillingOptionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.i f102747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f102748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f102749c;
    public final PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent d;
    public final PlanPageLayoutTerms e;
    public final PlansDashboardLayout$Button f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f102750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PricingPlanOffer f102751h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlansDashboardLayout$PlanPageLayout$BillingOptionItem(hha.i.valueOf(parcel.readString()), (dj0.d) parcel.readSerializable(), (o) parcel.readSerializable(), PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent.CREATOR.createFromParcel(parcel), PlanPageLayoutTerms.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlansDashboardLayout$Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PricingPlanOffer) parcel.readParcelable(PlansDashboardLayout$PlanPageLayout$BillingOptionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlansDashboardLayout$PlanPageLayout$BillingOptionItem[i];
        }
    }

    public PlansDashboardLayout$PlanPageLayout$BillingOptionItem(hha.i period, dj0.d dVar, o oVar, PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent content, PlanPageLayoutTerms terms, PlansDashboardLayout$Button plansDashboardLayout$Button, boolean z, PricingPlanOffer pricingPlanOffer) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.f102747a = period;
        this.f102748b = dVar;
        this.f102749c = oVar;
        this.d = content;
        this.e = terms;
        this.f = plansDashboardLayout$Button;
        this.f102750g = z;
        this.f102751h = pricingPlanOffer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlansDashboardLayout$PlanPageLayout$BillingOptionItem)) {
            return false;
        }
        PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItem = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) obj2;
        return this.f102747a == plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102747a && Intrinsics.f(this.f102748b, plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102748b) && Intrinsics.f(this.f102749c, plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102749c) && Intrinsics.f(this.d, plansDashboardLayout$PlanPageLayout$BillingOptionItem.d) && Intrinsics.f(this.e, plansDashboardLayout$PlanPageLayout$BillingOptionItem.e) && Intrinsics.f(this.f, plansDashboardLayout$PlanPageLayout$BillingOptionItem.f) && this.f102750g == plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102750g && Intrinsics.f(this.f102751h, plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102751h);
    }

    public final int hashCode() {
        int iHashCode = this.f102747a.hashCode() * 31;
        dj0.d dVar = this.f102748b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        o oVar = this.f102749c;
        int iHashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31)) * 31)) * 31;
        PlansDashboardLayout$Button plansDashboardLayout$Button = this.f;
        int iC = j6.a.c((iHashCode3 + (plansDashboardLayout$Button == null ? 0 : plansDashboardLayout$Button.hashCode())) * 31, 31, this.f102750g);
        PricingPlanOffer pricingPlanOffer = this.f102751h;
        return iC + (pricingPlanOffer != null ? pricingPlanOffer.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102747a.name());
        dest.writeSerializable(this.f102748b);
        dest.writeSerializable(this.f102749c);
        this.d.writeToParcel(dest, i);
        this.e.writeToParcel(dest, i);
        PlansDashboardLayout$Button plansDashboardLayout$Button = this.f;
        if (plansDashboardLayout$Button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plansDashboardLayout$Button.writeToParcel(dest, i);
        }
        dest.writeInt(this.f102750g ? 1 : 0);
        dest.writeParcelable(this.f102751h, i);
    }
}
