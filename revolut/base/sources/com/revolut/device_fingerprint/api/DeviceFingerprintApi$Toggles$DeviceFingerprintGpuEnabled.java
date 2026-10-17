package com.revolut.device_fingerprint.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/device_fingerprint/api/DeviceFingerprintApi$Toggles$DeviceFingerprintGpuEnabled", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "device_fingerprint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceFingerprintApi$Toggles$DeviceFingerprintGpuEnabled extends RemoteFeatureDefinition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DeviceFingerprintApi$Toggles$DeviceFingerprintGpuEnabled f60255c = new DeviceFingerprintApi$Toggles$DeviceFingerprintGpuEnabled();

    @NotNull
    public static final Parcelable.Creator<DeviceFingerprintApi$Toggles$DeviceFingerprintGpuEnabled> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return DeviceFingerprintApi$Toggles$DeviceFingerprintGpuEnabled.f60255c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeviceFingerprintApi$Toggles$DeviceFingerprintGpuEnabled[i];
        }
    }

    private DeviceFingerprintApi$Toggles$DeviceFingerprintGpuEnabled() {
    }

    @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
    public final Experiment a() {
        return DeviceFingerprintApi$Toggles$DeviceFingerprintGPUEnabledFirebaseExperiment.f60254c;
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
