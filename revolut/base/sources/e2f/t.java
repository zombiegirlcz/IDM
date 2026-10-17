package e2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122084a;

    public t(String agentId) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        this.f122084a = agentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f122084a, ((t) obj2).f122084a);
    }

    public final int hashCode() {
        return this.f122084a.hashCode();
    }
}
