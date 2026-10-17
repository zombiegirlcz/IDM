package nv3;

import ft3.j1;
import gt3.f;
import kotlin.jvm.internal.Intrinsics;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements pu.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f219455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f219456c;
    public final b d;

    public a(String applicationId, j1 productType, f fVar, b countryCode) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f219454a = applicationId;
        this.f219455b = productType;
        this.f219456c = fVar;
        this.d = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f219454a, aVar.f219454a) && this.f219455b == aVar.f219455b && Intrinsics.f(this.f219456c, aVar.f219456c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f219455b.hashCode() + (this.f219454a.hashCode() * 31)) * 31;
        f fVar = this.f219456c;
        return this.d.f297794a.hashCode() + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31);
    }
}
