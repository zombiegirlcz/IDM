package com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/models/AssetStatsGroup;", "Landroid/os/Parcelable;", "Stocks", "Etf", "Bonds", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/models/AssetStatsGroup$Bonds;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/models/AssetStatsGroup$Etf;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/models/AssetStatsGroup$Stocks;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AssetStatsGroup extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/models/AssetStatsGroup$Bonds;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/models/AssetStatsGroup;", "", "YIELD_RANGE", "YIELD", "PRICE_RANGE", "PRICE", "RISK", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Bonds implements AssetStatsGroup {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Bonds[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<Bonds> CREATOR;
        public static final Bonds PRICE;
        public static final Bonds PRICE_RANGE;
        public static final Bonds RISK;
        public static final Bonds YIELD;
        public static final Bonds YIELD_RANGE;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Bonds.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bonds[i];
            }
        }

        static {
            Bonds bonds = new Bonds("YIELD_RANGE", 0);
            YIELD_RANGE = bonds;
            Bonds bonds2 = new Bonds("YIELD", 1);
            YIELD = bonds2;
            Bonds bonds3 = new Bonds("PRICE_RANGE", 2);
            PRICE_RANGE = bonds3;
            Bonds bonds4 = new Bonds("PRICE", 3);
            PRICE = bonds4;
            Bonds bonds5 = new Bonds("RISK", 4);
            RISK = bonds5;
            Bonds[] bondsArr = {bonds, bonds2, bonds3, bonds4, bonds5};
            $VALUES = bondsArr;
            $ENTRIES = s.n(bondsArr);
            CREATOR = new a();
        }

        public static Bonds valueOf(String str) {
            return (Bonds) Enum.valueOf(Bonds.class, str);
        }

        public static Bonds[] values() {
            return (Bonds[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/models/AssetStatsGroup$Etf;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/models/AssetStatsGroup;", "", "PRICE", "MARKET_CAPITALIZATION", "DIVIDEND", "CHARGES", "RISK_RATING", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Etf implements AssetStatsGroup {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Etf[] $VALUES;
        public static final Etf CHARGES;

        @NotNull
        public static final Parcelable.Creator<Etf> CREATOR;
        public static final Etf DIVIDEND;
        public static final Etf MARKET_CAPITALIZATION;
        public static final Etf PRICE;
        public static final Etf RISK_RATING;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Etf.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Etf[i];
            }
        }

        static {
            Etf etf2 = new Etf("PRICE", 0);
            PRICE = etf2;
            Etf etf3 = new Etf("MARKET_CAPITALIZATION", 1);
            MARKET_CAPITALIZATION = etf3;
            Etf etf4 = new Etf("DIVIDEND", 2);
            DIVIDEND = etf4;
            Etf etf5 = new Etf("CHARGES", 3);
            CHARGES = etf5;
            Etf etf6 = new Etf("RISK_RATING", 4);
            RISK_RATING = etf6;
            Etf[] etfArr = {etf2, etf3, etf4, etf5, etf6};
            $VALUES = etfArr;
            $ENTRIES = s.n(etfArr);
            CREATOR = new a();
        }

        public static Etf valueOf(String str) {
            return (Etf) Enum.valueOf(Etf.class, str);
        }

        public static Etf[] values() {
            return (Etf[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/models/AssetStatsGroup$Stocks;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/models/AssetStatsGroup;", "", "PRICE", "VOLUME", "MARKET_CAP", "PER_SHARE", "DIVIDEND", "VALUATION", "PROFITABILITY", "MANAGEMENT_EFFECTIVENESS", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Stocks implements AssetStatsGroup {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Stocks[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<Stocks> CREATOR;
        public static final Stocks DIVIDEND;
        public static final Stocks MANAGEMENT_EFFECTIVENESS;
        public static final Stocks MARKET_CAP;
        public static final Stocks PER_SHARE;
        public static final Stocks PRICE;
        public static final Stocks PROFITABILITY;
        public static final Stocks VALUATION;
        public static final Stocks VOLUME;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Stocks.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stocks[i];
            }
        }

        static {
            Stocks stocks = new Stocks("PRICE", 0);
            PRICE = stocks;
            Stocks stocks2 = new Stocks("VOLUME", 1);
            VOLUME = stocks2;
            Stocks stocks3 = new Stocks("MARKET_CAP", 2);
            MARKET_CAP = stocks3;
            Stocks stocks4 = new Stocks("PER_SHARE", 3);
            PER_SHARE = stocks4;
            Stocks stocks5 = new Stocks("DIVIDEND", 4);
            DIVIDEND = stocks5;
            Stocks stocks6 = new Stocks("VALUATION", 5);
            VALUATION = stocks6;
            Stocks stocks7 = new Stocks("PROFITABILITY", 6);
            PROFITABILITY = stocks7;
            Stocks stocks8 = new Stocks("MANAGEMENT_EFFECTIVENESS", 7);
            MANAGEMENT_EFFECTIVENESS = stocks8;
            Stocks[] stocksArr = {stocks, stocks2, stocks3, stocks4, stocks5, stocks6, stocks7, stocks8};
            $VALUES = stocksArr;
            $ENTRIES = s.n(stocksArr);
            CREATOR = new a();
        }

        public static Stocks valueOf(String str) {
            return (Stocks) Enum.valueOf(Stocks.class, str);
        }

        public static Stocks[] values() {
            return (Stocks[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }
}
