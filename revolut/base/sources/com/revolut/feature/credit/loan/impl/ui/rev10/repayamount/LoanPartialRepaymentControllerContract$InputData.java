package com.revolut.feature.credit.loan.impl.ui.rev10.repayamount;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanPartialRepaymentControllerContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanPartialRepaymentControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f70489b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanPartialRepaymentControllerContract$InputData(parcel.readString(), parcel.readInt() == 0 ? null : g0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanPartialRepaymentControllerContract$InputData[i];
        }
    }

    public LoanPartialRepaymentControllerContract$InputData(String loanId, g0 g0Var) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f70488a = loanId;
        this.f70489b = g0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanPartialRepaymentControllerContract$InputData)) {
            return false;
        }
        LoanPartialRepaymentControllerContract$InputData loanPartialRepaymentControllerContract$InputData = (LoanPartialRepaymentControllerContract$InputData) obj2;
        return Intrinsics.f(this.f70488a, loanPartialRepaymentControllerContract$InputData.f70488a) && this.f70489b == loanPartialRepaymentControllerContract$InputData.f70489b;
    }

    public final int hashCode() {
        int iHashCode = this.f70488a.hashCode() * 31;
        g0 g0Var = this.f70489b;
        return iHashCode + (g0Var == null ? 0 : g0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70488a);
        g0 g0Var = this.f70489b;
        if (g0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(g0Var.name());
        }
    }
}
