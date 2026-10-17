package com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction;

import android.os.Parcel;
import android.os.Parcelable;
import bof.i;
import com.revolut.kompot.common.IOData$Input;
import do3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rhf.d;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/crypto/card/linked_transaction/LinkedTransactionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkedTransactionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LinkedTransactionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f92086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f92087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f92088c;
    public final i d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkedTransactionScreenContract$InputData((a3) parcel.readSerializable(), (n) parcel.readSerializable(), d.valueOf(parcel.readString()), i.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkedTransactionScreenContract$InputData[i];
        }
    }

    public LinkedTransactionScreenContract$InputData(a3 transaction, n user, d entrypoint, i useCase) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.f92086a = transaction;
        this.f92087b = user;
        this.f92088c = entrypoint;
        this.d = useCase;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkedTransactionScreenContract$InputData)) {
            return false;
        }
        LinkedTransactionScreenContract$InputData linkedTransactionScreenContract$InputData = (LinkedTransactionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f92086a, linkedTransactionScreenContract$InputData.f92086a) && Intrinsics.f(this.f92087b, linkedTransactionScreenContract$InputData.f92087b) && this.f92088c == linkedTransactionScreenContract$InputData.f92088c && this.d == linkedTransactionScreenContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f92088c.hashCode() + ((this.f92087b.hashCode() + (this.f92086a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92086a);
        dest.writeSerializable(this.f92087b);
        dest.writeString(this.f92088c.name());
        dest.writeString(this.d.name());
    }
}
