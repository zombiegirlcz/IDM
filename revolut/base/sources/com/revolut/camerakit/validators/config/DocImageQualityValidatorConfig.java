package com.revolut.camerakit.validators.config;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/camerakit/validators/config/DocImageQualityValidatorConfig;", "Landroid/os/Parcelable;", "Lcom/revolut/camerakit/validators/config/ValidatorConfig;", "", "toString", "()Ljava/lang/String;", "Thresholds", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocImageQualityValidatorConfig implements Parcelable, ValidatorConfig {

    @NotNull
    public static final Parcelable.Creator<DocImageQualityValidatorConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thresholds f50908c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/validators/config/DocImageQualityValidatorConfig$Thresholds;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Thresholds implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Thresholds> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f50909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f50910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f50911c;
        public final float d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Thresholds(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Thresholds[i];
            }
        }

        public Thresholds(float f, float f4, float f5, float f6) {
            this.f50909a = f;
            this.f50910b = f4;
            this.f50911c = f5;
            this.d = f6;
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
            return Float.compare(this.f50909a, thresholds.f50909a) == 0 && Float.compare(this.f50910b, thresholds.f50910b) == 0 && Float.compare(this.f50911c, thresholds.f50911c) == 0 && Float.compare(this.d, thresholds.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + b.b(this.f50911c, b.b(this.f50910b, Float.hashCode(this.f50909a) * 31, 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.f50909a);
            dest.writeFloat(this.f50910b);
            dest.writeFloat(this.f50911c);
            dest.writeFloat(this.d);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocImageQualityValidatorConfig(parcel.readString(), parcel.readString(), Thresholds.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocImageQualityValidatorConfig[i];
        }
    }

    public DocImageQualityValidatorConfig(String modelName, String checkSum, Thresholds thresholds) {
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        Intrinsics.checkNotNullParameter(checkSum, "checkSum");
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        this.f50906a = modelName;
        this.f50907b = checkSum;
        this.f50908c = thresholds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocImageQualityValidatorConfig)) {
            return false;
        }
        DocImageQualityValidatorConfig docImageQualityValidatorConfig = (DocImageQualityValidatorConfig) obj2;
        return Intrinsics.f(this.f50906a, docImageQualityValidatorConfig.f50906a) && Intrinsics.f(this.f50907b, docImageQualityValidatorConfig.f50907b) && Intrinsics.f(this.f50908c, docImageQualityValidatorConfig.f50908c);
    }

    public final int hashCode() {
        return this.f50908c.hashCode() + p.a.c(this.f50906a.hashCode() * 31, 31, this.f50907b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f50906a);
        dest.writeString(this.f50907b);
        this.f50908c.writeToParcel(dest, i);
    }
}
