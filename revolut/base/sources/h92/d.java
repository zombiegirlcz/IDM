package h92;

import cli.j;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViaVerdeEnrollment f150085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f150086b;

    public d(ViaVerdeEnrollment enrollment, f0 f0Var) {
        Intrinsics.checkNotNullParameter(enrollment, "enrollment");
        this.f150085a = enrollment;
        this.f150086b = f0Var;
    }

    public static d a(d dVar, ViaVerdeEnrollment enrollment, f0 f0Var, int i) {
        if ((i & 1) != 0) {
            enrollment = dVar.f150085a;
        }
        if ((i & 2) != 0) {
            f0Var = dVar.f150086b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(enrollment, "enrollment");
        return new d(enrollment, f0Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f150085a, dVar.f150085a) && Intrinsics.f(this.f150086b, dVar.f150086b);
    }

    public final int hashCode() {
        int iHashCode = this.f150085a.hashCode() * 31;
        f0 f0Var = this.f150086b;
        return iHashCode + (f0Var == null ? 0 : f0Var.hashCode());
    }
}
