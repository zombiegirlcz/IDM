package tnl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272467a;

    public a(String challengeId) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        this.f272467a = challengeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f272467a, ((a) obj2).f272467a);
    }

    public final int hashCode() {
        return this.f272467a.hashCode();
    }
}
