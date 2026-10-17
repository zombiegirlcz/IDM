package com.revolut.camerakit.core.errors;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/camerakit/core/errors/CameraXInitException;", "Lcom/revolut/camerakit/core/errors/CameraInitException;", "camera_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CameraXInitException extends CameraInitException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraXInitException(String message, Throwable th10, Map cameraInfo) {
        super(message, th10, cameraInfo);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
    }
}
