package com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00022\u00020\u0001:\u0015\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0014\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "Landroid/os/Parcelable;", "Companion", "DividendInformation", "Dividends", "ExpenseRatios", "ManagementEfectiveness", "ManagementFees", "MarketCapitalisation", "EeaMarketCapitalisation", "PerShareData", "Price", "EeaPrice", "ProfitabilityRatios", "Valuation", "Volume", "DividendsAndCharges", "PriceRange", "YieldRange", "Yield", "Risk", "RiskRating", "EeaRiskRating", "a", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$DividendInformation;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$Dividends;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$DividendsAndCharges;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$EeaMarketCapitalisation;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$EeaPrice;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$EeaRiskRating;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$ExpenseRatios;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$ManagementEfectiveness;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$ManagementFees;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$MarketCapitalisation;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$PerShareData;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$Price;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$PriceRange;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$ProfitabilityRatios;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$Risk;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$RiskRating;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$Valuation;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$Volume;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$Yield;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$YieldRange;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StatsSection implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f103761a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$DividendInformation;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DividendInformation extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final DividendInformation f103762b = new DividendInformation(true);

        @NotNull
        public static final Parcelable.Creator<DividendInformation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DividendInformation.f103762b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DividendInformation[i];
            }
        }

        private DividendInformation() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$Dividends;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Dividends extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Dividends f103763b = new Dividends(true);

        @NotNull
        public static final Parcelable.Creator<Dividends> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Dividends.f103763b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dividends[i];
            }
        }

        private Dividends() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$DividendsAndCharges;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DividendsAndCharges extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final DividendsAndCharges f103764b = new DividendsAndCharges(true);

        @NotNull
        public static final Parcelable.Creator<DividendsAndCharges> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DividendsAndCharges.f103764b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DividendsAndCharges[i];
            }
        }

        private DividendsAndCharges() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$EeaMarketCapitalisation;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EeaMarketCapitalisation extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EeaMarketCapitalisation f103765b = new EeaMarketCapitalisation(true);

        @NotNull
        public static final Parcelable.Creator<EeaMarketCapitalisation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EeaMarketCapitalisation.f103765b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EeaMarketCapitalisation[i];
            }
        }

        private EeaMarketCapitalisation() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$EeaPrice;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EeaPrice extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EeaPrice f103766b = new EeaPrice(true);

        @NotNull
        public static final Parcelable.Creator<EeaPrice> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EeaPrice.f103766b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EeaPrice[i];
            }
        }

        private EeaPrice() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$EeaRiskRating;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EeaRiskRating extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EeaRiskRating f103767b = new EeaRiskRating(false);

        @NotNull
        public static final Parcelable.Creator<EeaRiskRating> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EeaRiskRating.f103767b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EeaRiskRating[i];
            }
        }

        private EeaRiskRating() {
            super(false);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$ExpenseRatios;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExpenseRatios extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ExpenseRatios f103768b = new ExpenseRatios(true);

        @NotNull
        public static final Parcelable.Creator<ExpenseRatios> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExpenseRatios.f103768b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpenseRatios[i];
            }
        }

        private ExpenseRatios() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$ManagementEfectiveness;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManagementEfectiveness extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ManagementEfectiveness f103769b = new ManagementEfectiveness(true);

        @NotNull
        public static final Parcelable.Creator<ManagementEfectiveness> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManagementEfectiveness.f103769b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManagementEfectiveness[i];
            }
        }

        private ManagementEfectiveness() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$ManagementFees;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManagementFees extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ManagementFees f103770b = new ManagementFees(true);

        @NotNull
        public static final Parcelable.Creator<ManagementFees> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManagementFees.f103770b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManagementFees[i];
            }
        }

        private ManagementFees() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$MarketCapitalisation;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MarketCapitalisation extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final MarketCapitalisation f103771b = new MarketCapitalisation(true);

        @NotNull
        public static final Parcelable.Creator<MarketCapitalisation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MarketCapitalisation.f103771b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarketCapitalisation[i];
            }
        }

        private MarketCapitalisation() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$PerShareData;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PerShareData extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PerShareData f103772b = new PerShareData(true);

        @NotNull
        public static final Parcelable.Creator<PerShareData> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PerShareData.f103772b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PerShareData[i];
            }
        }

        private PerShareData() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$Price;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Price extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Price f103773b = new Price(true);

        @NotNull
        public static final Parcelable.Creator<Price> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Price.f103773b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Price[i];
            }
        }

        private Price() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$PriceRange;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PriceRange extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PriceRange f103774b = new PriceRange(true);

        @NotNull
        public static final Parcelable.Creator<PriceRange> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PriceRange.f103774b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceRange[i];
            }
        }

        private PriceRange() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$ProfitabilityRatios;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProfitabilityRatios extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ProfitabilityRatios f103775b = new ProfitabilityRatios(true);

        @NotNull
        public static final Parcelable.Creator<ProfitabilityRatios> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProfitabilityRatios.f103775b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProfitabilityRatios[i];
            }
        }

        private ProfitabilityRatios() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$Risk;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Risk extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Risk f103776b = new Risk(true);

        @NotNull
        public static final Parcelable.Creator<Risk> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Risk.f103776b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Risk[i];
            }
        }

        private Risk() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$RiskRating;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RiskRating extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RiskRating f103777b = new RiskRating(false);

        @NotNull
        public static final Parcelable.Creator<RiskRating> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RiskRating.f103777b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskRating[i];
            }
        }

        private RiskRating() {
            super(false);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$Valuation;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Valuation extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Valuation f103778b = new Valuation(true);

        @NotNull
        public static final Parcelable.Creator<Valuation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Valuation.f103778b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Valuation[i];
            }
        }

        private Valuation() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$Volume;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Volume extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Volume f103779b = new Volume(true);

        @NotNull
        public static final Parcelable.Creator<Volume> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Volume.f103779b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Volume[i];
            }
        }

        private Volume() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$Yield;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Yield extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Yield f103780b = new Yield(true);

        @NotNull
        public static final Parcelable.Creator<Yield> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Yield.f103780b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Yield[i];
            }
        }

        private Yield() {
            super(true);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection$YieldRange;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsSection;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class YieldRange extends StatsSection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final YieldRange f103781b = new YieldRange(true);

        @NotNull
        public static final Parcelable.Creator<YieldRange> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return YieldRange.f103781b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new YieldRange[i];
            }
        }

        private YieldRange() {
            super(true);
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

    public StatsSection(boolean z) {
        this.f103761a = z;
    }
}
