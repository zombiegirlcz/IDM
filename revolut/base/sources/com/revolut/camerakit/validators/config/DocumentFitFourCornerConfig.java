package com.revolut.camerakit.validators.config;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/camerakit/validators/config/DocumentFitFourCornerConfig;", "Landroid/os/Parcelable;", "Lcom/revolut/camerakit/validators/config/ValidatorConfig;", "", "toString", "()Ljava/lang/String;", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentFitFourCornerConfig implements Parcelable, ValidatorConfig {

    @NotNull
    public static final Parcelable.Creator<DocumentFitFourCornerConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f50914c;
    public final float d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentFitFourCornerConfig(parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentFitFourCornerConfig[i];
        }
    }

    public DocumentFitFourCornerConfig(String modelName, String checkSum, float f, float f4) {
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        Intrinsics.checkNotNullParameter(checkSum, "checkSum");
        this.f50912a = modelName;
        this.f50913b = checkSum;
        this.f50914c = f;
        this.d = f4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentFitFourCornerConfig)) {
            return false;
        }
        DocumentFitFourCornerConfig documentFitFourCornerConfig = (DocumentFitFourCornerConfig) obj2;
        return Intrinsics.f(this.f50912a, documentFitFourCornerConfig.f50912a) && Intrinsics.f(this.f50913b, documentFitFourCornerConfig.f50913b) && Float.compare(this.f50914c, documentFitFourCornerConfig.f50914c) == 0 && Float.compare(this.d, documentFitFourCornerConfig.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + b.b(this.f50914c, p.a.c(this.f50912a.hashCode() * 31, 31, this.f50913b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f50912a);
        dest.writeString(this.f50913b);
        dest.writeFloat(this.f50914c);
        dest.writeFloat(this.d);
    }
}
