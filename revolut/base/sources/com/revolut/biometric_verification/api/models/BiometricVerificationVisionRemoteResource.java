package com.revolut.biometric_verification.api.models;

import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationVisionRemoteResource;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationVisionResource;", "Landroid/os/Parcelable;", "Lcom/revolut/biometric_verification/api/models/DocumentClassificationResource;", "Lcom/revolut/biometric_verification/api/models/DocumentDetectionResource;", "Lcom/revolut/biometric_verification/api/models/DocumentQualityResource;", "Lcom/revolut/biometric_verification/api/models/DocumentSegmentationResource;", "Lcom/revolut/biometric_verification/api/models/FaceDetectionResource;", "Lcom/revolut/biometric_verification/api/models/FaceQualityResource;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationVisionRemoteResource extends BiometricVerificationVisionResource, Parcelable {
    String I6();

    String getFileName();

    String getUrl();
}
