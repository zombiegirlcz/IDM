package dgj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114706a;

    public f(String simProfileId) {
        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
        this.f114706a = simProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f114706a, ((f) obj2).f114706a);
    }

    public final int hashCode() {
        return this.f114706a.hashCode();
    }
}
