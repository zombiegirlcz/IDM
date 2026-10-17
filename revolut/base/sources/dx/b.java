package dx;

import com.revolut.camerakit.core.errors.CameraKitException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements d, xv.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitException f120491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable f120492b;

    public b(CameraKitException error, Iterable validationResults) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(validationResults, "validationResults");
        this.f120491a = error;
        this.f120492b = validationResults;
    }

    @Override // xv.l
    public final Iterable a() {
        return this.f120492b;
    }

    @Override // xv.l
    public final xv.n b() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f120491a, bVar.f120491a) && Intrinsics.f(this.f120492b, bVar.f120492b);
    }

    @Override // xv.j
    public final CameraKitException getError() {
        return this.f120491a;
    }

    public final int hashCode() {
        return (this.f120492b.hashCode() + (this.f120491a.hashCode() * 31)) * 31;
    }
}
