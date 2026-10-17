package io.fotoapparat.exception.camera;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/fotoapparat/exception/camera/UnsupportedLensException;", "Lio/fotoapparat/exception/camera/CameraException;", "()V", "fotoapparat_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UnsupportedLensException extends CameraException {
    public UnsupportedLensException() {
        super(null, "Device has no camera for the desired lens position(s).");
    }
}
