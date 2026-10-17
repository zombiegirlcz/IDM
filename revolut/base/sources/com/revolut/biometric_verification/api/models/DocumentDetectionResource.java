package com.revolut.biometric_verification.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/api/models/DocumentDetectionResource;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationVisionRemoteResource;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentDetectionResource implements BiometricVerificationVisionRemoteResource {

    @NotNull
    public static final Parcelable.Creator<DocumentDetectionResource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50430c;
    public final float d;
    public final float e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentDetectionResource(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentDetectionResource[i];
        }
    }

    public DocumentDetectionResource(String url2, String fileName, String checksum, float f, float f4) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(checksum, "checksum");
        this.f50428a = url2;
        this.f50429b = fileName;
        this.f50430c = checksum;
        this.d = f;
        this.e = f4;
    }

    @Override // com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource
    /* JADX INFO: renamed from: I6, reason: from getter */
    public final String getF50446c() {
        return this.f50430c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentDetectionResource)) {
            return false;
        }
        DocumentDetectionResource documentDetectionResource = (DocumentDetectionResource) obj2;
        return Intrinsics.f(this.f50428a, documentDetectionResource.f50428a) && Intrinsics.f(this.f50429b, documentDetectionResource.f50429b) && Intrinsics.f(this.f50430c, documentDetectionResource.f50430c) && Float.compare(this.d, documentDetectionResource.d) == 0 && Float.compare(this.e, documentDetectionResource.e) == 0;
    }

    @Override // com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource
    /* JADX INFO: renamed from: getFileName, reason: from getter */
    public final String getF50445b() {
        return this.f50429b;
    }

    @Override // com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource
    /* JADX INFO: renamed from: getUrl, reason: from getter */
    public final String getF50444a() {
        return this.f50428a;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + b.b(this.d, p.a.c(p.a.c(this.f50428a.hashCode() * 31, 31, this.f50429b), 31, this.f50430c), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f50428a);
        dest.writeString(this.f50429b);
        dest.writeString(this.f50430c);
        dest.writeFloat(this.d);
        dest.writeFloat(this.e);
    }
}
