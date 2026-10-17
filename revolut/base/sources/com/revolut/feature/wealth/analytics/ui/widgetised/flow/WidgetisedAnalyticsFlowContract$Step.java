package com.revolut.feature.wealth.analytics.ui.widgetised.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.analytics.ui.widgetised.models.PnLValues;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.wealth.models.config.Links;
import hel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vyg.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "WidgetisedAnalyticsDashboardStep", "WidgetisedAnalyticsTotalValueStep", "WidgetisedAnalyticsPnLStep", "WidgetisedAnalyticsPerformanceStep", "WidgetisedAnalyticsAllocationStep", "PortfolioInsightsDashboardStep", "PortfolioInsightsIndicatorStep", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$PortfolioInsightsDashboardStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$PortfolioInsightsIndicatorStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$WidgetisedAnalyticsAllocationStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$WidgetisedAnalyticsDashboardStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$WidgetisedAnalyticsPerformanceStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$WidgetisedAnalyticsPnLStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$WidgetisedAnalyticsTotalValueStep;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WidgetisedAnalyticsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$PortfolioInsightsDashboardStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortfolioInsightsDashboardStep implements WidgetisedAnalyticsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PortfolioInsightsDashboardStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WidgetisedAnalyticsType f95077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f95078c;
        public final Links d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortfolioInsightsDashboardStep((WidgetisedAnalyticsType) parcel.readParcelable(PortfolioInsightsDashboardStep.class.getClassLoader()), (Links) parcel.readParcelable(PortfolioInsightsDashboardStep.class.getClassLoader()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortfolioInsightsDashboardStep[i];
            }
        }

        public PortfolioInsightsDashboardStep(WidgetisedAnalyticsType analyticsType, Links links, b bVar, String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            this.f95076a = portfolioId;
            this.f95077b = analyticsType;
            this.f95078c = bVar;
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
            if (!(obj2 instanceof PortfolioInsightsDashboardStep)) {
                return false;
            }
            PortfolioInsightsDashboardStep portfolioInsightsDashboardStep = (PortfolioInsightsDashboardStep) obj2;
            return Intrinsics.f(this.f95076a, portfolioInsightsDashboardStep.f95076a) && Intrinsics.f(this.f95077b, portfolioInsightsDashboardStep.f95077b) && this.f95078c == portfolioInsightsDashboardStep.f95078c && Intrinsics.f(this.d, portfolioInsightsDashboardStep.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f95077b.hashCode() + (this.f95076a.hashCode() * 31)) * 31;
            b bVar = this.f95078c;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Links links = this.d;
            return iHashCode2 + (links != null ? links.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95076a);
            dest.writeParcelable(this.f95077b, i);
            b bVar = this.f95078c;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
            }
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$PortfolioInsightsIndicatorStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortfolioInsightsIndicatorStep implements WidgetisedAnalyticsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PortfolioInsightsIndicatorStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95080b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortfolioInsightsIndicatorStep(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortfolioInsightsIndicatorStep[i];
            }
        }

        public PortfolioInsightsIndicatorStep(String indicatorKey, String portfolioId) {
            Intrinsics.checkNotNullParameter(indicatorKey, "indicatorKey");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95079a = indicatorKey;
            this.f95080b = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PortfolioInsightsIndicatorStep)) {
                return false;
            }
            PortfolioInsightsIndicatorStep portfolioInsightsIndicatorStep = (PortfolioInsightsIndicatorStep) obj2;
            return Intrinsics.f(this.f95079a, portfolioInsightsIndicatorStep.f95079a) && Intrinsics.f(this.f95080b, portfolioInsightsIndicatorStep.f95080b);
        }

        public final int hashCode() {
            return this.f95080b.hashCode() + (this.f95079a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95079a);
            dest.writeString(this.f95080b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$WidgetisedAnalyticsAllocationStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WidgetisedAnalyticsAllocationStep implements WidgetisedAnalyticsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WidgetisedAnalyticsAllocationStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WidgetisedAnalyticsType f95081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f95082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Links f95083c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WidgetisedAnalyticsAllocationStep((WidgetisedAnalyticsType) parcel.readParcelable(WidgetisedAnalyticsAllocationStep.class.getClassLoader()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), (Links) parcel.readParcelable(WidgetisedAnalyticsAllocationStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WidgetisedAnalyticsAllocationStep[i];
            }
        }

        public WidgetisedAnalyticsAllocationStep(WidgetisedAnalyticsType selectedAnalyticsType, b bVar, Links links) {
            Intrinsics.checkNotNullParameter(selectedAnalyticsType, "selectedAnalyticsType");
            this.f95081a = selectedAnalyticsType;
            this.f95082b = bVar;
            this.f95083c = links;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WidgetisedAnalyticsAllocationStep)) {
                return false;
            }
            WidgetisedAnalyticsAllocationStep widgetisedAnalyticsAllocationStep = (WidgetisedAnalyticsAllocationStep) obj2;
            return Intrinsics.f(this.f95081a, widgetisedAnalyticsAllocationStep.f95081a) && this.f95082b == widgetisedAnalyticsAllocationStep.f95082b && Intrinsics.f(this.f95083c, widgetisedAnalyticsAllocationStep.f95083c);
        }

        public final int hashCode() {
            int iHashCode = this.f95081a.hashCode() * 31;
            b bVar = this.f95082b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Links links = this.f95083c;
            return iHashCode2 + (links != null ? links.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95081a, i);
            b bVar = this.f95082b;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
            }
            dest.writeParcelable(this.f95083c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$WidgetisedAnalyticsDashboardStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WidgetisedAnalyticsDashboardStep implements WidgetisedAnalyticsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WidgetisedAnalyticsDashboardStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ixg.b f95084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f95086c;
        public final Links d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WidgetisedAnalyticsDashboardStep(ixg.b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), (Links) parcel.readParcelable(WidgetisedAnalyticsDashboardStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WidgetisedAnalyticsDashboardStep[i];
            }
        }

        public WidgetisedAnalyticsDashboardStep(ixg.b analyticsType, String str, b bVar, Links links) {
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            this.f95084a = analyticsType;
            this.f95085b = str;
            this.f95086c = bVar;
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
            if (!(obj2 instanceof WidgetisedAnalyticsDashboardStep)) {
                return false;
            }
            WidgetisedAnalyticsDashboardStep widgetisedAnalyticsDashboardStep = (WidgetisedAnalyticsDashboardStep) obj2;
            return this.f95084a == widgetisedAnalyticsDashboardStep.f95084a && Intrinsics.f(this.f95085b, widgetisedAnalyticsDashboardStep.f95085b) && this.f95086c == widgetisedAnalyticsDashboardStep.f95086c && Intrinsics.f(this.d, widgetisedAnalyticsDashboardStep.d);
        }

        public final int hashCode() {
            int iHashCode = this.f95084a.hashCode() * 31;
            String str = this.f95085b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            b bVar = this.f95086c;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Links links = this.d;
            return iHashCode3 + (links != null ? links.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95084a.name());
            dest.writeString(this.f95085b);
            b bVar = this.f95086c;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
            }
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$WidgetisedAnalyticsPerformanceStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WidgetisedAnalyticsPerformanceStep implements WidgetisedAnalyticsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WidgetisedAnalyticsPerformanceStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f95087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WidgetisedAnalyticsType f95088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f95089c;
        public final Links d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WidgetisedAnalyticsPerformanceStep((WidgetisedAnalyticsType) parcel.readParcelable(WidgetisedAnalyticsPerformanceStep.class.getClassLoader()), (Links) parcel.readParcelable(WidgetisedAnalyticsPerformanceStep.class.getClassLoader()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WidgetisedAnalyticsPerformanceStep[i];
            }
        }

        public WidgetisedAnalyticsPerformanceStep(WidgetisedAnalyticsType selectedAnalyticsType, Links links, b bVar, c selectedTimeframe) {
            Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
            Intrinsics.checkNotNullParameter(selectedAnalyticsType, "selectedAnalyticsType");
            this.f95087a = selectedTimeframe;
            this.f95088b = selectedAnalyticsType;
            this.f95089c = bVar;
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
            if (!(obj2 instanceof WidgetisedAnalyticsPerformanceStep)) {
                return false;
            }
            WidgetisedAnalyticsPerformanceStep widgetisedAnalyticsPerformanceStep = (WidgetisedAnalyticsPerformanceStep) obj2;
            return this.f95087a == widgetisedAnalyticsPerformanceStep.f95087a && Intrinsics.f(this.f95088b, widgetisedAnalyticsPerformanceStep.f95088b) && this.f95089c == widgetisedAnalyticsPerformanceStep.f95089c && Intrinsics.f(this.d, widgetisedAnalyticsPerformanceStep.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f95088b.hashCode() + (this.f95087a.hashCode() * 31)) * 31;
            b bVar = this.f95089c;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Links links = this.d;
            return iHashCode2 + (links != null ? links.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95087a.name());
            dest.writeParcelable(this.f95088b, i);
            b bVar = this.f95089c;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
            }
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$WidgetisedAnalyticsPnLStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WidgetisedAnalyticsPnLStep implements WidgetisedAnalyticsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WidgetisedAnalyticsPnLStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WidgetisedAnalyticsType f95090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PnLValues f95091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f95092c;
        public final b d;
        public final Links e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WidgetisedAnalyticsPnLStep((WidgetisedAnalyticsType) parcel.readParcelable(WidgetisedAnalyticsPnLStep.class.getClassLoader()), parcel.readInt() == 0 ? null : PnLValues.CREATOR.createFromParcel(parcel), c.valueOf(parcel.readString()), parcel.readInt() != 0 ? b.valueOf(parcel.readString()) : null, (Links) parcel.readParcelable(WidgetisedAnalyticsPnLStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WidgetisedAnalyticsPnLStep[i];
            }
        }

        public WidgetisedAnalyticsPnLStep(WidgetisedAnalyticsType analyticsType, PnLValues pnLValues, c selectedTimeframe, b bVar, Links links) {
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
            this.f95090a = analyticsType;
            this.f95091b = pnLValues;
            this.f95092c = selectedTimeframe;
            this.d = bVar;
            this.e = links;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WidgetisedAnalyticsPnLStep)) {
                return false;
            }
            WidgetisedAnalyticsPnLStep widgetisedAnalyticsPnLStep = (WidgetisedAnalyticsPnLStep) obj2;
            return Intrinsics.f(this.f95090a, widgetisedAnalyticsPnLStep.f95090a) && Intrinsics.f(this.f95091b, widgetisedAnalyticsPnLStep.f95091b) && this.f95092c == widgetisedAnalyticsPnLStep.f95092c && this.d == widgetisedAnalyticsPnLStep.d && Intrinsics.f(this.e, widgetisedAnalyticsPnLStep.e);
        }

        public final int hashCode() {
            int iHashCode = this.f95090a.hashCode() * 31;
            PnLValues pnLValues = this.f95091b;
            int iHashCode2 = (this.f95092c.hashCode() + ((iHashCode + (pnLValues == null ? 0 : pnLValues.hashCode())) * 31)) * 31;
            b bVar = this.d;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Links links = this.e;
            return iHashCode3 + (links != null ? links.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95090a, i);
            PnLValues pnLValues = this.f95091b;
            if (pnLValues == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                pnLValues.writeToParcel(dest, i);
            }
            dest.writeString(this.f95092c.name());
            b bVar = this.d;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
            }
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step$WidgetisedAnalyticsTotalValueStep;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/flow/WidgetisedAnalyticsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WidgetisedAnalyticsTotalValueStep implements WidgetisedAnalyticsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WidgetisedAnalyticsTotalValueStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WidgetisedAnalyticsType f95093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f95094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f95095c;
        public final Links d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WidgetisedAnalyticsTotalValueStep((WidgetisedAnalyticsType) parcel.readParcelable(WidgetisedAnalyticsTotalValueStep.class.getClassLoader()), (Links) parcel.readParcelable(WidgetisedAnalyticsTotalValueStep.class.getClassLoader()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WidgetisedAnalyticsTotalValueStep[i];
            }
        }

        public WidgetisedAnalyticsTotalValueStep(WidgetisedAnalyticsType analyticsType, Links links, b bVar, c selectedTimeframe) {
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
            this.f95093a = analyticsType;
            this.f95094b = selectedTimeframe;
            this.f95095c = bVar;
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
            if (!(obj2 instanceof WidgetisedAnalyticsTotalValueStep)) {
                return false;
            }
            WidgetisedAnalyticsTotalValueStep widgetisedAnalyticsTotalValueStep = (WidgetisedAnalyticsTotalValueStep) obj2;
            return Intrinsics.f(this.f95093a, widgetisedAnalyticsTotalValueStep.f95093a) && this.f95094b == widgetisedAnalyticsTotalValueStep.f95094b && this.f95095c == widgetisedAnalyticsTotalValueStep.f95095c && Intrinsics.f(this.d, widgetisedAnalyticsTotalValueStep.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f95094b.hashCode() + (this.f95093a.hashCode() * 31)) * 31;
            b bVar = this.f95095c;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Links links = this.d;
            return iHashCode2 + (links != null ? links.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95093a, i);
            dest.writeString(this.f95094b.name());
            b bVar = this.f95095c;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
            }
            dest.writeParcelable(this.d, i);
        }
    }
}
