package sc2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrf.f f261621a;

    public c(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        this.f261621a = transferDirection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f261621a == ((c) obj2).f261621a;
    }

    public final int hashCode() {
        return this.f261621a.hashCode();
    }
}
