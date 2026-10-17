package com.revolut.camerakit.core.errors;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/camerakit/core/errors/CameraCaptureException;", "Lcom/revolut/camerakit/core/errors/CameraKitException;", "camera_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraCaptureException extends CameraKitException {
    /* JADX WARN: Illegal instructions before constructor call */
    public CameraCaptureException(Throwable th10) {
        Map cameraInfo = r0.g();
        Intrinsics.checkNotNullParameter("Capturing failed", "message");
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        super("Capturing failed", th10, cameraInfo);
    }
}
