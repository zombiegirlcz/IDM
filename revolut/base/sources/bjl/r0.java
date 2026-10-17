package bjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16185a;

    public r0(String challengeId) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        this.f16185a = challengeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r0) && Intrinsics.f(this.f16185a, ((r0) obj2).f16185a);
    }

    public final int hashCode() {
        return this.f16185a.hashCode();
    }
}
