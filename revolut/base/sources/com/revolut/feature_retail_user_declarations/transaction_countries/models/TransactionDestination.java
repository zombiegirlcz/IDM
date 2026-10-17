package com.revolut.feature_retail_user_declarations.transaction_countries.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/transaction_countries/models/TransactionDestination;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionDestination implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransactionDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f97773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f97774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yci.a f97775c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionDestination((b) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : yci.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionDestination[i];
        }
    }

    public TransactionDestination(b country, d dVar, yci.a aVar) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f97773a = country;
        this.f97774b = dVar;
        this.f97775c = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionDestination)) {
            return false;
        }
        TransactionDestination transactionDestination = (TransactionDestination) obj2;
        return Intrinsics.f(this.f97773a, transactionDestination.f97773a) && Intrinsics.f(this.f97774b, transactionDestination.f97774b) && this.f97775c == transactionDestination.f97775c;
    }

    public final int hashCode() {
        int iHashCode = this.f97773a.f297794a.hashCode() * 31;
        d dVar = this.f97774b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        yci.a aVar = this.f97775c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97773a);
        dest.writeSerializable(this.f97774b);
        yci.a aVar = this.f97775c;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
