package cjl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24719c;
    public final long d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24720g;

    public u(String idToken, String accessToken, String tokenType, long j2, String scope, List accountIds, String region) {
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(accountIds, "accountIds");
        Intrinsics.checkNotNullParameter(region, "region");
        this.f24717a = idToken;
        this.f24718b = accessToken;
        this.f24719c = tokenType;
        this.d = j2;
        this.e = scope;
        this.f = accountIds;
        this.f24720g = region;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f24717a, uVar.f24717a) && Intrinsics.f(this.f24718b, uVar.f24718b) && Intrinsics.f(this.f24719c, uVar.f24719c) && this.d == uVar.d && Intrinsics.f(this.e, uVar.e) && Intrinsics.f(this.f, uVar.f) && Intrinsics.f(this.f24720g, uVar.f24720g);
    }

    public final int hashCode() {
        return this.f24720g.hashCode() + p.a.d(p.a.c(a0.d.c(p.a.c(p.a.c(this.f24717a.hashCode() * 31, 31, this.f24718b), 31, this.f24719c), 31, this.d), 31, this.e), 31, this.f);
    }
}
