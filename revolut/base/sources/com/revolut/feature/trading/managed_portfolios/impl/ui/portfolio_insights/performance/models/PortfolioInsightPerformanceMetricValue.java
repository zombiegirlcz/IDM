package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue;", "Landroid/os/Parcelable;", "Ratio", "Percentage", "PercentageRange", "RecoveryPeriodMonths", "RiskLevel", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue$Percentage;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue$PercentageRange;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue$Ratio;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue$RecoveryPeriodMonths;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue$RiskLevel;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PortfolioInsightPerformanceMetricValue extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue$Percentage;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Percentage implements PortfolioInsightPerformanceMetricValue {

        @NotNull
        public static final Parcelable.Creator<Percentage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91411a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Percentage((BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Percentage[i];
            }
        }

        public Percentage(BigDecimal value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f91411a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Percentage) && Intrinsics.f(this.f91411a, ((Percentage) obj2).f91411a);
        }

        public final int hashCode() {
            return this.f91411a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91411a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue$PercentageRange;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PercentageRange implements PortfolioInsightPerformanceMetricValue {

        @NotNull
        public static final Parcelable.Creator<PercentageRange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f91413b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PercentageRange((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PercentageRange[i];
            }
        }

        public PercentageRange(BigDecimal min, BigDecimal max) {
            Intrinsics.checkNotNullParameter(min, "min");
            Intrinsics.checkNotNullParameter(max, "max");
            this.f91412a = min;
            this.f91413b = max;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PercentageRange)) {
                return false;
            }
            PercentageRange percentageRange = (PercentageRange) obj2;
            return Intrinsics.f(this.f91412a, percentageRange.f91412a) && Intrinsics.f(this.f91413b, percentageRange.f91413b);
        }

        public final int hashCode() {
            return this.f91413b.hashCode() + (this.f91412a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91412a);
            dest.writeSerializable(this.f91413b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue$Ratio;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Ratio implements PortfolioInsightPerformanceMetricValue {

        @NotNull
        public static final Parcelable.Creator<Ratio> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91414a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ratio((BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ratio[i];
            }
        }

        public Ratio(BigDecimal value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f91414a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Ratio) && Intrinsics.f(this.f91414a, ((Ratio) obj2).f91414a);
        }

        public final int hashCode() {
            return this.f91414a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91414a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue$RecoveryPeriodMonths;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecoveryPeriodMonths implements PortfolioInsightPerformanceMetricValue {

        @NotNull
        public static final Parcelable.Creator<RecoveryPeriodMonths> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91415a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecoveryPeriodMonths(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecoveryPeriodMonths[i];
            }
        }

        public RecoveryPeriodMonths(int i) {
            this.f91415a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RecoveryPeriodMonths) && this.f91415a == ((RecoveryPeriodMonths) obj2).f91415a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f91415a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f91415a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue$RiskLevel;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/models/PortfolioInsightPerformanceMetricValue;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskLevel implements PortfolioInsightPerformanceMetricValue {

        @NotNull
        public static final Parcelable.Creator<RiskLevel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xdh.a f91416a;

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
            this.f91416a = riskProfileValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RiskLevel) && this.f91416a == ((RiskLevel) obj2).f91416a;
        }

        public final int hashCode() {
            return this.f91416a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91416a.name());
        }
    }
}
