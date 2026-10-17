package com.revolut.feature.insurance_credit.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_credit.impl.data.model.action.Prompt;
import com.revolut.feature.insurance_credit.impl.data.model.action.ShowConfirmationAction;
import com.revolut.feature.insurance_credit.impl.data.model.action.ShowCoverageDetailsAction;
import com.revolut.feature.insurance_credit.impl.data.model.coverages.CoverageDetailsLayout;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Details", "CancellationPrompt", "CancellationConfirmation", "Documents", "Claim", "GetHelp", "CoverageDetails", "CoverageDetailsModal", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$CancellationConfirmation;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$CancellationPrompt;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$Claim;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$CoverageDetails;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$CoverageDetailsModal;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$Details;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$Documents;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$GetHelp;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InsuranceCreditFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$CancellationConfirmation;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationConfirmation extends InsuranceCreditFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CancellationConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShowConfirmationAction f75806a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancellationConfirmation(ShowConfirmationAction.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationConfirmation[i];
            }
        }

        public CancellationConfirmation(ShowConfirmationAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.f75806a = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancellationConfirmation) && Intrinsics.f(this.f75806a, ((CancellationConfirmation) obj2).f75806a);
        }

        public final int hashCode() {
            return this.f75806a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75806a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$CancellationPrompt;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationPrompt extends InsuranceCreditFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CancellationPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Prompt f75807a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancellationPrompt(Prompt.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationPrompt[i];
            }
        }

        public CancellationPrompt(Prompt prompt) {
            Intrinsics.checkNotNullParameter(prompt, "prompt");
            this.f75807a = prompt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancellationPrompt) && Intrinsics.f(this.f75807a, ((CancellationPrompt) obj2).f75807a);
        }

        public final int hashCode() {
            return this.f75807a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75807a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$Claim;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step;", "<init>", "()V", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Claim extends InsuranceCreditFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Claim f75808a = new Claim();

        @NotNull
        public static final Parcelable.Creator<Claim> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Claim.f75808a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Claim[i];
            }
        }

        private Claim() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$CoverageDetails;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CoverageDetails extends InsuranceCreditFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CoverageDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoverageDetailsLayout f75809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f75810b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CoverageDetails(CoverageDetailsLayout.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoverageDetails[i];
            }
        }

        public CoverageDetails(CoverageDetailsLayout layout, String str) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            this.f75809a = layout;
            this.f75810b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CoverageDetails)) {
                return false;
            }
            CoverageDetails coverageDetails = (CoverageDetails) obj2;
            return Intrinsics.f(this.f75809a, coverageDetails.f75809a) && Intrinsics.f(this.f75810b, coverageDetails.f75810b);
        }

        public final int hashCode() {
            int iHashCode = this.f75809a.hashCode() * 31;
            String str = this.f75810b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75809a.writeToParcel(dest, i);
            dest.writeString(this.f75810b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$CoverageDetailsModal;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CoverageDetailsModal extends InsuranceCreditFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CoverageDetailsModal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShowCoverageDetailsAction f75811a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CoverageDetailsModal(ShowCoverageDetailsAction.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoverageDetailsModal[i];
            }
        }

        public CoverageDetailsModal(ShowCoverageDetailsAction model) {
            Intrinsics.checkNotNullParameter(model, "model");
            this.f75811a = model;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CoverageDetailsModal) && Intrinsics.f(this.f75811a, ((CoverageDetailsModal) obj2).f75811a);
        }

        public final int hashCode() {
            return this.f75811a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75811a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$Details;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step;", "<init>", "()V", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details extends InsuranceCreditFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Details f75812a = new Details();

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Details.f75812a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        private Details() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$Documents;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step;", "<init>", "()V", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Documents extends InsuranceCreditFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Documents f75813a = new Documents();

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Documents.f75813a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        private Documents() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step$GetHelp;", "Lcom/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$Step;", "<init>", "()V", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GetHelp extends InsuranceCreditFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GetHelp f75814a = new GetHelp();

        @NotNull
        public static final Parcelable.Creator<GetHelp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GetHelp.f75814a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetHelp[i];
            }
        }

        private GetHelp() {
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

    private InsuranceCreditFlowContract$Step() {
    }
}
