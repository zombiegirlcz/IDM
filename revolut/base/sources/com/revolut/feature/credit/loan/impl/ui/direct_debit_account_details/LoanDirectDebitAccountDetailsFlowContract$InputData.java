package com.revolut.feature.credit.loan.impl.ui.direct_debit_account_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/direct_debit_account_details/LoanDirectDebitAccountDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanDirectDebitAccountDetailsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LoanDirectDebitAccountDetailsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final py4.a f70328a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanDirectDebitAccountDetailsFlowContract$InputData((py4.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanDirectDebitAccountDetailsFlowContract$InputData[i];
        }
    }

    public LoanDirectDebitAccountDetailsFlowContract$InputData(py4.a accountInfo) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        this.f70328a = accountInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof LoanDirectDebitAccountDetailsFlowContract$InputData) && Intrinsics.f(this.f70328a, ((LoanDirectDebitAccountDetailsFlowContract$InputData) obj2).f70328a);
    }

    public final int hashCode() {
        return this.f70328a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70328a);
    }
}
