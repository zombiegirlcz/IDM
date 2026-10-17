package aw;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class y implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f10219a;

    public y(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f10219a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f10219a, ((y) obj2).f10219a);
    }

    public final int hashCode() {
        return this.f10219a.hashCode();
    }
}
