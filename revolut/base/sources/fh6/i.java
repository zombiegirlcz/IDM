package fh6;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f135159a;

    public i(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f135159a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f135159a, ((i) obj2).f135159a);
    }

    public final int hashCode() {
        return this.f135159a.hashCode();
    }
}
