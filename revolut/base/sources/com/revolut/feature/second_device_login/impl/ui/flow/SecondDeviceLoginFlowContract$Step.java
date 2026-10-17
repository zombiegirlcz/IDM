package com.revolut.feature.second_device_login.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Details", "ConfirmLogin", "ChangePasscode", "DeviceManagement", "Lcom/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step$ChangePasscode;", "Lcom/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step$ConfirmLogin;", "Lcom/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step$Details;", "Lcom/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step$DeviceManagement;", "feature_second_device_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SecondDeviceLoginFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step$ChangePasscode;", "Lcom/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step;", "<init>", "()V", "feature_second_device_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangePasscode implements SecondDeviceLoginFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangePasscode f85360a = new ChangePasscode();

        @NotNull
        public static final Parcelable.Creator<ChangePasscode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangePasscode.f85360a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangePasscode[i];
            }
        }

        private ChangePasscode() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step$ConfirmLogin;", "Lcom/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step;", "<init>", "()V", "feature_second_device_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConfirmLogin implements SecondDeviceLoginFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmLogin f85361a = new ConfirmLogin();

        @NotNull
        public static final Parcelable.Creator<ConfirmLogin> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfirmLogin.f85361a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmLogin[i];
            }
        }

        private ConfirmLogin() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step$Details;", "Lcom/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step;", "<init>", "()V", "feature_second_device_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details implements SecondDeviceLoginFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Details f85362a = new Details();

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Details.f85362a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step$DeviceManagement;", "Lcom/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$Step;", "<init>", "()V", "feature_second_device_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeviceManagement implements SecondDeviceLoginFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeviceManagement f85363a = new DeviceManagement();

        @NotNull
        public static final Parcelable.Creator<DeviceManagement> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeviceManagement.f85363a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeviceManagement[i];
            }
        }

        private DeviceManagement() {
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
