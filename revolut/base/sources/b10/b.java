package b10;

import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f11699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitValidatorException f11700b;

    public b(a aVar, CameraKitValidatorException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f11699a = aVar;
        this.f11700b = error;
    }

    @Override // xv.q
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f11699a, bVar.f11699a) && Intrinsics.f(this.f11700b, bVar.f11700b);
    }

    @Override // b10.d
    public final a f() {
        return this.f11699a;
    }

    public final int hashCode() {
        a aVar = this.f11699a;
        return this.f11700b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }
}
