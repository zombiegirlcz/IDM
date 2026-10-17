package com.revolut.feature.transactions.api.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.interactors.transactions.TransactionContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/filter/TransactionsFilterWithContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionsFilterWithContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransactionsFilterWithContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f91956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionContext f91957b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionsFilterWithContext((i7) parcel.readSerializable(), (TransactionContext) parcel.readParcelable(TransactionsFilterWithContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionsFilterWithContext[i];
        }
    }

    public TransactionsFilterWithContext(i7 filter, TransactionContext context) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f91956a = filter;
        this.f91957b = context;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionsFilterWithContext)) {
            return false;
        }
        TransactionsFilterWithContext transactionsFilterWithContext = (TransactionsFilterWithContext) obj2;
        return Intrinsics.f(this.f91956a, transactionsFilterWithContext.f91956a) && Intrinsics.f(this.f91957b, transactionsFilterWithContext.f91957b);
    }

    public final int hashCode() {
        return this.f91957b.hashCode() + (this.f91956a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f91956a);
        dest.writeParcelable(this.f91957b, i);
    }
}
