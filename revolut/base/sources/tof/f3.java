package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f272744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f272745b;

    public f3(dj0.d dVar, boolean z) {
        this.f272744a = z;
        this.f272745b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj2;
        return this.f272744a == f3Var.f272744a && Intrinsics.f(this.f272745b, f3Var.f272745b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f272744a) * 31;
        dj0.d dVar = this.f272745b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
