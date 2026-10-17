package com.revolut.feature.currency_pairs.core;

import android.os.Parcel;
import android.os.Parcelable;
import bz5.c;
import bz5.d;
import h30.l;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/currency_pairs/core/CurrencyPairConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_currency_pairs_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrencyPairConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f71606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f71607c;
    public final long d;
    public final int e;
    public final double f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f71608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f71609h;
    public final double i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xi0.b f71610j;
    public final double k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f71611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f71612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f71613n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f71614p;

    @NotNull
    public static final Parcelable.Creator<CurrencyPairConfig> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencyPairConfig(parcel.readString(), (xi0.b) parcel.readSerializable(), parcel.readDouble(), parcel.readLong(), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), (xi0.b) parcel.readSerializable(), parcel.readDouble(), parcel.readInt(), d.valueOf(parcel.readString()), c.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CurrencyPairConfig[i];
        }
    }

    public CurrencyPairConfig(String id10, xi0.b baseCurrency, double d, long j2, int i, double d5, double d6, double d10, double d15, xi0.b quoteCurrency, double d41, int i2, d type, c status, int i3, Integer num) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f71605a = id10;
        this.f71606b = baseCurrency;
        this.f71607c = d;
        this.d = j2;
        this.e = i;
        this.f = d5;
        this.f71608g = d6;
        this.f71609h = d10;
        this.i = d15;
        this.f71610j = quoteCurrency;
        this.k = d41;
        this.f71611l = i2;
        this.f71612m = type;
        this.f71613n = status;
        this.o = i3;
        this.f71614p = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CurrencyPairConfig)) {
            return false;
        }
        CurrencyPairConfig currencyPairConfig = (CurrencyPairConfig) obj2;
        return Intrinsics.f(this.f71605a, currencyPairConfig.f71605a) && Intrinsics.f(this.f71606b, currencyPairConfig.f71606b) && Double.compare(this.f71607c, currencyPairConfig.f71607c) == 0 && this.d == currencyPairConfig.d && this.e == currencyPairConfig.e && Double.compare(this.f, currencyPairConfig.f) == 0 && Double.compare(this.f71608g, currencyPairConfig.f71608g) == 0 && Double.compare(this.f71609h, currencyPairConfig.f71609h) == 0 && Double.compare(this.i, currencyPairConfig.i) == 0 && Intrinsics.f(this.f71610j, currencyPairConfig.f71610j) && Double.compare(this.k, currencyPairConfig.k) == 0 && this.f71611l == currencyPairConfig.f71611l && this.f71612m == currencyPairConfig.f71612m && this.f71613n == currencyPairConfig.f71613n && this.o == currencyPairConfig.o && Intrinsics.f(this.f71614p, currencyPairConfig.f71614p);
    }

    public final int hashCode() {
        int iB = a.b(this.o, (this.f71613n.hashCode() + ((this.f71612m.hashCode() + a.b(this.f71611l, m72.b.c(l.j(this.f71610j, m72.b.c(m72.b.c(m72.b.c(m72.b.c(a.b(this.e, a0.d.c(m72.b.c(l.j(this.f71606b, this.f71605a.hashCode() * 31, 31), this.f71607c, 31), 31, this.d), 31), this.f, 31), this.f71608g, 31), this.f71609h, 31), this.i, 31), 31), this.k, 31), 31)) * 31)) * 31, 31);
        Integer num = this.f71614p;
        return iB + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71605a);
        dest.writeSerializable(this.f71606b);
        dest.writeDouble(this.f71607c);
        dest.writeLong(this.d);
        dest.writeInt(this.e);
        dest.writeDouble(this.f);
        dest.writeDouble(this.f71608g);
        dest.writeDouble(this.f71609h);
        dest.writeDouble(this.i);
        dest.writeSerializable(this.f71610j);
        dest.writeDouble(this.k);
        dest.writeInt(this.f71611l);
        dest.writeString(this.f71612m.name());
        dest.writeString(this.f71613n.name());
        dest.writeInt(this.o);
        Integer num = this.f71614p;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
