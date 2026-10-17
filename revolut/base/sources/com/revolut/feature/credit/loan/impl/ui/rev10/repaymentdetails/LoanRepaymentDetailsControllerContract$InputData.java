package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q35.e0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repaymentdetails/LoanRepaymentDetailsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanRepaymentDetailsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LoanRepaymentDetailsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f70532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f70533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70534c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanRepaymentDetailsControllerContract$InputData((LoanDetails) parcel.readParcelable(LoanRepaymentDetailsControllerContract$InputData.class.getClassLoader()), (e0) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanRepaymentDetailsControllerContract$InputData[i];
        }
    }

    public LoanRepaymentDetailsControllerContract$InputData(LoanDetails loan, e0 repayment, String userId) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        Intrinsics.checkNotNullParameter(repayment, "repayment");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f70532a = loan;
        this.f70533b = repayment;
        this.f70534c = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanRepaymentDetailsControllerContract$InputData)) {
            return false;
        }
        LoanRepaymentDetailsControllerContract$InputData loanRepaymentDetailsControllerContract$InputData = (LoanRepaymentDetailsControllerContract$InputData) obj2;
        return Intrinsics.f(this.f70532a, loanRepaymentDetailsControllerContract$InputData.f70532a) && Intrinsics.f(this.f70533b, loanRepaymentDetailsControllerContract$InputData.f70533b) && Intrinsics.f(this.f70534c, loanRepaymentDetailsControllerContract$InputData.f70534c);
    }

    public final int hashCode() {
        return this.f70534c.hashCode() + ((this.f70533b.hashCode() + (this.f70532a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f70532a, i);
        dest.writeSerializable(this.f70533b);
        dest.writeString(this.f70534c);
    }
}
