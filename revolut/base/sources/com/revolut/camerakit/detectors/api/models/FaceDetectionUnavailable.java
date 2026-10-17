package com.revolut.camerakit.detectors.api.models;

import com.revolut.camerakit.core.errors.CameraKitException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/camerakit/detectors/api/models/FaceDetectionUnavailable;", "Lcom/revolut/camerakit/core/errors/CameraKitException;", "camera_kit_detectors_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FaceDetectionUnavailable extends CameraKitException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceDetectionUnavailable(RuntimeException cause) {
        super("Face detection unavailable at this moment", cause, 4);
        Intrinsics.checkNotNullParameter("Face detection unavailable at this moment", "message");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
