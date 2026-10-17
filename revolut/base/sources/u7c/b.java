package u7c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f277731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f277732c;

    public b(String orderToken, String merchantPublicKey, String authorizationCode) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
        Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
        this.f277730a = orderToken;
        this.f277731b = merchantPublicKey;
        this.f277732c = authorizationCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f277730a, bVar.f277730a) && Intrinsics.f(this.f277731b, bVar.f277731b) && Intrinsics.f(this.f277732c, bVar.f277732c);
    }

    public final int hashCode() {
        return this.f277732c.hashCode() + p.a.c(this.f277730a.hashCode() * 31, 31, this.f277731b);
    }
}
