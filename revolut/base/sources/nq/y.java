package nq;

import com.revolut.camerakit.core.errors.CameraKitException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class y implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitException f218338a;

    public y(CameraKitException cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f218338a = cause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f218338a, ((y) obj2).f218338a);
    }

    public final int hashCode() {
        return this.f218338a.hashCode();
    }
}
