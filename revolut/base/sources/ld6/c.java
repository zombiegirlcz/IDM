package ld6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f194034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f194035b;

    public c(wi0.b baseEntityCountry, g gVar) {
        Intrinsics.checkNotNullParameter(baseEntityCountry, "baseEntityCountry");
        this.f194034a = baseEntityCountry;
        this.f194035b = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f194034a, cVar.f194034a) && Intrinsics.f(this.f194035b, cVar.f194035b);
    }

    public final int hashCode() {
        int iHashCode = this.f194034a.f297794a.hashCode() * 31;
        g gVar = this.f194035b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
