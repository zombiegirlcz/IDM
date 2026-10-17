package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f296691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296692b;

    public x0(dj0.d amount, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f296691a = amount;
        this.f296692b = str;
    }

    public final dj0.d b() {
        return this.f296691a;
    }

    public final String c() {
        return this.f296692b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f296691a, x0Var.f296691a) && Intrinsics.f(this.f296692b, x0Var.f296692b);
    }

    public final int hashCode() {
        int iHashCode = this.f296691a.hashCode() * 961;
        String str = this.f296692b;
        return (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
    }
}
