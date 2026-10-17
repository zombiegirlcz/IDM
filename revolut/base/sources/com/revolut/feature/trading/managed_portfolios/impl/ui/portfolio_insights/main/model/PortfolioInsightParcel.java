package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel;", "Landroid/os/Parcelable;", "<init>", "()V", "SharpeRatio", "MaxDrawdown", "AverageAnnualReturnBreakdown", "ProductFeeRange", "RiskLevel", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel$AverageAnnualReturnBreakdown;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel$MaxDrawdown;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel$RiskLevel;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel$SharpeRatio;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PortfolioInsightParcel implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel$AverageAnnualReturnBreakdown;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AverageAnnualReturnBreakdown extends PortfolioInsightParcel {

        @NotNull
        public static final Parcelable.Creator<AverageAnnualReturnBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f91386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ProductFeeRange f91387c;

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
            this.f91385a = averageGrossReturn;
            this.f91386b = fees;
            this.f91387c = productFeeRange;
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
            return Intrinsics.f(this.f91385a, averageAnnualReturnBreakdown.f91385a) && Intrinsics.f(this.f91386b, averageAnnualReturnBreakdown.f91386b) && Intrinsics.f(this.f91387c, averageAnnualReturnBreakdown.f91387c);
        }

        public final int hashCode() {
            int iD = t61.a.d(this.f91386b, this.f91385a.hashCode() * 31, 31);
            ProductFeeRange productFeeRange = this.f91387c;
            return iD + (productFeeRange == null ? 0 : productFeeRange.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91385a);
            dest.writeSerializable(this.f91386b);
            ProductFeeRange productFeeRange = this.f91387c;
            if (productFeeRange == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                productFeeRange.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel$MaxDrawdown;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MaxDrawdown extends PortfolioInsightParcel {

        @NotNull
        public static final Parcelable.Creator<MaxDrawdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f91389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigDecimal f91390c;
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
            this.f91388a = maximumDrawdown;
            this.f91389b = averageDrawdown;
            this.f91390c = bigDecimal;
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
            return Intrinsics.f(this.f91388a, maxDrawdown.f91388a) && Intrinsics.f(this.f91389b, maxDrawdown.f91389b) && Intrinsics.f(this.f91390c, maxDrawdown.f91390c) && Intrinsics.f(this.d, maxDrawdown.d) && Intrinsics.f(this.e, maxDrawdown.e);
        }

        public final int hashCode() {
            int iD = t61.a.d(this.f91389b, this.f91388a.hashCode() * 31, 31);
            BigDecimal bigDecimal = this.f91390c;
            int iD2 = t61.a.d(this.d, (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31);
            Integer num = this.e;
            return iD2 + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91388a);
            dest.writeSerializable(this.f91389b);
            dest.writeSerializable(this.f91390c);
            dest.writeSerializable(this.d);
            Integer num = this.e;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel$ProductFeeRange;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductFeeRange implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ProductFeeRange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f91392b;

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
            this.f91391a = min;
            this.f91392b = max;
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
            return Intrinsics.f(this.f91391a, productFeeRange.f91391a) && Intrinsics.f(this.f91392b, productFeeRange.f91392b);
        }

        public final int hashCode() {
            return this.f91392b.hashCode() + (this.f91391a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91391a);
            dest.writeSerializable(this.f91392b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel$RiskLevel;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskLevel extends PortfolioInsightParcel {

        @NotNull
        public static final Parcelable.Creator<RiskLevel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xdh.a f91393a;

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
            this.f91393a = riskProfileValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RiskLevel) && this.f91393a == ((RiskLevel) obj2).f91393a;
        }

        public final int hashCode() {
            return this.f91393a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91393a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel$SharpeRatio;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/model/PortfolioInsightParcel;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SharpeRatio extends PortfolioInsightParcel {

        @NotNull
        public static final Parcelable.Creator<SharpeRatio> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f91395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigDecimal f91396c;

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
            this.f91394a = sharpeRatio;
            this.f91395b = riskFreeReturn;
            this.f91396c = volatility;
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
            return Intrinsics.f(this.f91394a, sharpeRatio.f91394a) && Intrinsics.f(this.f91395b, sharpeRatio.f91395b) && Intrinsics.f(this.f91396c, sharpeRatio.f91396c);
        }

        public final int hashCode() {
            return this.f91396c.hashCode() + t61.a.d(this.f91395b, this.f91394a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91394a);
            dest.writeSerializable(this.f91395b);
            dest.writeSerializable(this.f91396c);
        }
    }

    private PortfolioInsightParcel() {
    }
}
