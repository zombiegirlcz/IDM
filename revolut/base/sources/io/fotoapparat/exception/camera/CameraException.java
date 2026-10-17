package io.fotoapparat.exception.camera;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/fotoapparat/exception/camera/CameraException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fotoapparat_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class CameraException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraException(RuntimeException runtimeException, String message) {
        super(message, runtimeException);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
