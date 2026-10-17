package com.revolut.feature.second_device_login.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/second_device_login/api/SecondDeviceLoginDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_second_device_login_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SecondDeviceLoginDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SecondDeviceLoginDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final etc.a f85356b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SecondDeviceLoginDestination(parcel.readString(), etc.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SecondDeviceLoginDestination[i];
        }
    }

    public SecondDeviceLoginDestination(String deviceId, etc.a flowType) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f85355a = deviceId;
        this.f85356b = flowType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF85355a() {
        return this.f85355a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final etc.a getF85356b() {
        return this.f85356b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SecondDeviceLoginDestination)) {
            return false;
        }
        SecondDeviceLoginDestination secondDeviceLoginDestination = (SecondDeviceLoginDestination) obj2;
        return Intrinsics.f(this.f85355a, secondDeviceLoginDestination.f85355a) && this.f85356b == secondDeviceLoginDestination.f85356b;
    }

    public final int hashCode() {
        return this.f85356b.hashCode() + (this.f85355a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85355a);
        dest.writeString(this.f85356b.name());
    }
}
