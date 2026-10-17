package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentAccountData;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repaymentbreakdown/LoanRepaymentBreakdownControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanRepaymentBreakdownControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LoanRepaymentBreakdownControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanRepaymentTerms f70522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LoanDetails f70523c;
    public final g0 d;
    public final boolean e;
    public final LoanRepaymentAccountData f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanRepaymentBreakdownControllerContract$InputData(parcel.readString(), (LoanRepaymentTerms) parcel.readParcelable(LoanRepaymentBreakdownControllerContract$InputData.class.getClassLoader()), (LoanDetails) parcel.readParcelable(LoanRepaymentBreakdownControllerContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : g0.valueOf(parcel.readString()), parcel.readInt() != 0, (LoanRepaymentAccountData) parcel.readParcelable(LoanRepaymentBreakdownControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanRepaymentBreakdownControllerContract$InputData[i];
        }
    }

    public LoanRepaymentBreakdownControllerContract$InputData(String loanId, LoanRepaymentTerms terms, LoanDetails loanDetails, g0 g0Var, boolean z, LoanRepaymentAccountData loanRepaymentAccountData) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f70521a = loanId;
        this.f70522b = terms;
        this.f70523c = loanDetails;
        this.d = g0Var;
        this.e = z;
        this.f = loanRepaymentAccountData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanRepaymentBreakdownControllerContract$InputData)) {
            return false;
        }
        LoanRepaymentBreakdownControllerContract$InputData loanRepaymentBreakdownControllerContract$InputData = (LoanRepaymentBreakdownControllerContract$InputData) obj2;
        return Intrinsics.f(this.f70521a, loanRepaymentBreakdownControllerContract$InputData.f70521a) && Intrinsics.f(this.f70522b, loanRepaymentBreakdownControllerContract$InputData.f70522b) && Intrinsics.f(this.f70523c, loanRepaymentBreakdownControllerContract$InputData.f70523c) && this.d == loanRepaymentBreakdownControllerContract$InputData.d && this.e == loanRepaymentBreakdownControllerContract$InputData.e && Intrinsics.f(this.f, loanRepaymentBreakdownControllerContract$InputData.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f70523c.hashCode() + ((this.f70522b.hashCode() + (this.f70521a.hashCode() * 31)) * 31)) * 31;
        g0 g0Var = this.d;
        int iC = j6.a.c((iHashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31, 31, this.e);
        LoanRepaymentAccountData loanRepaymentAccountData = this.f;
        return iC + (loanRepaymentAccountData != null ? loanRepaymentAccountData.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70521a);
        dest.writeParcelable(this.f70522b, i);
        dest.writeParcelable(this.f70523c, i);
        g0 g0Var = this.d;
        if (g0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(g0Var.name());
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
    }
}
