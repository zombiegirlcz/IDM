package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ContextMenuAction", "Landroid/os/Parcelable;", "LinkExternalAccount", "AddAsset", "AddTrip", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ContextMenuAction$AddAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ContextMenuAction$AddTrip;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ContextMenuAction$LinkExternalAccount;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AnalyticsDashboardContract$ContextMenuAction extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ContextMenuAction$AddAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ContextMenuAction;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddAsset implements AnalyticsDashboardContract$ContextMenuAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddAsset f87519a = new AddAsset();

        @NotNull
        public static final Parcelable.Creator<AddAsset> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddAsset.f87519a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddAsset[i];
            }
        }

        private AddAsset() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ContextMenuAction$AddTrip;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ContextMenuAction;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddTrip implements AnalyticsDashboardContract$ContextMenuAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddTrip f87520a = new AddTrip();

        @NotNull
        public static final Parcelable.Creator<AddTrip> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddTrip.f87520a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddTrip[i];
            }
        }

        private AddTrip() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ContextMenuAction$LinkExternalAccount;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ContextMenuAction;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LinkExternalAccount implements AnalyticsDashboardContract$ContextMenuAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LinkExternalAccount f87521a = new LinkExternalAccount();

        @NotNull
        public static final Parcelable.Creator<LinkExternalAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LinkExternalAccount.f87521a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkExternalAccount[i];
            }
        }

        private LinkExternalAccount() {
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
}
