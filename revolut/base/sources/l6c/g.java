package l6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192394b;

    public g(String paymentId, String paymentToken) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        this.f192393a = paymentId;
        this.f192394b = paymentToken;
    }

    @Override // l6c.a
    public final String a() {
        return this.f192394b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f192393a, gVar.f192393a) && Intrinsics.f(this.f192394b, gVar.f192394b);
    }

    public final int hashCode() {
        return this.f192394b.hashCode() + (this.f192393a.hashCode() * 31);
    }
}
