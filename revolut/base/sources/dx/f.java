package dx;

import com.revolut.camerakit.core.errors.CameraKitException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements h, xv.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitException f120497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable f120498b;

    public f(CameraKitException error, f0 validationResults) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(validationResults, "validationResults");
        this.f120497a = error;
        this.f120498b = validationResults;
    }

    @Override // xv.l
    public final Iterable a() {
        return this.f120498b;
    }

    @Override // xv.l
    public final xv.n b() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f120497a.equals(fVar.f120497a) && Intrinsics.f(this.f120498b, fVar.f120498b);
    }

    @Override // xv.j
    public final CameraKitException getError() {
        return this.f120497a;
    }

    public final int hashCode() {
        return (this.f120498b.hashCode() + (this.f120497a.hashCode() * 31)) * 31;
    }
}
