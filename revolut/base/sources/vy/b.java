package vy;

import com.revolut.camerakit.core.errors.CameraKitException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitException f293113a;

    public b(CameraKitException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f293113a = exception;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f293113a, ((b) obj2).f293113a);
    }

    public final int hashCode() {
        return this.f293113a.hashCode();
    }
}
