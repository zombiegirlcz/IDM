package com.revolut.feature.transactions.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k71.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "rhf/d", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionDetailsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TransactionDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f91988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rhf.d f91989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f91990c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            i iVar = (i) parcel.readSerializable();
            rhf.d dVarValueOf = rhf.d.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = com.revolut.data.database.models.openbanking.d.e(TransactionDetailsDestination.class, parcel, linkedHashSet, iE, 1);
            }
            return new TransactionDetailsDestination(iVar, dVarValueOf, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionDetailsDestination[i];
        }
    }

    public TransactionDetailsDestination(i descriptor, rhf.d entryPoint, Set additionalConfig) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(additionalConfig, "additionalConfig");
        this.f91988a = descriptor;
        this.f91989b = entryPoint;
        this.f91990c = additionalConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionDetailsDestination)) {
            return false;
        }
        TransactionDetailsDestination transactionDetailsDestination = (TransactionDetailsDestination) obj2;
        return Intrinsics.f(this.f91988a, transactionDetailsDestination.f91988a) && this.f91989b == transactionDetailsDestination.f91989b && Intrinsics.f(this.f91990c, transactionDetailsDestination.f91990c);
    }

    public final int hashCode() {
        return this.f91990c.hashCode() + ((this.f91989b.hashCode() + (this.f91988a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f91988a);
        dest.writeString(this.f91989b.name());
        Iterator itV = n.v(this.f91990c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }

    public TransactionDetailsDestination(i iVar, rhf.d dVar, int i) {
        this(iVar, (i & 2) != 0 ? rhf.d.OTHER : dVar, h0.f322473a);
    }
}
