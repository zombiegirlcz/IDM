package com.revolut.feature.semi_independent_onboarding.impl.ui.invitation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.semi_independent_onboarding.api.model.GuardianInvitationResult;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/semi_independent_onboarding/impl/ui/invitation/SemiIndependentOnboardingInvitationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AddParentStartingPrompt", "ContactChooser", "ParentInvitationToCreateRevolutAccount", "Lcom/revolut/feature/semi_independent_onboarding/impl/ui/invitation/SemiIndependentOnboardingInvitationFlowContract$Step$AddParentStartingPrompt;", "Lcom/revolut/feature/semi_independent_onboarding/impl/ui/invitation/SemiIndependentOnboardingInvitationFlowContract$Step$ContactChooser;", "Lcom/revolut/feature/semi_independent_onboarding/impl/ui/invitation/SemiIndependentOnboardingInvitationFlowContract$Step$ParentInvitationToCreateRevolutAccount;", "feature_semi_independent_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SemiIndependentOnboardingInvitationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/semi_independent_onboarding/impl/ui/invitation/SemiIndependentOnboardingInvitationFlowContract$Step$AddParentStartingPrompt;", "Lcom/revolut/feature/semi_independent_onboarding/impl/ui/invitation/SemiIndependentOnboardingInvitationFlowContract$Step;", "<init>", "()V", "feature_semi_independent_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddParentStartingPrompt extends SemiIndependentOnboardingInvitationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddParentStartingPrompt f85995a = new AddParentStartingPrompt();

        @NotNull
        public static final Parcelable.Creator<AddParentStartingPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddParentStartingPrompt.f85995a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddParentStartingPrompt[i];
            }
        }

        private AddParentStartingPrompt() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/semi_independent_onboarding/impl/ui/invitation/SemiIndependentOnboardingInvitationFlowContract$Step$ContactChooser;", "Lcom/revolut/feature/semi_independent_onboarding/impl/ui/invitation/SemiIndependentOnboardingInvitationFlowContract$Step;", "<init>", "()V", "feature_semi_independent_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ContactChooser extends SemiIndependentOnboardingInvitationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ContactChooser f85996a = new ContactChooser();

        @NotNull
        public static final Parcelable.Creator<ContactChooser> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ContactChooser.f85996a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactChooser[i];
            }
        }

        private ContactChooser() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/semi_independent_onboarding/impl/ui/invitation/SemiIndependentOnboardingInvitationFlowContract$Step$ParentInvitationToCreateRevolutAccount;", "Lcom/revolut/feature/semi_independent_onboarding/impl/ui/invitation/SemiIndependentOnboardingInvitationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_semi_independent_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ParentInvitationToCreateRevolutAccount extends SemiIndependentOnboardingInvitationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ParentInvitationToCreateRevolutAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GuardianInvitationResult.NotExistingUser f85997a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ParentInvitationToCreateRevolutAccount((GuardianInvitationResult.NotExistingUser) parcel.readParcelable(ParentInvitationToCreateRevolutAccount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ParentInvitationToCreateRevolutAccount[i];
            }
        }

        public ParentInvitationToCreateRevolutAccount(GuardianInvitationResult.NotExistingUser invitationResult) {
            Intrinsics.checkNotNullParameter(invitationResult, "invitationResult");
            this.f85997a = invitationResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ParentInvitationToCreateRevolutAccount) && Intrinsics.f(this.f85997a, ((ParentInvitationToCreateRevolutAccount) obj2).f85997a);
        }

        public final int hashCode() {
            return this.f85997a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85997a, i);
        }
    }

    private SemiIndependentOnboardingInvitationFlowContract$Step() {
    }
}
