package com.revolut.retail.feature.pricing_plans.waitlist.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$ButtonStyle", "Landroid/os/Parcelable;", "", "Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$ButtonStyle;", "PRIMARY", "SECONDARY", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PricingPlanWaitlistLayout$ButtonStyle implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PricingPlanWaitlistLayout$ButtonStyle[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PricingPlanWaitlistLayout$ButtonStyle> CREATOR;
    public static final PricingPlanWaitlistLayout$ButtonStyle PRIMARY;
    public static final PricingPlanWaitlistLayout$ButtonStyle SECONDARY;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PricingPlanWaitlistLayout$ButtonStyle.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanWaitlistLayout$ButtonStyle[i];
        }
    }

    static {
        PricingPlanWaitlistLayout$ButtonStyle pricingPlanWaitlistLayout$ButtonStyle = new PricingPlanWaitlistLayout$ButtonStyle("PRIMARY", 0);
        PRIMARY = pricingPlanWaitlistLayout$ButtonStyle;
        PricingPlanWaitlistLayout$ButtonStyle pricingPlanWaitlistLayout$ButtonStyle2 = new PricingPlanWaitlistLayout$ButtonStyle("SECONDARY", 1);
        SECONDARY = pricingPlanWaitlistLayout$ButtonStyle2;
        PricingPlanWaitlistLayout$ButtonStyle[] pricingPlanWaitlistLayout$ButtonStyleArr = {pricingPlanWaitlistLayout$ButtonStyle, pricingPlanWaitlistLayout$ButtonStyle2};
        $VALUES = pricingPlanWaitlistLayout$ButtonStyleArr;
        $ENTRIES = s.n(pricingPlanWaitlistLayout$ButtonStyleArr);
        CREATOR = new a();
    }

    public static PricingPlanWaitlistLayout$ButtonStyle valueOf(String str) {
        return (PricingPlanWaitlistLayout$ButtonStyle) Enum.valueOf(PricingPlanWaitlistLayout$ButtonStyle.class, str);
    }

    public static PricingPlanWaitlistLayout$ButtonStyle[] values() {
        return (PricingPlanWaitlistLayout$ButtonStyle[]) $VALUES.clone();
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
