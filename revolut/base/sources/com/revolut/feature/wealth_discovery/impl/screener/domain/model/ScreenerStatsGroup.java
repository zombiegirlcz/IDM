package com.revolut.feature.wealth_discovery.impl.screener.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerStatsGroup;", "Landroid/os/Parcelable;", "Stocks", "ETP", "CFD", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerStatsGroup$CFD;", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerStatsGroup$ETP;", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerStatsGroup$Stocks;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ScreenerStatsGroup extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerStatsGroup$CFD;", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerStatsGroup;", "", "PRICE_MOVEMENTS", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CFD implements ScreenerStatsGroup {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CFD[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<CFD> CREATOR;
        public static final CFD PRICE_MOVEMENTS;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return CFD.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CFD[i];
            }
        }

        static {
            CFD cfd2 = new CFD("PRICE_MOVEMENTS", 0);
            PRICE_MOVEMENTS = cfd2;
            CFD[] cfdArr = {cfd2};
            $VALUES = cfdArr;
            $ENTRIES = s.n(cfdArr);
            CREATOR = new a();
        }

        public static CFD valueOf(String str) {
            return (CFD) Enum.valueOf(CFD.class, str);
        }

        public static CFD[] values() {
            return (CFD[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerStatsGroup$ETP;", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerStatsGroup;", "", "PERFORMANCE", "DIVIDEND_INFO", "TECHNICAL_METRICS", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ETP implements ScreenerStatsGroup {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ETP[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<ETP> CREATOR;
        public static final ETP DIVIDEND_INFO;
        public static final ETP PERFORMANCE;
        public static final ETP TECHNICAL_METRICS;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ETP.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ETP[i];
            }
        }

        static {
            ETP etp = new ETP("PERFORMANCE", 0);
            PERFORMANCE = etp;
            ETP etp2 = new ETP("DIVIDEND_INFO", 1);
            DIVIDEND_INFO = etp2;
            ETP etp3 = new ETP("TECHNICAL_METRICS", 2);
            TECHNICAL_METRICS = etp3;
            ETP[] etpArr = {etp, etp2, etp3};
            $VALUES = etpArr;
            $ENTRIES = s.n(etpArr);
            CREATOR = new a();
        }

        public static ETP valueOf(String str) {
            return (ETP) Enum.valueOf(ETP.class, str);
        }

        public static ETP[] values() {
            return (ETP[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerStatsGroup$Stocks;", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerStatsGroup;", "", "VALUATION", "GROWTH", "PROFITABILITY", "DIVIDEND_INFORMATION", "LIQUIDITY", "ANALYST_METRICS", "TECHNICAL_METRICS", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Stocks implements ScreenerStatsGroup {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Stocks[] $VALUES;
        public static final Stocks ANALYST_METRICS;

        @NotNull
        public static final Parcelable.Creator<Stocks> CREATOR;
        public static final Stocks DIVIDEND_INFORMATION;
        public static final Stocks GROWTH;
        public static final Stocks LIQUIDITY;
        public static final Stocks PROFITABILITY;
        public static final Stocks TECHNICAL_METRICS;
        public static final Stocks VALUATION;

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
            Stocks stocks = new Stocks("VALUATION", 0);
            VALUATION = stocks;
            Stocks stocks2 = new Stocks("GROWTH", 1);
            GROWTH = stocks2;
            Stocks stocks3 = new Stocks("PROFITABILITY", 2);
            PROFITABILITY = stocks3;
            Stocks stocks4 = new Stocks("DIVIDEND_INFORMATION", 3);
            DIVIDEND_INFORMATION = stocks4;
            Stocks stocks5 = new Stocks("LIQUIDITY", 4);
            LIQUIDITY = stocks5;
            Stocks stocks6 = new Stocks("ANALYST_METRICS", 5);
            ANALYST_METRICS = stocks6;
            Stocks stocks7 = new Stocks("TECHNICAL_METRICS", 6);
            TECHNICAL_METRICS = stocks7;
            Stocks[] stocksArr = {stocks, stocks2, stocks3, stocks4, stocks5, stocks6, stocks7};
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
