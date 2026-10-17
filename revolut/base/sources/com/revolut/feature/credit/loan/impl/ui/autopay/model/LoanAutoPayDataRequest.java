package com.revolut.feature.credit.loan.impl.ui.autopay.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/autopay/model/LoanAutoPayDataRequest;", "Lcom/revolut/feature/credit/autopay/models/repayment/AutoPayRepaymentDataRequest;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanAutoPayDataRequest implements AutoPayRepaymentDataRequest {

    @NotNull
    public static final Parcelable.Creator<LoanAutoPayDataRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RepaymentSource f70325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70326b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanAutoPayDataRequest((RepaymentSource) parcel.readParcelable(LoanAutoPayDataRequest.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanAutoPayDataRequest[i];
        }
    }

    public LoanAutoPayDataRequest(RepaymentSource repaymentSource, String facilityId) {
        Intrinsics.checkNotNullParameter(repaymentSource, "repaymentSource");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f70325a = repaymentSource;
        this.f70326b = facilityId;
    }

    @Override // com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest
    /* JADX INFO: renamed from: N8, reason: from getter */
    public final RepaymentSource getF70325a() {
        return this.f70325a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanAutoPayDataRequest)) {
            return false;
        }
        LoanAutoPayDataRequest loanAutoPayDataRequest = (LoanAutoPayDataRequest) obj2;
        return Intrinsics.f(this.f70325a, loanAutoPayDataRequest.f70325a) && Intrinsics.f(this.f70326b, loanAutoPayDataRequest.f70326b);
    }

    public final int hashCode() {
        return this.f70326b.hashCode() + (this.f70325a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f70325a, i);
        dest.writeString(this.f70326b);
    }
}
