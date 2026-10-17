package com.revolut.feature.devicemanagement.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/devicemanagement/impl/ui/flow/DeviceManagementFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DeviceList", "DeviceDetails", "PasscodeChange", "Lcom/revolut/feature/devicemanagement/impl/ui/flow/DeviceManagementFlowContract$Step$DeviceDetails;", "Lcom/revolut/feature/devicemanagement/impl/ui/flow/DeviceManagementFlowContract$Step$DeviceList;", "Lcom/revolut/feature/devicemanagement/impl/ui/flow/DeviceManagementFlowContract$Step$PasscodeChange;", "feature_device_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DeviceManagementFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/devicemanagement/impl/ui/flow/DeviceManagementFlowContract$Step$DeviceDetails;", "Lcom/revolut/feature/devicemanagement/impl/ui/flow/DeviceManagementFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_device_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeviceDetails extends DeviceManagementFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DeviceDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeviceManagementDestination.Config.DeviceDetails f71936a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeviceDetails((DeviceManagementDestination.Config.DeviceDetails) parcel.readParcelable(DeviceDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeviceDetails[i];
            }
        }

        public DeviceDetails(DeviceManagementDestination.Config.DeviceDetails config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f71936a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeviceDetails) && Intrinsics.f(this.f71936a, ((DeviceDetails) obj2).f71936a);
        }

        public final int hashCode() {
            return this.f71936a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71936a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/devicemanagement/impl/ui/flow/DeviceManagementFlowContract$Step$DeviceList;", "Lcom/revolut/feature/devicemanagement/impl/ui/flow/DeviceManagementFlowContract$Step;", "<init>", "()V", "feature_device_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeviceList extends DeviceManagementFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeviceList f71937a = new DeviceList();

        @NotNull
        public static final Parcelable.Creator<DeviceList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeviceList.f71937a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeviceList[i];
            }
        }

        private DeviceList() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/devicemanagement/impl/ui/flow/DeviceManagementFlowContract$Step$PasscodeChange;", "Lcom/revolut/feature/devicemanagement/impl/ui/flow/DeviceManagementFlowContract$Step;", "<init>", "()V", "feature_device_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PasscodeChange extends DeviceManagementFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PasscodeChange f71938a = new PasscodeChange();

        @NotNull
        public static final Parcelable.Creator<PasscodeChange> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PasscodeChange.f71938a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PasscodeChange[i];
            }
        }

        private PasscodeChange() {
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

    private DeviceManagementFlowContract$Step() {
    }
}
