package com.revolut.feature.currency_pairs.core;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/currency_pairs/core/CryptoExchangePair;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_currency_pairs_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoExchangePair implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f71603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f71604c;

    @NotNull
    public static final Parcelable.Creator<CryptoExchangePair> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoExchangePair(parcel.readString(), (xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangePair[i];
        }
    }

    public CryptoExchangePair(String id10, xi0.b baseCurrency, xi0.b quoteCurrency) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        this.f71602a = id10;
        this.f71603b = baseCurrency;
        this.f71604c = quoteCurrency;
        String str = baseCurrency.f306286a;
        String str2 = quoteCurrency.f306286a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoExchangePair)) {
            return false;
        }
        CryptoExchangePair cryptoExchangePair = (CryptoExchangePair) obj2;
        return Intrinsics.f(this.f71602a, cryptoExchangePair.f71602a) && Intrinsics.f(this.f71603b, cryptoExchangePair.f71603b) && Intrinsics.f(this.f71604c, cryptoExchangePair.f71604c);
    }

    public final int hashCode() {
        return this.f71604c.hashCode() + l.j(this.f71603b, this.f71602a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71602a);
        dest.writeSerializable(this.f71603b);
        dest.writeSerializable(this.f71604c);
    }
}
