package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$AccountSelectorPopupAction", "Landroid/os/Parcelable;", "Filters", "Select", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$AccountSelectorPopupAction$Filters;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$AccountSelectorPopupAction$Select;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AnalyticsDashboardContract$AccountSelectorPopupAction extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$AccountSelectorPopupAction$Filters;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$AccountSelectorPopupAction;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Filters implements AnalyticsDashboardContract$AccountSelectorPopupAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Filters f87514a = new Filters();

        @NotNull
        public static final Parcelable.Creator<Filters> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Filters.f87514a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Filters[i];
            }
        }

        private Filters() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$AccountSelectorPopupAction$Select;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$AccountSelectorPopupAction;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Select implements AnalyticsDashboardContract$AccountSelectorPopupAction {

        @NotNull
        public static final Parcelable.Creator<Select> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnalyticsAccountsSelection f87515a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Select((AnalyticsAccountsSelection) parcel.readParcelable(Select.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Select[i];
            }
        }

        public Select(AnalyticsAccountsSelection selection) {
            Intrinsics.checkNotNullParameter(selection, "selection");
            this.f87515a = selection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Select) && Intrinsics.f(this.f87515a, ((Select) obj2).f87515a);
        }

        public final int hashCode() {
            return this.f87515a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87515a, i);
        }
    }
}
