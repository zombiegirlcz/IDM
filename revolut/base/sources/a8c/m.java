package a8c;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalDestination.ExplicitActivity f2167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2169c;

    public m(ExternalDestination.ExplicitActivity destination, String merchantPublicKey, String orderToken) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        this.f2167a = destination;
        this.f2168b = merchantPublicKey;
        this.f2169c = orderToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f2167a.equals(mVar.f2167a) && Intrinsics.f(this.f2168b, mVar.f2168b) && Intrinsics.f(this.f2169c, mVar.f2169c);
    }

    public final int hashCode() {
        return this.f2169c.hashCode() + p.a.c(this.f2167a.hashCode() * 31, 31, this.f2168b);
    }
}
