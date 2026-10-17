package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114099a;

    public s0(String profileId) {
        Intrinsics.checkNotNullParameter(profileId, "profileId");
        this.f114099a = profileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f114099a, ((s0) obj2).f114099a);
    }

    public final int hashCode() {
        return this.f114099a.hashCode();
    }
}
