package pej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235388b;

    public d(String esimProfileId, String str) {
        Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
        this.f235387a = esimProfileId;
        this.f235388b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f235387a, dVar.f235387a) && Intrinsics.f(this.f235388b, dVar.f235388b);
    }

    public final int hashCode() {
        int iHashCode = this.f235387a.hashCode() * 31;
        String str = this.f235388b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
