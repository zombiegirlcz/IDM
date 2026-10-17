package com.revolut.feature.wealth.api.ui.invest.transactions.details.pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/api/ui/invest/transactions/details/pager/InvestTransactionDetailsPagerContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestTransactionDetailsPagerContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvestTransactionDetailsPagerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransaction f95357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestTransactionsFilter f95358b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestTransactionDetailsPagerContract$InputData((InvestTransaction) parcel.readParcelable(InvestTransactionDetailsPagerContract$InputData.class.getClassLoader()), (InvestTransactionsFilter) parcel.readParcelable(InvestTransactionDetailsPagerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestTransactionDetailsPagerContract$InputData[i];
        }
    }

    public InvestTransactionDetailsPagerContract$InputData(InvestTransaction transaction, InvestTransactionsFilter filter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f95357a = transaction;
        this.f95358b = filter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestTransactionDetailsPagerContract$InputData)) {
            return false;
        }
        InvestTransactionDetailsPagerContract$InputData investTransactionDetailsPagerContract$InputData = (InvestTransactionDetailsPagerContract$InputData) obj2;
        return Intrinsics.f(this.f95357a, investTransactionDetailsPagerContract$InputData.f95357a) && Intrinsics.f(this.f95358b, investTransactionDetailsPagerContract$InputData.f95358b);
    }

    public final int hashCode() {
        return this.f95358b.hashCode() + (this.f95357a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95357a, i);
        dest.writeParcelable(this.f95358b, i);
    }
}
