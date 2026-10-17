package ww8;

import com.revolut.feature.kyc.api.KycContract$Requirement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KycContract$Requirement f300625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f300626b;

    public g(KycContract$Requirement requirement, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(requirement, "requirement");
        this.f300625a = requirement;
        this.f300626b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f300625a, gVar.f300625a) && Intrinsics.f(this.f300626b, gVar.f300626b);
    }

    public final int hashCode() {
        int iHashCode = this.f300625a.hashCode() * 31;
        wi0.b bVar = this.f300626b;
        return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
