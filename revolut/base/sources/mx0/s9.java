package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9 f209998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9 f209999b;

    public s9(r9 cameraState, u9 reasonForUpdate) {
        Intrinsics.checkNotNullParameter(cameraState, "cameraState");
        Intrinsics.checkNotNullParameter(reasonForUpdate, "reasonForUpdate");
        this.f209998a = cameraState;
        this.f209999b = reasonForUpdate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj2;
        return this.f209998a == s9Var.f209998a && this.f209999b == s9Var.f209999b;
    }

    public final int hashCode() {
        return this.f209999b.hashCode() + (this.f209998a.hashCode() * 31);
    }
}
