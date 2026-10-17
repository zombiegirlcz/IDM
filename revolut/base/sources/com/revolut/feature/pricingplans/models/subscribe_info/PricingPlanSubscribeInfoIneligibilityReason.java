package com.revolut.feature.pricingplans.models.subscribe_info;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricingplans/models/subscribe_info/PricingPlanSubscribeInfoIneligibilityReason;", "Landroid/os/Parcelable;", "", "ACTIVE_MANAGED_PORTFOLIOS", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PricingPlanSubscribeInfoIneligibilityReason implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PricingPlanSubscribeInfoIneligibilityReason[] $VALUES;
    public static final PricingPlanSubscribeInfoIneligibilityReason ACTIVE_MANAGED_PORTFOLIOS;

    @NotNull
    public static final Parcelable.Creator<PricingPlanSubscribeInfoIneligibilityReason> CREATOR;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PricingPlanSubscribeInfoIneligibilityReason.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanSubscribeInfoIneligibilityReason[i];
        }
    }

    static {
        PricingPlanSubscribeInfoIneligibilityReason pricingPlanSubscribeInfoIneligibilityReason = new PricingPlanSubscribeInfoIneligibilityReason("ACTIVE_MANAGED_PORTFOLIOS", 0);
        ACTIVE_MANAGED_PORTFOLIOS = pricingPlanSubscribeInfoIneligibilityReason;
        PricingPlanSubscribeInfoIneligibilityReason[] pricingPlanSubscribeInfoIneligibilityReasonArr = {pricingPlanSubscribeInfoIneligibilityReason};
        $VALUES = pricingPlanSubscribeInfoIneligibilityReasonArr;
        $ENTRIES = s.n(pricingPlanSubscribeInfoIneligibilityReasonArr);
        CREATOR = new a();
    }

    public static PricingPlanSubscribeInfoIneligibilityReason valueOf(String str) {
        return (PricingPlanSubscribeInfoIneligibilityReason) Enum.valueOf(PricingPlanSubscribeInfoIneligibilityReason.class, str);
    }

    public static PricingPlanSubscribeInfoIneligibilityReason[] values() {
        return (PricingPlanSubscribeInfoIneligibilityReason[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
