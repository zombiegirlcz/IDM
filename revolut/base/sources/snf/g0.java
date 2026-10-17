package snf;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f264580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f264581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f264582c;

    public g0(Set mainWalletIds, Map countryProfilesByRegisteredIdentityId, LinkedHashMap allPocketsById) {
        Intrinsics.checkNotNullParameter(mainWalletIds, "mainWalletIds");
        Intrinsics.checkNotNullParameter(countryProfilesByRegisteredIdentityId, "countryProfilesByRegisteredIdentityId");
        Intrinsics.checkNotNullParameter(allPocketsById, "allPocketsById");
        this.f264580a = mainWalletIds;
        this.f264581b = countryProfilesByRegisteredIdentityId;
        this.f264582c = allPocketsById;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f264580a, g0Var.f264580a) && Intrinsics.f(this.f264581b, g0Var.f264581b) && this.f264582c.equals(g0Var.f264582c);
    }

    public final int hashCode() {
        return this.f264582c.hashCode() + p.a.e(this.f264580a.hashCode() * 31, 31, this.f264581b);
    }
}
