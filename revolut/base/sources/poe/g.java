package poe;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zme.h f237966a;

    public g(zme.h rationale) {
        Intrinsics.checkNotNullParameter(rationale, "rationale");
        this.f237966a = rationale;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f237966a, ((g) obj2).f237966a);
    }

    public final int hashCode() {
        return this.f237966a.hashCode();
    }
}
