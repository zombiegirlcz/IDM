package o0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f221236a;

    public i(dj0.d monthlyIncomeAmount) {
        Intrinsics.checkNotNullParameter(monthlyIncomeAmount, "monthlyIncomeAmount");
        this.f221236a = monthlyIncomeAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f221236a, ((i) obj2).f221236a);
    }

    public final int hashCode() {
        return this.f221236a.hashCode();
    }
}
