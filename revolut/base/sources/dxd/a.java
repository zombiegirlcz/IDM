package dxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f120936a;

    public a(dj0.d minWithdrawAmount) {
        Intrinsics.checkNotNullParameter(minWithdrawAmount, "minWithdrawAmount");
        this.f120936a = minWithdrawAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f120936a, ((a) obj2).f120936a);
    }

    public final int hashCode() {
        return this.f120936a.hashCode();
    }
}
