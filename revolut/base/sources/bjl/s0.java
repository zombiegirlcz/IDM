package bjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16188a;

    public s0(String challengeId) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        this.f16188a = challengeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f16188a, ((s0) obj2).f16188a);
    }

    public final int hashCode() {
        return this.f16188a.hashCode();
    }
}
