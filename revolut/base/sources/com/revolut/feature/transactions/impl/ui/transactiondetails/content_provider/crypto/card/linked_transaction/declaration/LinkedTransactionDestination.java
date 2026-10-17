package com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import bof.i;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import do3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rhf.d;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/crypto/card/linked_transaction/declaration/LinkedTransactionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkedTransactionDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<LinkedTransactionDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f92089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f92090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f92091c;
    public final i d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkedTransactionDestination((a3) parcel.readSerializable(), (n) parcel.readSerializable(), d.valueOf(parcel.readString()), i.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkedTransactionDestination[i];
        }
    }

    public LinkedTransactionDestination(a3 transaction, n user, d entrypoint, i useCase) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.f92089a = transaction;
        this.f92090b = user;
        this.f92091c = entrypoint;
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
        if (!(obj2 instanceof LinkedTransactionDestination)) {
            return false;
        }
        LinkedTransactionDestination linkedTransactionDestination = (LinkedTransactionDestination) obj2;
        return Intrinsics.f(this.f92089a, linkedTransactionDestination.f92089a) && Intrinsics.f(this.f92090b, linkedTransactionDestination.f92090b) && this.f92091c == linkedTransactionDestination.f92091c && this.d == linkedTransactionDestination.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f92091c.hashCode() + ((this.f92090b.hashCode() + (this.f92089a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92089a);
        dest.writeSerializable(this.f92090b);
        dest.writeString(this.f92091c.name());
        dest.writeString(this.d.name());
    }
}
