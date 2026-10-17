package com.revolut.feature.exchange.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import h30.l;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1.c;
import wd6.e;
import wd6.h;
import wp5.y;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/exchange/models/ExchangeOrderInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeOrderInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExchangeOrderInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f72139c;
    public final e d;
    public final b e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f72140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f72141h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f72142j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExchangeOrderInfo(parcel.readString(), parcel.readString(), h.valueOf(parcel.readString()), e.valueOf(parcel.readString()), (b) parcel.readSerializable(), (b) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readDouble(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangeOrderInfo[i];
        }
    }

    public ExchangeOrderInfo(String id10, String str, h orderType, e exchangeMode, b baseCurrency, b counterCurrency, d amount, double d, long j2, long j3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f72137a = id10;
        this.f72138b = str;
        this.f72139c = orderType;
        this.d = exchangeMode;
        this.e = baseCurrency;
        this.f = counterCurrency;
        this.f72140g = amount;
        this.f72141h = d;
        this.i = j2;
        this.f72142j = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExchangeOrderInfo)) {
            return false;
        }
        ExchangeOrderInfo exchangeOrderInfo = (ExchangeOrderInfo) obj2;
        return Intrinsics.f(this.f72137a, exchangeOrderInfo.f72137a) && Intrinsics.f(this.f72138b, exchangeOrderInfo.f72138b) && this.f72139c == exchangeOrderInfo.f72139c && this.d == exchangeOrderInfo.d && Intrinsics.f(this.e, exchangeOrderInfo.e) && Intrinsics.f(this.f, exchangeOrderInfo.f) && Intrinsics.f(this.f72140g, exchangeOrderInfo.f72140g) && Double.compare(this.f72141h, exchangeOrderInfo.f72141h) == 0 && this.i == exchangeOrderInfo.i && this.f72142j == exchangeOrderInfo.f72142j;
    }

    public final int hashCode() {
        int iHashCode = this.f72137a.hashCode() * 31;
        String str = this.f72138b;
        return Long.hashCode(this.f72142j) + a0.d.c(m72.b.c(v7.c(l.j(this.f, l.j(this.e, y.g(this.d, c.b(this.f72139c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31, this.f72140g), this.f72141h, 31), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72137a);
        dest.writeString(this.f72138b);
        dest.writeString(this.f72139c.name());
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f72140g);
        dest.writeDouble(this.f72141h);
        dest.writeLong(this.i);
        dest.writeLong(this.f72142j);
    }
}
