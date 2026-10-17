package com.revolut.feature.staking.impl.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/staking/impl/confirmation/StakingConfirmationControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "UnstakingPeriodDisclaimerDialog", "Lcom/revolut/feature/staking/impl/confirmation/StakingConfirmationControllerContract$ModalStep$UnstakingPeriodDisclaimerDialog;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StakingConfirmationControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/impl/confirmation/StakingConfirmationControllerContract$ModalStep$UnstakingPeriodDisclaimerDialog;", "Lcom/revolut/feature/staking/impl/confirmation/StakingConfirmationControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnstakingPeriodDisclaimerDialog implements StakingConfirmationControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UnstakingPeriodDisclaimerDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f88109a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnstakingPeriodDisclaimerDialog(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnstakingPeriodDisclaimerDialog[i];
            }
        }

        public UnstakingPeriodDisclaimerDialog(int i) {
            this.f88109a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnstakingPeriodDisclaimerDialog) && this.f88109a == ((UnstakingPeriodDisclaimerDialog) obj2).f88109a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f88109a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f88109a);
        }
    }
}
