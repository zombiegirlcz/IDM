package b00;

import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f11535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitValidatorException f11536b;

    public d(a aVar, CameraKitValidatorException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f11535a = aVar;
        this.f11536b = error;
    }

    @Override // b00.f
    public final a b() {
        return this.f11535a;
    }

    @Override // xv.q
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f11535a, dVar.f11535a) && Intrinsics.f(this.f11536b, dVar.f11536b);
    }

    public final int hashCode() {
        a aVar = this.f11535a;
        return this.f11536b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }
}
