package qij;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimProfile f246728a;

    public c(EsimProfile esimProfile) {
        Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
        this.f246728a = esimProfile;
    }

    @Override // qij.k
    public final long a() {
        return 2000L;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f246728a, ((c) obj2).f246728a);
    }

    public final int hashCode() {
        return this.f246728a.hashCode();
    }
}
