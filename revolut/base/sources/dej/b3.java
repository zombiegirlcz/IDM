package dej;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f113498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimProfile f113499b;

    public b3(t1 esimSubscription, EsimProfile esimProfile) {
        Intrinsics.checkNotNullParameter(esimSubscription, "esimSubscription");
        this.f113498a = esimSubscription;
        this.f113499b = esimProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj2;
        return Intrinsics.f(this.f113498a, b3Var.f113498a) && Intrinsics.f(this.f113499b, b3Var.f113499b);
    }

    public final int hashCode() {
        int iHashCode = this.f113498a.hashCode() * 31;
        EsimProfile esimProfile = this.f113499b;
        return iHashCode + (esimProfile == null ? 0 : esimProfile.hashCode());
    }
}
