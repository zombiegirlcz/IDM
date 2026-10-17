package jfb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173815a;

    public i0(String newChallengeId) {
        Intrinsics.checkNotNullParameter(newChallengeId, "newChallengeId");
        this.f173815a = newChallengeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f173815a, ((i0) obj2).f173815a);
    }

    public final int hashCode() {
        return this.f173815a.hashCode();
    }
}
