package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentAccountData;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/reviewpayment/ReviewPaymentControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReviewPaymentControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReviewPaymentControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f70565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f70566c;
    public final LoanRepaymentAccountData d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReviewPaymentControllerContract$InputData(parcel.readString(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : g0.valueOf(parcel.readString()), (LoanRepaymentAccountData) parcel.readParcelable(ReviewPaymentControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReviewPaymentControllerContract$InputData[i];
        }
    }

    public ReviewPaymentControllerContract$InputData(String loanId, d amount, g0 g0Var, LoanRepaymentAccountData loanRepaymentAccountData) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f70564a = loanId;
        this.f70565b = amount;
        this.f70566c = g0Var;
        this.d = loanRepaymentAccountData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReviewPaymentControllerContract$InputData)) {
            return false;
        }
        ReviewPaymentControllerContract$InputData reviewPaymentControllerContract$InputData = (ReviewPaymentControllerContract$InputData) obj2;
        return Intrinsics.f(this.f70564a, reviewPaymentControllerContract$InputData.f70564a) && Intrinsics.f(this.f70565b, reviewPaymentControllerContract$InputData.f70565b) && this.f70566c == reviewPaymentControllerContract$InputData.f70566c && Intrinsics.f(this.d, reviewPaymentControllerContract$InputData.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f70564a.hashCode() * 31, 31, this.f70565b);
        g0 g0Var = this.f70566c;
        int iHashCode = (iC + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        LoanRepaymentAccountData loanRepaymentAccountData = this.d;
        return iHashCode + (loanRepaymentAccountData != null ? loanRepaymentAccountData.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70564a);
        dest.writeSerializable(this.f70565b);
        g0 g0Var = this.f70566c;
        if (g0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(g0Var.name());
        }
        dest.writeParcelable(this.d, i);
    }
}
