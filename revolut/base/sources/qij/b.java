package qij;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimProfile f246727a;

    public b(EsimProfile esimProfile) {
        Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
        this.f246727a = esimProfile;
    }

    @Override // qij.k
    public final long a() {
        return 2000L;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f246727a, ((b) obj2).f246727a);
    }

    public final int hashCode() {
        return this.f246727a.hashCode();
    }
}
