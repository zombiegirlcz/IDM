package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric;", "Landroid/os/Parcelable;", "<init>", "()V", "SharpeRatio", "MaxDrawdown", "AverageAnnualReturnBreakdown", "ProductFeeRange", "RiskLevel", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric$AverageAnnualReturnBreakdown;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric$MaxDrawdown;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric$RiskLevel;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric$SharpeRatio;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PortfolioInsightPerformanceMetric implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric$AverageAnnualReturnBreakdown;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AverageAnnualReturnBreakdown extends PortfolioInsightPerformanceMetric {

        @NotNull
        public static final Parcelable.Creator<AverageAnnualReturnBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f91400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ProductFeeRange f91401c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AverageAnnualReturnBreakdown((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : ProductFeeRange.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AverageAnnualReturnBreakdown[i];
            }
        }

        public AverageAnnualReturnBreakdown(BigDecimal averageGrossReturn, BigDecimal fees, ProductFeeRange productFeeRange) {
            Intrinsics.checkNotNullParameter(averageGrossReturn, "averageGrossReturn");
            Intrinsics.checkNotNullParameter(fees, "fees");
            this.f91399a = averageGrossReturn;
            this.f91400b = fees;
            this.f91401c = productFeeRange;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AverageAnnualReturnBreakdown)) {
                return false;
            }
            AverageAnnualReturnBreakdown averageAnnualReturnBreakdown = (AverageAnnualReturnBreakdown) obj2;
            return Intrinsics.f(this.f91399a, averageAnnualReturnBreakdown.f91399a) && Intrinsics.f(this.f91400b, averageAnnualReturnBreakdown.f91400b) && Intrinsics.f(this.f91401c, averageAnnualReturnBreakdown.f91401c);
        }

        public final int hashCode() {
            int iD = t61.a.d(this.f91400b, this.f91399a.hashCode() * 31, 31);
            ProductFeeRange productFeeRange = this.f91401c;
            return iD + (productFeeRange == null ? 0 : productFeeRange.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91399a);
            dest.writeSerializable(this.f91400b);
            ProductFeeRange productFeeRange = this.f91401c;
            if (productFeeRange == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                productFeeRange.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric$MaxDrawdown;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MaxDrawdown extends PortfolioInsightPerformanceMetric {

        @NotNull
        public static final Parcelable.Creator<MaxDrawdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f91403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigDecimal f91404c;
        public final BigDecimal d;
        public final Integer e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MaxDrawdown((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MaxDrawdown[i];
            }
        }

        public MaxDrawdown(BigDecimal maximumDrawdown, BigDecimal averageDrawdown, BigDecimal bigDecimal, BigDecimal valueAtRisk, Integer num) {
            Intrinsics.checkNotNullParameter(maximumDrawdown, "maximumDrawdown");
            Intrinsics.checkNotNullParameter(averageDrawdown, "averageDrawdown");
            Intrinsics.checkNotNullParameter(valueAtRisk, "valueAtRisk");
            this.f91402a = maximumDrawdown;
            this.f91403b = averageDrawdown;
            this.f91404c = bigDecimal;
            this.d = valueAtRisk;
            this.e = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MaxDrawdown)) {
                return false;
            }
            MaxDrawdown maxDrawdown = (MaxDrawdown) obj2;
            return Intrinsics.f(this.f91402a, maxDrawdown.f91402a) && Intrinsics.f(this.f91403b, maxDrawdown.f91403b) && Intrinsics.f(this.f91404c, maxDrawdown.f91404c) && Intrinsics.f(this.d, maxDrawdown.d) && Intrinsics.f(this.e, maxDrawdown.e);
        }

        public final int hashCode() {
            int iD = t61.a.d(this.f91403b, this.f91402a.hashCode() * 31, 31);
            BigDecimal bigDecimal = this.f91404c;
            int iD2 = t61.a.d(this.d, (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31);
            Integer num = this.e;
            return iD2 + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91402a);
            dest.writeSerializable(this.f91403b);
            dest.writeSerializable(this.f91404c);
            dest.writeSerializable(this.d);
            Integer num = this.e;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric$ProductFeeRange;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductFeeRange implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ProductFeeRange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f91406b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductFeeRange((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductFeeRange[i];
            }
        }

        public ProductFeeRange(BigDecimal min, BigDecimal max) {
            Intrinsics.checkNotNullParameter(min, "min");
            Intrinsics.checkNotNullParameter(max, "max");
            this.f91405a = min;
            this.f91406b = max;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductFeeRange)) {
                return false;
            }
            ProductFeeRange productFeeRange = (ProductFeeRange) obj2;
            return Intrinsics.f(this.f91405a, productFeeRange.f91405a) && Intrinsics.f(this.f91406b, productFeeRange.f91406b);
        }

        public final int hashCode() {
            return this.f91406b.hashCode() + (this.f91405a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91405a);
            dest.writeSerializable(this.f91406b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric$RiskLevel;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskLevel extends PortfolioInsightPerformanceMetric {

        @NotNull
        public static final Parcelable.Creator<RiskLevel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xdh.a f91407a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskLevel(xdh.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskLevel[i];
            }
        }

        public RiskLevel(xdh.a riskProfileValue) {
            Intrinsics.checkNotNullParameter(riskProfileValue, "riskProfileValue");
            this.f91407a = riskProfileValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RiskLevel) && this.f91407a == ((RiskLevel) obj2).f91407a;
        }

        public final int hashCode() {
            return this.f91407a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91407a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric$SharpeRatio;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetric;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SharpeRatio extends PortfolioInsightPerformanceMetric {

        @NotNull
        public static final Parcelable.Creator<SharpeRatio> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f91409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigDecimal f91410c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SharpeRatio((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SharpeRatio[i];
            }
        }

        public SharpeRatio(BigDecimal sharpeRatio, BigDecimal riskFreeReturn, BigDecimal volatility) {
            Intrinsics.checkNotNullParameter(sharpeRatio, "sharpeRatio");
            Intrinsics.checkNotNullParameter(riskFreeReturn, "riskFreeReturn");
            Intrinsics.checkNotNullParameter(volatility, "volatility");
            this.f91408a = sharpeRatio;
            this.f91409b = riskFreeReturn;
            this.f91410c = volatility;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SharpeRatio)) {
                return false;
            }
            SharpeRatio sharpeRatio = (SharpeRatio) obj2;
            return Intrinsics.f(this.f91408a, sharpeRatio.f91408a) && Intrinsics.f(this.f91409b, sharpeRatio.f91409b) && Intrinsics.f(this.f91410c, sharpeRatio.f91410c);
        }

        public final int hashCode() {
            return this.f91410c.hashCode() + t61.a.d(this.f91409b, this.f91408a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91408a);
            dest.writeSerializable(this.f91409b);
            dest.writeSerializable(this.f91410c);
        }
    }

    private PortfolioInsightPerformanceMetric() {
    }
}
