package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentAccountData;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import dj0.d;
import gim.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q35.f0;
import q35.g0;
import wkm.l;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public abstract class LoanRepaymentAccountModelExtension extends n implements vki.b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentaccountpicker/LoanRepaymentAccountModelExtension$RepaymentAccountState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentAccountState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RepaymentAccountState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountWrapper f70504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0 f70505b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RepaymentAccountState((AccountWrapper) parcel.readParcelable(RepaymentAccountState.class.getClassLoader()), (f0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepaymentAccountState[i];
            }
        }

        public RepaymentAccountState(AccountWrapper selectedAccount, f0 repaymentAccountsConfig) {
            Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
            Intrinsics.checkNotNullParameter(repaymentAccountsConfig, "repaymentAccountsConfig");
            this.f70504a = selectedAccount;
            this.f70505b = repaymentAccountsConfig;
        }

        public final String a() {
            AccountWrapper accountWrapper = this.f70504a;
            AccountSource accountSource = accountWrapper.d;
            if (!(accountSource instanceof AccountSource.SavingsSource)) {
                return accountWrapper.getId();
            }
            String str = ((AccountSource.SavingsSource) accountSource).f97216a.f86460a.f234882b;
            if (str != null) {
                return str;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RepaymentAccountState)) {
                return false;
            }
            RepaymentAccountState repaymentAccountState = (RepaymentAccountState) obj2;
            return Intrinsics.f(this.f70504a, repaymentAccountState.f70504a) && Intrinsics.f(this.f70505b, repaymentAccountState.f70505b);
        }

        public final int hashCode() {
            return this.f70505b.hashCode() + (this.f70504a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70504a, i);
            dest.writeSerializable(this.f70505b);
        }
    }

    public abstract Object Z2(LoanDetails loanDetails, g0 g0Var, LoanRepaymentTerms loanRepaymentTerms, d dVar, String str, c cVar);

    public abstract void b3();

    public abstract l c3(String str, LoanRepaymentAccountData loanRepaymentAccountData);

    public abstract void d3(j1j.d dVar);
}
