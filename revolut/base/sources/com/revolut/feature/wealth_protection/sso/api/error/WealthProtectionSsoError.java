package com.revolut.feature.wealth_protection.sso.api.error;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p.a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/api/error/WealthProtectionSsoError;", "", "", "toString", "()Ljava/lang/String;", "feature_wealth_protection_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthProtectionSsoError extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f96313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96315c;

    public WealthProtectionSsoError(String state, String url2, List acceptedAuthenticationContexts) {
        Intrinsics.checkNotNullParameter(acceptedAuthenticationContexts, "acceptedAuthenticationContexts");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f96313a = acceptedAuthenticationContexts;
        this.f96314b = state;
        this.f96315c = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthProtectionSsoError)) {
            return false;
        }
        WealthProtectionSsoError wealthProtectionSsoError = (WealthProtectionSsoError) obj2;
        return Intrinsics.f(this.f96313a, wealthProtectionSsoError.f96313a) && Intrinsics.f(this.f96314b, wealthProtectionSsoError.f96314b) && Intrinsics.f(this.f96315c, wealthProtectionSsoError.f96315c);
    }

    public final int hashCode() {
        return this.f96315c.hashCode() + a.c(this.f96313a.hashCode() * 31, 31, this.f96314b);
    }
}
