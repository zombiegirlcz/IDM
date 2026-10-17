package s92;

import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViaVerdeEnrollment f261094a;

    public g(ViaVerdeEnrollment enrollment) {
        Intrinsics.checkNotNullParameter(enrollment, "enrollment");
        this.f261094a = enrollment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f261094a, ((g) obj2).f261094a);
    }

    public final int hashCode() {
        return this.f261094a.hashCode();
    }
}
