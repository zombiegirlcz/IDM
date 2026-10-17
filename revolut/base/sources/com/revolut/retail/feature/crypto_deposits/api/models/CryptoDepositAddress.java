package com.revolut.retail.feature.crypto_deposits.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wk5.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/api/models/CryptoDepositAddress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_crypto_deposits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoDepositAddress implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100039c;
    public final a d;
    public final boolean e;

    @NotNull
    public static final Parcelable.Creator<CryptoDepositAddress> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoDepositAddress(parcel.readString(), parcel.readString(), parcel.readString(), a.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoDepositAddress[i];
        }
    }

    public CryptoDepositAddress(String pocketId, String address, String str, a blockchain, boolean z) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        this.f100037a = pocketId;
        this.f100038b = address;
        this.f100039c = str;
        this.d = blockchain;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoDepositAddress)) {
            return false;
        }
        CryptoDepositAddress cryptoDepositAddress = (CryptoDepositAddress) obj2;
        return Intrinsics.f(this.f100037a, cryptoDepositAddress.f100037a) && Intrinsics.f(this.f100038b, cryptoDepositAddress.f100038b) && Intrinsics.f(this.f100039c, cryptoDepositAddress.f100039c) && this.d == cryptoDepositAddress.d && this.e == cryptoDepositAddress.e;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f100037a.hashCode() * 31, 31, this.f100038b);
        String str = this.f100039c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100037a);
        dest.writeString(this.f100038b);
        dest.writeString(this.f100039c);
        dest.writeString(this.d.name());
        dest.writeInt(this.e ? 1 : 0);
    }
}
