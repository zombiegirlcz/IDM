package ly;

import com.revolut.camerakit.core.errors.CameraKitException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitException f200610a;

    public d(CameraKitException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f200610a = exception;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f200610a, ((d) obj2).f200610a);
    }

    public final int hashCode() {
        return this.f200610a.hashCode();
    }
}
