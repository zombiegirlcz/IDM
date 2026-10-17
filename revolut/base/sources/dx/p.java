package dx;

import com.revolut.camerakit.core.errors.CameraKitException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class p implements xv.l, xv.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitException f120509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable f120510b;

    public p(CameraKitException error, Iterable validationResults) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(validationResults, "validationResults");
        this.f120509a = error;
        this.f120510b = validationResults;
    }

    @Override // xv.l
    public final Iterable a() {
        return this.f120510b;
    }

    @Override // xv.l
    public final xv.n b() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f120509a, pVar.f120509a) && Intrinsics.f(this.f120510b, pVar.f120510b);
    }

    @Override // xv.j
    public final CameraKitException getError() {
        return this.f120509a;
    }

    public final int hashCode() {
        return (this.f120510b.hashCode() + (this.f120509a.hashCode() * 31)) * 31;
    }
}
