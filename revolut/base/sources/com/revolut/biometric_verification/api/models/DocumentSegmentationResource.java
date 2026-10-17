package com.revolut.biometric_verification.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/api/models/DocumentSegmentationResource;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationVisionRemoteResource;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentSegmentationResource implements BiometricVerificationVisionRemoteResource {

    @NotNull
    public static final Parcelable.Creator<DocumentSegmentationResource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50440c;
    public final float d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentSegmentationResource(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentSegmentationResource[i];
        }
    }

    public DocumentSegmentationResource(String url2, String fileName, String checksum, float f) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(checksum, "checksum");
        this.f50438a = url2;
        this.f50439b = fileName;
        this.f50440c = checksum;
        this.d = f;
    }

    @Override // com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource
    /* JADX INFO: renamed from: I6, reason: from getter */
    public final String getF50440c() {
        return this.f50440c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentSegmentationResource)) {
            return false;
        }
        DocumentSegmentationResource documentSegmentationResource = (DocumentSegmentationResource) obj2;
        return Intrinsics.f(this.f50438a, documentSegmentationResource.f50438a) && Intrinsics.f(this.f50439b, documentSegmentationResource.f50439b) && Intrinsics.f(this.f50440c, documentSegmentationResource.f50440c) && Float.compare(this.d, documentSegmentationResource.d) == 0;
    }

    @Override // com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource
    /* JADX INFO: renamed from: getFileName, reason: from getter */
    public final String getF50442b() {
        return this.f50439b;
    }

    @Override // com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource
    /* JADX INFO: renamed from: getUrl, reason: from getter */
    public final String getF50441a() {
        return this.f50438a;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + p.a.c(p.a.c(this.f50438a.hashCode() * 31, 31, this.f50439b), 31, this.f50440c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f50438a);
        dest.writeString(this.f50439b);
        dest.writeString(this.f50440c);
        dest.writeFloat(this.d);
    }
}
