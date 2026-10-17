package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yvh.f f272683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yvh.h f272684c;

    public d3(String targetPocketId, yvh.f fVar, yvh.h hVar) {
        Intrinsics.checkNotNullParameter(targetPocketId, "targetPocketId");
        this.f272682a = targetPocketId;
        this.f272683b = fVar;
        this.f272684c = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return Intrinsics.f(this.f272682a, d3Var.f272682a) && this.f272683b == d3Var.f272683b && this.f272684c == d3Var.f272684c;
    }

    public final int hashCode() {
        int iHashCode = this.f272682a.hashCode() * 31;
        yvh.f fVar = this.f272683b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        yvh.h hVar = this.f272684c;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }
}
