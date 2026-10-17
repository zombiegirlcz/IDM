package com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/impl/userauth/location_enforce/ui/flow/LocationEnforceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Permission", "LocationToggle", "Lcom/revolut/retail/feature/impl/userauth/location_enforce/ui/flow/LocationEnforceFlowContract$Step$LocationToggle;", "Lcom/revolut/retail/feature/impl/userauth/location_enforce/ui/flow/LocationEnforceFlowContract$Step$Permission;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LocationEnforceFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/location_enforce/ui/flow/LocationEnforceFlowContract$Step$LocationToggle;", "Lcom/revolut/retail/feature/impl/userauth/location_enforce/ui/flow/LocationEnforceFlowContract$Step;", "<init>", "()V", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LocationToggle extends LocationEnforceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationToggle f101683a = new LocationToggle();

        @NotNull
        public static final Parcelable.Creator<LocationToggle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LocationToggle.f101683a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocationToggle[i];
            }
        }

        private LocationToggle() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/location_enforce/ui/flow/LocationEnforceFlowContract$Step$Permission;", "Lcom/revolut/retail/feature/impl/userauth/location_enforce/ui/flow/LocationEnforceFlowContract$Step;", "<init>", "()V", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Permission extends LocationEnforceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Permission f101684a = new Permission();

        @NotNull
        public static final Parcelable.Creator<Permission> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Permission.f101684a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Permission[i];
            }
        }

        private Permission() {
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

    private LocationEnforceFlowContract$Step() {
    }
}
