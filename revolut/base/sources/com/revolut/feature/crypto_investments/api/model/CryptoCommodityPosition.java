package com.revolut.feature.crypto_investments.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/model/CryptoCommodityPosition;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCommodityPosition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoCommodityPosition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f71379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f71380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f71381c;
    public final ej0.b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoCommodityPosition((b) parcel.readSerializable(), (d) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (ej0.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoCommodityPosition[i];
        }
    }

    public CryptoCommodityPosition(b currency, d investment, DateTime lastTransactionDate, ej0.b averagePrice) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(investment, "investment");
        Intrinsics.checkNotNullParameter(lastTransactionDate, "lastTransactionDate");
        Intrinsics.checkNotNullParameter(averagePrice, "averagePrice");
        this.f71379a = currency;
        this.f71380b = investment;
        this.f71381c = lastTransactionDate;
        this.d = averagePrice;
    }

    public static CryptoCommodityPosition a(CryptoCommodityPosition cryptoCommodityPosition, d investment, ej0.b averagePrice) {
        b currency = cryptoCommodityPosition.f71379a;
        DateTime lastTransactionDate = cryptoCommodityPosition.f71381c;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(investment, "investment");
        Intrinsics.checkNotNullParameter(lastTransactionDate, "lastTransactionDate");
        Intrinsics.checkNotNullParameter(averagePrice, "averagePrice");
        return new CryptoCommodityPosition(currency, investment, lastTransactionDate, averagePrice);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoCommodityPosition)) {
            return false;
        }
        CryptoCommodityPosition cryptoCommodityPosition = (CryptoCommodityPosition) obj2;
        return Intrinsics.f(this.f71379a, cryptoCommodityPosition.f71379a) && Intrinsics.f(this.f71380b, cryptoCommodityPosition.f71380b) && Intrinsics.f(this.f71381c, cryptoCommodityPosition.f71381c) && Intrinsics.f(this.d, cryptoCommodityPosition.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + m72.b.f(this.f71381c, v7.c(this.f71379a.hashCode() * 31, 31, this.f71380b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71379a);
        dest.writeSerializable(this.f71380b);
        dest.writeSerializable(this.f71381c);
        dest.writeSerializable(this.d);
    }
}
