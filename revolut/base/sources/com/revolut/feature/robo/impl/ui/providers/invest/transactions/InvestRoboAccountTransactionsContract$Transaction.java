package com.revolut.feature.robo.impl.ui.providers.invest.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.robo.api.ui.providers.models.RoboTransaction;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransactionMetadata;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import dfl.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/robo/impl/ui/providers/invest/transactions/InvestRoboAccountTransactionsContract$Transaction", "Lcom/revolut/feature/wealth/api/domain/model/transactions/InvestTransaction;", "", "toString", "()Ljava/lang/String;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestRoboAccountTransactionsContract$Transaction implements InvestTransaction {

    @NotNull
    public static final Parcelable.Creator<InvestRoboAccountTransactionsContract$Transaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f85125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestTransactionMetadata f85126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RoboTransaction f85127c;
    public final RoboPortfolioInfo d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestRoboAccountTransactionsContract$Transaction((i0) parcel.readSerializable(), (InvestTransactionMetadata) parcel.readParcelable(InvestRoboAccountTransactionsContract$Transaction.class.getClassLoader()), (RoboTransaction) parcel.readParcelable(InvestRoboAccountTransactionsContract$Transaction.class.getClassLoader()), (RoboPortfolioInfo) parcel.readParcelable(InvestRoboAccountTransactionsContract$Transaction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestRoboAccountTransactionsContract$Transaction[i];
        }
    }

    public InvestRoboAccountTransactionsContract$Transaction(i0 trade, InvestTransactionMetadata metadata, RoboTransaction roboTransaction, RoboPortfolioInfo roboPortfolioInfo) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(roboTransaction, "roboTransaction");
        Intrinsics.checkNotNullParameter(roboPortfolioInfo, "roboPortfolioInfo");
        this.f85125a = trade;
        this.f85126b = metadata;
        this.f85127c = roboTransaction;
        this.d = roboPortfolioInfo;
    }

    @Override // com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction
    /* JADX INFO: renamed from: V1, reason: from getter */
    public final i0 getF85125a() {
        return this.f85125a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestRoboAccountTransactionsContract$Transaction)) {
            return false;
        }
        InvestRoboAccountTransactionsContract$Transaction investRoboAccountTransactionsContract$Transaction = (InvestRoboAccountTransactionsContract$Transaction) obj2;
        return Intrinsics.f(this.f85125a, investRoboAccountTransactionsContract$Transaction.f85125a) && Intrinsics.f(this.f85126b, investRoboAccountTransactionsContract$Transaction.f85126b) && Intrinsics.f(this.f85127c, investRoboAccountTransactionsContract$Transaction.f85127c) && Intrinsics.f(this.d, investRoboAccountTransactionsContract$Transaction.d);
    }

    @Override // com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final InvestTransactionMetadata getF85126b() {
        return this.f85126b;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f85127c.hashCode() + ((this.f85126b.hashCode() + (this.f85125a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f85125a);
        dest.writeParcelable(this.f85126b, i);
        dest.writeParcelable(this.f85127c, i);
        dest.writeParcelable(this.d, i);
    }
}
