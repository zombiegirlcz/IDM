package com.revolut.feature.exchange.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import wd6.e;
import wd6.h;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/exchange/models/ExchangeOrderSpec;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeOrderSpec implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExchangeOrderSpec> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f72143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f72144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f72145c;
    public final e d;
    public final Pair e;
    public final d f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExchangeOrderSpec(h.valueOf(parcel.readString()), parcel.readDouble(), parcel.readDouble(), e.valueOf(parcel.readString()), (Pair) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangeOrderSpec[i];
        }
    }

    public ExchangeOrderSpec(h orderType, double d, double d5, e exchangeMode, Pair currencyPair, d amount) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f72143a = orderType;
        this.f72144b = d;
        this.f72145c = d5;
        this.d = exchangeMode;
        this.e = currencyPair;
        this.f = amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExchangeOrderSpec)) {
            return false;
        }
        ExchangeOrderSpec exchangeOrderSpec = (ExchangeOrderSpec) obj2;
        return this.f72143a == exchangeOrderSpec.f72143a && Double.compare(this.f72144b, exchangeOrderSpec.f72144b) == 0 && Double.compare(this.f72145c, exchangeOrderSpec.f72145c) == 0 && this.d == exchangeOrderSpec.d && Intrinsics.f(this.e, exchangeOrderSpec.e) && Intrinsics.f(this.f, exchangeOrderSpec.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + y.g(this.d, b.c(b.c(this.f72143a.hashCode() * 31, this.f72144b, 31), this.f72145c, 31), 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72143a.name());
        dest.writeDouble(this.f72144b);
        dest.writeDouble(this.f72145c);
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
    }
}
