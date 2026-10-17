package p00;

import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitValidatorException f231395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f231396b;

    public b(CameraKitValidatorException error, k kVar) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f231395a = error;
        this.f231396b = kVar;
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
        return Intrinsics.f(this.f231395a, bVar.f231395a) && Intrinsics.f(this.f231396b, bVar.f231396b);
    }

    public final int hashCode() {
        int iHashCode = this.f231395a.hashCode() * 31;
        k kVar = this.f231396b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }
}
