package dej;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimProfile f113555a;

    public i0(EsimProfile esimProfile) {
        Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
        this.f113555a = esimProfile;
    }

    @Override // dej.o0
    public final EsimProfile a() {
        return this.f113555a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f113555a, ((i0) obj2).f113555a);
    }

    public final int hashCode() {
        return this.f113555a.hashCode();
    }
}
