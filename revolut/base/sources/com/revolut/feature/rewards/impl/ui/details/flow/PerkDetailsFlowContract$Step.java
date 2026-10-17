package com.revolut.feature.rewards.impl.ui.details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rewards.api.model.rewards.ExistingSubscriptionCheck;
import com.revolut.feature.rewards.api.model.rewards.RewardBottomSheet;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterAction;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Content", "OptIn", "ExpiredPerk", "FooterBottomSheet", "ExistingSubscriptionPrompt", "ActivationNotice", "CancellationInstructions", "CancelSubscription", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$ActivationNotice;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$CancelSubscription;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$CancellationInstructions;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$Content;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$ExistingSubscriptionPrompt;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$ExpiredPerk;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$FooterBottomSheet;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$OptIn;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PerkDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$ActivationNotice;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActivationNotice extends PerkDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ActivationNotice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.feature.rewards.api.model.rewards.ActivationNotice f84928b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActivationNotice(parcel.readString(), (com.revolut.feature.rewards.api.model.rewards.ActivationNotice) parcel.readParcelable(ActivationNotice.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActivationNotice[i];
            }
        }

        public ActivationNotice(String merchantAvatar, com.revolut.feature.rewards.api.model.rewards.ActivationNotice activationNotice) {
            Intrinsics.checkNotNullParameter(merchantAvatar, "merchantAvatar");
            Intrinsics.checkNotNullParameter(activationNotice, "activationNotice");
            this.f84927a = merchantAvatar;
            this.f84928b = activationNotice;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActivationNotice)) {
                return false;
            }
            ActivationNotice activationNotice = (ActivationNotice) obj2;
            return Intrinsics.f(this.f84927a, activationNotice.f84927a) && Intrinsics.f(this.f84928b, activationNotice.f84928b);
        }

        public final int hashCode() {
            return this.f84928b.hashCode() + (this.f84927a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84927a);
            dest.writeParcelable(this.f84928b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$CancelSubscription;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelSubscription extends PerkDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CancelSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RewardFooterAction.Cancel f84929a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelSubscription((RewardFooterAction.Cancel) parcel.readParcelable(CancelSubscription.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelSubscription[i];
            }
        }

        public CancelSubscription(RewardFooterAction.Cancel cancelAction) {
            Intrinsics.checkNotNullParameter(cancelAction, "cancelAction");
            this.f84929a = cancelAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelSubscription) && Intrinsics.f(this.f84929a, ((CancelSubscription) obj2).f84929a);
        }

        public final int hashCode() {
            return this.f84929a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84929a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$CancellationInstructions;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationInstructions extends PerkDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CancellationInstructions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExistingSubscriptionCheck f84931b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancellationInstructions(parcel.readString(), (ExistingSubscriptionCheck) parcel.readParcelable(CancellationInstructions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationInstructions[i];
            }
        }

        public CancellationInstructions(String merchantAvatar, ExistingSubscriptionCheck existingSubscriptionCheck) {
            Intrinsics.checkNotNullParameter(merchantAvatar, "merchantAvatar");
            Intrinsics.checkNotNullParameter(existingSubscriptionCheck, "existingSubscriptionCheck");
            this.f84930a = merchantAvatar;
            this.f84931b = existingSubscriptionCheck;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CancellationInstructions)) {
                return false;
            }
            CancellationInstructions cancellationInstructions = (CancellationInstructions) obj2;
            return Intrinsics.f(this.f84930a, cancellationInstructions.f84930a) && Intrinsics.f(this.f84931b, cancellationInstructions.f84931b);
        }

        public final int hashCode() {
            return this.f84931b.hashCode() + (this.f84930a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84930a);
            dest.writeParcelable(this.f84931b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$Content;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content extends PerkDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PerkDetailsFlowContract$InputData f84932a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Content(PerkDetailsFlowContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Content[i];
            }
        }

        public Content(PerkDetailsFlowContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f84932a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Content) && Intrinsics.f(this.f84932a, ((Content) obj2).f84932a);
        }

        public final int hashCode() {
            return this.f84932a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f84932a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$ExistingSubscriptionPrompt;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExistingSubscriptionPrompt extends PerkDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExistingSubscriptionPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExistingSubscriptionCheck f84934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.revolut.feature.rewards.api.model.rewards.ActivationNotice f84935c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExistingSubscriptionPrompt(parcel.readString(), (ExistingSubscriptionCheck) parcel.readParcelable(ExistingSubscriptionPrompt.class.getClassLoader()), (com.revolut.feature.rewards.api.model.rewards.ActivationNotice) parcel.readParcelable(ExistingSubscriptionPrompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExistingSubscriptionPrompt[i];
            }
        }

        public ExistingSubscriptionPrompt(String merchantAvatar, ExistingSubscriptionCheck existingSubscriptionCheck, com.revolut.feature.rewards.api.model.rewards.ActivationNotice activationNotice) {
            Intrinsics.checkNotNullParameter(merchantAvatar, "merchantAvatar");
            Intrinsics.checkNotNullParameter(existingSubscriptionCheck, "existingSubscriptionCheck");
            this.f84933a = merchantAvatar;
            this.f84934b = existingSubscriptionCheck;
            this.f84935c = activationNotice;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExistingSubscriptionPrompt)) {
                return false;
            }
            ExistingSubscriptionPrompt existingSubscriptionPrompt = (ExistingSubscriptionPrompt) obj2;
            return Intrinsics.f(this.f84933a, existingSubscriptionPrompt.f84933a) && Intrinsics.f(this.f84934b, existingSubscriptionPrompt.f84934b) && Intrinsics.f(this.f84935c, existingSubscriptionPrompt.f84935c);
        }

        public final int hashCode() {
            int iHashCode = (this.f84934b.hashCode() + (this.f84933a.hashCode() * 31)) * 31;
            com.revolut.feature.rewards.api.model.rewards.ActivationNotice activationNotice = this.f84935c;
            return iHashCode + (activationNotice == null ? 0 : activationNotice.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84933a);
            dest.writeParcelable(this.f84934b, i);
            dest.writeParcelable(this.f84935c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$ExpiredPerk;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step;", "<init>", "()V", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExpiredPerk extends PerkDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExpiredPerk f84936a = new ExpiredPerk();

        @NotNull
        public static final Parcelable.Creator<ExpiredPerk> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExpiredPerk.f84936a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpiredPerk[i];
            }
        }

        private ExpiredPerk() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$FooterBottomSheet;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FooterBottomSheet extends PerkDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FooterBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RewardBottomSheet f84937a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FooterBottomSheet((RewardBottomSheet) parcel.readParcelable(FooterBottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FooterBottomSheet[i];
            }
        }

        public FooterBottomSheet(RewardBottomSheet bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            this.f84937a = bottomSheet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FooterBottomSheet) && Intrinsics.f(this.f84937a, ((FooterBottomSheet) obj2).f84937a);
        }

        public final int hashCode() {
            return this.f84937a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84937a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step$OptIn;", "Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$Step;", "<init>", "()V", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OptIn extends PerkDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OptIn f84938a = new OptIn();

        @NotNull
        public static final Parcelable.Creator<OptIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OptIn.f84938a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptIn[i];
            }
        }

        private OptIn() {
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

    private PerkDetailsFlowContract$Step() {
    }
}
