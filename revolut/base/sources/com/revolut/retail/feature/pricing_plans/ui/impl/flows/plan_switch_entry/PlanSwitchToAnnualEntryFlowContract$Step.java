package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import hha.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_switch_entry/PlanSwitchToAnnualEntryFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Prompt", "SwitchToAnnual", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_switch_entry/PlanSwitchToAnnualEntryFlowContract$Step$Prompt;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_switch_entry/PlanSwitchToAnnualEntryFlowContract$Step$SwitchToAnnual;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanSwitchToAnnualEntryFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_switch_entry/PlanSwitchToAnnualEntryFlowContract$Step$Prompt;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_switch_entry/PlanSwitchToAnnualEntryFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt implements PlanSwitchToAnnualEntryFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f103248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f103249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f103250c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt((PromptMarketingScreenContract$InputData) parcel.readParcelable(Prompt.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        public Prompt(PromptMarketingScreenContract$InputData inputData, d plan, boolean z) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.f103248a = inputData;
            this.f103249b = plan;
            this.f103250c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Prompt)) {
                return false;
            }
            Prompt prompt = (Prompt) obj2;
            return Intrinsics.f(this.f103248a, prompt.f103248a) && Intrinsics.f(this.f103249b, prompt.f103249b) && this.f103250c == prompt.f103250c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103250c) + ((this.f103249b.hashCode() + (this.f103248a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103248a, i);
            dest.writeSerializable(this.f103249b);
            dest.writeInt(this.f103250c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_switch_entry/PlanSwitchToAnnualEntryFlowContract$Step$SwitchToAnnual;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_switch_entry/PlanSwitchToAnnualEntryFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwitchToAnnual implements PlanSwitchToAnnualEntryFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SwitchToAnnual> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f103251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103252b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwitchToAnnual((d) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchToAnnual[i];
            }
        }

        public SwitchToAnnual(d plan, boolean z) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.f103251a = plan;
            this.f103252b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SwitchToAnnual)) {
                return false;
            }
            SwitchToAnnual switchToAnnual = (SwitchToAnnual) obj2;
            return Intrinsics.f(this.f103251a, switchToAnnual.f103251a) && this.f103252b == switchToAnnual.f103252b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103252b) + (this.f103251a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103251a);
            dest.writeInt(this.f103252b ? 1 : 0);
        }
    }
}
