package com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsScreen;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId;", "Landroid/os/Parcelable;", "FundData", "EeaFundData", "PriceAndVolume", "EeaPriceAndVolume", "BondPriceAndVolume", "PerShareData", "Ratios", "Yield", "Risk", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$BondPriceAndVolume;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$EeaFundData;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$EeaPriceAndVolume;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$FundData;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$PerShareData;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$PriceAndVolume;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$Ratios;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$Risk;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$Yield;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DetailedStatsNavigationId implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatsScreen f103922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f103923c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$BondPriceAndVolume;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondPriceAndVolume extends DetailedStatsNavigationId {
        public static final BondPriceAndVolume d = new BondPriceAndVolume();

        @NotNull
        public static final Parcelable.Creator<BondPriceAndVolume> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondPriceAndVolume.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondPriceAndVolume[i];
            }
        }

        private BondPriceAndVolume() {
            super("BOND_PRICE_AND_VOLUME_ID", StatsScreen.BondPriceAndVolume.f103752a, R$string.wealth_stock_details_stats_price_volume_price);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$EeaFundData;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EeaFundData extends DetailedStatsNavigationId {
        public static final EeaFundData d = new EeaFundData();

        @NotNull
        public static final Parcelable.Creator<EeaFundData> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EeaFundData.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EeaFundData[i];
            }
        }

        private EeaFundData() {
            super("EEA_FUND_DATA_ID", StatsScreen.EeaFundData.f103753a, R$string.wealth_stock_details_stats_fund_data_title);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$EeaPriceAndVolume;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EeaPriceAndVolume extends DetailedStatsNavigationId {
        public static final EeaPriceAndVolume d = new EeaPriceAndVolume();

        @NotNull
        public static final Parcelable.Creator<EeaPriceAndVolume> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EeaPriceAndVolume.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EeaPriceAndVolume[i];
            }
        }

        private EeaPriceAndVolume() {
            super("EEA_PRICE_AND_VOLUME_ID", StatsScreen.EeaPriceAndVolume.f103754a, R$string.wealth_stock_details_stats_price_volume_title);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$FundData;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FundData extends DetailedStatsNavigationId {
        public static final FundData d = new FundData();

        @NotNull
        public static final Parcelable.Creator<FundData> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FundData.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FundData[i];
            }
        }

        private FundData() {
            super("FUND_DATA_ID", StatsScreen.FundData.f103755a, R$string.wealth_stock_details_stats_fund_data_title);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$PerShareData;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PerShareData extends DetailedStatsNavigationId {
        public static final PerShareData d = new PerShareData();

        @NotNull
        public static final Parcelable.Creator<PerShareData> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PerShareData.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PerShareData[i];
            }
        }

        private PerShareData() {
            super("PER_SHARE_DATA", StatsScreen.PerShareData.f103756a, R$string.wealth_stock_details_stats_per_share_title);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$PriceAndVolume;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PriceAndVolume extends DetailedStatsNavigationId {
        public static final PriceAndVolume d = new PriceAndVolume();

        @NotNull
        public static final Parcelable.Creator<PriceAndVolume> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PriceAndVolume.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceAndVolume[i];
            }
        }

        private PriceAndVolume() {
            super("PRICE_AND_VOLUME", StatsScreen.PriceAndVolume.f103757a, R$string.wealth_stock_details_stats_price_volume_title);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$Ratios;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Ratios extends DetailedStatsNavigationId {
        public static final Ratios d = new Ratios();

        @NotNull
        public static final Parcelable.Creator<Ratios> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Ratios.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ratios[i];
            }
        }

        private Ratios() {
            super("RATIOS", StatsScreen.Ratios.f103758a, R$string.wealth_stock_details_stats_ratios_title);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$Risk;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Risk extends DetailedStatsNavigationId {
        public static final Risk d = new Risk();

        @NotNull
        public static final Parcelable.Creator<Risk> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Risk.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Risk[i];
            }
        }

        private Risk() {
            super("RISK", StatsScreen.Risk.f103759a, R$string.trading_bonds_stats_screen_tabs_risk);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId$Yield;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsNavigationId;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Yield extends DetailedStatsNavigationId {
        public static final Yield d = new Yield();

        @NotNull
        public static final Parcelable.Creator<Yield> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Yield.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Yield[i];
            }
        }

        private Yield() {
            super("YIELD", StatsScreen.Yield.f103760a, R$string.trading_bonds_stats_screen_tabs_yield);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public DetailedStatsNavigationId(String str, StatsScreen statsScreen, int i) {
        this.f103921a = str;
        this.f103922b = statsScreen;
        this.f103923c = i;
    }
}
