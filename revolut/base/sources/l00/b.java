package l00;

import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitValidatorException f191137a;

    public b(CameraKitValidatorException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f191137a = error;
    }

    @Override // xv.q
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f191137a, ((b) obj2).f191137a);
    }

    public final int hashCode() {
        return this.f191137a.hashCode();
    }
}
