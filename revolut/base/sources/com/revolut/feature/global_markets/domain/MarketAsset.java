package com.revolut.feature.global_markets.domain;

import android.os.Parcel;
import android.os.Parcelable;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/global_markets/domain/MarketAsset;", "Landroid/os/Parcelable;", "<init>", "()V", "Index", "CurrencyPair", "Commodity", "Lcom/revolut/feature/global_markets/domain/MarketAsset$Commodity;", "Lcom/revolut/feature/global_markets/domain/MarketAsset$CurrencyPair;", "Lcom/revolut/feature/global_markets/domain/MarketAsset$Index;", "feature_global_markets_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MarketAsset implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/global_markets/domain/MarketAsset$Commodity;", "Lcom/revolut/feature/global_markets/domain/MarketAsset;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_global_markets_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Commodity extends MarketAsset {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f74568a;

        @NotNull
        public static final Parcelable.Creator<Commodity> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Commodity((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Commodity[i];
            }
        }

        public Commodity(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f74568a = currency;
        }

        @Override // com.revolut.feature.global_markets.domain.MarketAsset
        public final String a() {
            return a.q("Commodity:", this.f74568a.f306286a);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Commodity) && Intrinsics.f(this.f74568a, ((Commodity) obj2).f74568a);
        }

        public final int hashCode() {
            return this.f74568a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74568a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/global_markets/domain/MarketAsset$CurrencyPair;", "Lcom/revolut/feature/global_markets/domain/MarketAsset;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_global_markets_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyPair extends MarketAsset {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f74569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f74570b;

        @NotNull
        public static final Parcelable.Creator<CurrencyPair> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyPair((xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPair[i];
            }
        }

        public CurrencyPair(xi0.b currency, xi0.b baseCurrency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
            this.f74569a = currency;
            this.f74570b = baseCurrency;
        }

        @Override // com.revolut.feature.global_markets.domain.MarketAsset
        public final String a() {
            return p.a.p("CurrencyPair:", this.f74569a.f306286a, this.f74570b.f306286a);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencyPair)) {
                return false;
            }
            CurrencyPair currencyPair = (CurrencyPair) obj2;
            return Intrinsics.f(this.f74569a, currencyPair.f74569a) && Intrinsics.f(this.f74570b, currencyPair.f74570b);
        }

        public final int hashCode() {
            return this.f74570b.hashCode() + (this.f74569a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74569a);
            dest.writeSerializable(this.f74570b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/global_markets/domain/MarketAsset$Index;", "Lcom/revolut/feature/global_markets/domain/MarketAsset;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_global_markets_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Index extends MarketAsset {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f74572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f74573c;

        @NotNull
        public static final Parcelable.Creator<Index> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Index(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Index[i];
            }
        }

        public Index(String str, String symbol, String ref2) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(ref2, "ref");
            this.f74571a = str;
            this.f74572b = symbol;
            this.f74573c = ref2;
        }

        @Override // com.revolut.feature.global_markets.domain.MarketAsset
        public final String a() {
            return a.q("I:", this.f74572b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Index)) {
                return false;
            }
            Index index = (Index) obj2;
            return Intrinsics.f(this.f74571a, index.f74571a) && Intrinsics.f(this.f74572b, index.f74572b) && Intrinsics.f(this.f74573c, index.f74573c);
        }

        public final int hashCode() {
            String str = this.f74571a;
            return this.f74573c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f74572b);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getF74573c() {
            return this.f74573c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74571a);
            dest.writeString(this.f74572b);
            dest.writeString(this.f74573c);
        }
    }

    private MarketAsset() {
    }

    public abstract String a();
}
