package com.revolut.camerakit.validators.exceptions;

import com.revolut.camerakit.core.errors.CameraKitException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/camerakit/validators/exceptions/CameraKitValidatorException;", "Lcom/revolut/camerakit/core/errors/CameraKitException;", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CameraKitValidatorException extends CameraKitException {
    /* JADX WARN: Illegal instructions before constructor call */
    public CameraKitValidatorException(String message, Throwable th10, int i) {
        th10 = (i & 2) != 0 ? null : th10;
        Map cameraInfo = r0.g();
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        super(message, th10, cameraInfo);
    }
}
