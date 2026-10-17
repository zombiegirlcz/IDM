package x8j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 extends aii.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ytd.b f303455b;

    public j0(ytd.b stakingResult) {
        Intrinsics.checkNotNullParameter(stakingResult, "stakingResult");
        this.f303455b = stakingResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f303455b, ((j0) obj2).f303455b);
    }

    public final int hashCode() {
        return this.f303455b.hashCode();
    }
}
