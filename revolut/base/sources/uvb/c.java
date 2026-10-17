package uvb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tvb.a f283348a;

    public c(tvb.a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f283348a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f283348a, ((c) obj2).f283348a);
    }

    public final int hashCode() {
        return this.f283348a.hashCode();
    }
}
