package com.revolut.feature.retail.salary_account.impl.salary_hub_phase3;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RewardStep", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$ModalStep$RewardStep;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SalaryHubV3ControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$ModalStep$RewardStep;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RewardStep implements SalaryHubV3ControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RewardStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SalaryHubV3ControllerContract$RewardInfo f82996a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RewardStep((SalaryHubV3ControllerContract$RewardInfo) parcel.readParcelable(RewardStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardStep[i];
            }
        }

        public RewardStep(SalaryHubV3ControllerContract$RewardInfo rewardInfo) {
            Intrinsics.checkNotNullParameter(rewardInfo, "rewardInfo");
            this.f82996a = rewardInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RewardStep) && Intrinsics.f(this.f82996a, ((RewardStep) obj2).f82996a);
        }

        public final int hashCode() {
            return this.f82996a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82996a, i);
        }
    }
}
