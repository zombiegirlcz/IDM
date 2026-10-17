package com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/profile/impl/ui/profile/screens/auto_earn_rewards/AutoEarnRewardsControllerContract$Steps", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "FlexibleConsentDialogStep", "DisableConsentStep", "Lcom/revolut/feature/profile/impl/ui/profile/screens/auto_earn_rewards/AutoEarnRewardsControllerContract$Steps$DisableConsentStep;", "Lcom/revolut/feature/profile/impl/ui/profile/screens/auto_earn_rewards/AutoEarnRewardsControllerContract$Steps$FlexibleConsentDialogStep;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AutoEarnRewardsControllerContract$Steps extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/auto_earn_rewards/AutoEarnRewardsControllerContract$Steps$DisableConsentStep;", "Lcom/revolut/feature/profile/impl/ui/profile/screens/auto_earn_rewards/AutoEarnRewardsControllerContract$Steps;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DisableConsentStep implements AutoEarnRewardsControllerContract$Steps {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DisableConsentStep f81441a = new DisableConsentStep();

        @NotNull
        public static final Parcelable.Creator<DisableConsentStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DisableConsentStep.f81441a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisableConsentStep[i];
            }
        }

        private DisableConsentStep() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/auto_earn_rewards/AutoEarnRewardsControllerContract$Steps$FlexibleConsentDialogStep;", "Lcom/revolut/feature/profile/impl/ui/profile/screens/auto_earn_rewards/AutoEarnRewardsControllerContract$Steps;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FlexibleConsentDialogStep implements AutoEarnRewardsControllerContract$Steps {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FlexibleConsentDialogStep f81442a = new FlexibleConsentDialogStep();

        @NotNull
        public static final Parcelable.Creator<FlexibleConsentDialogStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FlexibleConsentDialogStep.f81442a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlexibleConsentDialogStep[i];
            }
        }

        private FlexibleConsentDialogStep() {
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
}
