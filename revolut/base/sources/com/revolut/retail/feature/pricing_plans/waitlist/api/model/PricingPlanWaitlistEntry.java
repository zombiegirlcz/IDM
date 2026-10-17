package com.revolut.retail.feature.pricing_plans.waitlist.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import gok.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistEntry;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanWaitlistEntry implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanWaitlistEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f103653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f103654c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanWaitlistEntry(parcel.readString(), b.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanWaitlistEntry[i];
        }
    }

    public PricingPlanWaitlistEntry(String id10, b state, String planTier, String planTierDisplayName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        Intrinsics.checkNotNullParameter(planTierDisplayName, "planTierDisplayName");
        this.f103652a = id10;
        this.f103653b = state;
        this.f103654c = planTier;
        this.d = planTierDisplayName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanWaitlistEntry)) {
            return false;
        }
        PricingPlanWaitlistEntry pricingPlanWaitlistEntry = (PricingPlanWaitlistEntry) obj2;
        return Intrinsics.f(this.f103652a, pricingPlanWaitlistEntry.f103652a) && this.f103653b == pricingPlanWaitlistEntry.f103653b && Intrinsics.f(this.f103654c, pricingPlanWaitlistEntry.f103654c) && Intrinsics.f(this.d, pricingPlanWaitlistEntry.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f103653b.hashCode() + (this.f103652a.hashCode() * 31)) * 31, 31, this.f103654c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103652a);
        dest.writeString(this.f103653b.name());
        dest.writeString(this.f103654c);
        dest.writeString(this.d);
    }
}
