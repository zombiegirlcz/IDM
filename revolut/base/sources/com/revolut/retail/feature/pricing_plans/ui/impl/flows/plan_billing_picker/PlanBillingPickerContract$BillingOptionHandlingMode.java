package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$BillingOptionHandlingMode", "Landroid/os/Parcelable;", "", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$BillingOptionHandlingMode;", "ReturnSelection", "ExecuteActions", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanBillingPickerContract$BillingOptionHandlingMode implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PlanBillingPickerContract$BillingOptionHandlingMode[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PlanBillingPickerContract$BillingOptionHandlingMode> CREATOR;
    public static final PlanBillingPickerContract$BillingOptionHandlingMode ExecuteActions;
    public static final PlanBillingPickerContract$BillingOptionHandlingMode ReturnSelection;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PlanBillingPickerContract$BillingOptionHandlingMode.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanBillingPickerContract$BillingOptionHandlingMode[i];
        }
    }

    static {
        PlanBillingPickerContract$BillingOptionHandlingMode planBillingPickerContract$BillingOptionHandlingMode = new PlanBillingPickerContract$BillingOptionHandlingMode("ReturnSelection", 0);
        ReturnSelection = planBillingPickerContract$BillingOptionHandlingMode;
        PlanBillingPickerContract$BillingOptionHandlingMode planBillingPickerContract$BillingOptionHandlingMode2 = new PlanBillingPickerContract$BillingOptionHandlingMode("ExecuteActions", 1);
        ExecuteActions = planBillingPickerContract$BillingOptionHandlingMode2;
        PlanBillingPickerContract$BillingOptionHandlingMode[] planBillingPickerContract$BillingOptionHandlingModeArr = {planBillingPickerContract$BillingOptionHandlingMode, planBillingPickerContract$BillingOptionHandlingMode2};
        $VALUES = planBillingPickerContract$BillingOptionHandlingModeArr;
        $ENTRIES = s.n(planBillingPickerContract$BillingOptionHandlingModeArr);
        CREATOR = new a();
    }

    public static PlanBillingPickerContract$BillingOptionHandlingMode valueOf(String str) {
        return (PlanBillingPickerContract$BillingOptionHandlingMode) Enum.valueOf(PlanBillingPickerContract$BillingOptionHandlingMode.class, str);
    }

    public static PlanBillingPickerContract$BillingOptionHandlingMode[] values() {
        return (PlanBillingPickerContract$BillingOptionHandlingMode[]) $VALUES.clone();
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
