package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AmountInputControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AmountInputControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f70547b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AmountInputControllerContract$InputData((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AmountInputControllerContract$InputData[i];
        }
    }

    public AmountInputControllerContract$InputData(d dVar, String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f70546a = loanId;
        this.f70547b = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AmountInputControllerContract$InputData)) {
            return false;
        }
        AmountInputControllerContract$InputData amountInputControllerContract$InputData = (AmountInputControllerContract$InputData) obj2;
        return Intrinsics.f(this.f70546a, amountInputControllerContract$InputData.f70546a) && Intrinsics.f(this.f70547b, amountInputControllerContract$InputData.f70547b);
    }

    public final int hashCode() {
        int iHashCode = this.f70546a.hashCode() * 31;
        d dVar = this.f70547b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70546a);
        dest.writeSerializable(this.f70547b);
    }
}
