package ulf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f281002a;

    public y(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f281002a = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f281002a, ((y) obj2).f281002a);
    }

    public final int hashCode() {
        return this.f281002a.hashCode();
    }
}
