package com.revolut.feature.transactions.impl.ui.kompot.details.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k71.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rhf.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transactions/impl/ui/kompot/details/screen/TransactionDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f92057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f92058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f92059c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            i iVar = (i) parcel.readSerializable();
            d dVarValueOf = d.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = com.revolut.data.database.models.openbanking.d.e(TransactionDetailsScreenContract$InputData.class, parcel, linkedHashSet, iE, 1);
            }
            return new TransactionDetailsScreenContract$InputData(iVar, dVarValueOf, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionDetailsScreenContract$InputData[i];
        }
    }

    public TransactionDetailsScreenContract$InputData(i descriptor, d entryPoint, Set additionalConfig) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(additionalConfig, "additionalConfig");
        this.f92057a = descriptor;
        this.f92058b = entryPoint;
        this.f92059c = additionalConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionDetailsScreenContract$InputData)) {
            return false;
        }
        TransactionDetailsScreenContract$InputData transactionDetailsScreenContract$InputData = (TransactionDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f92057a, transactionDetailsScreenContract$InputData.f92057a) && this.f92058b == transactionDetailsScreenContract$InputData.f92058b && Intrinsics.f(this.f92059c, transactionDetailsScreenContract$InputData.f92059c);
    }

    public final int hashCode() {
        return this.f92059c.hashCode() + ((this.f92058b.hashCode() + (this.f92057a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92057a);
        dest.writeString(this.f92058b.name());
        Iterator itV = n.v(this.f92059c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
