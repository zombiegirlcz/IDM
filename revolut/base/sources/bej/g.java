package bej;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimProfile f14853a;

    public g() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f14853a, ((g) obj2).f14853a);
    }

    public final int hashCode() {
        EsimProfile esimProfile = this.f14853a;
        if (esimProfile == null) {
            return 0;
        }
        return esimProfile.hashCode();
    }

    public g(EsimProfile esimProfile) {
        this.f14853a = esimProfile;
    }
}
