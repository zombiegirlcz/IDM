package x00;

import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitValidatorException f301449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f301450b;

    public c(CameraKitValidatorException error, boolean z) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f301449a = error;
        this.f301450b = z;
    }

    @Override // xv.q
    public final boolean c() {
        return this.f301450b;
    }

    @Override // xv.q
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f301449a, cVar.f301449a) && this.f301450b == cVar.f301450b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f301450b) + (this.f301449a.hashCode() * 31);
    }
}
