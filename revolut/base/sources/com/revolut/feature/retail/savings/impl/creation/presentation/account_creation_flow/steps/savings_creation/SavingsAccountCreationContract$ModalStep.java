package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_creation/SavingsAccountCreationContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PostCreationWorkflow", "IneligibleForSavingsWorkflow", "ChallengePrompt", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_creation/SavingsAccountCreationContract$ModalStep$ChallengePrompt;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_creation/SavingsAccountCreationContract$ModalStep$IneligibleForSavingsWorkflow;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_creation/SavingsAccountCreationContract$ModalStep$PostCreationWorkflow;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SavingsAccountCreationContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_creation/SavingsAccountCreationContract$ModalStep$ChallengePrompt;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_creation/SavingsAccountCreationContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChallengePrompt extends SavingsAccountCreationContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ChallengePrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingsChallengeOnboarding.Config.SuccessInfo f83305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f83306b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChallengePrompt((SavingsChallengeOnboarding.Config.SuccessInfo) parcel.readParcelable(ChallengePrompt.class.getClassLoader()), (s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChallengePrompt[i];
            }
        }

        public ChallengePrompt(SavingsChallengeOnboarding.Config.SuccessInfo successInfo, s savingsAccount) {
            Intrinsics.checkNotNullParameter(successInfo, "successInfo");
            Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
            this.f83305a = successInfo;
            this.f83306b = savingsAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChallengePrompt)) {
                return false;
            }
            ChallengePrompt challengePrompt = (ChallengePrompt) obj2;
            return Intrinsics.f(this.f83305a, challengePrompt.f83305a) && Intrinsics.f(this.f83306b, challengePrompt.f83306b);
        }

        public final int hashCode() {
            return this.f83306b.hashCode() + (this.f83305a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83305a, i);
            dest.writeSerializable(this.f83306b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_creation/SavingsAccountCreationContract$ModalStep$IneligibleForSavingsWorkflow;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_creation/SavingsAccountCreationContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IneligibleForSavingsWorkflow extends SavingsAccountCreationContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<IneligibleForSavingsWorkflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f83307a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new IneligibleForSavingsWorkflow(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IneligibleForSavingsWorkflow[i];
            }
        }

        public IneligibleForSavingsWorkflow(Map params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f83307a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IneligibleForSavingsWorkflow) && Intrinsics.f(this.f83307a, ((IneligibleForSavingsWorkflow) obj2).f83307a);
        }

        public final int hashCode() {
            return this.f83307a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itZ = j6.a.z(this.f83307a, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_creation/SavingsAccountCreationContract$ModalStep$PostCreationWorkflow;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_creation/SavingsAccountCreationContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostCreationWorkflow extends SavingsAccountCreationContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PostCreationWorkflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f83309b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostCreationWorkflow(parcel.readString(), (s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostCreationWorkflow[i];
            }
        }

        public PostCreationWorkflow(String workflowId, s savingsAccount) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
            this.f83308a = workflowId;
            this.f83309b = savingsAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PostCreationWorkflow)) {
                return false;
            }
            PostCreationWorkflow postCreationWorkflow = (PostCreationWorkflow) obj2;
            return Intrinsics.f(this.f83308a, postCreationWorkflow.f83308a) && Intrinsics.f(this.f83309b, postCreationWorkflow.f83309b);
        }

        public final int hashCode() {
            return this.f83309b.hashCode() + (this.f83308a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83308a);
            dest.writeSerializable(this.f83309b);
        }
    }

    private SavingsAccountCreationContract$ModalStep() {
    }
}
