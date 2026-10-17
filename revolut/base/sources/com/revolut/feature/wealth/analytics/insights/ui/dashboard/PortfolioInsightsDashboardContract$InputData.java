package com.revolut.feature.wealth.analytics.insights.ui.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.config.Links;
import hel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/analytics/insights/ui/dashboard/PortfolioInsightsDashboardContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PortfolioInsightsDashboardContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PortfolioInsightsDashboardContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f95020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WidgetisedAnalyticsType f95021c;
    public final Links d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PortfolioInsightsDashboardContract$InputData((WidgetisedAnalyticsType) parcel.readParcelable(PortfolioInsightsDashboardContract$InputData.class.getClassLoader()), (Links) parcel.readParcelable(PortfolioInsightsDashboardContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PortfolioInsightsDashboardContract$InputData[i];
        }
    }

    public PortfolioInsightsDashboardContract$InputData(WidgetisedAnalyticsType analyticsType, Links links, b bVar, String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        this.f95019a = portfolioId;
        this.f95020b = bVar;
        this.f95021c = analyticsType;
        this.d = links;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PortfolioInsightsDashboardContract$InputData)) {
            return false;
        }
        PortfolioInsightsDashboardContract$InputData portfolioInsightsDashboardContract$InputData = (PortfolioInsightsDashboardContract$InputData) obj2;
        return Intrinsics.f(this.f95019a, portfolioInsightsDashboardContract$InputData.f95019a) && this.f95020b == portfolioInsightsDashboardContract$InputData.f95020b && Intrinsics.f(this.f95021c, portfolioInsightsDashboardContract$InputData.f95021c) && Intrinsics.f(this.d, portfolioInsightsDashboardContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f95019a.hashCode() * 31;
        b bVar = this.f95020b;
        int iHashCode2 = (this.f95021c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        Links links = this.d;
        return iHashCode2 + (links != null ? links.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95019a);
        b bVar = this.f95020b;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
        }
        dest.writeParcelable(this.f95021c, i);
        dest.writeParcelable(this.d, i);
    }
}
