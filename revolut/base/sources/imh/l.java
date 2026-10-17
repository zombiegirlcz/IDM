package imh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162479a;

    public l(String tradeDiscoveryKey) {
        Intrinsics.checkNotNullParameter(tradeDiscoveryKey, "tradeDiscoveryKey");
        this.f162479a = tradeDiscoveryKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f162479a, ((l) obj2).f162479a);
    }

    public final int hashCode() {
        return this.f162479a.hashCode();
    }
}
