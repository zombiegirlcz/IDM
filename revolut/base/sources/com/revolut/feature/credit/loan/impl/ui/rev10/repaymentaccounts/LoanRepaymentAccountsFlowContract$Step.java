package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repaymentaccounts/LoanRepaymentAccountsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ManageRepaymentAccounts", "SetupBackUpCard", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentaccounts/LoanRepaymentAccountsFlowContract$Step$ManageRepaymentAccounts;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentaccounts/LoanRepaymentAccountsFlowContract$Step$SetupBackUpCard;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanRepaymentAccountsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentaccounts/LoanRepaymentAccountsFlowContract$Step$ManageRepaymentAccounts;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentaccounts/LoanRepaymentAccountsFlowContract$Step;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManageRepaymentAccounts extends LoanRepaymentAccountsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManageRepaymentAccounts f70514a = new ManageRepaymentAccounts();

        @NotNull
        public static final Parcelable.Creator<ManageRepaymentAccounts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManageRepaymentAccounts.f70514a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageRepaymentAccounts[i];
            }
        }

        private ManageRepaymentAccounts() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentaccounts/LoanRepaymentAccountsFlowContract$Step$SetupBackUpCard;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentaccounts/LoanRepaymentAccountsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetupBackUpCard extends LoanRepaymentAccountsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SetupBackUpCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f70515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LoanBackupCard f70516b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetupBackUpCard(parcel.readInt() != 0, (LoanBackupCard) parcel.readParcelable(SetupBackUpCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetupBackUpCard[i];
            }
        }

        public SetupBackUpCard(boolean z, LoanBackupCard backupCard) {
            Intrinsics.checkNotNullParameter(backupCard, "backupCard");
            this.f70515a = z;
            this.f70516b = backupCard;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SetupBackUpCard)) {
                return false;
            }
            SetupBackUpCard setupBackUpCard = (SetupBackUpCard) obj2;
            return this.f70515a == setupBackUpCard.f70515a && Intrinsics.f(this.f70516b, setupBackUpCard.f70516b);
        }

        public final int hashCode() {
            return this.f70516b.hashCode() + (Boolean.hashCode(this.f70515a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f70515a ? 1 : 0);
            dest.writeParcelable(this.f70516b, i);
        }
    }

    private LoanRepaymentAccountsFlowContract$Step() {
    }
}
