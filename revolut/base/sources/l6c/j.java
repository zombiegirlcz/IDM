package l6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192399a;

    public j(String paymentToken) {
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        this.f192399a = paymentToken;
    }

    @Override // l6c.a
    public final String a() {
        return this.f192399a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f192399a, ((j) obj2).f192399a);
    }

    public final int hashCode() {
        return this.f192399a.hashCode();
    }
}
