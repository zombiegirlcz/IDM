package com.revolut.feature.insurance.impl.ui.cfac;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_expenses.CFACClaimExpensesScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.CFACClaimsListScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.expense_details.CFACClaimExpenseDetailsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Details", "Documents", "ClaimsList", "ClaimDetails", "ClaimExpenses", "ClaimExpenseDetails", "ClaimStatusUpdate", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$ClaimDetails;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$ClaimExpenseDetails;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$ClaimExpenses;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$ClaimStatusUpdate;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$ClaimsList;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$Details;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$Documents;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CFACInsuranceFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$ClaimDetails;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClaimDetails extends CFACInsuranceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ClaimDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CFACClaimDetailsScreenContract$InputData f75035a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClaimDetails(CFACClaimDetailsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimDetails[i];
            }
        }

        public ClaimDetails(CFACClaimDetailsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f75035a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ClaimDetails) && Intrinsics.f(this.f75035a, ((ClaimDetails) obj2).f75035a);
        }

        public final int hashCode() {
            return this.f75035a.f75130a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75035a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$ClaimExpenseDetails;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClaimExpenseDetails extends CFACInsuranceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ClaimExpenseDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CFACClaimExpenseDetailsScreenContract$InputData f75036a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClaimExpenseDetails(CFACClaimExpenseDetailsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimExpenseDetails[i];
            }
        }

        public ClaimExpenseDetails(CFACClaimExpenseDetailsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f75036a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ClaimExpenseDetails) && Intrinsics.f(this.f75036a, ((ClaimExpenseDetails) obj2).f75036a);
        }

        public final int hashCode() {
            return this.f75036a.f75141a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75036a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$ClaimExpenses;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClaimExpenses extends CFACInsuranceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ClaimExpenses> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CFACClaimExpensesScreenContract$InputData f75037a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClaimExpenses(CFACClaimExpensesScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimExpenses[i];
            }
        }

        public ClaimExpenses(CFACClaimExpensesScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f75037a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ClaimExpenses) && Intrinsics.f(this.f75037a, ((ClaimExpenses) obj2).f75037a);
        }

        public final int hashCode() {
            return this.f75037a.f75133a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75037a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$ClaimStatusUpdate;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClaimStatusUpdate extends CFACInsuranceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ClaimStatusUpdate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CFACClaimStatusUpdateScreenContract$InputData f75038a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClaimStatusUpdate((CFACClaimStatusUpdateScreenContract$InputData) parcel.readParcelable(ClaimStatusUpdate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimStatusUpdate[i];
            }
        }

        public ClaimStatusUpdate(CFACClaimStatusUpdateScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f75038a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ClaimStatusUpdate) && Intrinsics.f(this.f75038a, ((ClaimStatusUpdate) obj2).f75038a);
        }

        public final int hashCode() {
            return this.f75038a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f75038a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$ClaimsList;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClaimsList extends CFACInsuranceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ClaimsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CFACClaimsListScreenContract$InputData f75039a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClaimsList(CFACClaimsListScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimsList[i];
            }
        }

        public ClaimsList(CFACClaimsListScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f75039a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ClaimsList) && Intrinsics.f(this.f75039a, ((ClaimsList) obj2).f75039a);
        }

        public final int hashCode() {
            return this.f75039a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75039a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$Details;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends CFACInsuranceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CFACInsuranceDetailsScreenContract$InputData f75040a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(CFACInsuranceDetailsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(CFACInsuranceDetailsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f75040a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f75040a, ((Details) obj2).f75040a);
        }

        public final int hashCode() {
            return this.f75040a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75040a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step$Documents;", "Lcom/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Documents extends CFACInsuranceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CFACInsuranceDocumentsScreenContract$InputData f75041a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Documents(CFACInsuranceDocumentsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        public Documents(CFACInsuranceDocumentsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f75041a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Documents) && Intrinsics.f(this.f75041a, ((Documents) obj2).f75041a);
        }

        public final int hashCode() {
            return this.f75041a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75041a.writeToParcel(dest, i);
        }
    }

    private CFACInsuranceFlowContract$Step() {
    }
}
