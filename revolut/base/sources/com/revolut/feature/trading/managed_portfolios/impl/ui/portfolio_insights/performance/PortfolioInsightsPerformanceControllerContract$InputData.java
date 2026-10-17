package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetric;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/PortfolioInsightsPerformanceControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PortfolioInsightsPerformanceControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PortfolioInsightsPerformanceControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PortfolioInsightPerformanceMetric f91398b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PortfolioInsightsPerformanceControllerContract$InputData(parcel.readString(), (PortfolioInsightPerformanceMetric) parcel.readParcelable(PortfolioInsightsPerformanceControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PortfolioInsightsPerformanceControllerContract$InputData[i];
        }
    }

    public PortfolioInsightsPerformanceControllerContract$InputData(String templateId, PortfolioInsightPerformanceMetric portfolioInsightPerformanceMetric) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(portfolioInsightPerformanceMetric, "portfolioInsightPerformanceMetric");
        this.f91397a = templateId;
        this.f91398b = portfolioInsightPerformanceMetric;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PortfolioInsightsPerformanceControllerContract$InputData)) {
            return false;
        }
        PortfolioInsightsPerformanceControllerContract$InputData portfolioInsightsPerformanceControllerContract$InputData = (PortfolioInsightsPerformanceControllerContract$InputData) obj2;
        return Intrinsics.f(this.f91397a, portfolioInsightsPerformanceControllerContract$InputData.f91397a) && Intrinsics.f(this.f91398b, portfolioInsightsPerformanceControllerContract$InputData.f91398b);
    }

    public final int hashCode() {
        return this.f91398b.hashCode() + (this.f91397a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91397a);
        dest.writeParcelable(this.f91398b, i);
    }
}
