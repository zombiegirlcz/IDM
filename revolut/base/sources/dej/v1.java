package dej;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v1 extends w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimProfile f113670a;

    public v1(EsimProfile esimProfile) {
        this.f113670a = esimProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v1) && Intrinsics.f(this.f113670a, ((v1) obj2).f113670a);
    }

    public final int hashCode() {
        EsimProfile esimProfile = this.f113670a;
        if (esimProfile == null) {
            return 0;
        }
        return esimProfile.hashCode();
    }
}
