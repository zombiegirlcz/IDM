package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanRepaymentAccountDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanRepaymentAccountDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanRepaymentAccountDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70176b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanRepaymentAccountDetails(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanRepaymentAccountDetails[i];
        }
    }

    public LoanRepaymentAccountDetails(String accountNumber, String str) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.f70175a = accountNumber;
        this.f70176b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanRepaymentAccountDetails)) {
            return false;
        }
        LoanRepaymentAccountDetails loanRepaymentAccountDetails = (LoanRepaymentAccountDetails) obj2;
        return Intrinsics.f(this.f70175a, loanRepaymentAccountDetails.f70175a) && Intrinsics.f(this.f70176b, loanRepaymentAccountDetails.f70176b);
    }

    public final int hashCode() {
        int iHashCode = this.f70175a.hashCode() * 31;
        String str = this.f70176b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70175a);
        dest.writeString(this.f70176b);
    }
}
