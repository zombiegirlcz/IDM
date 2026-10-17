package com.revolut.feature.teen_dashboard.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/teen_dashboard/api/navigation/TeenDashboardDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "Dashboard", "Details", "Lcom/revolut/feature/teen_dashboard/api/navigation/TeenDashboardDestination$Dashboard;", "Lcom/revolut/feature/teen_dashboard/api/navigation/TeenDashboardDestination$Details;", "feature_teen_dashboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TeenDashboardDestination implements KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/teen_dashboard/api/navigation/TeenDashboardDestination$Dashboard;", "Lcom/revolut/feature/teen_dashboard/api/navigation/TeenDashboardDestination;", "", "toString", "()Ljava/lang/String;", "feature_teen_dashboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dashboard extends TeenDashboardDestination {

        @NotNull
        public static final Parcelable.Creator<Dashboard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90330a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dashboard(((RegisteredIdentityId) parcel.readParcelable(Dashboard.class.getClassLoader())).f74764a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dashboard[i];
            }
        }

        public Dashboard(String teenRegisteredIdentityId) {
            Intrinsics.checkNotNullParameter(teenRegisteredIdentityId, "teenRegisteredIdentityId");
            this.f90330a = teenRegisteredIdentityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Dashboard) && Intrinsics.f(this.f90330a, ((Dashboard) obj2).f90330a);
        }

        public final int hashCode() {
            return this.f90330a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            e.x(this.f90330a, dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/teen_dashboard/api/navigation/TeenDashboardDestination$Details;", "Lcom/revolut/feature/teen_dashboard/api/navigation/TeenDashboardDestination;", "", "toString", "()Ljava/lang/String;", "feature_teen_dashboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends TeenDashboardDestination {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90331a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(((RegisteredIdentityId) parcel.readParcelable(Details.class.getClassLoader())).f74764a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String teenRegisteredIdentityId) {
            Intrinsics.checkNotNullParameter(teenRegisteredIdentityId, "teenRegisteredIdentityId");
            this.f90331a = teenRegisteredIdentityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f90331a, ((Details) obj2).f90331a);
        }

        public final int hashCode() {
            return this.f90331a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            e.x(this.f90331a, dest, i);
        }
    }

    private TeenDashboardDestination() {
    }
}
