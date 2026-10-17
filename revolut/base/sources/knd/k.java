package knd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final amd.i f186101a;

    public k(amd.i spendingFilter) {
        Intrinsics.checkNotNullParameter(spendingFilter, "spendingFilter");
        this.f186101a = spendingFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f186101a == ((k) obj2).f186101a;
    }

    public final int hashCode() {
        return this.f186101a.hashCode();
    }
}
