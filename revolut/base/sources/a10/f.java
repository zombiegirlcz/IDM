package a10;

import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitValidatorException f451a;

    public f(CameraKitValidatorException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f451a = error;
    }

    @Override // xv.q
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f451a, ((f) obj2).f451a);
    }

    public final int hashCode() {
        return this.f451a.hashCode();
    }
}
