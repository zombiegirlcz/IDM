package com.revolut.feature.transactions.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.interactors.transactions.TransactionContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/StandardPagerInput;", "Lcom/revolut/feature/transactions/api/navigation/TransactionDetailsPagerInput;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StandardPagerInput implements TransactionDetailsPagerInput {

    @NotNull
    public static final Parcelable.Creator<StandardPagerInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f91980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7 f91981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionContext f91982c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StandardPagerInput((a3) parcel.readSerializable(), (i7) parcel.readSerializable(), (TransactionContext) parcel.readParcelable(StandardPagerInput.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StandardPagerInput[i];
        }
    }

    public StandardPagerInput(a3 selectedTransaction, i7 i7Var, TransactionContext transactionContext) {
        Intrinsics.checkNotNullParameter(selectedTransaction, "selectedTransaction");
        this.f91980a = selectedTransaction;
        this.f91981b = i7Var;
        this.f91982c = transactionContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StandardPagerInput)) {
            return false;
        }
        StandardPagerInput standardPagerInput = (StandardPagerInput) obj2;
        return Intrinsics.f(this.f91980a, standardPagerInput.f91980a) && Intrinsics.f(this.f91981b, standardPagerInput.f91981b) && Intrinsics.f(this.f91982c, standardPagerInput.f91982c);
    }

    public final int hashCode() {
        int iHashCode = this.f91980a.hashCode() * 31;
        i7 i7Var = this.f91981b;
        int iHashCode2 = (iHashCode + (i7Var == null ? 0 : i7Var.hashCode())) * 31;
        TransactionContext transactionContext = this.f91982c;
        return iHashCode2 + (transactionContext != null ? transactionContext.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f91980a);
        dest.writeSerializable(this.f91981b);
        dest.writeParcelable(this.f91982c, i);
    }
}
