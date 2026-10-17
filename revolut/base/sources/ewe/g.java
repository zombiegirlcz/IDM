package ewe;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130170a;

    public g(String expiredCardId) {
        Intrinsics.checkNotNullParameter(expiredCardId, "expiredCardId");
        this.f130170a = expiredCardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f130170a, ((g) obj2).f130170a);
    }

    public final int hashCode() {
        return this.f130170a.hashCode();
    }
}
