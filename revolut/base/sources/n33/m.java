package n33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final psg.a f211762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kc8.a f211763b;

    public m(psg.a walletProfile, kc8.a juniorCardType) {
        Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
        Intrinsics.checkNotNullParameter(juniorCardType, "juniorCardType");
        this.f211762a = walletProfile;
        this.f211763b = juniorCardType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f211762a, mVar.f211762a) && this.f211763b == mVar.f211763b;
    }

    public final int hashCode() {
        return this.f211763b.hashCode() + (this.f211762a.hashCode() * 31);
    }
}
