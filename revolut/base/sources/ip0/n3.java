package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n3 implements o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f165449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.o9 f165450b;

    public n3(xi0.b currency) {
        aw0.o9 sensitivity = aw0.o9.SENSITIVE;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        this.f165449a = currency;
        this.f165450b = sensitivity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return Intrinsics.f(this.f165449a, n3Var.f165449a) && this.f165450b == n3Var.f165450b;
    }

    public final int hashCode() {
        return this.f165450b.hashCode() + (this.f165449a.hashCode() * 31);
    }
}
