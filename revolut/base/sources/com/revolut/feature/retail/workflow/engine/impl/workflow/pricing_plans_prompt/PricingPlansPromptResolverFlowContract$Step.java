package com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/workflow/engine/impl/workflow/pricing_plans_prompt/PricingPlansPromptResolverFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Prompt", "Lcom/revolut/feature/retail/workflow/engine/impl/workflow/pricing_plans_prompt/PricingPlansPromptResolverFlowContract$Step$Prompt;", "feature_retail_workflow_engine_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PricingPlansPromptResolverFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/workflow/engine/impl/workflow/pricing_plans_prompt/PricingPlansPromptResolverFlowContract$Step$Prompt;", "Lcom/revolut/feature/retail/workflow/engine/impl/workflow/pricing_plans_prompt/PricingPlansPromptResolverFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_workflow_engine_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt implements PricingPlansPromptResolverFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanOfferPrompt.Available f83405a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt((PricingPlanOfferPrompt.Available) parcel.readParcelable(Prompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        public Prompt(PricingPlanOfferPrompt.Available offer) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            this.f83405a = offer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Prompt) && Intrinsics.f(this.f83405a, ((Prompt) obj2).f83405a);
        }

        public final int hashCode() {
            return this.f83405a.f102847a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83405a, i);
        }
    }
}
