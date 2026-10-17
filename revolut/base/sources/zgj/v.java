package zgj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322186a;

    public v(String simProfileId) {
        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
        this.f322186a = simProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f322186a, ((v) obj2).f322186a);
    }

    public final int hashCode() {
        return this.f322186a.hashCode();
    }
}
