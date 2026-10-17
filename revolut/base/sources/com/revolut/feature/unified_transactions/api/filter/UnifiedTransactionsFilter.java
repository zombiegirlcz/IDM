package com.revolut.feature.unified_transactions.api.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transactions.api.filter.TransactionsFilterWithContext;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/unified_transactions/api/filter/UnifiedTransactionsFilter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_unified_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UnifiedTransactionsFilter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifiedTransactionsFilter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsFilterWithContext f94567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestTransactionsFilter f94568b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnifiedTransactionsFilter((TransactionsFilterWithContext) parcel.readParcelable(UnifiedTransactionsFilter.class.getClassLoader()), (InvestTransactionsFilter) parcel.readParcelable(UnifiedTransactionsFilter.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UnifiedTransactionsFilter[i];
        }
    }

    public UnifiedTransactionsFilter() {
        this((TransactionsFilterWithContext) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UnifiedTransactionsFilter)) {
            return false;
        }
        UnifiedTransactionsFilter unifiedTransactionsFilter = (UnifiedTransactionsFilter) obj2;
        return Intrinsics.f(this.f94567a, unifiedTransactionsFilter.f94567a) && Intrinsics.f(this.f94568b, unifiedTransactionsFilter.f94568b);
    }

    public final int hashCode() {
        TransactionsFilterWithContext transactionsFilterWithContext = this.f94567a;
        int iHashCode = (transactionsFilterWithContext == null ? 0 : transactionsFilterWithContext.hashCode()) * 31;
        InvestTransactionsFilter investTransactionsFilter = this.f94568b;
        return iHashCode + (investTransactionsFilter != null ? investTransactionsFilter.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94567a, i);
        dest.writeParcelable(this.f94568b, i);
    }

    public UnifiedTransactionsFilter(TransactionsFilterWithContext transactionsFilterWithContext, InvestTransactionsFilter investTransactionsFilter) {
        this.f94567a = transactionsFilterWithContext;
        this.f94568b = investTransactionsFilter;
    }

    public /* synthetic */ UnifiedTransactionsFilter(TransactionsFilterWithContext transactionsFilterWithContext, int i) {
        this((i & 1) != 0 ? null : transactionsFilterWithContext, (InvestTransactionsFilter) null);
    }
}
