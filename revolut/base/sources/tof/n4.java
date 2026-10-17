package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272946b;

    public n4(String externalReference, String externalTrackingCode) {
        Intrinsics.checkNotNullParameter(externalReference, "externalReference");
        Intrinsics.checkNotNullParameter(externalTrackingCode, "externalTrackingCode");
        this.f272945a = externalReference;
        this.f272946b = externalTrackingCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj2;
        return Intrinsics.f(this.f272945a, n4Var.f272945a) && Intrinsics.f(this.f272946b, n4Var.f272946b);
    }

    public final int hashCode() {
        return this.f272946b.hashCode() + (this.f272945a.hashCode() * 31);
    }
}
