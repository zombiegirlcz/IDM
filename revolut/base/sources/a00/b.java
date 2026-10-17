package a00;

import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f93a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitValidatorException f94b;

    public b(Integer num, CameraKitValidatorException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f93a = num;
        this.f94b = error;
    }

    @Override // xv.q
    public final boolean d() {
        return false;
    }

    @Override // a00.d
    public final Integer e() {
        return this.f93a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f93a, bVar.f93a) && Intrinsics.f(this.f94b, bVar.f94b);
    }

    public final int hashCode() {
        Integer num = this.f93a;
        return this.f94b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
