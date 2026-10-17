package com.revolut.camerakit.core.settings;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/core/settings/WatermarkSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "camera_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WatermarkSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WatermarkSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WatermarkConfig f50752b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatermarkSettings(parcel.readInt() != 0, WatermarkConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WatermarkSettings[i];
        }
    }

    public WatermarkSettings(boolean z, WatermarkConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f50751a = z;
        this.f50752b = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WatermarkSettings)) {
            return false;
        }
        WatermarkSettings watermarkSettings = (WatermarkSettings) obj2;
        return this.f50751a == watermarkSettings.f50751a && Intrinsics.f(this.f50752b, watermarkSettings.f50752b);
    }

    public final int hashCode() {
        return this.f50752b.hashCode() + (Boolean.hashCode(this.f50751a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f50751a ? 1 : 0);
        this.f50752b.writeToParcel(dest, i);
    }

    public /* synthetic */ WatermarkSettings() {
        this(false, new WatermarkConfig(0));
    }
}
