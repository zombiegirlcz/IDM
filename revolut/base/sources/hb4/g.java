package hb4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f150601a;

    public g(it3.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f150601a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f150601a, ((g) obj2).f150601a);
    }

    public final int hashCode() {
        return this.f150601a.hashCode();
    }
}
