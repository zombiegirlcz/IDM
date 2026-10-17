package uv;

import kotlin.jvm.internal.Intrinsics;
import xv.l;

/* JADX INFO: loaded from: classes16.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f283256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv.e f283257b;

    public f(l detectorResult, gv.e captureReason) {
        Intrinsics.checkNotNullParameter(detectorResult, "detectorResult");
        Intrinsics.checkNotNullParameter(captureReason, "captureReason");
        this.f283256a = detectorResult;
        this.f283257b = captureReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f283256a, fVar.f283256a) && this.f283257b == fVar.f283257b;
    }

    public final int hashCode() {
        return this.f283257b.hashCode() + (this.f283256a.hashCode() * 31);
    }
}
