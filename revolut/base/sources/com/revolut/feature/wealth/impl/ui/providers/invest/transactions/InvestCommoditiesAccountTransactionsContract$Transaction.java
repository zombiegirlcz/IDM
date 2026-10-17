package com.revolut.feature.wealth.impl.ui.providers.invest.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransactionMetadata;
import dfl.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/impl/ui/providers/invest/transactions/InvestCommoditiesAccountTransactionsContract$Transaction", "Lcom/revolut/feature/wealth/api/domain/model/transactions/InvestTransaction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestCommoditiesAccountTransactionsContract$Transaction implements InvestTransaction {

    @NotNull
    public static final Parcelable.Creator<InvestCommoditiesAccountTransactionsContract$Transaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f95577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestTransactionMetadata f95578b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestCommoditiesAccountTransactionsContract$Transaction((i0) parcel.readSerializable(), (InvestTransactionMetadata) parcel.readParcelable(InvestCommoditiesAccountTransactionsContract$Transaction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestCommoditiesAccountTransactionsContract$Transaction[i];
        }
    }

    public InvestCommoditiesAccountTransactionsContract$Transaction(i0 trade, InvestTransactionMetadata metadata) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f95577a = trade;
        this.f95578b = metadata;
    }

    @Override // com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction
    /* JADX INFO: renamed from: V1, reason: from getter */
    public final i0 getF95577a() {
        return this.f95577a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestCommoditiesAccountTransactionsContract$Transaction)) {
            return false;
        }
        InvestCommoditiesAccountTransactionsContract$Transaction investCommoditiesAccountTransactionsContract$Transaction = (InvestCommoditiesAccountTransactionsContract$Transaction) obj2;
        return Intrinsics.f(this.f95577a, investCommoditiesAccountTransactionsContract$Transaction.f95577a) && Intrinsics.f(this.f95578b, investCommoditiesAccountTransactionsContract$Transaction.f95578b);
    }

    @Override // com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final InvestTransactionMetadata getF95578b() {
        return this.f95578b;
    }

    public final int hashCode() {
        return this.f95578b.hashCode() + (this.f95577a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95577a);
        dest.writeParcelable(this.f95578b, i);
    }
}
