package w00;

import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f293598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitValidatorException f293599b;

    public b(g gVar, CameraKitValidatorException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f293598a = gVar;
        this.f293599b = error;
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
        return Intrinsics.f(this.f293598a, bVar.f293598a) && Intrinsics.f(this.f293599b, bVar.f293599b);
    }

    @Override // w00.d
    public final g getPosition() {
        return this.f293598a;
    }

    public final int hashCode() {
        g gVar = this.f293598a;
        return this.f293599b.hashCode() + ((gVar == null ? 0 : gVar.hashCode()) * 31);
    }
}
