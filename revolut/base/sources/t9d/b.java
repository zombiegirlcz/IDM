package t9d;

import aii.e;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f268979b;

    public b(String invoiceId) {
        Set visibleTypes = d0.i1(d.a());
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(visibleTypes, "visibleTypes");
        this.f268978a = invoiceId;
        this.f268979b = visibleTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f268978a, bVar.f268978a) && Intrinsics.f(this.f268979b, bVar.f268979b);
    }

    public final int hashCode() {
        return this.f268979b.hashCode() + (this.f268978a.hashCode() * 31);
    }
}
