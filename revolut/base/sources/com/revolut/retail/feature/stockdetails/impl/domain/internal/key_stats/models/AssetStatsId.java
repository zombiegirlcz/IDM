package com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/AssetStatsId;", "Landroid/os/Parcelable;", "Stocks", "Etf", "Bonds", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/AssetStatsId$Bonds;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/AssetStatsId$Etf;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/AssetStatsId$Stocks;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AssetStatsId extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/AssetStatsId$Bonds;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/AssetStatsId;", "", "DAILY_OPEN_PRICE_PRECISE", "DAY_RANGE_PRECISE", "FIFTY_TWO_WEEK_RANGE_PRECISE", "CLEAN_PRICE", "DIRTY_PRICE", "ACCRUED_INTEREST", "CURRENT_YIELD", "YIELD_TO_MATURITY", "DAILY_OPEN", "DAY_RANGE", "FIFTY_TWO_WEEK_RANGE", "MACAULAY_DURATION", "MODIFIED_DURATION", "CONVEXITY", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Bonds implements AssetStatsId {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Bonds[] $VALUES;
        public static final Bonds ACCRUED_INTEREST;
        public static final Bonds CLEAN_PRICE;
        public static final Bonds CONVEXITY;

        @NotNull
        public static final Parcelable.Creator<Bonds> CREATOR;
        public static final Bonds CURRENT_YIELD;
        public static final Bonds DAILY_OPEN;
        public static final Bonds DAILY_OPEN_PRICE_PRECISE;
        public static final Bonds DAY_RANGE;
        public static final Bonds DAY_RANGE_PRECISE;
        public static final Bonds DIRTY_PRICE;
        public static final Bonds FIFTY_TWO_WEEK_RANGE;
        public static final Bonds FIFTY_TWO_WEEK_RANGE_PRECISE;
        public static final Bonds MACAULAY_DURATION;
        public static final Bonds MODIFIED_DURATION;
        public static final Bonds YIELD_TO_MATURITY;

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
            Bonds bonds = new Bonds("DAILY_OPEN_PRICE_PRECISE", 0);
            DAILY_OPEN_PRICE_PRECISE = bonds;
            Bonds bonds2 = new Bonds("DAY_RANGE_PRECISE", 1);
            DAY_RANGE_PRECISE = bonds2;
            Bonds bonds3 = new Bonds("FIFTY_TWO_WEEK_RANGE_PRECISE", 2);
            FIFTY_TWO_WEEK_RANGE_PRECISE = bonds3;
            Bonds bonds4 = new Bonds("CLEAN_PRICE", 3);
            CLEAN_PRICE = bonds4;
            Bonds bonds5 = new Bonds("DIRTY_PRICE", 4);
            DIRTY_PRICE = bonds5;
            Bonds bonds6 = new Bonds("ACCRUED_INTEREST", 5);
            ACCRUED_INTEREST = bonds6;
            Bonds bonds7 = new Bonds("CURRENT_YIELD", 6);
            CURRENT_YIELD = bonds7;
            Bonds bonds8 = new Bonds("YIELD_TO_MATURITY", 7);
            YIELD_TO_MATURITY = bonds8;
            Bonds bonds9 = new Bonds("DAILY_OPEN", 8);
            DAILY_OPEN = bonds9;
            Bonds bonds10 = new Bonds("DAY_RANGE", 9);
            DAY_RANGE = bonds10;
            Bonds bonds11 = new Bonds("FIFTY_TWO_WEEK_RANGE", 10);
            FIFTY_TWO_WEEK_RANGE = bonds11;
            Bonds bonds12 = new Bonds("MACAULAY_DURATION", 11);
            MACAULAY_DURATION = bonds12;
            Bonds bonds13 = new Bonds("MODIFIED_DURATION", 12);
            MODIFIED_DURATION = bonds13;
            Bonds bonds14 = new Bonds("CONVEXITY", 13);
            CONVEXITY = bonds14;
            Bonds[] bondsArr = {bonds, bonds2, bonds3, bonds4, bonds5, bonds6, bonds7, bonds8, bonds9, bonds10, bonds11, bonds12, bonds13, bonds14};
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/AssetStatsId$Etf;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/AssetStatsId;", "", "DAILY_OPEN_PRICE", "DAY_RANGE", "FIFTY_TWO_WEEK_RANGE", "FIVE_YEAR_RANGE", "BETA", "TOTAL_NET_ASSETS", "NET_ASSET_VALUE", "INCOME_DIVIDEND", "DIVIDEND_YIELD", "GROSS_EXPENSE_RATIO", "NET_EXPENSE_RATIO", "TOTAL_EXPENSE_RATIO", "GROSS_MANAGEMENT_FEE", "NET_MANAGEMENT_FEE", "RISK_RATING_SRI", "RISK_RATING_SRRI", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Etf implements AssetStatsId {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Etf[] $VALUES;
        public static final Etf BETA;

        @NotNull
        public static final Parcelable.Creator<Etf> CREATOR;
        public static final Etf DAILY_OPEN_PRICE;
        public static final Etf DAY_RANGE;
        public static final Etf DIVIDEND_YIELD;
        public static final Etf FIFTY_TWO_WEEK_RANGE;
        public static final Etf FIVE_YEAR_RANGE;
        public static final Etf GROSS_EXPENSE_RATIO;
        public static final Etf GROSS_MANAGEMENT_FEE;
        public static final Etf INCOME_DIVIDEND;
        public static final Etf NET_ASSET_VALUE;
        public static final Etf NET_EXPENSE_RATIO;
        public static final Etf NET_MANAGEMENT_FEE;
        public static final Etf RISK_RATING_SRI;
        public static final Etf RISK_RATING_SRRI;
        public static final Etf TOTAL_EXPENSE_RATIO;
        public static final Etf TOTAL_NET_ASSETS;

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
            Etf etf2 = new Etf("DAILY_OPEN_PRICE", 0);
            DAILY_OPEN_PRICE = etf2;
            Etf etf3 = new Etf("DAY_RANGE", 1);
            DAY_RANGE = etf3;
            Etf etf4 = new Etf("FIFTY_TWO_WEEK_RANGE", 2);
            FIFTY_TWO_WEEK_RANGE = etf4;
            Etf etf5 = new Etf("FIVE_YEAR_RANGE", 3);
            FIVE_YEAR_RANGE = etf5;
            Etf etf6 = new Etf("BETA", 4);
            BETA = etf6;
            Etf etf7 = new Etf("TOTAL_NET_ASSETS", 5);
            TOTAL_NET_ASSETS = etf7;
            Etf etf8 = new Etf("NET_ASSET_VALUE", 6);
            NET_ASSET_VALUE = etf8;
            Etf etf9 = new Etf("INCOME_DIVIDEND", 7);
            INCOME_DIVIDEND = etf9;
            Etf etf10 = new Etf("DIVIDEND_YIELD", 8);
            DIVIDEND_YIELD = etf10;
            Etf etf11 = new Etf("GROSS_EXPENSE_RATIO", 9);
            GROSS_EXPENSE_RATIO = etf11;
            Etf etf12 = new Etf("NET_EXPENSE_RATIO", 10);
            NET_EXPENSE_RATIO = etf12;
            Etf etf13 = new Etf("TOTAL_EXPENSE_RATIO", 11);
            TOTAL_EXPENSE_RATIO = etf13;
            Etf etf14 = new Etf("GROSS_MANAGEMENT_FEE", 12);
            GROSS_MANAGEMENT_FEE = etf14;
            Etf etf15 = new Etf("NET_MANAGEMENT_FEE", 13);
            NET_MANAGEMENT_FEE = etf15;
            Etf etf16 = new Etf("RISK_RATING_SRI", 14);
            RISK_RATING_SRI = etf16;
            Etf etf17 = new Etf("RISK_RATING_SRRI", 15);
            RISK_RATING_SRRI = etf17;
            Etf[] etfArr = {etf2, etf3, etf4, etf5, etf6, etf7, etf8, etf9, etf10, etf11, etf12, etf13, etf14, etf15, etf16, etf17};
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001d\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/AssetStatsId$Stocks;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/AssetStatsId;", "", "DAILY_OPEN_PRICE", "DAY_RANGE", "FIFTY_TWO_WEEK_RANGE", "FIVE_YEAR_RANGE", "BETA", "DAY_VOLUME", "AVERAGE_3_MONTH_VOLUME", "MARKET_CAP", "SHARES_OUTSTANDING", "SHARES_FLOAT", "EARNINGS_PER_SHARE_RFY", "SALES_PER_SHARE_RFY", "BOOK_VALUE_PER_SHARE_RFY", "CASH_FLOW_PER_SHARE_RFY", "CASH_PER_SHARE_RFY", "DIVIDEND_YIELD", "DIVIDEND_PER_SHARE_RFY", "PAYOUT_RATIO", "PRICE_TO_EARNINGS_RATIO_RFY", "PRICE_TO_SALES_RATIO_RFY", "PRICE_TO_BOOK_RATIO_RFY", "PRICE_TO_CASH_FLOW_RATIO_RFY", "GROSS_MARGIN_RFY", "OPERATING_MARGIN_RFY", "NET_PROFIT_MARGIN_RFY", "RETURN_ON_EQUITY_RFY", "RETURN_ON_ASSETS_RFY", "RETURN_ON_INVESTMENT_RFY", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Stocks implements AssetStatsId {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Stocks[] $VALUES;
        public static final Stocks AVERAGE_3_MONTH_VOLUME;
        public static final Stocks BETA;
        public static final Stocks BOOK_VALUE_PER_SHARE_RFY;
        public static final Stocks CASH_FLOW_PER_SHARE_RFY;
        public static final Stocks CASH_PER_SHARE_RFY;

        @NotNull
        public static final Parcelable.Creator<Stocks> CREATOR;
        public static final Stocks DAILY_OPEN_PRICE;
        public static final Stocks DAY_RANGE;
        public static final Stocks DAY_VOLUME;
        public static final Stocks DIVIDEND_PER_SHARE_RFY;
        public static final Stocks DIVIDEND_YIELD;
        public static final Stocks EARNINGS_PER_SHARE_RFY;
        public static final Stocks FIFTY_TWO_WEEK_RANGE;
        public static final Stocks FIVE_YEAR_RANGE;
        public static final Stocks GROSS_MARGIN_RFY;
        public static final Stocks MARKET_CAP;
        public static final Stocks NET_PROFIT_MARGIN_RFY;
        public static final Stocks OPERATING_MARGIN_RFY;
        public static final Stocks PAYOUT_RATIO;
        public static final Stocks PRICE_TO_BOOK_RATIO_RFY;
        public static final Stocks PRICE_TO_CASH_FLOW_RATIO_RFY;
        public static final Stocks PRICE_TO_EARNINGS_RATIO_RFY;
        public static final Stocks PRICE_TO_SALES_RATIO_RFY;
        public static final Stocks RETURN_ON_ASSETS_RFY;
        public static final Stocks RETURN_ON_EQUITY_RFY;
        public static final Stocks RETURN_ON_INVESTMENT_RFY;
        public static final Stocks SALES_PER_SHARE_RFY;
        public static final Stocks SHARES_FLOAT;
        public static final Stocks SHARES_OUTSTANDING;

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
            Stocks stocks = new Stocks("DAILY_OPEN_PRICE", 0);
            DAILY_OPEN_PRICE = stocks;
            Stocks stocks2 = new Stocks("DAY_RANGE", 1);
            DAY_RANGE = stocks2;
            Stocks stocks3 = new Stocks("FIFTY_TWO_WEEK_RANGE", 2);
            FIFTY_TWO_WEEK_RANGE = stocks3;
            Stocks stocks4 = new Stocks("FIVE_YEAR_RANGE", 3);
            FIVE_YEAR_RANGE = stocks4;
            Stocks stocks5 = new Stocks("BETA", 4);
            BETA = stocks5;
            Stocks stocks6 = new Stocks("DAY_VOLUME", 5);
            DAY_VOLUME = stocks6;
            Stocks stocks7 = new Stocks("AVERAGE_3_MONTH_VOLUME", 6);
            AVERAGE_3_MONTH_VOLUME = stocks7;
            Stocks stocks8 = new Stocks("MARKET_CAP", 7);
            MARKET_CAP = stocks8;
            Stocks stocks9 = new Stocks("SHARES_OUTSTANDING", 8);
            SHARES_OUTSTANDING = stocks9;
            Stocks stocks10 = new Stocks("SHARES_FLOAT", 9);
            SHARES_FLOAT = stocks10;
            Stocks stocks11 = new Stocks("EARNINGS_PER_SHARE_RFY", 10);
            EARNINGS_PER_SHARE_RFY = stocks11;
            Stocks stocks12 = new Stocks("SALES_PER_SHARE_RFY", 11);
            SALES_PER_SHARE_RFY = stocks12;
            Stocks stocks13 = new Stocks("BOOK_VALUE_PER_SHARE_RFY", 12);
            BOOK_VALUE_PER_SHARE_RFY = stocks13;
            Stocks stocks14 = new Stocks("CASH_FLOW_PER_SHARE_RFY", 13);
            CASH_FLOW_PER_SHARE_RFY = stocks14;
            Stocks stocks15 = new Stocks("CASH_PER_SHARE_RFY", 14);
            CASH_PER_SHARE_RFY = stocks15;
            Stocks stocks16 = new Stocks("DIVIDEND_YIELD", 15);
            DIVIDEND_YIELD = stocks16;
            Stocks stocks17 = new Stocks("DIVIDEND_PER_SHARE_RFY", 16);
            DIVIDEND_PER_SHARE_RFY = stocks17;
            Stocks stocks18 = new Stocks("PAYOUT_RATIO", 17);
            PAYOUT_RATIO = stocks18;
            Stocks stocks19 = new Stocks("PRICE_TO_EARNINGS_RATIO_RFY", 18);
            PRICE_TO_EARNINGS_RATIO_RFY = stocks19;
            Stocks stocks20 = new Stocks("PRICE_TO_SALES_RATIO_RFY", 19);
            PRICE_TO_SALES_RATIO_RFY = stocks20;
            Stocks stocks21 = new Stocks("PRICE_TO_BOOK_RATIO_RFY", 20);
            PRICE_TO_BOOK_RATIO_RFY = stocks21;
            Stocks stocks22 = new Stocks("PRICE_TO_CASH_FLOW_RATIO_RFY", 21);
            PRICE_TO_CASH_FLOW_RATIO_RFY = stocks22;
            Stocks stocks23 = new Stocks("GROSS_MARGIN_RFY", 22);
            GROSS_MARGIN_RFY = stocks23;
            Stocks stocks24 = new Stocks("OPERATING_MARGIN_RFY", 23);
            OPERATING_MARGIN_RFY = stocks24;
            Stocks stocks25 = new Stocks("NET_PROFIT_MARGIN_RFY", 24);
            NET_PROFIT_MARGIN_RFY = stocks25;
            Stocks stocks26 = new Stocks("RETURN_ON_EQUITY_RFY", 25);
            RETURN_ON_EQUITY_RFY = stocks26;
            Stocks stocks27 = new Stocks("RETURN_ON_ASSETS_RFY", 26);
            RETURN_ON_ASSETS_RFY = stocks27;
            Stocks stocks28 = new Stocks("RETURN_ON_INVESTMENT_RFY", 27);
            RETURN_ON_INVESTMENT_RFY = stocks28;
            Stocks[] stocksArr = {stocks, stocks2, stocks3, stocks4, stocks5, stocks6, stocks7, stocks8, stocks9, stocks10, stocks11, stocks12, stocks13, stocks14, stocks15, stocks16, stocks17, stocks18, stocks19, stocks20, stocks21, stocks22, stocks23, stocks24, stocks25, stocks26, stocks27, stocks28};
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
