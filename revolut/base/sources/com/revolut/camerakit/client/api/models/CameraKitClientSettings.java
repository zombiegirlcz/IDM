package com.revolut.camerakit.client.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CameraKitClientSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CameraKitClientSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CameraKitClientSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSettings f50706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptureMode f50707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50708c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CameraKitClientSettings((CameraCaptureSettings) parcel.readParcelable(CameraKitClientSettings.class.getClassLoader()), (CaptureMode) parcel.readParcelable(CameraKitClientSettings.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CameraKitClientSettings[i];
        }
    }

    public CameraKitClientSettings(CameraCaptureSettings cameraCaptureSettings, CaptureMode captureMode, boolean z) {
        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "cameraCaptureSettings");
        Intrinsics.checkNotNullParameter(captureMode, "captureMode");
        this.f50706a = cameraCaptureSettings;
        this.f50707b = captureMode;
        this.f50708c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CameraKitClientSettings)) {
            return false;
        }
        CameraKitClientSettings cameraKitClientSettings = (CameraKitClientSettings) obj2;
        return Intrinsics.f(this.f50706a, cameraKitClientSettings.f50706a) && Intrinsics.f(this.f50707b, cameraKitClientSettings.f50707b) && this.f50708c == cameraKitClientSettings.f50708c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50708c) + ((this.f50707b.hashCode() + (this.f50706a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f50706a, i);
        dest.writeParcelable(this.f50707b, i);
        dest.writeInt(this.f50708c ? 1 : 0);
    }
}
