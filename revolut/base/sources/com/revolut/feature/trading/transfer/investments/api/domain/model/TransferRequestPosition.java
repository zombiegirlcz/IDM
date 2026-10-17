package com.revolut.feature.trading.transfer.investments.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import ej0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferRequestPosition;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferRequestPosition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferRequestPosition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91527c;
    public final int d;
    public final b e;
    public final Boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            b bVar = (b) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TransferRequestPosition(string, string2, string3, i, bVar, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferRequestPosition[i];
        }
    }

    public TransferRequestPosition(String ref2, String name, String symbol, int i, b bVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f91525a = ref2;
        this.f91526b = name;
        this.f91527c = symbol;
        this.d = i;
        this.e = bVar;
        this.f = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferRequestPosition)) {
            return false;
        }
        TransferRequestPosition transferRequestPosition = (TransferRequestPosition) obj2;
        return Intrinsics.f(this.f91525a, transferRequestPosition.f91525a) && Intrinsics.f(this.f91526b, transferRequestPosition.f91526b) && Intrinsics.f(this.f91527c, transferRequestPosition.f91527c) && this.d == transferRequestPosition.d && Intrinsics.f(this.e, transferRequestPosition.e) && Intrinsics.f(this.f, transferRequestPosition.f);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, p.a.c(p.a.c(this.f91525a.hashCode() * 31, 31, this.f91526b), 31, this.f91527c), 31);
        b bVar = this.e;
        int iHashCode = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91525a);
        dest.writeString(this.f91526b);
        dest.writeString(this.f91527c);
        dest.writeInt(this.d);
        dest.writeSerializable(this.e);
        Boolean bool = this.f;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
