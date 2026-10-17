package com.revolut.camerakit.validators.config;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/camerakit/validators/config/BrightnessValidatorConfig;", "Landroid/os/Parcelable;", "Lcom/revolut/camerakit/validators/config/ValidatorConfig;", "", "toString", "()Ljava/lang/String;", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BrightnessValidatorConfig implements Parcelable, ValidatorConfig {

    @NotNull
    public static final Parcelable.Creator<BrightnessValidatorConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f50901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f50902b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrightnessValidatorConfig(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BrightnessValidatorConfig[i];
        }
    }

    public BrightnessValidatorConfig(float f, float f4) {
        this.f50901a = f;
        this.f50902b = f4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BrightnessValidatorConfig)) {
            return false;
        }
        BrightnessValidatorConfig brightnessValidatorConfig = (BrightnessValidatorConfig) obj2;
        return Float.compare(this.f50901a, brightnessValidatorConfig.f50901a) == 0 && Float.compare(this.f50902b, brightnessValidatorConfig.f50902b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f50902b) + (Float.hashCode(this.f50901a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.f50901a);
        dest.writeFloat(this.f50902b);
    }
}
