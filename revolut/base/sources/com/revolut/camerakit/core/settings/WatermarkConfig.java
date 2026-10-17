package com.revolut.camerakit.core.settings;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/camerakit/core/settings/WatermarkConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "camera_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WatermarkConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f50749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50750c;
    public final int d;

    @NotNull
    public static final Parcelable.Creator<WatermarkConfig> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatermarkConfig(parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WatermarkConfig[i];
        }
    }

    public WatermarkConfig() {
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
        if (!(obj2 instanceof WatermarkConfig)) {
            return false;
        }
        WatermarkConfig watermarkConfig = (WatermarkConfig) obj2;
        return this.f50748a == watermarkConfig.f50748a && Float.compare(this.f50749b, watermarkConfig.f50749b) == 0 && this.f50750c == watermarkConfig.f50750c && this.d == watermarkConfig.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f50750c, m72.b.b(this.f50749b, Integer.hashCode(this.f50748a) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f50748a);
        dest.writeFloat(this.f50749b);
        dest.writeInt(this.f50750c);
        dest.writeInt(this.d);
    }

    public WatermarkConfig(float f, int i, int i2, int i3) {
        this.f50748a = i;
        this.f50749b = f;
        this.f50750c = i2;
        this.d = i3;
    }

    public /* synthetic */ WatermarkConfig(int i) {
        this(0.05f, 4, 5, 32);
    }
}
