package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$InputData;
import hha.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_gift_sending/PlanGiftSendingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectPlanToGive", "BillingPicker", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_gift_sending/PlanGiftSendingFlowContract$Step$BillingPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_gift_sending/PlanGiftSendingFlowContract$Step$SelectPlanToGive;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanGiftSendingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_gift_sending/PlanGiftSendingFlowContract$Step$BillingPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_gift_sending/PlanGiftSendingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillingPicker extends PlanGiftSendingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BillingPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f103177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PlanBillingPickerContract$InputData f103179c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingPicker((d) parcel.readSerializable(), parcel.readString(), PlanBillingPickerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillingPicker[i];
            }
        }

        public BillingPicker(d selectedPlan, String selectedPlanName, PlanBillingPickerContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
            Intrinsics.checkNotNullParameter(selectedPlanName, "selectedPlanName");
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f103177a = selectedPlan;
            this.f103178b = selectedPlanName;
            this.f103179c = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillingPicker)) {
                return false;
            }
            BillingPicker billingPicker = (BillingPicker) obj2;
            return Intrinsics.f(this.f103177a, billingPicker.f103177a) && Intrinsics.f(this.f103178b, billingPicker.f103178b) && Intrinsics.f(this.f103179c, billingPicker.f103179c);
        }

        public final int hashCode() {
            return this.f103179c.hashCode() + p.a.c(this.f103177a.hashCode() * 31, 31, this.f103178b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103177a);
            dest.writeString(this.f103178b);
            this.f103179c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_gift_sending/PlanGiftSendingFlowContract$Step$SelectPlanToGive;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_gift_sending/PlanGiftSendingFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectPlanToGive extends PlanGiftSendingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectPlanToGive f103180a = new SelectPlanToGive();

        @NotNull
        public static final Parcelable.Creator<SelectPlanToGive> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectPlanToGive.f103180a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPlanToGive[i];
            }
        }

        private SelectPlanToGive() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private PlanGiftSendingFlowContract$Step() {
    }
}
