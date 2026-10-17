package dv;

import com.revolut.camerakit.core.errors.CameraKitException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitException f118000a;

    public b(CameraKitException cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f118000a = cause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f118000a, ((b) obj2).f118000a);
    }

    public final int hashCode() {
        return this.f118000a.hashCode();
    }
}
