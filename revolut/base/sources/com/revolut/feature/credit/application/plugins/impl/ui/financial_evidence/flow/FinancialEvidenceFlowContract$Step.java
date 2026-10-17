package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ht3.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xu3.m;
import xu3.m0;
import xu3.o0;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Initial", "EvidenceHolderSelection", "CoApplicantConfirmation", "JointApplicantsConfirmation", "AddEvidence", "Summary", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step$AddEvidence;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step$CoApplicantConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step$EvidenceHolderSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step$JointApplicantsConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step$Summary;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FinancialEvidenceFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step$AddEvidence;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddEvidence implements FinancialEvidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddEvidence> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xu3.d f67714a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddEvidence((xu3.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddEvidence[i];
            }
        }

        public AddEvidence(xu3.d configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67714a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddEvidence) && Intrinsics.f(this.f67714a, ((AddEvidence) obj2).f67714a);
        }

        public final int hashCode() {
            return this.f67714a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67714a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step$CoApplicantConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CoApplicantConfirmation implements FinancialEvidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CoApplicantConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f67715a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CoApplicantConfirmation((l0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoApplicantConfirmation[i];
            }
        }

        public CoApplicantConfirmation(l0 configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67715a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CoApplicantConfirmation) && Intrinsics.f(this.f67715a, ((CoApplicantConfirmation) obj2).f67715a);
        }

        public final int hashCode() {
            return this.f67715a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67715a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step$EvidenceHolderSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EvidenceHolderSelection implements FinancialEvidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EvidenceHolderSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f67716a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EvidenceHolderSelection((m) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EvidenceHolderSelection[i];
            }
        }

        public EvidenceHolderSelection(m configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67716a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EvidenceHolderSelection) && Intrinsics.f(this.f67716a, ((EvidenceHolderSelection) obj2).f67716a);
        }

        public final int hashCode() {
            return this.f67716a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67716a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Initial implements FinancialEvidenceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initial f67717a = new Initial();

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Initial.f67717a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        private Initial() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step$JointApplicantsConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointApplicantsConfirmation implements FinancialEvidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<JointApplicantsConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final it3.d f67718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l0 f67719b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointApplicantsConfirmation((it3.d) parcel.readSerializable(), (l0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointApplicantsConfirmation[i];
            }
        }

        public JointApplicantsConfirmation(it3.d currentPluginStatus, l0 configuration) {
            Intrinsics.checkNotNullParameter(currentPluginStatus, "currentPluginStatus");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67718a = currentPluginStatus;
            this.f67719b = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JointApplicantsConfirmation)) {
                return false;
            }
            JointApplicantsConfirmation jointApplicantsConfirmation = (JointApplicantsConfirmation) obj2;
            return Intrinsics.f(this.f67718a, jointApplicantsConfirmation.f67718a) && Intrinsics.f(this.f67719b, jointApplicantsConfirmation.f67719b);
        }

        public final int hashCode() {
            return this.f67719b.hashCode() + (this.f67718a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67718a);
            dest.writeSerializable(this.f67719b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step$Summary;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/flow/FinancialEvidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Summary implements FinancialEvidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Summary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m0 f67720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o0 f67721b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Summary((m0) parcel.readSerializable(), parcel.readInt() == 0 ? null : o0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Summary[i];
            }
        }

        public Summary(m0 configuration, o0 o0Var) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67720a = configuration;
            this.f67721b = o0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) obj2;
            return Intrinsics.f(this.f67720a, summary.f67720a) && this.f67721b == summary.f67721b;
        }

        public final int hashCode() {
            int iHashCode = this.f67720a.hashCode() * 31;
            o0 o0Var = this.f67721b;
            return iHashCode + (o0Var == null ? 0 : o0Var.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67720a);
            o0 o0Var = this.f67721b;
            if (o0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(o0Var.name());
            }
        }
    }
}
