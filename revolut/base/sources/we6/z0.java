package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f296698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f296699b;

    public z0(dj0.d limitPerTransfer, dj0.d limitPerMonth) {
        Intrinsics.checkNotNullParameter(limitPerTransfer, "limitPerTransfer");
        Intrinsics.checkNotNullParameter(limitPerMonth, "limitPerMonth");
        this.f296698a = limitPerTransfer;
        this.f296699b = limitPerMonth;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f296698a, z0Var.f296698a) && Intrinsics.f(this.f296699b, z0Var.f296699b);
    }

    public final int hashCode() {
        return this.f296699b.hashCode() + (this.f296698a.hashCode() * 31);
    }
}
