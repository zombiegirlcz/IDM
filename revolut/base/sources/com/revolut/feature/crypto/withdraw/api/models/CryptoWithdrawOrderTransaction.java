package com.revolut.feature.crypto.withdraw.api.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoWithdrawOrderTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoWithdrawOrderTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoWithdrawOrderTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71103c;
    public final String d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CryptoWithdrawOrderDetails f71104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f71105h;
    public final Long i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoWithdrawOrderTransaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), CryptoWithdrawOrderDetails.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoWithdrawOrderTransaction[i];
        }
    }

    public CryptoWithdrawOrderTransaction(String id10, String type, String state, String currency, long j2, long j3, CryptoWithdrawOrderDetails cryptoWithdrawDetails, long j5, Long l2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(cryptoWithdrawDetails, "cryptoWithdrawDetails");
        this.f71101a = id10;
        this.f71102b = type;
        this.f71103c = state;
        this.d = currency;
        this.e = j2;
        this.f = j3;
        this.f71104g = cryptoWithdrawDetails;
        this.f71105h = j5;
        this.i = l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoWithdrawOrderTransaction)) {
            return false;
        }
        CryptoWithdrawOrderTransaction cryptoWithdrawOrderTransaction = (CryptoWithdrawOrderTransaction) obj2;
        return Intrinsics.f(this.f71101a, cryptoWithdrawOrderTransaction.f71101a) && Intrinsics.f(this.f71102b, cryptoWithdrawOrderTransaction.f71102b) && Intrinsics.f(this.f71103c, cryptoWithdrawOrderTransaction.f71103c) && Intrinsics.f(this.d, cryptoWithdrawOrderTransaction.d) && this.e == cryptoWithdrawOrderTransaction.e && this.f == cryptoWithdrawOrderTransaction.f && Intrinsics.f(this.f71104g, cryptoWithdrawOrderTransaction.f71104g) && this.f71105h == cryptoWithdrawOrderTransaction.f71105h && Intrinsics.f(this.i, cryptoWithdrawOrderTransaction.i);
    }

    public final int hashCode() {
        int iC = d.c((this.f71104g.hashCode() + d.c(d.c(p.a.c(p.a.c(p.a.c(this.f71101a.hashCode() * 31, 31, this.f71102b), 31, this.f71103c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.f71105h);
        Long l2 = this.i;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71101a);
        dest.writeString(this.f71102b);
        dest.writeString(this.f71103c);
        dest.writeString(this.d);
        dest.writeLong(this.e);
        dest.writeLong(this.f);
        this.f71104g.writeToParcel(dest, i);
        dest.writeLong(this.f71105h);
        Long l2 = this.i;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
    }
}
