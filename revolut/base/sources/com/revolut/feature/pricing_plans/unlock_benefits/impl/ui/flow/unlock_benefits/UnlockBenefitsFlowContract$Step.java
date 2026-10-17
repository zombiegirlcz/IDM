package com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pricing_plans/unlock_benefits/impl/ui/flow/unlock_benefits/UnlockBenefitsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "UnlockBenefits", "Attestation", "Lcom/revolut/feature/pricing_plans/unlock_benefits/impl/ui/flow/unlock_benefits/UnlockBenefitsFlowContract$Step$Attestation;", "Lcom/revolut/feature/pricing_plans/unlock_benefits/impl/ui/flow/unlock_benefits/UnlockBenefitsFlowContract$Step$UnlockBenefits;", "feature_pricing_plans_unlock_benefits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UnlockBenefitsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/unlock_benefits/impl/ui/flow/unlock_benefits/UnlockBenefitsFlowContract$Step$Attestation;", "Lcom/revolut/feature/pricing_plans/unlock_benefits/impl/ui/flow/unlock_benefits/UnlockBenefitsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_unlock_benefits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Attestation implements UnlockBenefitsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Attestation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80967a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Attestation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Attestation[i];
            }
        }

        public Attestation(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f80967a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Attestation) && Intrinsics.f(this.f80967a, ((Attestation) obj2).f80967a);
        }

        public final int hashCode() {
            return this.f80967a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80967a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/unlock_benefits/impl/ui/flow/unlock_benefits/UnlockBenefitsFlowContract$Step$UnlockBenefits;", "Lcom/revolut/feature/pricing_plans/unlock_benefits/impl/ui/flow/unlock_benefits/UnlockBenefitsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_unlock_benefits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnlockBenefits implements UnlockBenefitsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UnlockBenefits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f80968a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnlockBenefits(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnlockBenefits[i];
            }
        }

        public UnlockBenefits(boolean z) {
            this.f80968a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnlockBenefits) && this.f80968a == ((UnlockBenefits) obj2).f80968a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f80968a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f80968a ? 1 : 0);
        }
    }
}
