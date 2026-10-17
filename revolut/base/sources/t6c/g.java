package t6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f268295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268296c;
    public final String d;

    public g(String orderToken, long j2, String paymentMethodId, String str) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        this.f268294a = orderToken;
        this.f268295b = j2;
        this.f268296c = paymentMethodId;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f268294a, gVar.f268294a) && this.f268295b == gVar.f268295b && Intrinsics.f(this.f268296c, gVar.f268296c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(this.f268294a.hashCode() * 31, 31, this.f268295b), 31, this.f268296c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
