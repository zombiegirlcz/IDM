package com.onfido.api.client.token.sdk;

import cl.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class TokenEnterpriseFeatures {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f50157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f50158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f50159c;
    public final Boolean d;
    public final Boolean e;

    public TokenEnterpriseFeatures(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.f50157a = bool;
        this.f50158b = bool2;
        this.f50159c = bool3;
        this.d = bool4;
        this.e = bool5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TokenEnterpriseFeatures)) {
            return false;
        }
        TokenEnterpriseFeatures tokenEnterpriseFeatures = (TokenEnterpriseFeatures) obj2;
        return Intrinsics.f(this.f50157a, tokenEnterpriseFeatures.f50157a) && Intrinsics.f(this.f50158b, tokenEnterpriseFeatures.f50158b) && Intrinsics.f(this.f50159c, tokenEnterpriseFeatures.f50159c) && Intrinsics.f(this.d, tokenEnterpriseFeatures.d) && Intrinsics.f(this.e, tokenEnterpriseFeatures.e);
    }

    public final int hashCode() {
        Boolean bool = this.f50157a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f50158b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f50159c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.e;
        return iHashCode4 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        return "TokenEnterpriseFeatures(mediaCallbacksEnabled=" + this.f50157a + ", hideOnfidoLogo=" + this.f50158b + ", disableMobileSdkAnalytics=" + this.f50159c + ", cobrand=" + this.d + ", logoCobrand=" + this.e + ")";
    }
}
