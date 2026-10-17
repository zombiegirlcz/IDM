package o24;

import ft3.j1;
import it3.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f221478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f221479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f221480c;

    public a(j1 productType, b endpointVersion, k kVar) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(endpointVersion, "endpointVersion");
        this.f221478a = productType;
        this.f221479b = endpointVersion;
        this.f221480c = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f221478a == aVar.f221478a && this.f221479b == aVar.f221479b && this.f221480c == aVar.f221480c;
    }

    public final int hashCode() {
        int iHashCode = (this.f221479b.hashCode() + (this.f221478a.hashCode() * 31)) * 31;
        k kVar = this.f221480c;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }
}
