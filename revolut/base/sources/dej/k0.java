package dej;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimProfile f113579a;

    public k0(EsimProfile esimProfile) {
        Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
        this.f113579a = esimProfile;
    }

    @Override // dej.o0
    public final EsimProfile a() {
        return this.f113579a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f113579a, ((k0) obj2).f113579a);
    }

    public final int hashCode() {
        return this.f113579a.hashCode();
    }
}
