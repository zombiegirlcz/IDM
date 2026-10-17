package com.revolut.camerakit.core.settings;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/camerakit/core/settings/VideoImuDataCollectionSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "camera_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoImuDataCollectionSettings implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f50744b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<VideoImuDataCollectionSettings> CREATOR = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final VideoImuDataCollectionSettings f50742c = new VideoImuDataCollectionSettings(0);

    /* JADX INFO: renamed from: com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VideoImuDataCollectionSettings(parcel.readInt() != 0, parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoImuDataCollectionSettings[i];
        }
    }

    public VideoImuDataCollectionSettings() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VideoImuDataCollectionSettings)) {
            return false;
        }
        VideoImuDataCollectionSettings videoImuDataCollectionSettings = (VideoImuDataCollectionSettings) obj2;
        return this.f50743a == videoImuDataCollectionSettings.f50743a && Double.compare(this.f50744b, videoImuDataCollectionSettings.f50744b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f50744b) + (Boolean.hashCode(this.f50743a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f50743a ? 1 : 0);
        dest.writeDouble(this.f50744b);
    }

    public VideoImuDataCollectionSettings(boolean z, double d) {
        this.f50743a = z;
        this.f50744b = d;
    }

    public /* synthetic */ VideoImuDataCollectionSettings(int i) {
        this(false, 100.0d);
    }
}
