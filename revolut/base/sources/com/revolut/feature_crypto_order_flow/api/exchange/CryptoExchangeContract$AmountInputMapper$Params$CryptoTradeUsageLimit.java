package com.revolut.feature_crypto_order_flow.api.exchange;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ej0.b;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature_crypto_order_flow/api/exchange/CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kyh/a", "feature_crypto_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kyh.a f96680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f96681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f96682c;
    public final d d;
    public final b e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit(kyh.a.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit[i];
        }
    }

    public CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit(kyh.a type, d usage, d limit, d maximumTradeFiatAmount, b maximumTradeAmount) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(usage, "usage");
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(maximumTradeFiatAmount, "maximumTradeFiatAmount");
        Intrinsics.checkNotNullParameter(maximumTradeAmount, "maximumTradeAmount");
        this.f96680a = type;
        this.f96681b = usage;
        this.f96682c = limit;
        this.d = maximumTradeFiatAmount;
        this.e = maximumTradeAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit)) {
            return false;
        }
        CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit = (CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit) obj2;
        return this.f96680a == cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit.f96680a && Intrinsics.f(this.f96681b, cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit.f96681b) && Intrinsics.f(this.f96682c, cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit.f96682c) && Intrinsics.f(this.d, cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit.d) && Intrinsics.f(this.e, cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(v7.c(this.f96680a.hashCode() * 31, 31, this.f96681b), 31, this.f96682c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96680a.name());
        dest.writeSerializable(this.f96681b);
        dest.writeSerializable(this.f96682c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
