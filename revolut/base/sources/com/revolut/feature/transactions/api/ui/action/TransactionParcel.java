package com.revolut.feature.transactions.api.ui.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.interactors.transactions.TransactionContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.i7;
import uhf.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/ui/action/TransactionParcel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransactionParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f92025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i7 f92027c;
    public final TransactionContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            a3 a3Var = (a3) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(c.valueOf(parcel.readString()));
            }
            return new TransactionParcel(a3Var, arrayList, (i7) parcel.readSerializable(), (TransactionContext) parcel.readParcelable(TransactionParcel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionParcel[i];
        }
    }

    public TransactionParcel(a3 transaction, List actions, i7 i7Var, TransactionContext transactionContext) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f92025a = transaction;
        this.f92026b = actions;
        this.f92027c = i7Var;
        this.d = transactionContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionParcel)) {
            return false;
        }
        TransactionParcel transactionParcel = (TransactionParcel) obj2;
        return Intrinsics.f(this.f92025a, transactionParcel.f92025a) && Intrinsics.f(this.f92026b, transactionParcel.f92026b) && Intrinsics.f(this.f92027c, transactionParcel.f92027c) && Intrinsics.f(this.d, transactionParcel.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f92025a.hashCode() * 31, 31, this.f92026b);
        i7 i7Var = this.f92027c;
        int iHashCode = (iD + (i7Var == null ? 0 : i7Var.hashCode())) * 31;
        TransactionContext transactionContext = this.d;
        return iHashCode + (transactionContext != null ? transactionContext.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92025a);
        Iterator itV = p.a.v(this.f92026b, dest);
        while (itV.hasNext()) {
            dest.writeString(((c) itV.next()).name());
        }
        dest.writeSerializable(this.f92027c);
        dest.writeParcelable(this.d, i);
    }
}
