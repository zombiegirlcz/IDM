package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f273042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f273043b;

    public s3(Double d, xi0.b bVar) {
        this.f273042a = d;
        this.f273043b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj2;
        return Intrinsics.f(this.f273042a, s3Var.f273042a) && Intrinsics.f(this.f273043b, s3Var.f273043b);
    }

    public final int hashCode() {
        Double d = this.f273042a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        xi0.b bVar = this.f273043b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
