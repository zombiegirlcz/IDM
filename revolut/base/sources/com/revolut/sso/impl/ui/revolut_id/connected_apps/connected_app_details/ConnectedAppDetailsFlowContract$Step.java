package com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/sso/impl/ui/revolut_id/connected_apps/connected_app_details/ConnectedAppDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Details", "RevokeAccess", "Lcom/revolut/sso/impl/ui/revolut_id/connected_apps/connected_app_details/ConnectedAppDetailsFlowContract$Step$Details;", "Lcom/revolut/sso/impl/ui/revolut_id/connected_apps/connected_app_details/ConnectedAppDetailsFlowContract$Step$RevokeAccess;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ConnectedAppDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/connected_apps/connected_app_details/ConnectedAppDetailsFlowContract$Step$Details;", "Lcom/revolut/sso/impl/ui/revolut_id/connected_apps/connected_app_details/ConnectedAppDetailsFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details extends ConnectedAppDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Details f106717a = new Details();

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Details.f106717a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        private Details() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/connected_apps/connected_app_details/ConnectedAppDetailsFlowContract$Step$RevokeAccess;", "Lcom/revolut/sso/impl/ui/revolut_id/connected_apps/connected_app_details/ConnectedAppDetailsFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevokeAccess extends ConnectedAppDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevokeAccess f106718a = new RevokeAccess();

        @NotNull
        public static final Parcelable.Creator<RevokeAccess> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevokeAccess.f106718a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevokeAccess[i];
            }
        }

        private RevokeAccess() {
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

    private ConnectedAppDetailsFlowContract$Step() {
    }
}
