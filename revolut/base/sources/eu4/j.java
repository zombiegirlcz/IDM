package eu4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f129509a;

    public j(dj0.d mainPocketBalance) {
        Intrinsics.checkNotNullParameter(mainPocketBalance, "mainPocketBalance");
        this.f129509a = mainPocketBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f129509a, ((j) obj2).f129509a);
    }

    public final int hashCode() {
        return this.f129509a.hashCode();
    }
}
