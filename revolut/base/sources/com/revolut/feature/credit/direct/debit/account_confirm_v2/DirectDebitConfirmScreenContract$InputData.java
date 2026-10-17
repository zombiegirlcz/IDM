package com.revolut.feature.credit.direct.debit.account_confirm_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/direct/debit/account_confirm_v2/DirectDebitConfirmScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DirectDebitConfirmScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DirectDebitConfirmScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DirectDebitConfirmScreenContract$AmountType f69857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DirectDebitConfirmScreenContract$RepaymentDay f69858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f69859c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DirectDebitConfirmScreenContract$InputData((DirectDebitConfirmScreenContract$AmountType) parcel.readParcelable(DirectDebitConfirmScreenContract$InputData.class.getClassLoader()), (DirectDebitConfirmScreenContract$RepaymentDay) parcel.readParcelable(DirectDebitConfirmScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(DirectDebitConfirmScreenContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DirectDebitConfirmScreenContract$InputData[i];
        }
    }

    public DirectDebitConfirmScreenContract$InputData(DirectDebitConfirmScreenContract$AmountType amountType, DirectDebitConfirmScreenContract$RepaymentDay repaymentDay, Clause bankName, String clabe) {
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(repaymentDay, "repaymentDay");
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(clabe, "clabe");
        this.f69857a = amountType;
        this.f69858b = repaymentDay;
        this.f69859c = bankName;
        this.d = clabe;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DirectDebitConfirmScreenContract$InputData)) {
            return false;
        }
        DirectDebitConfirmScreenContract$InputData directDebitConfirmScreenContract$InputData = (DirectDebitConfirmScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69857a, directDebitConfirmScreenContract$InputData.f69857a) && Intrinsics.f(this.f69858b, directDebitConfirmScreenContract$InputData.f69858b) && Intrinsics.f(this.f69859c, directDebitConfirmScreenContract$InputData.f69859c) && Intrinsics.f(this.d, directDebitConfirmScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a((this.f69858b.hashCode() + (this.f69857a.hashCode() * 31)) * 31, 31, this.f69859c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f69857a, i);
        dest.writeParcelable(this.f69858b, i);
        dest.writeParcelable(this.f69859c, i);
        dest.writeString(this.d);
    }
}
