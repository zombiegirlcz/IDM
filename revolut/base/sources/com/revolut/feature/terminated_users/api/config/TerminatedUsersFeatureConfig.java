package com.revolut.feature.terminated_users.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import do3.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/terminated_users/api/config/TerminatedUsersFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Dashboard", "feature_terminated_users_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TerminatedUsersFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/terminated_users/api/config/TerminatedUsersFeatureConfig$Dashboard;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_terminated_users_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dashboard implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<Dashboard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f90339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f90340b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dashboard(parcel.readInt() == 0 ? null : v.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dashboard[i];
            }
        }

        public Dashboard(v vVar, boolean z) {
            this.f90339a = vVar;
            this.f90340b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Dashboard)) {
                return false;
            }
            Dashboard dashboard = (Dashboard) obj2;
            return this.f90339a == dashboard.f90339a && this.f90340b == dashboard.f90340b;
        }

        public final int hashCode() {
            v vVar = this.f90339a;
            return Boolean.hashCode(this.f90340b) + ((vVar == null ? 0 : vVar.hashCode()) * 31);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: n1, reason: from getter */
        public final boolean getF90340b() {
            return this.f90340b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            v vVar = this.f90339a;
            if (vVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(vVar.name());
            }
            dest.writeInt(this.f90340b ? 1 : 0);
        }
    }
}
