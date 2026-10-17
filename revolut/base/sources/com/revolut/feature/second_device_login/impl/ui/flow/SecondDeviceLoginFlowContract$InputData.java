package com.revolut.feature.second_device_login.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/second_device_login/impl/ui/flow/SecondDeviceLoginFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_second_device_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SecondDeviceLoginFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SecondDeviceLoginFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final etc.a f85359b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SecondDeviceLoginFlowContract$InputData(parcel.readString(), etc.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SecondDeviceLoginFlowContract$InputData[i];
        }
    }

    public SecondDeviceLoginFlowContract$InputData(String deviceId, etc.a flowType) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f85358a = deviceId;
        this.f85359b = flowType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SecondDeviceLoginFlowContract$InputData)) {
            return false;
        }
        SecondDeviceLoginFlowContract$InputData secondDeviceLoginFlowContract$InputData = (SecondDeviceLoginFlowContract$InputData) obj2;
        return Intrinsics.f(this.f85358a, secondDeviceLoginFlowContract$InputData.f85358a) && this.f85359b == secondDeviceLoginFlowContract$InputData.f85359b;
    }

    public final int hashCode() {
        return this.f85359b.hashCode() + (this.f85358a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85358a);
        dest.writeString(this.f85359b.name());
    }
}
