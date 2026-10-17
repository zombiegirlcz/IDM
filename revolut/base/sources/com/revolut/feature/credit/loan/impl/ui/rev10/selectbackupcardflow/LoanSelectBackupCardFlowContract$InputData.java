package com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/selectbackupcardflow/LoanSelectBackupCardFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanSelectBackupCardFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LoanSelectBackupCardFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanBackupCard f70588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f70589c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanSelectBackupCardFlowContract$InputData(parcel.readString(), (LoanBackupCard) parcel.readParcelable(LoanSelectBackupCardFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanSelectBackupCardFlowContract$InputData[i];
        }
    }

    public LoanSelectBackupCardFlowContract$InputData(String loanId, LoanBackupCard backupCard, boolean z) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(backupCard, "backupCard");
        this.f70587a = loanId;
        this.f70588b = backupCard;
        this.f70589c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanSelectBackupCardFlowContract$InputData)) {
            return false;
        }
        LoanSelectBackupCardFlowContract$InputData loanSelectBackupCardFlowContract$InputData = (LoanSelectBackupCardFlowContract$InputData) obj2;
        return Intrinsics.f(this.f70587a, loanSelectBackupCardFlowContract$InputData.f70587a) && Intrinsics.f(this.f70588b, loanSelectBackupCardFlowContract$InputData.f70588b) && this.f70589c == loanSelectBackupCardFlowContract$InputData.f70589c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70589c) + ((this.f70588b.hashCode() + (this.f70587a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70587a);
        dest.writeParcelable(this.f70588b, i);
        dest.writeInt(this.f70589c ? 1 : 0);
    }
}
