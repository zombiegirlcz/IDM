package com.revolut.feature.retail.cfd.impl.ui.providers.invest.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransactionMetadata;
import dfl.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/cfd/impl/ui/providers/invest/transactions/InvestCfdAccountTransactionsContract$Transaction", "Lcom/revolut/feature/wealth/api/domain/model/transactions/InvestTransaction;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestCfdAccountTransactionsContract$Transaction implements InvestTransaction {

    @NotNull
    public static final Parcelable.Creator<InvestCfdAccountTransactionsContract$Transaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f82285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestTransactionMetadata f82286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f82287c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestCfdAccountTransactionsContract$Transaction((i0) parcel.readSerializable(), (InvestTransactionMetadata) parcel.readParcelable(InvestCfdAccountTransactionsContract$Transaction.class.getClassLoader()), (n) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestCfdAccountTransactionsContract$Transaction[i];
        }
    }

    public InvestCfdAccountTransactionsContract$Transaction(i0 trade, InvestTransactionMetadata metadata, n nVar) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f82285a = trade;
        this.f82286b = metadata;
        this.f82287c = nVar;
    }

    @Override // com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction
    /* JADX INFO: renamed from: V1, reason: from getter */
    public final i0 getF82285a() {
        return this.f82285a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestCfdAccountTransactionsContract$Transaction)) {
            return false;
        }
        InvestCfdAccountTransactionsContract$Transaction investCfdAccountTransactionsContract$Transaction = (InvestCfdAccountTransactionsContract$Transaction) obj2;
        return Intrinsics.f(this.f82285a, investCfdAccountTransactionsContract$Transaction.f82285a) && Intrinsics.f(this.f82286b, investCfdAccountTransactionsContract$Transaction.f82286b) && Intrinsics.f(this.f82287c, investCfdAccountTransactionsContract$Transaction.f82287c);
    }

    @Override // com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final InvestTransactionMetadata getF82286b() {
        return this.f82286b;
    }

    public final int hashCode() {
        int iHashCode = (this.f82286b.hashCode() + (this.f82285a.hashCode() * 31)) * 31;
        n nVar = this.f82287c;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f82285a);
        dest.writeParcelable(this.f82286b, i);
        dest.writeSerializable(this.f82287c);
    }
}
