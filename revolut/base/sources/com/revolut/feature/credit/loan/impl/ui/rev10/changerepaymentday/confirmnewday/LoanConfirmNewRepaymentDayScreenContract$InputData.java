package com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/confirmnewday/LoanConfirmNewRepaymentDayScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanConfirmNewRepaymentDayScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LoanConfirmNewRepaymentDayScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f70403c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanConfirmNewRepaymentDayScreenContract$InputData(parcel.readInt(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanConfirmNewRepaymentDayScreenContract$InputData[i];
        }
    }

    public LoanConfirmNewRepaymentDayScreenContract$InputData(int i, String loanId, b countryCode) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f70401a = loanId;
        this.f70402b = i;
        this.f70403c = countryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanConfirmNewRepaymentDayScreenContract$InputData)) {
            return false;
        }
        LoanConfirmNewRepaymentDayScreenContract$InputData loanConfirmNewRepaymentDayScreenContract$InputData = (LoanConfirmNewRepaymentDayScreenContract$InputData) obj2;
        return Intrinsics.f(this.f70401a, loanConfirmNewRepaymentDayScreenContract$InputData.f70401a) && this.f70402b == loanConfirmNewRepaymentDayScreenContract$InputData.f70402b && Intrinsics.f(this.f70403c, loanConfirmNewRepaymentDayScreenContract$InputData.f70403c);
    }

    public final int hashCode() {
        return this.f70403c.f297794a.hashCode() + j6.a.b(this.f70402b, this.f70401a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70401a);
        dest.writeInt(this.f70402b);
        dest.writeSerializable(this.f70403c);
    }
}
