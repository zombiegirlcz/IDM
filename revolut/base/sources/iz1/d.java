package iz1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx1.b f169822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i02.d f169823b;

    public d(dx1.b apmProduct, i02.d dVar) {
        Intrinsics.checkNotNullParameter(apmProduct, "apmProduct");
        this.f169822a = apmProduct;
        this.f169823b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f169822a, dVar.f169822a) && Intrinsics.f(this.f169823b, dVar.f169823b);
    }

    public final int hashCode() {
        int iHashCode = this.f169822a.hashCode() * 31;
        i02.d dVar = this.f169823b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
