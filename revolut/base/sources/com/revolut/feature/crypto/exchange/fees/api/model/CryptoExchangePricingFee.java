package com.revolut.feature.crypto.exchange.fees.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/api/model/CryptoExchangePricingFee;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_exchange_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoExchangePricingFee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoExchangePricingFee> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f70817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f70818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f70819c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoExchangePricingFee((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangePricingFee[i];
        }
    }

    public CryptoExchangePricingFee(d from, d dVar, double d) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f70817a = from;
        this.f70818b = dVar;
        this.f70819c = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoExchangePricingFee)) {
            return false;
        }
        CryptoExchangePricingFee cryptoExchangePricingFee = (CryptoExchangePricingFee) obj2;
        return Intrinsics.f(this.f70817a, cryptoExchangePricingFee.f70817a) && Intrinsics.f(this.f70818b, cryptoExchangePricingFee.f70818b) && Double.compare(this.f70819c, cryptoExchangePricingFee.f70819c) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.f70817a.hashCode() * 31;
        d dVar = this.f70818b;
        return Double.hashCode(this.f70819c) + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70817a);
        dest.writeSerializable(this.f70818b);
        dest.writeDouble(this.f70819c);
    }
}
