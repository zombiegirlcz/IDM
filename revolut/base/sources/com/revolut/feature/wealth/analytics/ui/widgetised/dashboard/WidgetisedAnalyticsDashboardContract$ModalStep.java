package com.revolut.feature.wealth.analytics.ui.widgetised.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.analytics.insights.model.PortfolioInsightsUsageRequirements;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.kompot.navigable.flow.FlowStep;
import hel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vyg.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/wealth/analytics/ui/widgetised/dashboard/WidgetisedAnalyticsDashboardContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectTimeframe", "SelectAccount", "PortfolioInsightsUsageInfo", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/dashboard/WidgetisedAnalyticsDashboardContract$ModalStep$PortfolioInsightsUsageInfo;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/dashboard/WidgetisedAnalyticsDashboardContract$ModalStep$SelectAccount;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/dashboard/WidgetisedAnalyticsDashboardContract$ModalStep$SelectTimeframe;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WidgetisedAnalyticsDashboardContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/dashboard/WidgetisedAnalyticsDashboardContract$ModalStep$PortfolioInsightsUsageInfo;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/dashboard/WidgetisedAnalyticsDashboardContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortfolioInsightsUsageInfo extends WidgetisedAnalyticsDashboardContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PortfolioInsightsUsageInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PortfolioInsightsUsageRequirements f95058a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortfolioInsightsUsageInfo(PortfolioInsightsUsageRequirements.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortfolioInsightsUsageInfo[i];
            }
        }

        public PortfolioInsightsUsageInfo(PortfolioInsightsUsageRequirements usageRequirements) {
            Intrinsics.checkNotNullParameter(usageRequirements, "usageRequirements");
            this.f95058a = usageRequirements;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PortfolioInsightsUsageInfo) && Intrinsics.f(this.f95058a, ((PortfolioInsightsUsageInfo) obj2).f95058a);
        }

        public final int hashCode() {
            return this.f95058a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f95058a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/dashboard/WidgetisedAnalyticsDashboardContract$ModalStep$SelectAccount;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/dashboard/WidgetisedAnalyticsDashboardContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectAccount extends WidgetisedAnalyticsDashboardContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SelectAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WidgetisedAnalyticsType f95059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f95060b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectAccount((WidgetisedAnalyticsType) parcel.readParcelable(SelectAccount.class.getClassLoader()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectAccount[i];
            }
        }

        public SelectAccount(WidgetisedAnalyticsType selectedAnalyticsType, b bVar) {
            Intrinsics.checkNotNullParameter(selectedAnalyticsType, "selectedAnalyticsType");
            this.f95059a = selectedAnalyticsType;
            this.f95060b = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectAccount)) {
                return false;
            }
            SelectAccount selectAccount = (SelectAccount) obj2;
            return Intrinsics.f(this.f95059a, selectAccount.f95059a) && this.f95060b == selectAccount.f95060b;
        }

        public final int hashCode() {
            int iHashCode = this.f95059a.hashCode() * 31;
            b bVar = this.f95060b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95059a, i);
            b bVar = this.f95060b;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/dashboard/WidgetisedAnalyticsDashboardContract$ModalStep$SelectTimeframe;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/dashboard/WidgetisedAnalyticsDashboardContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectTimeframe extends WidgetisedAnalyticsDashboardContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SelectTimeframe> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f95061a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectTimeframe(c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectTimeframe[i];
            }
        }

        public SelectTimeframe(c selectedTimeframe) {
            Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
            this.f95061a = selectedTimeframe;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectTimeframe) && this.f95061a == ((SelectTimeframe) obj2).f95061a;
        }

        public final int hashCode() {
            return this.f95061a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95061a.name());
        }
    }

    private WidgetisedAnalyticsDashboardContract$ModalStep() {
    }
}
