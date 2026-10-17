package com.revolut.camerakit.validators.config;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/camerakit/validators/config/FaceQualityValidatorConfig;", "Landroid/os/Parcelable;", "Lcom/revolut/camerakit/validators/config/ValidatorConfig;", "RevolutVisionFaceQualityValidatorConfig", "DownloadableFaceQualityValidatorConfig", "Lcom/revolut/camerakit/validators/config/FaceQualityValidatorConfig$DownloadableFaceQualityValidatorConfig;", "Lcom/revolut/camerakit/validators/config/FaceQualityValidatorConfig$RevolutVisionFaceQualityValidatorConfig;", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FaceQualityValidatorConfig extends Parcelable, ValidatorConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/camerakit/validators/config/FaceQualityValidatorConfig$DownloadableFaceQualityValidatorConfig;", "Lcom/revolut/camerakit/validators/config/FaceQualityValidatorConfig;", "", "toString", "()Ljava/lang/String;", "Thresholds", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DownloadableFaceQualityValidatorConfig implements FaceQualityValidatorConfig {

        @NotNull
        public static final Parcelable.Creator<DownloadableFaceQualityValidatorConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f50919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Thresholds f50920c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/validators/config/FaceQualityValidatorConfig$DownloadableFaceQualityValidatorConfig$Thresholds;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Thresholds implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Thresholds> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f50921a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f50922b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final float f50923c;
            public final float d;
            public final float e;
            public final float f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final float f50924g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final float f50925h;
            public final float i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final float f50926j;
            public final float k;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Thresholds(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Thresholds[i];
                }
            }

            public Thresholds(float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, float f57) {
                this.f50921a = f;
                this.f50922b = f4;
                this.f50923c = f5;
                this.d = f6;
                this.e = f32;
                this.f = f35;
                this.f50924g = f36;
                this.f50925h = f37;
                this.i = f41;
                this.f50926j = f42;
                this.k = f57;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Thresholds)) {
                    return false;
                }
                Thresholds thresholds = (Thresholds) obj2;
                return Float.compare(this.f50921a, thresholds.f50921a) == 0 && Float.compare(this.f50922b, thresholds.f50922b) == 0 && Float.compare(this.f50923c, thresholds.f50923c) == 0 && Float.compare(this.d, thresholds.d) == 0 && Float.compare(this.e, thresholds.e) == 0 && Float.compare(this.f, thresholds.f) == 0 && Float.compare(this.f50924g, thresholds.f50924g) == 0 && Float.compare(this.f50925h, thresholds.f50925h) == 0 && Float.compare(this.i, thresholds.i) == 0 && Float.compare(this.f50926j, thresholds.f50926j) == 0 && Float.compare(this.k, thresholds.k) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.k) + b.b(this.f50926j, b.b(this.i, b.b(this.f50925h, b.b(this.f50924g, b.b(this.f, b.b(this.e, b.b(this.d, b.b(this.f50923c, b.b(this.f50922b, Float.hashCode(this.f50921a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeFloat(this.f50921a);
                dest.writeFloat(this.f50922b);
                dest.writeFloat(this.f50923c);
                dest.writeFloat(this.d);
                dest.writeFloat(this.e);
                dest.writeFloat(this.f);
                dest.writeFloat(this.f50924g);
                dest.writeFloat(this.f50925h);
                dest.writeFloat(this.i);
                dest.writeFloat(this.f50926j);
                dest.writeFloat(this.k);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DownloadableFaceQualityValidatorConfig(parcel.readString(), parcel.readString(), Thresholds.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DownloadableFaceQualityValidatorConfig[i];
            }
        }

        public DownloadableFaceQualityValidatorConfig(String modelName, String checkSum, Thresholds thresholds) {
            Intrinsics.checkNotNullParameter(modelName, "modelName");
            Intrinsics.checkNotNullParameter(checkSum, "checkSum");
            Intrinsics.checkNotNullParameter(thresholds, "thresholds");
            this.f50918a = modelName;
            this.f50919b = checkSum;
            this.f50920c = thresholds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DownloadableFaceQualityValidatorConfig)) {
                return false;
            }
            DownloadableFaceQualityValidatorConfig downloadableFaceQualityValidatorConfig = (DownloadableFaceQualityValidatorConfig) obj2;
            return Intrinsics.f(this.f50918a, downloadableFaceQualityValidatorConfig.f50918a) && Intrinsics.f(this.f50919b, downloadableFaceQualityValidatorConfig.f50919b) && Intrinsics.f(this.f50920c, downloadableFaceQualityValidatorConfig.f50920c);
        }

        public final int hashCode() {
            return this.f50920c.hashCode() + p.a.c(this.f50918a.hashCode() * 31, 31, this.f50919b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50918a);
            dest.writeString(this.f50919b);
            this.f50920c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/validators/config/FaceQualityValidatorConfig$RevolutVisionFaceQualityValidatorConfig;", "Lcom/revolut/camerakit/validators/config/FaceQualityValidatorConfig;", "", "toString", "()Ljava/lang/String;", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutVisionFaceQualityValidatorConfig implements FaceQualityValidatorConfig {

        @NotNull
        public static final Parcelable.Creator<RevolutVisionFaceQualityValidatorConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f50927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f50928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f50929c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevolutVisionFaceQualityValidatorConfig(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutVisionFaceQualityValidatorConfig[i];
            }
        }

        public RevolutVisionFaceQualityValidatorConfig() {
            this(true, true, true);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevolutVisionFaceQualityValidatorConfig)) {
                return false;
            }
            RevolutVisionFaceQualityValidatorConfig revolutVisionFaceQualityValidatorConfig = (RevolutVisionFaceQualityValidatorConfig) obj2;
            return this.f50927a == revolutVisionFaceQualityValidatorConfig.f50927a && this.f50928b == revolutVisionFaceQualityValidatorConfig.f50928b && this.f50929c == revolutVisionFaceQualityValidatorConfig.f50929c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50929c) + j6.a.c(Boolean.hashCode(this.f50927a) * 31, 31, this.f50928b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f50927a ? 1 : 0);
            dest.writeInt(this.f50928b ? 1 : 0);
            dest.writeInt(this.f50929c ? 1 : 0);
        }

        public RevolutVisionFaceQualityValidatorConfig(boolean z, boolean z3, boolean z4) {
            this.f50927a = z;
            this.f50928b = z3;
            this.f50929c = z4;
        }
    }
}
