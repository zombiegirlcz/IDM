package com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z45.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/cancellation_v2/confirmation/LoanConfirmWithdrawalControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanConfirmWithdrawalControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LoanConfirmWithdrawalControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f70369b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanConfirmWithdrawalControllerContract$InputData(parcel.readString(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanConfirmWithdrawalControllerContract$InputData[i];
        }
    }

    public LoanConfirmWithdrawalControllerContract$InputData(String loanId, d confirmation) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        this.f70368a = loanId;
        this.f70369b = confirmation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanConfirmWithdrawalControllerContract$InputData)) {
            return false;
        }
        LoanConfirmWithdrawalControllerContract$InputData loanConfirmWithdrawalControllerContract$InputData = (LoanConfirmWithdrawalControllerContract$InputData) obj2;
        return Intrinsics.f(this.f70368a, loanConfirmWithdrawalControllerContract$InputData.f70368a) && Intrinsics.f(this.f70369b, loanConfirmWithdrawalControllerContract$InputData.f70369b);
    }

    public final int hashCode() {
        return this.f70369b.hashCode() + (this.f70368a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70368a);
        dest.writeSerializable(this.f70369b);
    }
}
