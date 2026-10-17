package io.fotoapparat.exception.camera;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import uam.h;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/fotoapparat/exception/camera/InvalidConfigurationException;", "Lio/fotoapparat/exception/camera/CameraException;", "fotoapparat_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class InvalidConfigurationException extends CameraException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidConfigurationException(h value, Class klass, Collection supportedParameters) {
        super(null, klass.getSimpleName() + " configuration selector selected value " + value + ". However it's not in the supported set of values. Supported parameters: " + supportedParameters);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(supportedParameters, "supportedParameters");
    }
}
