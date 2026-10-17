package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/LoanRepaymentFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanRepaymentFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LoanRepaymentFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b95.a f70536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f70537c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanRepaymentFlowContract$InputData(parcel.readString(), b95.a.valueOf(parcel.readString()), (d) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanRepaymentFlowContract$InputData[i];
        }
    }

    public LoanRepaymentFlowContract$InputData(String loanId, b95.a product, d dVar, boolean z) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f70535a = loanId;
        this.f70536b = product;
        this.f70537c = dVar;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanRepaymentFlowContract$InputData)) {
            return false;
        }
        LoanRepaymentFlowContract$InputData loanRepaymentFlowContract$InputData = (LoanRepaymentFlowContract$InputData) obj2;
        return Intrinsics.f(this.f70535a, loanRepaymentFlowContract$InputData.f70535a) && this.f70536b == loanRepaymentFlowContract$InputData.f70536b && Intrinsics.f(this.f70537c, loanRepaymentFlowContract$InputData.f70537c) && this.d == loanRepaymentFlowContract$InputData.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f70536b.hashCode() + (this.f70535a.hashCode() * 31)) * 31;
        d dVar = this.f70537c;
        return Boolean.hashCode(this.d) + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70535a);
        dest.writeString(this.f70536b.name());
        dest.writeSerializable(this.f70537c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
