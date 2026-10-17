package com.revolut.biometric_verification.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/api/models/DocumentQualityResource;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationVisionRemoteResource;", "", "toString", "()Ljava/lang/String;", "Thresholds", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentQualityResource implements BiometricVerificationVisionRemoteResource {

    @NotNull
    public static final Parcelable.Creator<DocumentQualityResource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50434c;
    public final Thresholds d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/api/models/DocumentQualityResource$Thresholds;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Thresholds implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Thresholds> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f50435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f50436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f50437c;
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
            this.f50435a = f;
            this.f50436b = f4;
            this.f50437c = f5;
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
            return Float.compare(this.f50435a, thresholds.f50435a) == 0 && Float.compare(this.f50436b, thresholds.f50436b) == 0 && Float.compare(this.f50437c, thresholds.f50437c) == 0 && Float.compare(this.d, thresholds.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + b.b(this.f50437c, b.b(this.f50436b, Float.hashCode(this.f50435a) * 31, 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.f50435a);
            dest.writeFloat(this.f50436b);
            dest.writeFloat(this.f50437c);
            dest.writeFloat(this.d);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentQualityResource(parcel.readString(), parcel.readString(), parcel.readString(), Thresholds.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentQualityResource[i];
        }
    }

    public DocumentQualityResource(String url2, String fileName, String checksum, Thresholds thresholds) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(checksum, "checksum");
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        this.f50432a = url2;
        this.f50433b = fileName;
        this.f50434c = checksum;
        this.d = thresholds;
    }

    @Override // com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource
    /* JADX INFO: renamed from: I6, reason: from getter */
    public final String getF50446c() {
        return this.f50434c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentQualityResource)) {
            return false;
        }
        DocumentQualityResource documentQualityResource = (DocumentQualityResource) obj2;
        return Intrinsics.f(this.f50432a, documentQualityResource.f50432a) && Intrinsics.f(this.f50433b, documentQualityResource.f50433b) && Intrinsics.f(this.f50434c, documentQualityResource.f50434c) && Intrinsics.f(this.d, documentQualityResource.d);
    }

    @Override // com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource
    /* JADX INFO: renamed from: getFileName, reason: from getter */
    public final String getF50445b() {
        return this.f50433b;
    }

    @Override // com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource
    /* JADX INFO: renamed from: getUrl, reason: from getter */
    public final String getF50444a() {
        return this.f50432a;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f50432a.hashCode() * 31, 31, this.f50433b), 31, this.f50434c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f50432a);
        dest.writeString(this.f50433b);
        dest.writeString(this.f50434c);
        this.d.writeToParcel(dest, i);
    }
}
