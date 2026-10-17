package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t4 implements v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f120779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f120780b;

    public t4(long j2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f120779a = currency;
        this.f120780b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj2;
        return Intrinsics.f(this.f120779a, t4Var.f120779a) && this.f120780b == t4Var.f120780b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f120780b) + (this.f120779a.hashCode() * 31);
    }
}
