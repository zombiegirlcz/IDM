package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repaymentaccounts/multipleborrowers/LoanRepaymentAccountsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanRepaymentAccountsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LoanRepaymentAccountsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f70520b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(LoanRepaymentAccountsControllerContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new LoanRepaymentAccountsControllerContract$InputData(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanRepaymentAccountsControllerContract$InputData[i];
        }
    }

    public LoanRepaymentAccountsControllerContract$InputData(String loanId, List loanBorrowers) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loanBorrowers, "loanBorrowers");
        this.f70519a = loanId;
        this.f70520b = loanBorrowers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanRepaymentAccountsControllerContract$InputData)) {
            return false;
        }
        LoanRepaymentAccountsControllerContract$InputData loanRepaymentAccountsControllerContract$InputData = (LoanRepaymentAccountsControllerContract$InputData) obj2;
        return Intrinsics.f(this.f70519a, loanRepaymentAccountsControllerContract$InputData.f70519a) && Intrinsics.f(this.f70520b, loanRepaymentAccountsControllerContract$InputData.f70520b);
    }

    public final int hashCode() {
        return this.f70520b.hashCode() + (this.f70519a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70519a);
        Iterator itV = p.a.v(this.f70520b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
