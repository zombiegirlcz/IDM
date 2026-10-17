package k3g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180717a;

    public g(String experienceId) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        this.f180717a = experienceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f180717a, ((g) obj2).f180717a);
    }

    public final int hashCode() {
        return this.f180717a.hashCode() * 31;
    }
}
