package k8e;

import kotlin.jvm.internal.Intrinsics;
import pcd.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f182135a;

    public d(v invite) {
        Intrinsics.checkNotNullParameter(invite, "invite");
        this.f182135a = invite;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f182135a, ((d) obj2).f182135a);
    }

    public final int hashCode() {
        return this.f182135a.hashCode();
    }
}
