package ypd;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f315831a;

    public b(dj0.d sortedMoney) {
        Intrinsics.checkNotNullParameter(sortedMoney, "sortedMoney");
        this.f315831a = sortedMoney;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f315831a, ((b) obj2).f315831a);
    }

    public final int hashCode() {
        return this.f315831a.hashCode();
    }
}
