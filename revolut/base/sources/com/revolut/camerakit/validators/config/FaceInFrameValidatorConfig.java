package com.revolut.camerakit.validators.config;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/camerakit/validators/config/FaceInFrameValidatorConfig;", "Landroid/os/Parcelable;", "Lcom/revolut/camerakit/validators/config/ValidatorConfig;", "", "toString", "()Ljava/lang/String;", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FaceInFrameValidatorConfig implements Parcelable, ValidatorConfig {

    @NotNull
    public static final Parcelable.Creator<FaceInFrameValidatorConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f50915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f50916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f50917c;
    public final float d;
    public final float e;
    public final float f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FaceInFrameValidatorConfig(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FaceInFrameValidatorConfig[i];
        }
    }

    public FaceInFrameValidatorConfig(float f, float f4, float f5, float f6, float f32, float f35) {
        this.f50915a = f;
        this.f50916b = f4;
        this.f50917c = f5;
        this.d = f6;
        this.e = f32;
        this.f = f35;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FaceInFrameValidatorConfig)) {
            return false;
        }
        FaceInFrameValidatorConfig faceInFrameValidatorConfig = (FaceInFrameValidatorConfig) obj2;
        return Float.compare(this.f50915a, faceInFrameValidatorConfig.f50915a) == 0 && Float.compare(this.f50916b, faceInFrameValidatorConfig.f50916b) == 0 && Float.compare(this.f50917c, faceInFrameValidatorConfig.f50917c) == 0 && Float.compare(this.d, faceInFrameValidatorConfig.d) == 0 && Float.compare(this.e, faceInFrameValidatorConfig.e) == 0 && Float.compare(this.f, faceInFrameValidatorConfig.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + b.b(this.e, b.b(this.d, b.b(this.f50917c, b.b(this.f50916b, Float.hashCode(this.f50915a) * 31, 31), 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.f50915a);
        dest.writeFloat(this.f50916b);
        dest.writeFloat(this.f50917c);
        dest.writeFloat(this.d);
        dest.writeFloat(this.e);
        dest.writeFloat(this.f);
    }
}
