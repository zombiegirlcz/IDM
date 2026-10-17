package com.revolut.feature.credit.loan.impl.ui.autopay.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanAutopayFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<LoanAutopayFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountDetails.LinkedAccount f70315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f70316b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanAutopayFlowContract$State((AccountDetails.LinkedAccount) parcel.readParcelable(LoanAutopayFlowContract$State.class.getClassLoader()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanAutopayFlowContract$State[i];
        }
    }

    public LoanAutopayFlowContract$State(AccountDetails.LinkedAccount linkedAccount, b bVar) {
        this.f70315a = linkedAccount;
        this.f70316b = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanAutopayFlowContract$State)) {
            return false;
        }
        LoanAutopayFlowContract$State loanAutopayFlowContract$State = (LoanAutopayFlowContract$State) obj2;
        return Intrinsics.f(this.f70315a, loanAutopayFlowContract$State.f70315a) && Intrinsics.f(this.f70316b, loanAutopayFlowContract$State.f70316b);
    }

    public final int hashCode() {
        AccountDetails.LinkedAccount linkedAccount = this.f70315a;
        int iHashCode = (linkedAccount == null ? 0 : linkedAccount.hashCode()) * 31;
        b bVar = this.f70316b;
        return iHashCode + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f70315a, i);
        dest.writeSerializable(this.f70316b);
    }

    public LoanAutopayFlowContract$State() {
        this(null, null);
    }
}
