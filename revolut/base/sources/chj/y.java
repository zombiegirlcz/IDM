package chj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24317a;

    public y(String simProfileId) {
        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
        this.f24317a = simProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f24317a, ((y) obj2).f24317a);
    }

    public final int hashCode() {
        return this.f24317a.hashCode();
    }
}
