package tdc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f269951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f269953c;

    public h(boolean z, String orderToken, String merchantPublicKey) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
        this.f269951a = z;
        this.f269952b = orderToken;
        this.f269953c = merchantPublicKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f269951a == hVar.f269951a && Intrinsics.f(this.f269952b, hVar.f269952b) && Intrinsics.f(this.f269953c, hVar.f269953c);
    }

    public final int hashCode() {
        return this.f269953c.hashCode() + p.a.c(Boolean.hashCode(this.f269951a) * 31, 31, this.f269952b);
    }
}
