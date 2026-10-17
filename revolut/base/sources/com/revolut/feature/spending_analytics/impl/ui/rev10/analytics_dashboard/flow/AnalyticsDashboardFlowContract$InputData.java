package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.categorisation.api.model.PeriodPreferenceType;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yld.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "DefaultScreen", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticsDashboardFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AnalyticsDashboardFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultScreen f87571a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$InputData$DefaultScreen;", "Landroid/os/Parcelable;", "Dashboard", "AnalyticsDetails", "Budget", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$InputData$DefaultScreen$AnalyticsDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$InputData$DefaultScreen$Budget;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$InputData$DefaultScreen$Dashboard;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface DefaultScreen extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$InputData$DefaultScreen$AnalyticsDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$InputData$DefaultScreen;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AnalyticsDetails implements DefaultScreen {

            @NotNull
            public static final Parcelable.Creator<AnalyticsDetails> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f87572a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AnalyticsAccountsSelection f87573b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f87574c;
            public final PeriodPreferenceType d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AnalyticsDetails(d.valueOf(parcel.readString()), (AnalyticsAccountsSelection) parcel.readParcelable(AnalyticsDetails.class.getClassLoader()), parcel.readString(), (PeriodPreferenceType) parcel.readParcelable(AnalyticsDetails.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AnalyticsDetails[i];
                }
            }

            public AnalyticsDetails(d screenType, AnalyticsAccountsSelection analyticsAccountsSelection, String str, PeriodPreferenceType periodPreferenceType) {
                Intrinsics.checkNotNullParameter(screenType, "screenType");
                Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "analyticsAccountsSelection");
                this.f87572a = screenType;
                this.f87573b = analyticsAccountsSelection;
                this.f87574c = str;
                this.d = periodPreferenceType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AnalyticsDetails)) {
                    return false;
                }
                AnalyticsDetails analyticsDetails = (AnalyticsDetails) obj2;
                return this.f87572a == analyticsDetails.f87572a && Intrinsics.f(this.f87573b, analyticsDetails.f87573b) && Intrinsics.f(this.f87574c, analyticsDetails.f87574c) && this.d == analyticsDetails.d;
            }

            public final int hashCode() {
                int iHashCode = (this.f87573b.hashCode() + (this.f87572a.hashCode() * 31)) * 31;
                String str = this.f87574c;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                PeriodPreferenceType periodPreferenceType = this.d;
                return iHashCode2 + (periodPreferenceType != null ? periodPreferenceType.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87572a.name());
                dest.writeParcelable(this.f87573b, i);
                dest.writeString(this.f87574c);
                dest.writeParcelable(this.d, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$InputData$DefaultScreen$Budget;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$InputData$DefaultScreen;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Budget implements DefaultScreen {

            @NotNull
            public static final Parcelable.Creator<Budget> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AccountId f87575a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f87576b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Budget((AccountId) parcel.readParcelable(Budget.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Budget[i];
                }
            }

            public Budget(AccountId accountId, boolean z) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f87575a = accountId;
                this.f87576b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Budget)) {
                    return false;
                }
                Budget budget = (Budget) obj2;
                return Intrinsics.f(this.f87575a, budget.f87575a) && this.f87576b == budget.f87576b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f87576b) + (this.f87575a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f87575a, i);
                dest.writeInt(this.f87576b ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$InputData$DefaultScreen$Dashboard;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$InputData$DefaultScreen;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dashboard implements DefaultScreen {

            @NotNull
            public static final Parcelable.Creator<Dashboard> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProductAccountDescriptor$Value f87577a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Dashboard((ProductAccountDescriptor$Value) parcel.readParcelable(Dashboard.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Dashboard[i];
                }
            }

            public Dashboard(ProductAccountDescriptor$Value productAccountDescriptor$Value) {
                this.f87577a = productAccountDescriptor$Value;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Dashboard) && Intrinsics.f(this.f87577a, ((Dashboard) obj2).f87577a);
            }

            public final int hashCode() {
                ProductAccountDescriptor$Value productAccountDescriptor$Value = this.f87577a;
                if (productAccountDescriptor$Value == null) {
                    return 0;
                }
                return productAccountDescriptor$Value.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f87577a, i);
            }

            public Dashboard() {
                this(null);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnalyticsDashboardFlowContract$InputData((DefaultScreen) parcel.readParcelable(AnalyticsDashboardFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsDashboardFlowContract$InputData[i];
        }
    }

    public AnalyticsDashboardFlowContract$InputData(DefaultScreen defaultScreen) {
        Intrinsics.checkNotNullParameter(defaultScreen, "defaultScreen");
        this.f87571a = defaultScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AnalyticsDashboardFlowContract$InputData) && Intrinsics.f(this.f87571a, ((AnalyticsDashboardFlowContract$InputData) obj2).f87571a);
    }

    public final int hashCode() {
        return this.f87571a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87571a, i);
    }

    public AnalyticsDashboardFlowContract$InputData() {
        this(new DefaultScreen.Dashboard(null));
    }
}
