package com.revolut.feature.credit.loan.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentAccountData;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBorrower;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.retail.core.navigation.ActivityAnimation;
import dj0.d;
import do3.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import q35.e0;
import q35.g;
import q35.g0;
import x35.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:+\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,\u0082\u0001\u0010-./0123456789:;<¨\u0006="}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "RepaymentsListDestination", "Statements", "StatementsNavigationDestination", "UpcomingInstalmentDetailsAsync", "UpcomingInstalmentDetailsDestinationAsync", "UpcomingInstalmentDetails", "UpcomingInstalmentDetailsDestination", "RepaymentDetails", "RepaymentDetailsDestination", "DirectDebitsNavigationDestination", "InterestRateBreakdownDestination", "ExternalAccountDetailsNavigationDestination", "AutoPay", "AutoPayNavigationDestination", "AccountDetails", "AccountDetailsNavigationDestination", "SelectAutoPay", "SelectAutoPayNavigationDestination", "ManageRepaymentsDestination", "SelectBackupCardFlow", "SelectBackupCardFlowNavigationDestination", "ChangeRepaymentDayFlow", "ChangeRepaymentDayFlowNavigationDestination", "LoansList", "LoansListNavigationDestination", "RenameLoanNavigationDestination", "DocumentsNavigationDestination", "RefinancedCreditsListV2", "RefinancedCreditsListV2Destination", "PartialRepayment", "PartialRepaymentDestination", "RepaymentV2Destination", "Welcome", "WelcomeDestination", "Cancellation", "CancellationDestination", "RepaymentTypePreloadedDestination", "RepaymentBreakdownDestination", "RefinancedSettlementPrompt", "RefinancedSettlementPromptDestination", "PaymentManagementDestination", "SetupSepaDirectDebit", "SetupSepaDirectDebitDestination", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$AccountDetails;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$AutoPay;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$Cancellation;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$ChangeRepaymentDayFlow;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$LoansList;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$PartialRepayment;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RefinancedCreditsListV2;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RefinancedSettlementPrompt;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RepaymentDetails;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$SelectAutoPay;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$SelectBackupCardFlow;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$SetupSepaDirectDebit;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$Statements;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$UpcomingInstalmentDetails;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$UpcomingInstalmentDetailsAsync;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$Welcome;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$AccountDetails;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountDetails extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f70219g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountDetails(String loanId) {
            super(null, new AccountDetailsNavigationDestination(loanId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70219g = loanId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountDetails) && Intrinsics.f(this.f70219g, ((AccountDetails) obj2).f70219g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f70219g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$AccountDetailsNavigationDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountDetailsNavigationDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<AccountDetailsNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70220a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountDetailsNavigationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountDetailsNavigationDestination[i];
            }
        }

        public AccountDetailsNavigationDestination(String loanId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70220a = loanId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70220a() {
            return this.f70220a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountDetailsNavigationDestination) && Intrinsics.f(this.f70220a, ((AccountDetailsNavigationDestination) obj2).f70220a);
        }

        public final int hashCode() {
            return this.f70220a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70220a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$AutoPay;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoPay extends LoanKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<AutoPay> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f70221g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f70222h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoPay(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoPay[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoPay(String loanId, boolean z) {
            super(null, new AutoPayNavigationDestination(loanId, z), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70221g = loanId;
            this.f70222h = z;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoPay)) {
                return false;
            }
            AutoPay autoPay = (AutoPay) obj2;
            return Intrinsics.f(this.f70221g, autoPay.f70221g) && this.f70222h == autoPay.f70222h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return Boolean.hashCode(this.f70222h) + (this.f70221g.hashCode() * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70221g);
            dest.writeInt(this.f70222h ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$AutoPayNavigationDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoPayNavigationDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<AutoPayNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f70224b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoPayNavigationDestination(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoPayNavigationDestination[i];
            }
        }

        public AutoPayNavigationDestination(String loanId, boolean z) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70223a = loanId;
            this.f70224b = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70223a() {
            return this.f70223a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF70224b() {
            return this.f70224b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoPayNavigationDestination)) {
                return false;
            }
            AutoPayNavigationDestination autoPayNavigationDestination = (AutoPayNavigationDestination) obj2;
            return Intrinsics.f(this.f70223a, autoPayNavigationDestination.f70223a) && this.f70224b == autoPayNavigationDestination.f70224b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f70224b) + (this.f70223a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70223a);
            dest.writeInt(this.f70224b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$Cancellation;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cancellation extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f70225g;

        public Cancellation() {
            this(null, 3);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Cancellation) && Intrinsics.f(this.f70225g, ((Cancellation) obj2).f70225g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            String str = this.f70225g;
            return (str == null ? 0 : str.hashCode()) * 31;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Cancellation(String str, int i) {
            str = (i & 1) != 0 ? null : str;
            super(null, new CancellationDestination(str), false, null, 0, 60);
            this.f70225g = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$ChangeRepaymentDayFlow;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeRepaymentDayFlow extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f70227g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeRepaymentDayFlow(String loanId) {
            super(null, new ChangeRepaymentDayFlowNavigationDestination(loanId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70227g = loanId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangeRepaymentDayFlow) && Intrinsics.f(this.f70227g, ((ChangeRepaymentDayFlow) obj2).f70227g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f70227g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$ChangeRepaymentDayFlowNavigationDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeRepaymentDayFlowNavigationDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<ChangeRepaymentDayFlowNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70228a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeRepaymentDayFlowNavigationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeRepaymentDayFlowNavigationDestination[i];
            }
        }

        public ChangeRepaymentDayFlowNavigationDestination(String loanId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70228a = loanId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70228a() {
            return this.f70228a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangeRepaymentDayFlowNavigationDestination) && Intrinsics.f(this.f70228a, ((ChangeRepaymentDayFlowNavigationDestination) obj2).f70228a);
        }

        public final int hashCode() {
            return this.f70228a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70228a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$DirectDebitsNavigationDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirectDebitsNavigationDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<DirectDebitsNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70229a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectDebitsNavigationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectDebitsNavigationDestination[i];
            }
        }

        public DirectDebitsNavigationDestination(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70229a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DirectDebitsNavigationDestination) && Intrinsics.f(this.f70229a, ((DirectDebitsNavigationDestination) obj2).f70229a);
        }

        public final int hashCode() {
            return this.f70229a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70229a);
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF70229a() {
            return this.f70229a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$DocumentsNavigationDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsNavigationDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<DocumentsNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70230a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentsNavigationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsNavigationDestination[i];
            }
        }

        public DocumentsNavigationDestination(String loanId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70230a = loanId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70230a() {
            return this.f70230a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentsNavigationDestination) && Intrinsics.f(this.f70230a, ((DocumentsNavigationDestination) obj2).f70230a);
        }

        public final int hashCode() {
            return this.f70230a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70230a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$ExternalAccountDetailsNavigationDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalAccountDetailsNavigationDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<ExternalAccountDetailsNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final py4.a f70231a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalAccountDetailsNavigationDestination((py4.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalAccountDetailsNavigationDestination[i];
            }
        }

        public ExternalAccountDetailsNavigationDestination(py4.a accountInfo) {
            Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
            this.f70231a = accountInfo;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final py4.a getF70231a() {
            return this.f70231a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExternalAccountDetailsNavigationDestination) && Intrinsics.f(this.f70231a, ((ExternalAccountDetailsNavigationDestination) obj2).f70231a);
        }

        public final int hashCode() {
            return this.f70231a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70231a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$InterestRateBreakdownDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InterestRateBreakdownDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<InterestRateBreakdownDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanDetails f70232a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InterestRateBreakdownDestination(LoanDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InterestRateBreakdownDestination[i];
            }
        }

        public InterestRateBreakdownDestination(LoanDetails loanDetails) {
            Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
            this.f70232a = loanDetails;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LoanDetails getF70232a() {
            return this.f70232a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InterestRateBreakdownDestination) && Intrinsics.f(this.f70232a, ((InterestRateBreakdownDestination) obj2).f70232a);
        }

        public final int hashCode() {
            return this.f70232a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f70232a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$LoansList;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoansList extends LoanKompotFeatureConfig {
        public LoansList() {
            this(0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof LoansList);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return 0;
        }

        public LoansList(int i) {
            super(null, LoansListNavigationDestination.f70233a, false, null, 0, 60);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$LoansListNavigationDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "<init>", "()V", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LoansListNavigationDestination implements LoanKompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoansListNavigationDestination f70233a = new LoansListNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<LoansListNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoansListNavigationDestination.f70233a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoansListNavigationDestination[i];
            }
        }

        private LoansListNavigationDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$ManageRepaymentsDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManageRepaymentsDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<ManageRepaymentsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f70235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LoanBackupCard f70236c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(LoanBorrower.CREATOR, parcel, arrayList, iA, 1);
                }
                return new ManageRepaymentsDestination((LoanBackupCard) parcel.readParcelable(ManageRepaymentsDestination.class.getClassLoader()), string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageRepaymentsDestination[i];
            }
        }

        public ManageRepaymentsDestination(LoanBackupCard backupCard, String loanId, List loanBorrowers) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            Intrinsics.checkNotNullParameter(loanBorrowers, "loanBorrowers");
            Intrinsics.checkNotNullParameter(backupCard, "backupCard");
            this.f70234a = loanId;
            this.f70235b = loanBorrowers;
            this.f70236c = backupCard;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LoanBackupCard getF70236c() {
            return this.f70236c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getF70235b() {
            return this.f70235b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF70234a() {
            return this.f70234a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ManageRepaymentsDestination)) {
                return false;
            }
            ManageRepaymentsDestination manageRepaymentsDestination = (ManageRepaymentsDestination) obj2;
            return Intrinsics.f(this.f70234a, manageRepaymentsDestination.f70234a) && Intrinsics.f(this.f70235b, manageRepaymentsDestination.f70235b) && Intrinsics.f(this.f70236c, manageRepaymentsDestination.f70236c);
        }

        public final int hashCode() {
            return this.f70236c.hashCode() + p.a.d(this.f70234a.hashCode() * 31, 31, this.f70235b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70234a);
            Iterator itV = p.a.v(this.f70235b, dest);
            while (itV.hasNext()) {
                ((LoanBorrower) itV.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f70236c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$PartialRepayment;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PartialRepayment extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f70237g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PartialRepayment(String loanId) {
            super(null, new PartialRepaymentDestination(loanId, null), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70237g = loanId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PartialRepayment) && Intrinsics.f(this.f70237g, ((PartialRepayment) obj2).f70237g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f70237g.hashCode() * 961;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$PartialRepaymentDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PartialRepaymentDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<PartialRepaymentDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g0 f70239b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PartialRepaymentDestination(parcel.readString(), parcel.readInt() == 0 ? null : g0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PartialRepaymentDestination[i];
            }
        }

        public PartialRepaymentDestination(String loanId, g0 g0Var) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70238a = loanId;
            this.f70239b = g0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70238a() {
            return this.f70238a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final g0 getF70239b() {
            return this.f70239b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PartialRepaymentDestination)) {
                return false;
            }
            PartialRepaymentDestination partialRepaymentDestination = (PartialRepaymentDestination) obj2;
            return Intrinsics.f(this.f70238a, partialRepaymentDestination.f70238a) && this.f70239b == partialRepaymentDestination.f70239b;
        }

        public final int hashCode() {
            int iHashCode = this.f70238a.hashCode() * 31;
            g0 g0Var = this.f70239b;
            return iHashCode + (g0Var == null ? 0 : g0Var.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70238a);
            g0 g0Var = this.f70239b;
            if (g0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(g0Var.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$PaymentManagementDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentManagementDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<PaymentManagementDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70240a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentManagementDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentManagementDestination[i];
            }
        }

        public PaymentManagementDestination(String loanId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70240a = loanId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70240a() {
            return this.f70240a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentManagementDestination) && Intrinsics.f(this.f70240a, ((PaymentManagementDestination) obj2).f70240a);
        }

        public final int hashCode() {
            return this.f70240a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70240a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RefinancedCreditsListV2;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RefinancedCreditsListV2 extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f70241g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefinancedCreditsListV2(String loanId) {
            super(null, new RefinancedCreditsListV2Destination(loanId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70241g = loanId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RefinancedCreditsListV2) && Intrinsics.f(this.f70241g, ((RefinancedCreditsListV2) obj2).f70241g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f70241g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RefinancedCreditsListV2Destination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RefinancedCreditsListV2Destination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<RefinancedCreditsListV2Destination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70242a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RefinancedCreditsListV2Destination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RefinancedCreditsListV2Destination[i];
            }
        }

        public RefinancedCreditsListV2Destination(String loanId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70242a = loanId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70242a() {
            return this.f70242a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RefinancedCreditsListV2Destination) && Intrinsics.f(this.f70242a, ((RefinancedCreditsListV2Destination) obj2).f70242a);
        }

        public final int hashCode() {
            return this.f70242a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70242a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RefinancedSettlementPrompt;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RefinancedSettlementPrompt extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f70243g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefinancedSettlementPrompt(String loanId) {
            super(null, new RefinancedSettlementPromptDestination(loanId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70243g = loanId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RefinancedSettlementPrompt) && Intrinsics.f(this.f70243g, ((RefinancedSettlementPrompt) obj2).f70243g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f70243g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RefinancedSettlementPromptDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RefinancedSettlementPromptDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<RefinancedSettlementPromptDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70244a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RefinancedSettlementPromptDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RefinancedSettlementPromptDestination[i];
            }
        }

        public RefinancedSettlementPromptDestination(String loanId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70244a = loanId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70244a() {
            return this.f70244a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RefinancedSettlementPromptDestination) && Intrinsics.f(this.f70244a, ((RefinancedSettlementPromptDestination) obj2).f70244a);
        }

        public final int hashCode() {
            return this.f70244a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70244a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RenameLoanNavigationDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RenameLoanNavigationDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<RenameLoanNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Loan f70245a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RenameLoanNavigationDestination(Loan.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RenameLoanNavigationDestination[i];
            }
        }

        public RenameLoanNavigationDestination(Loan loan) {
            Intrinsics.checkNotNullParameter(loan, "loan");
            this.f70245a = loan;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Loan getF70245a() {
            return this.f70245a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RenameLoanNavigationDestination) && Intrinsics.f(this.f70245a, ((RenameLoanNavigationDestination) obj2).f70245a);
        }

        public final int hashCode() {
            return this.f70245a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f70245a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RepaymentBreakdownDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentBreakdownDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<RepaymentBreakdownDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LoanRepaymentTerms f70247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LoanDetails f70248c;
        public final g0 d;
        public final boolean e;
        public final LoanRepaymentAccountData f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RepaymentBreakdownDestination(parcel.readString(), LoanRepaymentTerms.CREATOR.createFromParcel(parcel), LoanDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : g0.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0 ? LoanRepaymentAccountData.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepaymentBreakdownDestination[i];
            }
        }

        public RepaymentBreakdownDestination(String loanId, LoanRepaymentTerms terms, LoanDetails loanDetails, g0 g0Var, boolean z, LoanRepaymentAccountData loanRepaymentAccountData) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            Intrinsics.checkNotNullParameter(terms, "terms");
            Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
            this.f70246a = loanId;
            this.f70247b = terms;
            this.f70248c = loanDetails;
            this.d = g0Var;
            this.e = z;
            this.f = loanRepaymentAccountData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LoanDetails getF70248c() {
            return this.f70248c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF70246a() {
            return this.f70246a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LoanRepaymentAccountData getF() {
            return this.f;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final g0 getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RepaymentBreakdownDestination)) {
                return false;
            }
            RepaymentBreakdownDestination repaymentBreakdownDestination = (RepaymentBreakdownDestination) obj2;
            return Intrinsics.f(this.f70246a, repaymentBreakdownDestination.f70246a) && Intrinsics.f(this.f70247b, repaymentBreakdownDestination.f70247b) && Intrinsics.f(this.f70248c, repaymentBreakdownDestination.f70248c) && this.d == repaymentBreakdownDestination.d && this.e == repaymentBreakdownDestination.e && Intrinsics.f(this.f, repaymentBreakdownDestination.f);
        }

        public final int hashCode() {
            int iHashCode = (this.f70248c.hashCode() + ((this.f70247b.hashCode() + (this.f70246a.hashCode() * 31)) * 31)) * 31;
            g0 g0Var = this.d;
            int iC = j6.a.c((iHashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31, 31, this.e);
            LoanRepaymentAccountData loanRepaymentAccountData = this.f;
            return iC + (loanRepaymentAccountData != null ? loanRepaymentAccountData.hashCode() : 0);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final LoanRepaymentTerms getF70247b() {
            return this.f70247b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70246a);
            this.f70247b.writeToParcel(dest, i);
            this.f70248c.writeToParcel(dest, i);
            g0 g0Var = this.d;
            if (g0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(g0Var.name());
            }
            dest.writeInt(this.e ? 1 : 0);
            LoanRepaymentAccountData loanRepaymentAccountData = this.f;
            if (loanRepaymentAccountData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                loanRepaymentAccountData.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RepaymentDetails;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentDetails extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LoanDetails f70249g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e0 f70250h;
        public final String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RepaymentDetails(LoanDetails loan, e0 repayment, String userId) {
            super(null, new RepaymentDetailsDestination(loan, repayment, userId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loan, "loan");
            Intrinsics.checkNotNullParameter(repayment, "repayment");
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.f70249g = loan;
            this.f70250h = repayment;
            this.i = userId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RepaymentDetails)) {
                return false;
            }
            RepaymentDetails repaymentDetails = (RepaymentDetails) obj2;
            return Intrinsics.f(this.f70249g, repaymentDetails.f70249g) && Intrinsics.f(this.f70250h, repaymentDetails.f70250h) && Intrinsics.f(this.i, repaymentDetails.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return a.c((this.f70250h.hashCode() + (this.f70249g.hashCode() * 31)) * 31, 31, this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RepaymentDetailsDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentDetailsDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<RepaymentDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanDetails f70251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0 f70252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f70253c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RepaymentDetailsDestination(LoanDetails.CREATOR.createFromParcel(parcel), (e0) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepaymentDetailsDestination[i];
            }
        }

        public RepaymentDetailsDestination(LoanDetails loan, e0 repayment, String userId) {
            Intrinsics.checkNotNullParameter(loan, "loan");
            Intrinsics.checkNotNullParameter(repayment, "repayment");
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.f70251a = loan;
            this.f70252b = repayment;
            this.f70253c = userId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LoanDetails getF70251a() {
            return this.f70251a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final e0 getF70252b() {
            return this.f70252b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF70253c() {
            return this.f70253c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RepaymentDetailsDestination)) {
                return false;
            }
            RepaymentDetailsDestination repaymentDetailsDestination = (RepaymentDetailsDestination) obj2;
            return Intrinsics.f(this.f70251a, repaymentDetailsDestination.f70251a) && Intrinsics.f(this.f70252b, repaymentDetailsDestination.f70252b) && Intrinsics.f(this.f70253c, repaymentDetailsDestination.f70253c);
        }

        public final int hashCode() {
            return this.f70253c.hashCode() + ((this.f70252b.hashCode() + (this.f70251a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f70251a.writeToParcel(dest, i);
            dest.writeSerializable(this.f70252b);
            dest.writeString(this.f70253c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RepaymentTypePreloadedDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentTypePreloadedDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<RepaymentTypePreloadedDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanDetails f70254a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RepaymentTypePreloadedDestination(LoanDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepaymentTypePreloadedDestination[i];
            }
        }

        public RepaymentTypePreloadedDestination(LoanDetails loanDetails) {
            Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
            this.f70254a = loanDetails;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LoanDetails getF70254a() {
            return this.f70254a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RepaymentTypePreloadedDestination) && Intrinsics.f(this.f70254a, ((RepaymentTypePreloadedDestination) obj2).f70254a);
        }

        public final int hashCode() {
            return this.f70254a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f70254a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RepaymentsListDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentsListDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<RepaymentsListDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70258a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RepaymentsListDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepaymentsListDestination[i];
            }
        }

        public RepaymentsListDestination(String loanId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70258a = loanId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70258a() {
            return this.f70258a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RepaymentsListDestination) && Intrinsics.f(this.f70258a, ((RepaymentsListDestination) obj2).f70258a);
        }

        public final int hashCode() {
            return this.f70258a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70258a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$SelectAutoPay;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectAutoPay extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f70259g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectAutoPay(String loanId) {
            super(null, new SelectAutoPayNavigationDestination(loanId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70259g = loanId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectAutoPay) && Intrinsics.f(this.f70259g, ((SelectAutoPay) obj2).f70259g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f70259g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$SelectAutoPayNavigationDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectAutoPayNavigationDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<SelectAutoPayNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70260a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectAutoPayNavigationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectAutoPayNavigationDestination[i];
            }
        }

        public SelectAutoPayNavigationDestination(String loanId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70260a = loanId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70260a() {
            return this.f70260a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectAutoPayNavigationDestination) && Intrinsics.f(this.f70260a, ((SelectAutoPayNavigationDestination) obj2).f70260a);
        }

        public final int hashCode() {
            return this.f70260a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70260a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$SelectBackupCardFlow;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectBackupCardFlow extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f70261g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final LoanBackupCard f70262h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectBackupCardFlow(String loanId, LoanBackupCard backupCard) {
            super(null, new SelectBackupCardFlowNavigationDestination(loanId, backupCard, false), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            Intrinsics.checkNotNullParameter(backupCard, "backupCard");
            this.f70261g = loanId;
            this.f70262h = backupCard;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectBackupCardFlow)) {
                return false;
            }
            SelectBackupCardFlow selectBackupCardFlow = (SelectBackupCardFlow) obj2;
            return Intrinsics.f(this.f70261g, selectBackupCardFlow.f70261g) && Intrinsics.f(this.f70262h, selectBackupCardFlow.f70262h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return j6.a.c((this.f70262h.hashCode() + (this.f70261g.hashCode() * 31)) * 31, 31, false);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$SelectBackupCardFlowNavigationDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectBackupCardFlowNavigationDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<SelectBackupCardFlowNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LoanBackupCard f70264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f70265c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectBackupCardFlowNavigationDestination(parcel.readString(), (LoanBackupCard) parcel.readParcelable(SelectBackupCardFlowNavigationDestination.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectBackupCardFlowNavigationDestination[i];
            }
        }

        public SelectBackupCardFlowNavigationDestination(String loanId, LoanBackupCard backupCard, boolean z) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            Intrinsics.checkNotNullParameter(backupCard, "backupCard");
            this.f70263a = loanId;
            this.f70264b = backupCard;
            this.f70265c = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LoanBackupCard getF70264b() {
            return this.f70264b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF70263a() {
            return this.f70263a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getF70265c() {
            return this.f70265c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectBackupCardFlowNavigationDestination)) {
                return false;
            }
            SelectBackupCardFlowNavigationDestination selectBackupCardFlowNavigationDestination = (SelectBackupCardFlowNavigationDestination) obj2;
            return Intrinsics.f(this.f70263a, selectBackupCardFlowNavigationDestination.f70263a) && Intrinsics.f(this.f70264b, selectBackupCardFlowNavigationDestination.f70264b) && this.f70265c == selectBackupCardFlowNavigationDestination.f70265c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f70265c) + ((this.f70264b.hashCode() + (this.f70263a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70263a);
            dest.writeParcelable(this.f70264b, i);
            dest.writeInt(this.f70265c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$SetupSepaDirectDebit;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetupSepaDirectDebit extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LoanDetails f70266g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e f70267h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetupSepaDirectDebit(LoanDetails loanDetails, e eVar) {
            super(null, new SetupSepaDirectDebitDestination(loanDetails, eVar), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
            this.f70266g = loanDetails;
            this.f70267h = eVar;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SetupSepaDirectDebit)) {
                return false;
            }
            SetupSepaDirectDebit setupSepaDirectDebit = (SetupSepaDirectDebit) obj2;
            return Intrinsics.f(this.f70266g, setupSepaDirectDebit.f70266g) && Intrinsics.f(this.f70267h, setupSepaDirectDebit.f70267h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f70266g.hashCode() * 31;
            e eVar = this.f70267h;
            return (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$SetupSepaDirectDebitDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetupSepaDirectDebitDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<SetupSepaDirectDebitDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanDetails f70268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f70269b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetupSepaDirectDebitDestination(LoanDetails.CREATOR.createFromParcel(parcel), (e) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetupSepaDirectDebitDestination[i];
            }
        }

        public SetupSepaDirectDebitDestination(LoanDetails loanDetails, e eVar) {
            Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
            this.f70268a = loanDetails;
            this.f70269b = eVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getF70269b() {
            return this.f70269b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LoanDetails getF70268a() {
            return this.f70268a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SetupSepaDirectDebitDestination)) {
                return false;
            }
            SetupSepaDirectDebitDestination setupSepaDirectDebitDestination = (SetupSepaDirectDebitDestination) obj2;
            return Intrinsics.f(this.f70268a, setupSepaDirectDebitDestination.f70268a) && Intrinsics.f(this.f70269b, setupSepaDirectDebitDestination.f70269b);
        }

        public final int hashCode() {
            int iHashCode = this.f70268a.hashCode() * 31;
            e eVar = this.f70269b;
            return iHashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f70268a.writeToParcel(dest, i);
            dest.writeSerializable(this.f70269b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$Statements;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Statements extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f70270g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g f70271h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Statements(String loanId, g statementType) {
            super(null, new StatementsNavigationDestination(loanId, statementType), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            Intrinsics.checkNotNullParameter(statementType, "statementType");
            this.f70270g = loanId;
            this.f70271h = statementType;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Statements)) {
                return false;
            }
            Statements statements = (Statements) obj2;
            return Intrinsics.f(this.f70270g, statements.f70270g) && this.f70271h == statements.f70271h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return (this.f70271h.hashCode() + (this.f70270g.hashCode() * 31)) * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$StatementsNavigationDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementsNavigationDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<StatementsNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f70273b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatementsNavigationDestination(parcel.readString(), g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementsNavigationDestination[i];
            }
        }

        public StatementsNavigationDestination(String loanId, g statementType) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            Intrinsics.checkNotNullParameter(statementType, "statementType");
            this.f70272a = loanId;
            this.f70273b = statementType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70272a() {
            return this.f70272a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final g getF70273b() {
            return this.f70273b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StatementsNavigationDestination)) {
                return false;
            }
            StatementsNavigationDestination statementsNavigationDestination = (StatementsNavigationDestination) obj2;
            return Intrinsics.f(this.f70272a, statementsNavigationDestination.f70272a) && this.f70273b == statementsNavigationDestination.f70273b;
        }

        public final int hashCode() {
            return this.f70273b.hashCode() + (this.f70272a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70272a);
            dest.writeString(this.f70273b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$UpcomingInstalmentDetails;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpcomingInstalmentDetails extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LoanDetails f70274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final n f70275h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpcomingInstalmentDetails(LoanDetails loan, n user) {
            super(null, new UpcomingInstalmentDetailsDestination(loan, user), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loan, "loan");
            Intrinsics.checkNotNullParameter(user, "user");
            this.f70274g = loan;
            this.f70275h = user;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpcomingInstalmentDetails)) {
                return false;
            }
            UpcomingInstalmentDetails upcomingInstalmentDetails = (UpcomingInstalmentDetails) obj2;
            return Intrinsics.f(this.f70274g, upcomingInstalmentDetails.f70274g) && Intrinsics.f(this.f70275h, upcomingInstalmentDetails.f70275h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return (this.f70275h.hashCode() + (this.f70274g.hashCode() * 31)) * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$UpcomingInstalmentDetailsAsync;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpcomingInstalmentDetailsAsync extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f70276g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f70277h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpcomingInstalmentDetailsAsync(String loanId, String instalmentId) {
            super(null, new UpcomingInstalmentDetailsDestinationAsync(loanId, instalmentId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            Intrinsics.checkNotNullParameter(instalmentId, "instalmentId");
            this.f70276g = loanId;
            this.f70277h = instalmentId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpcomingInstalmentDetailsAsync)) {
                return false;
            }
            UpcomingInstalmentDetailsAsync upcomingInstalmentDetailsAsync = (UpcomingInstalmentDetailsAsync) obj2;
            return Intrinsics.f(this.f70276g, upcomingInstalmentDetailsAsync.f70276g) && Intrinsics.f(this.f70277h, upcomingInstalmentDetailsAsync.f70277h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return a.c(this.f70276g.hashCode() * 31, 31, this.f70277h);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$UpcomingInstalmentDetailsDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpcomingInstalmentDetailsDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<UpcomingInstalmentDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanDetails f70278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f70279b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpcomingInstalmentDetailsDestination(LoanDetails.CREATOR.createFromParcel(parcel), (n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpcomingInstalmentDetailsDestination[i];
            }
        }

        public UpcomingInstalmentDetailsDestination(LoanDetails loan, n user) {
            Intrinsics.checkNotNullParameter(loan, "loan");
            Intrinsics.checkNotNullParameter(user, "user");
            this.f70278a = loan;
            this.f70279b = user;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LoanDetails getF70278a() {
            return this.f70278a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n getF70279b() {
            return this.f70279b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpcomingInstalmentDetailsDestination)) {
                return false;
            }
            UpcomingInstalmentDetailsDestination upcomingInstalmentDetailsDestination = (UpcomingInstalmentDetailsDestination) obj2;
            return Intrinsics.f(this.f70278a, upcomingInstalmentDetailsDestination.f70278a) && Intrinsics.f(this.f70279b, upcomingInstalmentDetailsDestination.f70279b);
        }

        public final int hashCode() {
            return this.f70279b.hashCode() + (this.f70278a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f70278a.writeToParcel(dest, i);
            dest.writeSerializable(this.f70279b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$UpcomingInstalmentDetailsDestinationAsync;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpcomingInstalmentDetailsDestinationAsync implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<UpcomingInstalmentDetailsDestinationAsync> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70281b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpcomingInstalmentDetailsDestinationAsync(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpcomingInstalmentDetailsDestinationAsync[i];
            }
        }

        public UpcomingInstalmentDetailsDestinationAsync(String loanId, String instalmentId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            Intrinsics.checkNotNullParameter(instalmentId, "instalmentId");
            this.f70280a = loanId;
            this.f70281b = instalmentId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70281b() {
            return this.f70281b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF70280a() {
            return this.f70280a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpcomingInstalmentDetailsDestinationAsync)) {
                return false;
            }
            UpcomingInstalmentDetailsDestinationAsync upcomingInstalmentDetailsDestinationAsync = (UpcomingInstalmentDetailsDestinationAsync) obj2;
            return Intrinsics.f(this.f70280a, upcomingInstalmentDetailsDestinationAsync.f70280a) && Intrinsics.f(this.f70281b, upcomingInstalmentDetailsDestinationAsync.f70281b);
        }

        public final int hashCode() {
            return this.f70281b.hashCode() + (this.f70280a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70280a);
            dest.writeString(this.f70281b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$Welcome;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Welcome extends LoanKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f70282g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Welcome(String loanId) {
            super(null, new WelcomeDestination(loanId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70282g = loanId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Welcome) && Intrinsics.f(this.f70282g, ((Welcome) obj2).f70282g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f70282g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$WelcomeDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WelcomeDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<WelcomeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70283a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WelcomeDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WelcomeDestination[i];
            }
        }

        public WelcomeDestination(String loanId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70283a = loanId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70283a() {
            return this.f70283a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WelcomeDestination) && Intrinsics.f(this.f70283a, ((WelcomeDestination) obj2).f70283a);
        }

        public final int hashCode() {
            return this.f70283a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70283a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$CancellationDestination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationDestination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<CancellationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70226a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancellationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationDestination[i];
            }
        }

        public CancellationDestination(String str) {
            this.f70226a = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70226a() {
            return this.f70226a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancellationDestination) && Intrinsics.f(this.f70226a, ((CancellationDestination) obj2).f70226a);
        }

        public final int hashCode() {
            String str = this.f70226a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70226a);
        }

        public CancellationDestination() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotFeatureConfig$RepaymentV2Destination;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentV2Destination implements LoanKompotDestination {

        @NotNull
        public static final Parcelable.Creator<RepaymentV2Destination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b95.a f70256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f70257c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RepaymentV2Destination(parcel.readString(), b95.a.valueOf(parcel.readString()), (d) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepaymentV2Destination[i];
            }
        }

        public RepaymentV2Destination(String loanId, b95.a product, d dVar, boolean z) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            Intrinsics.checkNotNullParameter(product, "product");
            this.f70255a = loanId;
            this.f70256b = product;
            this.f70257c = dVar;
            this.d = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF70255a() {
            return this.f70255a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final d getF70257c() {
            return this.f70257c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b95.a getF70256b() {
            return this.f70256b;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RepaymentV2Destination)) {
                return false;
            }
            RepaymentV2Destination repaymentV2Destination = (RepaymentV2Destination) obj2;
            return Intrinsics.f(this.f70255a, repaymentV2Destination.f70255a) && this.f70256b == repaymentV2Destination.f70256b && Intrinsics.f(this.f70257c, repaymentV2Destination.f70257c) && this.d == repaymentV2Destination.d;
        }

        public final int hashCode() {
            int iHashCode = (this.f70256b.hashCode() + (this.f70255a.hashCode() * 31)) * 31;
            d dVar = this.f70257c;
            return Boolean.hashCode(this.d) + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70255a);
            dest.writeString(this.f70256b.name());
            dest.writeSerializable(this.f70257c);
            dest.writeInt(this.d ? 1 : 0);
        }

        public /* synthetic */ RepaymentV2Destination(String str, b95.a aVar, d dVar, int i) {
            this(str, aVar, (i & 4) != 0 ? null : dVar, false);
        }
    }
}
