package o92;

import aii.r;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViaVerdeEnrollment f223064a;

    public f(ViaVerdeEnrollment enrollment) {
        Intrinsics.checkNotNullParameter(enrollment, "enrollment");
        this.f223064a = enrollment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f223064a, ((f) obj2).f223064a);
    }

    public final int hashCode() {
        return this.f223064a.hashCode();
    }
}
