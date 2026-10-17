package com.revolut.feature.devicemanagement.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/devicemanagement/api/navigation/DeviceManagementDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/devicemanagement/api/navigation/DeviceManagementDestination$Config;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Config", "feature_device_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeviceManagementDestination extends InternalDestination<Config> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<DeviceManagementDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f71931b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/devicemanagement/api/navigation/DeviceManagementDestination$Config;", "Lcom/revolut/kompot/common/IOData$Input;", "Home", "DeviceDetails", "Lcom/revolut/feature/devicemanagement/api/navigation/DeviceManagementDestination$Config$DeviceDetails;", "Lcom/revolut/feature/devicemanagement/api/navigation/DeviceManagementDestination$Config$Home;", "feature_device_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Config extends IOData$Input {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/devicemanagement/api/navigation/DeviceManagementDestination$Config$DeviceDetails;", "Lcom/revolut/feature/devicemanagement/api/navigation/DeviceManagementDestination$Config;", "", "toString", "()Ljava/lang/String;", "feature_device_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DeviceDetails implements Config {

            @NotNull
            public static final Parcelable.Creator<DeviceDetails> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f71932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f71933b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DeviceDetails(parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DeviceDetails[i];
                }
            }

            public DeviceDetails(String deviceId, boolean z) {
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                this.f71932a = deviceId;
                this.f71933b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DeviceDetails)) {
                    return false;
                }
                DeviceDetails deviceDetails = (DeviceDetails) obj2;
                return Intrinsics.f(this.f71932a, deviceDetails.f71932a) && this.f71933b == deviceDetails.f71933b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f71933b) + (this.f71932a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f71932a);
                dest.writeInt(this.f71933b ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/devicemanagement/api/navigation/DeviceManagementDestination$Config$Home;", "Lcom/revolut/feature/devicemanagement/api/navigation/DeviceManagementDestination$Config;", "<init>", "()V", "feature_device_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Home implements Config {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Home f71934a = new Home();

            @NotNull
            public static final Parcelable.Creator<Home> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Home.f71934a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Home[i];
                }
            }

            private Home() {
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

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceManagementDestination((Config) parcel.readParcelable(DeviceManagementDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeviceManagementDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceManagementDestination(Config config) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        this.f71931b = config;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Config getF71931b() {
        return this.f71931b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof DeviceManagementDestination) && Intrinsics.f(this.f71931b, ((DeviceManagementDestination) obj2).f71931b);
    }

    public final int hashCode() {
        return this.f71931b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f71931b, i);
    }
}
